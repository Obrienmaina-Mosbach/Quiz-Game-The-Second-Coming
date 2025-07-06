package brian.dhbw.project.gradle;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.ServerApi;
import com.mongodb.ServerApiVersion;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


public class DatabaseConfig {
    private static final String CONFIG_FILE = "config.properties";
    private static String connectionString;
    private static String databaseName;
    private static String username;
    private static String password;

    private static MongoClient mongoClient = null;
    private static MongoDatabase database = null;
    private static final Object lock = new Object();


    static {
        loadProperties();
    }


    private DatabaseConfig() {

    }


    private static void loadProperties() {
        Properties properties = new Properties();
        try (InputStream input = DatabaseConfig.class.getClassLoader().getResourceAsStream(CONFIG_FILE)) {
            if (input == null) {
                System.err.println("Error: Configuration file not found: " + CONFIG_FILE + ". Ensure it's in the classpath.");
                throw new RuntimeException("Configuration file not found: " + CONFIG_FILE);
            }
            properties.load(input);


            connectionString = properties.getProperty("mongodb.connectionString", "mongodb://localhost:27017");
            databaseName = properties.getProperty("mongodb.databaseName", "quizGameDB");
            username = properties.getProperty("mongodb.username", "");
            password = properties.getProperty("mongodb.password", "");

            System.out.println("Database configuration loaded from " + CONFIG_FILE);
        } catch (IOException ex) {
            System.err.println("Error loading configuration properties: " + ex.getMessage());
            ex.printStackTrace();
            throw new RuntimeException("Failed to load database configuration.", ex);
        }
    }


    public static MongoDatabase getDatabase() {

        synchronized (lock) {
            if (database == null) {
                try {

                    ConnectionString connString = new ConnectionString(connectionString);


                    ServerApi serverApi = ServerApi.builder()
                            .version(ServerApiVersion.V1)
                            .build();

                    MongoClientSettings.Builder settingsBuilder = MongoClientSettings.builder()
                            .applyConnectionString(connString) // Applies the connection string (which now includes credentials)
                            .serverApi(serverApi);

                    MongoClientSettings settings = settingsBuilder.build();

                    mongoClient = MongoClients.create(settings);
                    database = mongoClient.getDatabase(databaseName);

                    // Test connection: Perform a simple operation to ensure the connection is live.

                    database.listCollectionNames().first();
                    System.out.println("Connected to MongoDB successfully!");
                } catch (Exception e) {
                    System.err.println("Error connecting to MongoDB: " + e.getMessage());
                    e.printStackTrace(); // Print stack trace for debugging.
                    throw new RuntimeException("Failed to connect to MongoDB", e);
                }
            }
            return database;
        }
    }


    public static void closeConnection() {

        synchronized (lock) {
            if (mongoClient != null) {
                mongoClient.close();
                mongoClient = null;
                database = null;
                System.out.println("MongoDB connection closed.");
            }
        }
    }
}