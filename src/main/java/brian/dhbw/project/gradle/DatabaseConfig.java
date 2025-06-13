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
    private static final String CONFIG_FILE = "config.properties"; // Name of your properties file
    private static String connectionString;
    private static String databaseName;
    private static String username;
    private static String password;

    private static MongoClient mongoClient = null;
    private static MongoDatabase database = null;
    private static final Object lock = new Object(); // For synchronized access

    static {
        // Static initializer block to load properties when the class is loaded
        loadProperties();
    }

    private DatabaseConfig() {
        // Private constructor to prevent instantiation
    }

    private static void loadProperties() {
        Properties properties = new Properties();
        try (InputStream input = DatabaseConfig.class.getClassLoader().getResourceAsStream(CONFIG_FILE)) {
            if (input == null) {
                System.err.println("Sorry, unable to find " + CONFIG_FILE);
                // Handle this error appropriately, e.g., throw a runtime exception or exit
                throw new RuntimeException("Configuration file not found: " + CONFIG_FILE);
            }
            properties.load(input);

            connectionString = properties.getProperty("mongodb.connectionString", "mongodb://localhost:27017");
            databaseName = properties.getProperty("mongodb.databaseName", "quizGameDB");
            username = properties.getProperty("mongodb.username", "");
            password = properties.getProperty("mongodb.password", "");

        } catch (IOException ex) {
            System.err.println("Error loading configuration properties: " + ex.getMessage());
            ex.printStackTrace();
            throw new RuntimeException("Failed to load database configuration.", ex);
        }
    }

    public static MongoDatabase getDatabase() {
        synchronized (lock) { // Ensure thread-safe singleton
            if (database == null) {
                try {
                    // Build connection string with credentials if present
                    ConnectionString connString;
                    if (!username.isEmpty() && !password.isEmpty()) {
                        // Example for username/password in connection string
                        // For a robust app, you might build a more complex connection string
                        // or use MongoClientSettings builder
                        connString = new ConnectionString(connectionString);
                    } else {
                        connString = new ConnectionString(connectionString);
                    }

                    // For modern MongoDB versions (4.0+), it's good practice to specify Server API
                    ServerApi serverApi = ServerApi.builder()
                            .version(ServerApiVersion.V1)
                            .build();

                    MongoClientSettings settings = MongoClientSettings.builder()
                            .applyConnectionString(connString)
                            .serverApi(serverApi)
                            .build();

                    mongoClient = MongoClients.create(settings);
                    database = mongoClient.getDatabase(databaseName);
                    // Test connection by doing a simple command or listing collections
                    database.listCollectionNames().first(); // This will throw if connection is bad

                    System.out.println("Connected to MongoDB successfully!");
                } catch (Exception e) {
                    System.err.println("Error connecting to MongoDB: " + e.getMessage());
                    e.printStackTrace();
                    // Re-throw as runtime exception or handle more gracefully based on app needs
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