package brian.dhbw.project.gradle;

import java.util.Arrays;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class DataInitializer {

    // This main method is for ONE-TIME use to initialize or clear data.
    // REMOVE OR RENAME IT AFTER YOU'VE USED IT FOR INITIALIZATION!
    /*public static void main(String[] args) {
        System.out.println("Executing Data Initializer tasks...");
        // Call clearQuestions() if you want to wipe existing questions before adding new ones
        clearQuestions(); // Uncomment this line if you want to clear existing data before re-populating
        initializeData(); // Call the actual data initialization method
        DatabaseConfig.closeConnection(); // Ensure connection is closed after initialization
        System.out.println("Data initialization complete.");
    }*/

    public static void initializeData() {
        QuestionBank qb = new QuestionBank("dummy", "dummy"); // Topic/difficulty don't matter for adding

        // --- Existing Animal Questions (Easy) ---
        Question q_animal_easy_1 = new Question();
        q_animal_easy_1.setQuestion("Which animal is known as the 'King of the Jungle'?");
        q_animal_easy_1.setOptions(Arrays.asList("Tiger", "Elephant", "Lion", "Cheetah"));
        q_animal_easy_1.setAnswer("Lion");
        q_animal_easy_1.setTopic("Animal");
        q_animal_easy_1.setDifficulty("Easy");
        qb.addQuestion(q_animal_easy_1);

        Question q_animal_easy_2 = new Question();
        q_animal_easy_2.setQuestion("What is the fastest land animal?");
        q_animal_easy_2.setOptions(Arrays.asList("Cheetah", "Leopard", "Horse", "Kangaroo"));
        q_animal_easy_2.setAnswer("Cheetah");
        q_animal_easy_2.setTopic("Animal");
        q_animal_easy_2.setDifficulty("Easy");
        qb.addQuestion(q_animal_easy_2);

        Question q_animal_easy_3 = new Question();
        q_animal_easy_3.setQuestion("Which animal is famous for its black and white stripes?");
        q_animal_easy_3.setOptions(Arrays.asList("Tiger", "Zebra", "Panda", "Skunk"));
        q_animal_easy_3.setAnswer("Zebra");
        q_animal_easy_3.setTopic("Animal");
        q_animal_easy_3.setDifficulty("Easy");
        qb.addQuestion(q_animal_easy_3);

        Question q_animal_easy_4 = new Question();
        q_animal_easy_4.setQuestion("Which bird is known for its ability to mimic human speech?");
        q_animal_easy_4.setOptions(Arrays.asList("Sparrow", "Eagle", "Parrot", "Owl"));
        q_animal_easy_4.setAnswer("Parrot");
        q_animal_easy_4.setTopic("Animal");
        q_animal_easy_4.setDifficulty("Easy");
        qb.addQuestion(q_animal_easy_4);

        Question q_animal_easy_5 = new Question();
        q_animal_easy_5.setQuestion("What do pandas mainly eat?");
        q_animal_easy_5.setOptions(Arrays.asList("Grass", "Bamboo", "Fruits", "Fish"));
        q_animal_easy_5.setAnswer("Bamboo");
        q_animal_easy_5.setTopic("Animal");
        q_animal_easy_5.setDifficulty("Easy");
        qb.addQuestion(q_animal_easy_5);

        Question q_animal_easy_6 = new Question();
        q_animal_easy_6.setQuestion("Which sea creature has eight tentacles?");
        q_animal_easy_6.setOptions(Arrays.asList("Octopus", "Jellyfish", "Squid", "Starfish"));
        q_animal_easy_6.setAnswer("Octopus");
        q_animal_easy_6.setTopic("Animal");
        q_animal_easy_6.setDifficulty("Easy");
        qb.addQuestion(q_animal_easy_6);

        Question q_animal_easy_7 = new Question();
        q_animal_easy_7.setQuestion("Which animal is known for being the largest mammal?");
        q_animal_easy_7.setOptions(Arrays.asList("Elephant", "Blue Whale", "Giraffe", "Hippopotamus"));
        q_animal_easy_7.setAnswer("Blue Whale");
        q_animal_easy_7.setTopic("Animal");
        q_animal_easy_7.setDifficulty("Easy");
        qb.addQuestion(q_animal_easy_7);

        Question q_animal_easy_8 = new Question();
        q_animal_easy_8.setQuestion("Which animal is commonly known as 'man's best friend'?");
        q_animal_easy_8.setOptions(Arrays.asList("Cat", "Horse", "Dog", "Rabbit"));
        q_animal_easy_8.setAnswer("Dog");
        q_animal_easy_8.setTopic("Animal");
        q_animal_easy_8.setDifficulty("Easy");
        qb.addQuestion(q_animal_easy_8);

        Question q_animal_easy_9 = new Question();
        q_animal_easy_9.setQuestion("What is the only mammal capable of true flight?");
        q_animal_easy_9.setOptions(Arrays.asList("Eagle", "Bat", "Flying Squirrel", "Owl"));
        q_animal_easy_9.setAnswer("Bat");
        q_animal_easy_9.setTopic("Animal");
        q_animal_easy_9.setDifficulty("Easy");
        qb.addQuestion(q_animal_easy_9);

        Question q_animal_easy_10 = new Question();
        q_animal_easy_10.setQuestion("What do bees produce?");
        q_animal_easy_10.setOptions(Arrays.asList("Milk", "Honey", "Sugar", "Nectar"));
        q_animal_easy_10.setAnswer("Honey");
        q_animal_easy_10.setTopic("Animal");
        q_animal_easy_10.setDifficulty("Easy");
        qb.addQuestion(q_animal_easy_10);

        // --- Existing Animal Questions (Hard) ---
        Question q_animal_hard_1 = new Question();
        q_animal_hard_1.setQuestion("What is the fastest land animal in the world?");
        q_animal_hard_1.setOptions(Arrays.asList("Cheetah", "Lion", "Antelope", "Tiger"));
        q_animal_hard_1.setAnswer("Cheetah");
        q_animal_hard_1.setTopic("Animal");
        q_animal_hard_1.setDifficulty("Hard");
        qb.addQuestion(q_animal_hard_1);

        Question q_animal_hard_2 = new Question();
        q_animal_hard_2.setQuestion("Which bird is known for its ability to mimic human speech?");
        q_animal_hard_2.setOptions(Arrays.asList("African Grey Parrot", "Cockatoo", "Macaw", "Eagle"));
        q_animal_hard_2.setAnswer("African Grey Parrot");
        q_animal_hard_2.setTopic("Animal");
        q_animal_hard_2.setDifficulty("Hard");
        qb.addQuestion(q_animal_hard_2);

        Question q_animal_hard_3 = new Question();
        q_animal_hard_3.setQuestion("What is the largest species of shark?");
        q_animal_hard_3.setOptions(Arrays.asList("Great White Shark", "Tiger Shark", "Whale Shark", "Hammerhead Shark"));
        q_animal_hard_3.setAnswer("Whale Shark");
        q_animal_hard_3.setTopic("Animal");
        q_animal_hard_3.setDifficulty("Hard");
        qb.addQuestion(q_animal_hard_3);

        Question q_animal_hard_4 = new Question();
        q_animal_hard_4.setQuestion("Which animal has the longest lifespan?");
        q_animal_hard_4.setOptions(Arrays.asList("Bowhead Whale", "Elephant", "Giant Tortoise", "Koi Fish"));
        q_animal_hard_4.setAnswer("Bowhead Whale");
        q_animal_hard_4.setTopic("Animal");
        q_animal_hard_4.setDifficulty("Hard");
        qb.addQuestion(q_animal_hard_4);

        Question q_animal_hard_5 = new Question();
        q_animal_hard_5.setQuestion("Which species of jellyfish is considered biologically immortal?");
        q_animal_hard_5.setOptions(Arrays.asList("Aurelia Aurita", "Turritopsis dohrnii", "Mastigias Papua", "Chrysaora Fuscescens"));
        q_animal_hard_5.setAnswer("Turritopsis dohrnii");
        q_animal_hard_5.setTopic("Animal");
        q_animal_hard_5.setDifficulty("Hard");
        qb.addQuestion(q_animal_hard_5);

        Question q_animal_hard_6 = new Question();
        q_animal_hard_6.setQuestion("What is the only mammal capable of true flight?");
        q_animal_hard_6.setOptions(Arrays.asList("Bat", "Flying Squirrel", "Colugo", "Sugar Glider"));
        q_animal_hard_6.setAnswer("Bat");
        q_animal_hard_6.setTopic("Animal");
        q_animal_hard_6.setDifficulty("Hard");
        qb.addQuestion(q_animal_hard_6);

        Question q_animal_hard_7 = new Question();
        q_animal_hard_7.setQuestion("Which mammal is known to have the longest migration?");
        q_animal_hard_7.setOptions(Arrays.asList("Gray Whale", "Caribou", "Monarch Butterfly", "Humpback Whale"));
        q_animal_hard_7.setAnswer("Gray Whale");
        q_animal_hard_7.setTopic("Animal");
        q_animal_hard_7.setDifficulty("Hard");
        qb.addQuestion(q_animal_hard_7);

        Question q_animal_hard_8 = new Question();
        q_animal_hard_8.setQuestion("Which species of frog is known to freeze and then thaw out without harm?");
        q_animal_hard_8.setOptions(Arrays.asList("Wood Frog", "Bullfrog", "Tree Frog", "Glass Frog"));
        q_animal_hard_8.setAnswer("Wood Frog");
        q_animal_hard_8.setTopic("Animal");
        q_animal_hard_8.setDifficulty("Hard");
        qb.addQuestion(q_animal_hard_8);

        Question q_animal_hard_9 = new Question();
        q_animal_hard_9.setQuestion("What animal has the most powerful bite force relative to its size?");
        q_animal_hard_9.setOptions(Arrays.asList("Saltwater Crocodile", "Tiger Beetle", "Jaguar", "Great White Shark"));
        q_animal_hard_9.setAnswer("Tiger Beetle");
        q_animal_hard_9.setTopic("Animal");
        q_animal_hard_9.setDifficulty("Hard");
        qb.addQuestion(q_animal_hard_9);

        Question q_animal_hard_10 = new Question();
        q_animal_hard_10.setQuestion("Which animal is capable of regenerating entire limbs and organs?");
        q_animal_hard_10.setOptions(Arrays.asList("Axolotl", "Starfish", "Gecko", "Lizard"));
        q_animal_hard_10.setAnswer("Axolotl");
        q_animal_hard_10.setTopic("Animal");
        q_animal_hard_10.setDifficulty("Hard");
        qb.addQuestion(q_animal_hard_10);

        Question q_animal_hard_11 = new Question();
        q_animal_hard_11.setQuestion("What is the fastest marine animal?");
        q_animal_hard_11.setOptions(Arrays.asList("Black Marlin", "Sailfish", "Dolphin", "Bluefin Tuna"));
        q_animal_hard_11.setAnswer("Black Marlin");
        q_animal_hard_11.setTopic("Animal");
        q_animal_hard_11.setDifficulty("Hard");
        qb.addQuestion(q_animal_hard_11);

        Question q_animal_hard_12 = new Question();
        q_animal_hard_12.setQuestion("Which animal's heart can beat more than 1,000 times per minute?");
        q_animal_hard_12.setOptions(Arrays.asList("Hummingbird", "Bat", "Shrew", "Cheetah"));
        q_animal_hard_12.setAnswer("Hummingbird");
        q_animal_hard_12.setTopic("Animal");
        q_animal_hard_12.setDifficulty("Hard");
        qb.addQuestion(q_animal_hard_12);

        Question q_animal_hard_13 = new Question();
        q_animal_hard_13.setQuestion("What is the largest living species of turtle?");
        q_animal_hard_13.setOptions(Arrays.asList("Leatherback Sea Turtle", "Green Sea Turtle", "Loggerhead Turtle", "Hawksbill Turtle"));
        q_animal_hard_13.setAnswer("Leatherback Sea Turtle");
        q_animal_hard_13.setTopic("Animal");
        q_animal_hard_13.setDifficulty("Hard");
        qb.addQuestion(q_animal_hard_13);

        Question q_animal_hard_14 = new Question();
        q_animal_hard_14.setQuestion("Which mammal produces the smallest eggs?");
        q_animal_hard_14.setOptions(Arrays.asList("Echidna", "Platypus", "Kangaroo", "Opossum"));
        q_animal_hard_14.setAnswer("Echidna");
        q_animal_hard_14.setTopic("Animal");
        q_animal_hard_14.setDifficulty("Hard");
        qb.addQuestion(q_animal_hard_14);

        Question q_animal_hard_15 = new Question();
        q_animal_hard_15.setQuestion("Which animal has the longest neck in relation to its body size?");
        q_animal_hard_15.setOptions(Arrays.asList("Giraffe", "Camel", "Okapi", "Long-necked Dinosaur"));
        q_animal_hard_15.setAnswer("Giraffe");
        q_animal_hard_15.setTopic("Animal");
        q_animal_hard_15.setDifficulty("Hard");
        qb.addQuestion(q_animal_hard_15);

        // --- Existing Animal Questions (Medium) ---
        Question q_animal_medium_1 = new Question();
        q_animal_medium_1.setQuestion("Which animal is known for its distinctive black and white coat and primarily eats bamboo?");
        q_animal_medium_1.setOptions(Arrays.asList("Giant Panda", "Zebra", "Koala", "Skunk"));
        q_animal_medium_1.setAnswer("Giant Panda");
        q_animal_medium_1.setTopic("Animal");
        q_animal_medium_1.setDifficulty("Medium");
        qb.addQuestion(q_animal_medium_1);

        Question q_animal_medium_2 = new Question();
        q_animal_medium_2.setQuestion("Which species of fish is known for its ability to change sex during its lifetime?");
        q_animal_medium_2.setOptions(Arrays.asList("Clownfish", "Anglerfish", "Lionfish", "Goldfish"));
        q_animal_medium_2.setAnswer("Clownfish");
        q_animal_medium_2.setTopic("Animal");
        q_animal_medium_2.setDifficulty("Medium");
        qb.addQuestion(q_animal_medium_2);

        Question q_animal_medium_3 = new Question();
        q_animal_medium_3.setQuestion("Which animal is the largest terrestrial mammal on Earth?");
        q_animal_medium_3.setOptions(Arrays.asList("African Elephant", "White Rhino", "Giraffe", "Hippopotamus"));
        q_animal_medium_3.setAnswer("African Elephant");
        q_animal_medium_3.setTopic("Animal");
        q_animal_medium_3.setDifficulty("Medium");
        qb.addQuestion(q_animal_medium_3);

        Question q_animal_medium_4 = new Question();
        q_animal_medium_4.setQuestion("What is the primary diet of a koala?");
        q_animal_medium_4.setOptions(Arrays.asList("Eucalyptus leaves", "Bamboo", "Grass", "Insects"));
        q_animal_medium_4.setAnswer("Eucalyptus leaves");
        q_animal_medium_4.setTopic("Animal");
        q_animal_medium_4.setDifficulty("Medium");
        qb.addQuestion(q_animal_medium_4);

        Question q_animal_medium_5 = new Question();
        q_animal_medium_5.setQuestion("Which animal can sleep for up to 20 hours a day?");
        q_animal_medium_5.setOptions(Arrays.asList("Koala", "Cat", "Sloth", "Lion"));
        q_animal_medium_5.setAnswer("Sloth");
        q_animal_medium_5.setTopic("Animal");
        q_animal_medium_5.setDifficulty("Medium");
        qb.addQuestion(q_animal_medium_5);

        Question q_animal_medium_6 = new Question();
        q_animal_medium_6.setQuestion("Which species of bird is capable of flying backward?");
        q_animal_medium_6.setOptions(Arrays.asList("Hummingbird", "Eagle", "Pigeon", "Albatross"));
        q_animal_medium_6.setAnswer("Hummingbird");
        q_animal_medium_6.setTopic("Animal");
        q_animal_medium_6.setDifficulty("Medium");
        qb.addQuestion(q_animal_medium_6);

        Question q_animal_medium_7 = new Question();
        q_animal_medium_7.setQuestion("Which mammal is known to have the shortest gestation period?");
        q_animal_medium_7.setOptions(Arrays.asList("Opossum", "Human", "Kangaroo", "Horse"));
        q_animal_medium_7.setAnswer("Opossum");
        q_animal_medium_7.setTopic("Animal");
        q_animal_medium_7.setDifficulty("Medium");
        qb.addQuestion(q_animal_medium_7);

        Question q_animal_medium_8 = new Question();
        q_animal_medium_8.setQuestion("Which reptile is known for having a shell and retracting its head and limbs for protection?");
        q_animal_medium_8.setOptions(Arrays.asList("Turtle", "Crocodile", "Lizard", "Gecko"));
        q_animal_medium_8.setAnswer("Turtle");
        q_animal_medium_8.setTopic("Animal");
        q_animal_medium_8.setDifficulty("Medium");
        qb.addQuestion(q_animal_medium_8);

        Question q_animal_medium_9 = new Question();
        q_animal_medium_9.setQuestion("What animal is known for its exceptional memory and intelligence, and is the largest land carnivore?");
        q_animal_medium_9.setOptions(Arrays.asList("Lion", "Polar Bear", "Elephant", "Orangutan"));
        q_animal_medium_9.setAnswer("Polar Bear");
        q_animal_medium_9.setTopic("Animal");
        q_animal_medium_9.setDifficulty("Medium");
        qb.addQuestion(q_animal_medium_9);

        Question q_animal_medium_10 = new Question();
        q_animal_medium_10.setQuestion("Which animal is known to communicate through echolocation?");
        q_animal_medium_10.setOptions(Arrays.asList("Dolphin", "Bat", "Whale", "All of the above"));
        q_animal_medium_10.setAnswer("All of the above");
        q_animal_medium_10.setTopic("Animal");
        q_animal_medium_10.setDifficulty("Medium");
        qb.addQuestion(q_animal_medium_10);

        Question q_animal_medium_11 = new Question();
        q_animal_medium_11.setQuestion("What is the fastest aquatic animal?");
        q_animal_medium_11.setOptions(Arrays.asList("Blue Whale", "Sailfish", "Shark", "Marlin"));
        q_animal_medium_11.setAnswer("Sailfish");
        q_animal_medium_11.setTopic("Animal");
        q_animal_medium_11.setDifficulty("Medium");
        qb.addQuestion(q_animal_medium_11);

        Question q_animal_medium_12 = new Question();
        q_animal_medium_12.setQuestion("Which animal has the longest migration distance of any mammal?");
        q_animal_medium_12.setOptions(Arrays.asList("Gray Whale", "Caribou", "Monarch Butterfly", "Humpback Whale"));
        q_animal_medium_12.setAnswer("Gray Whale");
        q_animal_medium_12.setTopic("Animal");
        q_animal_medium_12.setDifficulty("Medium");
        qb.addQuestion(q_animal_medium_12);

        Question q_animal_medium_13 = new Question();
        q_animal_medium_13.setQuestion("Which species of bear is native to North America and has a black, brown, or white coat?");
        q_animal_medium_13.setOptions(Arrays.asList("Grizzly Bear", "Polar Bear", "Sun Bear", "Black Bear"));
        q_animal_medium_13.setAnswer("Black Bear");
        q_animal_medium_13.setTopic("Animal");
        q_animal_medium_13.setDifficulty("Medium");
        qb.addQuestion(q_animal_medium_13);

        // --- New Topics ---

        // --- Artificial Intelligence Questions ---
        // Easy
        Question q_ai_easy_1 = new Question();
        q_ai_easy_1.setQuestion("What does AI stand for?");
        q_ai_easy_1.setOptions(Arrays.asList("Automated Intelligence", "Artificial Intelligence", "Advanced Integration", "Analytical Insight"));
        q_ai_easy_1.setAnswer("Artificial Intelligence");
        q_ai_easy_1.setTopic("Artificial Intelligence");
        q_ai_easy_1.setDifficulty("Easy");
        qb.addQuestion(q_ai_easy_1);

        Question q_ai_easy_2 = new Question();
        q_ai_easy_2.setQuestion("Which famous game did Deep Blue, an IBM computer, defeat in 1997?");
        q_ai_easy_2.setOptions(Arrays.asList("Checkers", "Chess", "Go", "Poker"));
        q_ai_easy_2.setAnswer("Chess");
        q_ai_easy_2.setTopic("Artificial Intelligence");
        q_ai_easy_2.setDifficulty("Easy");
        qb.addQuestion(q_ai_easy_2);

        Question q_ai_easy_3 = new Question();
        q_ai_easy_3.setQuestion("Is a robot an example of AI?");
        q_ai_easy_3.setOptions(Arrays.asList("Yes", "No", "Only if it has feelings", "Only if it can speak"));
        q_ai_easy_3.setAnswer("Yes");
        q_ai_easy_3.setTopic("Artificial Intelligence");
        q_ai_easy_3.setDifficulty("Easy");
        qb.addQuestion(q_ai_easy_3);

        Question q_ai_easy_4 = new Question();
        q_ai_easy_4.setQuestion("What is the goal of Artificial Intelligence?");
        q_ai_easy_4.setOptions(Arrays.asList("To replace humans", "To make computers smarter", "To automate all jobs", "To build self-driving cars"));
        q_ai_easy_4.setAnswer("To make computers smarter");
        q_ai_easy_4.setTopic("Artificial Intelligence");
        q_ai_easy_4.setDifficulty("Easy");
        qb.addQuestion(q_ai_easy_4);

        Question q_ai_easy_5 = new Question();
        q_ai_easy_5.setQuestion("Which of these is a common application of AI?");
        q_ai_easy_5.setOptions(Arrays.asList("Word processing", "Email sending", "Voice assistants", "Photo editing"));
        q_ai_easy_5.setAnswer("Voice assistants");
        q_ai_easy_5.setTopic("Artificial Intelligence");
        q_ai_easy_5.setDifficulty("Easy");
        qb.addQuestion(q_ai_easy_5);

        Question q_ai_easy_6 = new Question();
        q_ai_easy_6.setQuestion("True or False: AI can learn from data.");
        q_ai_easy_6.setOptions(Arrays.asList("True", "False"));
        q_ai_easy_6.setAnswer("True");
        q_ai_easy_6.setTopic("Artificial Intelligence");
        q_ai_easy_6.setDifficulty("Easy");
        qb.addQuestion(q_ai_easy_6);

        Question q_ai_easy_7 = new Question();
        q_ai_easy_7.setQuestion("What is a chatbot?");
        q_ai_easy_7.setOptions(Arrays.asList("A type of computer virus", "A software program that simulates human conversation", "A device for charging phones", "A small robot"));
        q_ai_easy_7.setAnswer("A software program that simulates human conversation");
        q_ai_easy_7.setTopic("Artificial Intelligence");
        q_ai_easy_7.setDifficulty("Easy");
        qb.addQuestion(q_ai_easy_7);

        Question q_ai_easy_8 = new Question();
        q_ai_easy_8.setQuestion("Which AI capability allows a system to understand human language?");
        q_ai_easy_8.setOptions(Arrays.asList("Image Recognition", "Natural Language Processing", "Robotics", "Predictive Analytics"));
        q_ai_easy_8.setAnswer("Natural Language Processing");
        q_ai_easy_8.setTopic("Artificial Intelligence");
        q_ai_easy_8.setDifficulty("Easy");
        qb.addQuestion(q_ai_easy_8);

        Question q_ai_easy_9 = new Question();
        q_ai_easy_9.setQuestion("What is the core idea behind Machine Learning?");
        q_ai_easy_9.setOptions(Arrays.asList("Teaching machines to do tasks explicitly", "Enabling machines to learn from data without explicit programming", "Making machines physically strong", "Designing machines with human-like features"));
        q_ai_easy_9.setAnswer("Enabling machines to learn from data without explicit programming");
        q_ai_easy_9.setTopic("Artificial Intelligence");
        q_ai_easy_9.setDifficulty("Easy");
        qb.addQuestion(q_ai_easy_9);

        Question q_ai_easy_10 = new Question();
        q_ai_easy_10.setQuestion("Which scientist is often considered the 'father of AI'?");
        q_ai_easy_10.setOptions(Arrays.asList("Albert Einstein", "Alan Turing", "Isaac Newton", "Stephen Hawking"));
        q_ai_easy_10.setAnswer("Alan Turing");
        q_ai_easy_10.setTopic("Artificial Intelligence");
        q_ai_easy_10.setDifficulty("Easy");
        qb.addQuestion(q_ai_easy_10);

        // Medium
        Question q_ai_medium_1 = new Question();
        q_ai_medium_1.setQuestion("Which branch of AI focuses on enabling computers to 'see' and interpret digital images?");
        q_ai_medium_1.setOptions(Arrays.asList("Natural Language Processing", "Robotics", "Computer Vision", "Expert Systems"));
        q_ai_medium_1.setAnswer("Computer Vision");
        q_ai_medium_1.setTopic("Artificial Intelligence");
        q_ai_medium_1.setDifficulty("Medium");
        qb.addQuestion(q_ai_medium_1);

        Question q_ai_medium_2 = new Question();
        q_ai_medium_2.setQuestion("What is the 'Turing Test' designed to assess?");
        q_ai_medium_2.setOptions(Arrays.asList("A computer's processing speed", "A machine's ability to exhibit intelligent behavior equivalent to, or indistinguishable from, that of a human", "The security of an AI system", "The memory capacity of an AI"));
        q_ai_medium_2.setAnswer("A machine's ability to exhibit intelligent behavior equivalent to, or indistinguishable from, that of a human");
        q_ai_medium_2.setTopic("Artificial Intelligence");
        q_ai_medium_2.setDifficulty("Medium");
        qb.addQuestion(q_ai_medium_2);

        Question q_ai_medium_3 = new Question();
        q_ai_medium_3.setQuestion("Which concept involves training neural networks with massive datasets?");
        q_ai_medium_3.setOptions(Arrays.asList("Shallow Learning", "Deep Learning", "Reinforcement Learning", "Supervised Learning"));
        q_ai_medium_3.setAnswer("Deep Learning");
        q_ai_medium_3.setTopic("Artificial Intelligence");
        q_ai_medium_3.setDifficulty("Medium");
        qb.addQuestion(q_ai_medium_3);

        Question q_ai_medium_4 = new Question();
        q_ai_medium_4.setQuestion("What kind of learning involves an AI agent learning by interacting with an environment and receiving rewards or penalties?");
        q_ai_medium_4.setOptions(Arrays.asList("Unsupervised Learning", "Supervised Learning", "Reinforcement Learning", "Semi-supervised Learning"));
        q_ai_medium_4.setAnswer("Reinforcement Learning");
        q_ai_medium_4.setTopic("Artificial Intelligence");
        q_ai_medium_4.setDifficulty("Medium");
        qb.addQuestion(q_ai_medium_4);

        Question q_ai_medium_5 = new Question();
        q_ai_medium_5.setQuestion("Which AI algorithm is used to classify data points into different groups based on similarity?");
        q_ai_medium_5.setOptions(Arrays.asList("Linear Regression", "Decision Tree", "K-Means Clustering", "Support Vector Machine"));
        q_ai_medium_5.setAnswer("K-Means Clustering");
        q_ai_medium_5.setTopic("Artificial Intelligence");
        q_ai_medium_5.setDifficulty("Medium");
        qb.addQuestion(q_ai_medium_5);

        Question q_ai_medium_6 = new Question();
        q_ai_medium_6.setQuestion("What is an 'Expert System' in AI?");
        q_ai_medium_6.setOptions(Arrays.asList("A system that can learn from scratch", "A system that mimics the decision-making ability of a human expert", "A system for building robots", "A system that predicts stock market trends"));
        q_ai_medium_6.setAnswer("A system that mimics the decision-making ability of a human expert");
        q_ai_medium_6.setTopic("Artificial Intelligence");
        q_ai_medium_6.setDifficulty("Medium");
        qb.addQuestion(q_ai_medium_6);

        Question q_ai_medium_7 = new Question();
        q_ai_medium_7.setQuestion("What does NLP stand for in the context of AI?");
        q_ai_medium_7.setOptions(Arrays.asList("New Language Protocol", "Natural Logic Programming", "Natural Language Processing", "Neural Linguistic Parameters"));
        q_ai_medium_7.setAnswer("Natural Language Processing");
        q_ai_medium_7.setTopic("Artificial Intelligence");
        q_ai_medium_7.setDifficulty("Medium");
        qb.addQuestion(q_ai_medium_7);

        Question q_ai_medium_8 = new Question();
        q_ai_medium_8.setQuestion("Which AI technique is often used for recommendation systems (e.g., Netflix, Amazon)?");
        q_ai_medium_8.setOptions(Arrays.asList("Computer Vision", "Natural Language Generation", "Collaborative Filtering", "Robotics"));
        q_ai_medium_8.setAnswer("Collaborative Filtering");
        q_ai_medium_8.setTopic("Artificial Intelligence");
        q_ai_medium_8.setDifficulty("Medium");
        qb.addQuestion(q_ai_medium_8);

        Question q_ai_medium_9 = new Question();
        q_ai_medium_9.setQuestion("What is 'Overfitting' in Machine Learning?");
        q_ai_medium_9.setOptions(Arrays.asList("When a model performs poorly on training data", "When a model learns the training data too well, including noise, and performs poorly on new data", "When a model is too simple to capture the underlying patterns", "When a model runs out of memory"));
        q_ai_medium_9.setAnswer("When a model learns the training data too well, including noise, and performs poorly on new data");
        q_ai_medium_9.setTopic("Artificial Intelligence");
        q_ai_medium_9.setDifficulty("Medium");
        qb.addQuestion(q_ai_medium_9);

        Question q_ai_medium_10 = new Question();
        q_ai_medium_10.setQuestion("Which concept in AI describes the ability of a system to understand the context of human speech?");
        q_ai_medium_10.setOptions(Arrays.asList("Speech Recognition", "Sentiment Analysis", "Contextual AI", "Syntax Analysis"));
        q_ai_medium_10.setAnswer("Contextual AI");
        q_ai_medium_10.setTopic("Artificial Intelligence");
        q_ai_medium_10.setDifficulty("Medium");
        qb.addQuestion(q_ai_medium_10);

        // Hard
        Question q_ai_hard_1 = new Question();
        q_ai_hard_1.setQuestion("What is the 'Vanishing Gradient Problem' in deep learning?");
        q_ai_hard_1.setOptions(Arrays.asList("Gradients become too large, causing instability", "Gradients become too small, preventing effective learning in deep networks", "Gradients disappear during backpropagation in shallow networks", "Gradients are not computed correctly"));
        q_ai_hard_1.setAnswer("Gradients become too small, preventing effective learning in deep networks");
        q_ai_hard_1.setTopic("Artificial Intelligence");
        q_ai_hard_1.setDifficulty("Hard");
        qb.addQuestion(q_ai_hard_1);

        Question q_ai_hard_2 = new Question();
        q_ai_hard_2.setQuestion("Which type of neural network is particularly effective for processing sequential data like text or time series?");
        q_ai_hard_2.setOptions(Arrays.asList("Convolutional Neural Network (CNN)", "Recurrent Neural Network (RNN)", "Feedforward Neural Network (FNN)", "Generative Adversarial Network (GAN)"));
        q_ai_hard_2.setAnswer("Recurrent Neural Network (RNN)");
        q_ai_hard_2.setTopic("Artificial Intelligence");
        q_ai_hard_2.setDifficulty("Hard");
        qb.addQuestion(q_ai_hard_2);

        Question q_ai_hard_3 = new Question();
        q_ai_hard_3.setQuestion("In AI, what does 'transfer learning' primarily involve?");
        q_ai_hard_3.setOptions(Arrays.asList("Transferring data between different models", "Training a model on a new task from scratch", "Reusing a pre-trained model as a starting point for a new task", "Transferring AI models between different hardware platforms"));
        q_ai_hard_3.setAnswer("Reusing a pre-trained model as a starting point for a new task");
        q_ai_hard_3.setTopic("Artificial Intelligence");
        q_ai_hard_3.setDifficulty("Hard");
        qb.addQuestion(q_ai_hard_3);

        Question q_ai_hard_4 = new Question();
        q_ai_hard_4.setQuestion("What is the primary function of a 'Generative Adversarial Network' (GAN)?");
        q_ai_hard_4.setOptions(Arrays.asList("To classify images into categories", "To generate new data instances that resemble the training data", "To predict future events based on past data", "To reduce the dimensionality of data"));
        q_ai_hard_4.setAnswer("To generate new data instances that resemble the training data");
        q_ai_hard_4.setTopic("Artificial Intelligence");
        q_ai_hard_4.setDifficulty("Hard");
        qb.addQuestion(q_ai_hard_4);

        Question q_ai_hard_5 = new Question();
        q_ai_hard_5.setQuestion("Which concept describes an AI's ability to 'reason' by using logical rules and knowledge representation?");
        q_ai_hard_5.setOptions(Arrays.asList("Heuristic Search", "Symbolic AI", "Evolutionary Computation", "Fuzzy Logic"));
        q_ai_hard_5.setAnswer("Symbolic AI");
        q_ai_hard_5.setTopic("Artificial Intelligence");
        q_ai_hard_5.setDifficulty("Hard");
        qb.addQuestion(q_ai_hard_5);

        Question q_ai_hard_6 = new Question();
        q_ai_hard_6.setQuestion("What is the purpose of 'Batch Normalization' in neural networks?");
        q_ai_hard_6.setOptions(Arrays.asList("To prevent overfitting by reducing model complexity", "To normalize input data before feeding it to the network", "To standardize the inputs to layers, helping to train deeper networks faster and more stably", "To reduce the number of parameters in a network"));
        q_ai_hard_6.setAnswer("To standardize the inputs to layers, helping to train deeper networks faster and more stably");
        q_ai_hard_6.setTopic("Artificial Intelligence");
        q_ai_hard_6.setDifficulty("Hard");
        qb.addQuestion(q_ai_hard_6);

        Question q_ai_hard_7 = new Question();
        q_ai_hard_7.setQuestion("Which algorithm is best suited for solving the 'multi-armed bandit problem' in reinforcement learning?");
        q_ai_hard_7.setOptions(Arrays.asList("Q-learning", "Dijkstra's algorithm", "A* search", "K-Nearest Neighbors"));
        q_ai_hard_7.setAnswer("Q-learning");
        q_ai_hard_7.setTopic("Artificial Intelligence");
        q_ai_hard_7.setDifficulty("Hard");
        qb.addQuestion(q_ai_hard_7);

        Question q_ai_hard_8 = new Question();
        q_ai_hard_8.setQuestion("What is the significance of the 'attention mechanism' in modern NLP models like Transformers?");
        q_ai_hard_8.setOptions(Arrays.asList("It helps the model focus on irrelevant parts of the input", "It allows the model to weigh the importance of different parts of the input sequence", "It reduces the computational cost of training", "It enables the model to generate longer sentences"));
        q_ai_hard_8.setAnswer("It allows the model to weigh the importance of different parts of the input sequence");
        q_ai_hard_8.setTopic("Artificial Intelligence");
        q_ai_hard_8.setDifficulty("Hard");
        qb.addQuestion(q_ai_hard_8);

        Question q_ai_hard_9 = new Question();
        q_ai_hard_9.setQuestion("What is the primary challenge addressed by 'Federated Learning'?");
        q_ai_hard_9.setOptions(Arrays.asList("Training models on centralized, massive datasets", "Enabling multiple organizations to train a shared model without sharing raw data", "Improving model accuracy through direct data exchange", "Reducing the computational power required for AI training"));
        q_ai_hard_9.setAnswer("Enabling multiple organizations to train a shared model without sharing raw data");
        q_ai_hard_9.setTopic("Artificial Intelligence");
        q_ai_hard_9.setDifficulty("Hard");
        qb.addQuestion(q_ai_hard_9);

        Question q_ai_hard_10 = new Question();
        q_ai_hard_10.setQuestion("Which concept in AI deals with the ethical considerations and potential biases in AI systems?");
        q_ai_hard_10.setOptions(Arrays.asList("AI Ethics", "AI Optimization", "AI Debugging", "AI Security"));
        q_ai_hard_10.setAnswer("AI Ethics");
        q_ai_hard_10.setTopic("Artificial Intelligence");
        q_ai_hard_10.setDifficulty("Hard");
        qb.addQuestion(q_ai_hard_10);

        // --- General Knowledge Questions ---
        // Easy
        Question q_gk_easy_1 = new Question();
        q_gk_easy_1.setQuestion("What is the capital of France?");
        q_gk_easy_1.setOptions(Arrays.asList("Berlin", "Madrid", "Rome", "Paris"));
        q_gk_easy_1.setAnswer("Paris");
        q_gk_easy_1.setTopic("General Knowledge");
        q_gk_easy_1.setDifficulty("Easy");
        qb.addQuestion(q_gk_easy_1);

        Question q_gk_easy_2 = new Question();
        q_gk_easy_2.setQuestion("Which planet is known as the 'Red Planet'?");
        q_gk_easy_2.setOptions(Arrays.asList("Earth", "Mars", "Jupiter", "Venus"));
        q_gk_easy_2.setAnswer("Mars");
        q_gk_easy_2.setTopic("General Knowledge");
        q_gk_easy_2.setDifficulty("Easy");
        qb.addQuestion(q_gk_easy_2);

        Question q_gk_easy_3 = new Question();
        q_gk_easy_3.setQuestion("What is the largest ocean on Earth?");
        q_gk_easy_3.setOptions(Arrays.asList("Atlantic Ocean", "Indian Ocean", "Arctic Ocean", "Pacific Ocean"));
        q_gk_easy_3.setAnswer("Pacific Ocean");
        q_gk_easy_3.setTopic("General Knowledge");
        q_gk_easy_3.setDifficulty("Easy");
        qb.addQuestion(q_gk_easy_3);

        Question q_gk_easy_4 = new Question();
        q_gk_easy_4.setQuestion("How many continents are there in the world?");
        q_gk_easy_4.setOptions(Arrays.asList("5", "6", "7", "8"));
        q_gk_easy_4.setAnswer("7");
        q_gk_easy_4.setTopic("General Knowledge");
        q_gk_easy_4.setDifficulty("Easy");
        qb.addQuestion(q_gk_easy_4);

        Question q_gk_easy_5 = new Question();
        q_gk_easy_5.setQuestion("What is the chemical symbol for water?");
        q_gk_easy_5.setOptions(Arrays.asList("O2", "H2O", "CO2", "NaCl"));
        q_gk_easy_5.setAnswer("H2O");
        q_gk_easy_5.setTopic("General Knowledge");
        q_gk_easy_5.setDifficulty("Easy");
        qb.addQuestion(q_gk_easy_5);

        Question q_gk_easy_6 = new Question();
        q_gk_easy_6.setQuestion("Who painted the Mona Lisa?");
        q_gk_easy_6.setOptions(Arrays.asList("Vincent van Gogh", "Pablo Picasso", "Leonardo da Vinci", "Claude Monet"));
        q_gk_easy_6.setAnswer("Leonardo da Vinci");
        q_gk_easy_6.setTopic("General Knowledge");
        q_gk_easy_6.setDifficulty("Easy");
        qb.addQuestion(q_gk_easy_6);

        Question q_gk_easy_7 = new Question();
        q_gk_easy_7.setQuestion("What is the highest mountain in the world?");
        q_gk_easy_7.setOptions(Arrays.asList("K2", "Mount Everest", "Kangchenjunga", "Lhotse"));
        q_gk_easy_7.setAnswer("Mount Everest");
        q_gk_easy_7.setTopic("General Knowledge");
        q_gk_easy_7.setDifficulty("Easy");
        qb.addQuestion(q_gk_easy_7);

        Question q_gk_easy_8 = new Question();
        q_gk_easy_8.setQuestion("Which country is known as the 'Land of the Rising Sun'?");
        q_gk_easy_8.setOptions(Arrays.asList("China", "South Korea", "Japan", "Thailand"));
        q_gk_easy_8.setAnswer("Japan");
        q_gk_easy_8.setTopic("General Knowledge");
        q_gk_easy_8.setDifficulty("Easy");
        qb.addQuestion(q_gk_easy_8);

        Question q_gk_easy_9 = new Question();
        q_gk_easy_9.setQuestion("What is the common name for a baby goat?");
        q_gk_easy_9.setOptions(Arrays.asList("Calf", "Kid", "Lamb", "Chick"));
        q_gk_easy_9.setAnswer("Kid");
        q_gk_easy_9.setTopic("General Knowledge");
        q_gk_easy_9.setDifficulty("Easy");
        qb.addQuestion(q_gk_easy_9);

        Question q_gk_easy_10 = new Question();
        q_gk_easy_10.setQuestion("What is the fastest animal on two legs?");
        q_gk_easy_10.setOptions(Arrays.asList("Ostrich", "Cheetah", "Kangaroo", "Human"));
        q_gk_easy_10.setAnswer("Ostrich");
        q_gk_easy_10.setTopic("General Knowledge");
        q_gk_easy_10.setDifficulty("Easy");
        qb.addQuestion(q_gk_easy_10);

        // Medium
        Question q_gk_medium_1 = new Question();
        q_gk_medium_1.setQuestion("Which ancient civilization built the pyramids?");
        q_gk_medium_1.setOptions(Arrays.asList("Roman", "Greek", "Egyptian", "Mayan"));
        q_gk_medium_1.setAnswer("Egyptian");
        q_gk_medium_1.setTopic("General Knowledge");
        q_gk_medium_1.setDifficulty("Medium");
        qb.addQuestion(q_gk_medium_1);

        Question q_gk_medium_2 = new Question();
        q_gk_medium_2.setQuestion("What is the longest river in the world?");
        q_gk_medium_2.setOptions(Arrays.asList("Amazon River", "Nile River", "Yangtze River", "Mississippi River"));
        q_gk_medium_2.setAnswer("Nile River");
        q_gk_medium_2.setTopic("General Knowledge");
        q_gk_medium_2.setDifficulty("Medium");
        qb.addQuestion(q_gk_medium_2);

        Question q_gk_medium_3 = new Question();
        q_gk_medium_3.setQuestion("In which year did the Titanic sink?");
        q_gk_medium_3.setOptions(Arrays.asList("1905", "1912", "1918", "1923"));
        q_gk_medium_3.setAnswer("1912");
        q_gk_medium_3.setTopic("General Knowledge");
        q_gk_medium_3.setDifficulty("Medium");
        qb.addQuestion(q_gk_medium_3);

        Question q_gk_medium_4 = new Question();
        q_gk_medium_4.setQuestion("What is the capital city of Australia?");
        q_gk_medium_4.setOptions(Arrays.asList("Sydney", "Melbourne", "Canberra", "Brisbane"));
        q_gk_medium_4.setAnswer("Canberra");
        q_gk_medium_4.setTopic("General Knowledge");
        q_gk_medium_4.setDifficulty("Medium");
        qb.addQuestion(q_gk_medium_4);

        Question q_gk_medium_5 = new Question();
        q_gk_medium_5.setQuestion("Which element has the chemical symbol 'Fe'?");
        q_gk_medium_5.setOptions(Arrays.asList("Fluorine", "Iron", "Gold", "Silver"));
        q_gk_medium_5.setAnswer("Iron");
        q_gk_medium_5.setTopic("General Knowledge");
        q_gk_medium_5.setDifficulty("Medium");
        qb.addQuestion(q_gk_medium_5);

        Question q_gk_medium_6 = new Question();
        q_gk_medium_6.setQuestion("Who wrote the play 'Romeo and Juliet'?");
        q_gk_medium_6.setOptions(Arrays.asList("Charles Dickens", "William Shakespeare", "Jane Austen", "Mark Twain"));
        q_gk_medium_6.setAnswer("William Shakespeare");
        q_gk_medium_6.setTopic("General Knowledge");
        q_gk_medium_6.setDifficulty("Medium");
        qb.addQuestion(q_gk_medium_6);

        Question q_gk_medium_7 = new Question();
        q_gk_medium_7.setQuestion("What is the national animal of Canada?");
        q_gk_medium_7.setOptions(Arrays.asList("Moose", "Beaver", "Polar Bear", "Grizzly Bear"));
        q_gk_medium_7.setAnswer("Beaver");
        q_gk_medium_7.setTopic("General Knowledge");
        q_gk_medium_7.setDifficulty("Medium");
        qb.addQuestion(q_gk_medium_7);

        Question q_gk_medium_8 = new Question();
        q_gk_medium_8.setQuestion("Which country is famous for the Eiffel Tower?");
        q_gk_medium_8.setOptions(Arrays.asList("Italy", "Spain", "Germany", "France"));
        q_gk_medium_8.setAnswer("France");
        q_gk_medium_8.setTopic("General Knowledge");
        q_gk_medium_8.setDifficulty("Medium");
        qb.addQuestion(q_gk_medium_8);

        Question q_gk_medium_9 = new Question();
        q_gk_medium_9.setQuestion("What is the human body's largest organ?");
        q_gk_medium_9.setOptions(Arrays.asList("Heart", "Brain", "Skin", "Liver"));
        q_gk_medium_9.setAnswer("Skin");
        q_gk_medium_9.setTopic("General Knowledge");
        q_gk_medium_9.setDifficulty("Medium");
        qb.addQuestion(q_gk_medium_9);

        Question q_gk_medium_10 = new Question();
        q_gk_medium_10.setQuestion("Which musical instrument has black and white keys?");
        q_gk_medium_10.setOptions(Arrays.asList("Guitar", "Drums", "Piano", "Violin"));
        q_gk_medium_10.setAnswer("Piano");
        q_gk_medium_10.setTopic("General Knowledge");
        q_gk_medium_10.setDifficulty("Medium");
        qb.addQuestion(q_gk_medium_10);

        // Hard
        Question q_gk_hard_1 = new Question();
        q_gk_hard_1.setQuestion("Which philosopher is famous for the quote 'I think, therefore I am'?");
        q_gk_hard_1.setOptions(Arrays.asList("Socrates", "Plato", "René Descartes", "Aristotle"));
        q_gk_hard_1.setAnswer("René Descartes");
        q_gk_hard_1.setTopic("General Knowledge");
        q_gk_hard_1.setDifficulty("Hard");
        qb.addQuestion(q_gk_hard_1);

        Question q_gk_hard_2 = new Question();
        q_gk_hard_2.setQuestion("What is the only letter in the alphabet that does not appear in the name of any U.S. state?");
        q_gk_hard_2.setOptions(Arrays.asList("Z", "X", "Q", "J"));
        q_gk_hard_2.setAnswer("Q");
        q_gk_hard_2.setTopic("General Knowledge");
        q_gk_hard_2.setDifficulty("Hard");
        qb.addQuestion(q_gk_hard_2);

        Question q_gk_hard_3 = new Question();
        q_gk_hard_3.setQuestion("Which country has the most natural lakes?");
        q_gk_hard_3.setOptions(Arrays.asList("USA", "Canada", "Russia", "China"));
        q_gk_hard_3.setAnswer("Canada");
        q_gk_hard_3.setTopic("General Knowledge");
        q_gk_hard_3.setDifficulty("Hard");
        qb.addQuestion(q_gk_hard_3);

        Question q_gk_hard_4 = new Question();
        q_gk_hard_4.setQuestion("What is the name of the smallest independent state in the world?");
        q_gk_hard_4.setOptions(Arrays.asList("Monaco", "San Marino", "Vatican City", "Liechtenstein"));
        q_gk_hard_4.setAnswer("Vatican City");
        q_gk_hard_4.setTopic("General Knowledge");
        q_gk_hard_4.setDifficulty("Hard");
        qb.addQuestion(q_gk_hard_4);

        Question q_gk_hard_5 = new Question();
        q_gk_hard_5.setQuestion("Which year marked the end of World War II?");
        q_gk_hard_5.setOptions(Arrays.asList("1942", "1945", "1948", "1950"));
        q_gk_hard_5.setAnswer("1945");
        q_gk_hard_5.setTopic("General Knowledge");
        q_gk_hard_5.setDifficulty("Hard");
        qb.addQuestion(q_gk_hard_5);

        Question q_gk_hard_6 = new Question();
        q_gk_hard_6.setQuestion("Which ocean is the only one named after a country?");
        q_gk_hard_6.setOptions(Arrays.asList("Atlantic Ocean", "Pacific Ocean", "Indian Ocean", "Arctic Ocean"));
        q_gk_hard_6.setAnswer("Indian Ocean");
        q_gk_hard_6.setTopic("General Knowledge");
        q_gk_hard_6.setDifficulty("Hard");
        qb.addQuestion(q_gk_hard_6);

        Question q_gk_hard_7 = new Question();
        q_gk_hard_7.setQuestion("What is the rarest blood type in humans?");
        q_gk_hard_7.setOptions(Arrays.asList("O negative", "AB negative", "A positive", "B positive"));
        q_gk_hard_7.setAnswer("AB negative");
        q_gk_hard_7.setTopic("General Knowledge");
        q_gk_hard_7.setDifficulty("Hard");
        qb.addQuestion(q_gk_hard_7);

        Question q_gk_hard_8 = new Question();
        q_gk_hard_8.setQuestion("Which country has the most time zones?");
        q_gk_hard_8.setOptions(Arrays.asList("Russia", "China", "USA", "France"));
        q_gk_hard_8.setAnswer("France"); // Including overseas territories
        q_gk_hard_8.setTopic("General Knowledge");
        q_gk_hard_8.setDifficulty("Hard");
        qb.addQuestion(q_gk_hard_8);

        Question q_gk_hard_9 = new Question();
        q_gk_hard_9.setQuestion("What is the name of the deepest point in Earth's oceans?");
        q_gk_hard_9.setOptions(Arrays.asList("Puerto Rico Trench", "Mariana Trench", "Java Trench", "Kermadec Trench"));
        q_gk_hard_9.setAnswer("Mariana Trench");
        q_gk_hard_9.setTopic("General Knowledge");
        q_gk_hard_9.setDifficulty("Hard");
        qb.addQuestion(q_gk_hard_9);

        Question q_gk_hard_10 = new Question();
        q_gk_hard_10.setQuestion("Which ancient wonder of the world is still standing today?");
        q_gk_hard_10.setOptions(Arrays.asList("Hanging Gardens of Babylon", "Lighthouse of Alexandria", "Pyramid of Giza", "Colossus of Rhodes"));
        q_gk_hard_10.setAnswer("Pyramid of Giza");
        q_gk_hard_10.setTopic("General Knowledge");
        q_gk_hard_10.setDifficulty("Hard");
        qb.addQuestion(q_gk_hard_10);

        // --- History Questions ---
        // Easy
        Question q_history_easy_1 = new Question();
        q_history_easy_1.setQuestion("Who was the first President of the United States?");
        q_history_easy_1.setOptions(Arrays.asList("Abraham Lincoln", "Thomas Jefferson", "George Washington", "John Adams"));
        q_history_easy_1.setAnswer("George Washington");
        q_history_easy_1.setTopic("History");
        q_history_easy_1.setDifficulty("Easy");
        qb.addQuestion(q_history_easy_1);

        Question q_history_easy_2 = new Question();
        q_history_easy_2.setQuestion("Which ancient civilization invented paper?");
        q_history_easy_2.setOptions(Arrays.asList("Roman", "Greek", "Chinese", "Egyptian"));
        q_history_easy_2.setAnswer("Chinese");
        q_history_easy_2.setTopic("History");
        q_history_easy_2.setDifficulty("Easy");
        qb.addQuestion(q_history_easy_2);

        Question q_history_easy_3 = new Question();
        q_history_easy_3.setQuestion("What year did the Berlin Wall fall?");
        q_history_easy_3.setOptions(Arrays.asList("1985", "1989", "1991", "1995"));
        q_history_easy_3.setAnswer("1989");
        q_history_easy_3.setTopic("History");
        q_history_easy_3.setDifficulty("Easy");
        qb.addQuestion(q_history_easy_3);

        Question q_history_easy_4 = new Question();
        q_history_easy_4.setQuestion("Who was a famous queen of ancient Egypt?");
        q_history_easy_4.setOptions(Arrays.asList("Nefertiti", "Cleopatra", "Hatshepsut", "Ankhesenamun"));
        q_history_easy_4.setAnswer("Cleopatra");
        q_history_easy_4.setTopic("History");
        q_history_easy_4.setDifficulty("Easy");
        qb.addQuestion(q_history_easy_4);

        Question q_history_easy_5 = new Question();
        q_history_easy_5.setQuestion("Which famous explorer discovered America in 1492?");
        q_history_easy_5.setOptions(Arrays.asList("Ferdinand Magellan", "Vasco da Gama", "Christopher Columbus", "Marco Polo"));
        q_history_easy_5.setAnswer("Christopher Columbus");
        q_history_easy_5.setTopic("History");
        q_history_easy_5.setDifficulty("Easy");
        qb.addQuestion(q_history_easy_5);

        Question q_history_easy_6 = new Question();
        q_history_easy_6.setQuestion("What was the primary weapon of medieval knights?");
        q_history_easy_6.setOptions(Arrays.asList("Bow and Arrow", "Sword", "Spear", "Axe"));
        q_history_easy_6.setAnswer("Sword");
        q_history_easy_6.setTopic("History");
        q_history_easy_6.setDifficulty("Easy");
        qb.addQuestion(q_history_easy_6);

        Question q_history_easy_7 = new Question();
        q_history_easy_7.setQuestion("Which country was ruled by the Roman Empire?");
        q_history_easy_7.setOptions(Arrays.asList("Greece", "Egypt", "Italy", "All of the above"));
        q_history_easy_7.setAnswer("All of the above");
        q_history_easy_7.setTopic("History");
        q_history_easy_7.setDifficulty("Easy");
        qb.addQuestion(q_history_easy_7);

        Question q_history_easy_8 = new Question();
        q_history_easy_8.setQuestion("What major historical event began in 1914?");
        q_history_easy_8.setOptions(Arrays.asList("World War I", "World War II", "The Great Depression", "The Cold War"));
        q_history_easy_8.setAnswer("World War I");
        q_history_easy_8.setTopic("History");
        q_history_easy_8.setDifficulty("Easy");
        qb.addQuestion(q_history_easy_8);

        Question q_history_easy_9 = new Question();
        q_history_easy_9.setQuestion("Who was the leader of Nazi Germany during World War II?");
        q_history_easy_9.setOptions(Arrays.asList("Benito Mussolini", "Joseph Stalin", "Winston Churchill", "Adolf Hitler"));
        q_history_easy_9.setAnswer("Adolf Hitler");
        q_history_easy_9.setTopic("History");
        q_history_easy_9.setDifficulty("Easy");
        qb.addQuestion(q_history_easy_9);

        Question q_history_easy_10 = new Question();
        q_history_easy_10.setQuestion("What was the name of the first permanent English settlement in North America?");
        q_history_easy_10.setOptions(Arrays.asList("Plymouth", "Roanoke", "Jamestown", "Boston"));
        q_history_easy_10.setAnswer("Jamestown");
        q_history_easy_10.setTopic("History");
        q_history_easy_10.setDifficulty("Easy");
        qb.addQuestion(q_history_easy_10);

        // Medium
        Question q_history_medium_1 = new Question();
        q_history_medium_1.setQuestion("The fall of the Western Roman Empire is traditionally dated to which year?");
        q_history_medium_1.setOptions(Arrays.asList("395 AD", "410 AD", "476 AD", "527 AD"));
        q_history_medium_1.setAnswer("476 AD");
        q_history_medium_1.setTopic("History");
        q_history_medium_1.setDifficulty("Medium");
        qb.addQuestion(q_history_medium_1);

        Question q_history_medium_2 = new Question();
        q_history_medium_2.setQuestion("Who was the primary author of the Declaration of Independence?");
        q_history_medium_2.setOptions(Arrays.asList("George Washington", "Benjamin Franklin", "Thomas Jefferson", "John Adams"));
        q_history_medium_2.setAnswer("Thomas Jefferson");
        q_history_medium_2.setTopic("History");
        q_history_medium_2.setDifficulty("Medium");
        qb.addQuestion(q_history_medium_2);

        Question q_history_medium_3 = new Question();
        q_history_medium_3.setQuestion("The 'Black Death' (bubonic plague) ravaged Europe in which century?");
        q_history_medium_3.setOptions(Arrays.asList("12th century", "13th century", "14th century", "15th century"));
        q_history_medium_3.setAnswer("14th century");
        q_history_medium_3.setTopic("History");
        q_history_medium_3.setDifficulty("Medium");
        qb.addQuestion(q_history_medium_3);

        Question q_history_medium_4 = new Question();
        q_history_medium_4.setQuestion("What was the Cold War primarily about?");
        q_history_medium_4.setOptions(Arrays.asList("A direct military conflict", "An ideological and geopolitical rivalry between the US and USSR", "A trade war", "A religious conflict"));
        q_history_medium_4.setAnswer("An ideological and geopolitical rivalry between the US and USSR");
        q_history_medium_4.setTopic("History");
        q_history_medium_4.setDifficulty("Medium");
        qb.addQuestion(q_history_medium_4);

        Question q_history_medium_5 = new Question();
        q_history_medium_5.setQuestion("Who led the Soviet Union during the Cuban Missile Crisis?");
        q_history_medium_5.setOptions(Arrays.asList("Joseph Stalin", "Mikhail Gorbachev", "Nikita Khrushchev", "Vladimir Lenin"));
        q_history_medium_5.setAnswer("Nikita Khrushchev");
        q_history_medium_5.setTopic("History");
        q_history_medium_5.setDifficulty("Medium");
        qb.addQuestion(q_history_medium_5);

        Question q_history_medium_6 = new Question();
        q_history_medium_6.setQuestion("The Magna Carta, a foundational document for constitutional law, was signed in which year?");
        q_history_medium_6.setOptions(Arrays.asList("1066", "1215", "1492", "1688"));
        q_history_medium_6.setAnswer("1215");
        q_history_medium_6.setTopic("History");
        q_history_medium_6.setDifficulty("Medium");
        qb.addQuestion(q_history_medium_6);

        Question q_history_medium_7 = new Question();
        q_history_medium_7.setQuestion("Which ancient city was buried by the eruption of Mount Vesuvius?");
        q_history_medium_7.setOptions(Arrays.asList("Rome", "Athens", "Pompeii", "Alexandria"));
        q_history_medium_7.setAnswer("Pompeii");
        q_history_medium_7.setTopic("History");
        q_history_medium_7.setDifficulty("Medium");
        qb.addQuestion(q_history_medium_7);

        Question q_history_medium_8 = new Question();
        q_history_medium_8.setQuestion("Who was the last Tsar of Russia?");
        q_history_medium_8.setOptions(Arrays.asList("Peter the Great", "Ivan the Terrible", "Nicholas II", "Alexander I"));
        q_history_medium_8.setAnswer("Nicholas II");
        q_history_medium_8.setTopic("History");
        q_history_medium_8.setDifficulty("Medium");
        qb.addQuestion(q_history_medium_8);

        Question q_history_medium_9 = new Question();
        q_history_medium_9.setQuestion("The Renaissance began in which country?");
        q_history_medium_9.setOptions(Arrays.asList("France", "Germany", "England", "Italy"));
        q_history_medium_9.setAnswer("Italy");
        q_history_medium_9.setTopic("History");
        q_history_medium_9.setDifficulty("Medium");
        qb.addQuestion(q_history_medium_9);

        Question q_history_medium_10 = new Question();
        q_history_medium_10.setQuestion("Which historical figure is associated with the phrase 'Veni, vidi, vici' (I came, I saw, I conquered)?");
        q_history_medium_10.setOptions(Arrays.asList("Alexander the Great", "Julius Caesar", "Napoleon Bonaparte", "Attila the Hun"));
        q_history_medium_10.setAnswer("Julius Caesar");
        q_history_medium_10.setTopic("History");
        q_history_medium_10.setDifficulty("Medium");
        qb.addQuestion(q_history_medium_10);

        // Hard
        Question q_history_hard_1 = new Question();
        q_history_hard_1.setQuestion("The Treaty of Versailles, which formally ended World War I, was signed in which year?");
        q_history_hard_1.setOptions(Arrays.asList("1917", "1918", "1919", "1920"));
        q_history_hard_1.setAnswer("1919");
        q_history_hard_1.setTopic("History");
        q_history_hard_1.setDifficulty("Hard");
        qb.addQuestion(q_history_hard_1);

        Question q_history_hard_2 = new Question();
        q_history_hard_2.setQuestion("Which event is widely considered the start of the Great Depression?");
        q_history_hard_2.setOptions(Arrays.asList("Black Monday (1929)", "Pearl Harbor Attack", "Assassination of Archduke Franz Ferdinand", "The Treaty of Versailles"));
        q_history_hard_2.setAnswer("Black Monday (1929)");
        q_history_hard_2.setTopic("History");
        q_history_hard_2.setDifficulty("Hard");
        qb.addQuestion(q_history_hard_2);

        Question q_history_hard_3 = new Question();
        q_history_hard_3.setQuestion("Who was the last pharaoh of ancient Egypt?");
        q_history_hard_3.setOptions(Arrays.asList("Hatshepsut", "Akhenaten", "Tutankhamun", "Cleopatra VII"));
        q_history_hard_3.setAnswer("Cleopatra VII");
        q_history_hard_3.setTopic("History");
        q_history_hard_3.setDifficulty("Hard");
        qb.addQuestion(q_history_hard_3);

        Question q_history_hard_4 = new Question();
        q_history_hard_4.setQuestion("The 'Glorious Revolution' of 1688 primarily took place in which country?");
        q_history_hard_4.setOptions(Arrays.asList("France", "England", "Germany", "Netherlands"));
        q_history_hard_4.setAnswer("England");
        q_history_hard_4.setTopic("History");
        q_history_hard_4.setDifficulty("Hard");
        qb.addQuestion(q_history_hard_4);

        Question q_history_hard_5 = new Question();
        q_history_hard_5.setQuestion("Which Roman emperor made Christianity the state religion of the Roman Empire?");
        q_history_hard_5.setOptions(Arrays.asList("Augustus", "Nero", "Constantine the Great", "Diocletian"));
        q_history_hard_5.setAnswer("Constantine the Great");
        q_history_hard_5.setTopic("History");
        q_history_hard_5.setDifficulty("Hard");
        qb.addQuestion(q_history_hard_5);

        Question q_history_hard_6 = new Question();
        q_history_hard_6.setQuestion("The Ottoman Empire officially ended and was replaced by Turkey in what year?");
        q_history_hard_6.setOptions(Arrays.asList("1918", "1922", "1924", "1930"));
        q_history_hard_6.setAnswer("1922");
        q_history_hard_6.setTopic("History");
        q_history_hard_6.setDifficulty("Hard");
        qb.addQuestion(q_history_hard_6);

        Question q_history_hard_7 = new Question();
        q_history_hard_7.setQuestion("Who was the leader of the Soviet Union at the time of its dissolution?");
        q_history_hard_7.setOptions(Arrays.asList("Leonid Brezhnev", "Nikita Khrushchev", "Mikhail Gorbachev", "Boris Yeltsin"));
        q_history_hard_7.setAnswer("Mikhail Gorbachev");
        q_history_hard_7.setTopic("History");
        q_history_hard_7.setDifficulty("Hard");
        qb.addQuestion(q_history_hard_7);

        Question q_history_hard_8 = new Question();
        q_history_hard_8.setQuestion("The 'Opium Wars' were primarily fought between which two countries?");
        q_history_hard_8.setOptions(Arrays.asList("Britain and India", "China and Japan", "Britain and China", "France and China"));
        q_history_hard_8.setAnswer("Britain and China");
        q_history_hard_8.setTopic("History");
        q_history_hard_8.setDifficulty("Hard");
        qb.addQuestion(q_history_hard_8);

        Question q_history_hard_9 = new Question();
        q_history_hard_9.setQuestion("Which document, signed in 1787, established the framework for the United States government?");
        q_history_hard_9.setOptions(Arrays.asList("Declaration of Independence", "Articles of Confederation", "U.S. Constitution", "Bill of Rights"));
        q_history_hard_9.setAnswer("U.S. Constitution");
        q_history_hard_9.setTopic("History");
        q_history_hard_9.setDifficulty("Hard");
        qb.addQuestion(q_history_hard_9);

        Question q_history_hard_10 = new Question();
        q_history_hard_10.setQuestion("What was the primary goal of the 'Manhattan Project' during WWII?");
        q_history_hard_10.setOptions(Arrays.asList("To develop radar technology", "To break the Enigma code", "To develop the atomic bomb", "To design advanced fighter jets"));
        q_history_hard_10.setAnswer("To develop the atomic bomb");
        q_history_hard_10.setTopic("History");
        q_history_hard_10.setDifficulty("Hard");
        qb.addQuestion(q_history_hard_10);

        // --- Mathematics Questions ---
        // Easy
        Question q_math_easy_1 = new Question();
        q_math_easy_1.setQuestion("What is 5 + 3?");
        q_math_easy_1.setOptions(Arrays.asList("7", "8", "9", "10"));
        q_math_easy_1.setAnswer("8");
        q_math_easy_1.setTopic("Mathematics");
        q_math_easy_1.setDifficulty("Easy");
        qb.addQuestion(q_math_easy_1);

        Question q_math_easy_2 = new Question();
        q_math_easy_2.setQuestion("What is the product of 4 and 6?");
        q_math_easy_2.setOptions(Arrays.asList("10", "24", "2", "16"));
        q_math_easy_2.setAnswer("24");
        q_math_easy_2.setTopic("Mathematics");
        q_math_easy_2.setDifficulty("Easy");
        qb.addQuestion(q_math_easy_2);

        Question q_math_easy_3 = new Question();
        q_math_easy_3.setQuestion("How many sides does a triangle have?");
        q_math_easy_3.setOptions(Arrays.asList("2", "3", "4", "5"));
        q_math_easy_3.setAnswer("3");
        q_math_easy_3.setTopic("Mathematics");
        q_math_easy_3.setDifficulty("Easy");
        qb.addQuestion(q_math_easy_3);

        Question q_math_easy_4 = new Question();
        q_math_easy_4.setQuestion("What is the value of Pi (π) rounded to two decimal places?");
        q_math_easy_4.setOptions(Arrays.asList("3.00", "3.14", "3.41", "3.50"));
        q_math_easy_4.setAnswer("3.14");
        q_math_easy_4.setTopic("Mathematics");
        q_math_easy_4.setDifficulty("Easy");
        qb.addQuestion(q_math_easy_4);

        Question q_math_easy_5 = new Question();
        q_math_easy_5.setQuestion("What is the square root of 9?");
        q_math_easy_5.setOptions(Arrays.asList("2", "3", "4", "81"));
        q_math_easy_5.setAnswer("3");
        q_math_easy_5.setTopic("Mathematics");
        q_math_easy_5.setDifficulty("Easy");
        qb.addQuestion(q_math_easy_5);

        Question q_math_easy_6 = new Question();
        q_math_easy_6.setQuestion("If a car travels at 60 miles per hour, how far will it travel in 2 hours?");
        q_math_easy_6.setOptions(Arrays.asList("30 miles", "60 miles", "90 miles", "120 miles"));
        q_math_easy_6.setAnswer("120 miles");
        q_math_easy_6.setTopic("Mathematics");
        q_math_easy_6.setDifficulty("Easy");
        qb.addQuestion(q_math_easy_6);

        Question q_math_easy_7 = new Question();
        q_math_easy_7.setQuestion("What is the sum of the angles in a straight line?");
        q_math_easy_7.setOptions(Arrays.asList("90 degrees", "180 degrees", "270 degrees", "360 degrees"));
        q_math_easy_7.setAnswer("180 degrees");
        q_math_easy_7.setTopic("Mathematics");
        q_math_easy_7.setDifficulty("Easy");
        qb.addQuestion(q_math_easy_7);

        Question q_math_easy_8 = new Question();
        q_math_easy_8.setQuestion("What is the smallest prime number?");
        q_math_easy_8.setOptions(Arrays.asList("0", "1", "2", "3"));
        q_math_easy_8.setAnswer("2");
        q_math_easy_8.setTopic("Mathematics");
        q_math_easy_8.setDifficulty("Easy");
        qb.addQuestion(q_math_easy_8);

        Question q_math_easy_9 = new Question();
        q_math_easy_9.setQuestion("What is the result of 15 divided by 3?");
        q_math_easy_9.setOptions(Arrays.asList("3", "4", "5", "6"));
        q_math_easy_9.setAnswer("5");
        q_math_easy_9.setTopic("Mathematics");
        q_math_easy_9.setDifficulty("Easy");
        qb.addQuestion(q_math_easy_9);

        Question q_math_easy_10 = new Question();
        q_math_easy_10.setQuestion("How many sides does a circle have?");
        q_math_easy_10.setOptions(Arrays.asList("0", "1", "2", "Infinite"));
        q_math_easy_10.setAnswer("0");
        q_math_easy_10.setTopic("Mathematics");
        q_math_easy_10.setDifficulty("Easy");
        qb.addQuestion(q_math_easy_10);

        // Medium
        Question q_math_medium_1 = new Question();
        q_math_medium_1.setQuestion("What is the next number in the Fibonacci sequence: 0, 1, 1, 2, 3, 5, 8, ...?");
        q_math_medium_1.setOptions(Arrays.asList("10", "11", "12", "13"));
        q_math_medium_1.setAnswer("13");
        q_math_medium_1.setTopic("Mathematics");
        q_math_medium_1.setDifficulty("Medium");
        qb.addQuestion(q_math_medium_1);

        Question q_math_medium_2 = new Question();
        q_math_medium_2.setQuestion("If a right-angled triangle has sides of length 3 and 4, what is the length of the hypotenuse?");
        q_math_medium_2.setOptions(Arrays.asList("4", "5", "6", "7"));
        q_math_medium_2.setAnswer("5");
        q_math_medium_2.setTopic("Mathematics");
        q_math_medium_2.setDifficulty("Medium");
        qb.addQuestion(q_math_medium_2);

        Question q_math_medium_3 = new Question();
        q_math_medium_3.setQuestion("What is the value of 7 factorial (7!)?");
        q_math_medium_3.setOptions(Arrays.asList("49", "720", "5040", "1440"));
        q_math_medium_3.setAnswer("5040");
        q_math_medium_3.setTopic("Mathematics");
        q_math_medium_3.setDifficulty("Medium");
        qb.addQuestion(q_math_medium_3);

        Question q_math_medium_4 = new Question();
        q_math_medium_4.setQuestion("What type of number is 0.333... (repeating decimal)?");
        q_math_medium_4.setOptions(Arrays.asList("Integer", "Irrational Number", "Rational Number", "Prime Number"));
        q_math_medium_4.setAnswer("Rational Number");
        q_math_medium_4.setTopic("Mathematics");
        q_math_medium_4.setDifficulty("Medium");
        qb.addQuestion(q_math_medium_4);

        Question q_math_medium_5 = new Question();
        q_math_medium_5.setQuestion("What is the formula for the area of a circle?");
        q_math_medium_5.setOptions(Arrays.asList("πr", "2πr", "πr²", "r²"));
        q_math_medium_5.setAnswer("πr²");
        q_math_medium_5.setTopic("Mathematics");
        q_math_medium_5.setDifficulty("Medium");
        qb.addQuestion(q_math_medium_5);

        Question q_math_medium_6 = new Question();
        q_math_medium_6.setQuestion("If x + 7 = 15, what is x?");
        q_math_medium_6.setOptions(Arrays.asList("8", "9", "10", "22"));
        q_math_medium_6.setAnswer("8");
        q_math_medium_6.setTopic("Mathematics");
        q_math_medium_6.setDifficulty("Medium");
        qb.addQuestion(q_math_medium_6);

        Question q_math_medium_7 = new Question();
        q_math_medium_7.setQuestion("What is the definition of a prime number?");
        q_math_medium_7.setOptions(Arrays.asList("A number divisible by 2", "A number greater than 1 that has no positive divisors other than 1 and itself", "Any odd number", "A number with exactly two divisors"));
        q_math_medium_7.setAnswer("A number greater than 1 that has no positive divisors other than 1 and itself");
        q_math_medium_7.setTopic("Mathematics");
        q_math_medium_7.setDifficulty("Medium");
        qb.addQuestion(q_math_medium_7);

        Question q_math_medium_8 = new Question();
        q_math_medium_8.setQuestion("How many degrees are in a full circle?");
        q_math_medium_8.setOptions(Arrays.asList("180", "270", "360", "90"));
        q_math_medium_8.setAnswer("360");
        q_math_medium_8.setTopic("Mathematics");
        q_math_medium_8.setDifficulty("Medium");
        qb.addQuestion(q_math_medium_8);

        Question q_math_medium_9 = new Question();
        q_math_medium_9.setQuestion("What is the decimal equivalent of the fraction 1/4?");
        q_math_medium_9.setOptions(Arrays.asList("0.14", "0.25", "0.4", "0.5"));
        q_math_medium_9.setAnswer("0.25");
        q_math_medium_9.setTopic("Mathematics");
        q_math_medium_9.setDifficulty("Medium");
        qb.addQuestion(q_math_medium_9);

        Question q_math_medium_10 = new Question();
        q_math_medium_10.setQuestion("What is the perimeter of a square with a side length of 5 units?");
        q_math_medium_10.setOptions(Arrays.asList("10 units", "15 units", "20 units", "25 units"));
        q_math_medium_10.setAnswer("20 units");
        q_math_medium_10.setTopic("Mathematics");
        q_math_medium_10.setDifficulty("Medium");
        qb.addQuestion(q_math_medium_10);

        // Hard
        Question q_math_hard_1 = new Question();
        q_math_hard_1.setQuestion("What is Euler's identity?");
        q_math_hard_1.setOptions(Arrays.asList("e^ix = cos(x) + i*sin(x)", "e^iπ + 1 = 0", "F = ma", "E = mc²"));
        q_math_hard_1.setAnswer("e^iπ + 1 = 0");
        q_math_hard_1.setTopic("Mathematics");
        q_math_hard_1.setDifficulty("Hard");
        qb.addQuestion(q_math_hard_1);

        Question q_math_hard_2 = new Question();
        q_math_hard_2.setQuestion("What is the sum of an infinite geometric series with first term 'a' and common ratio 'r' (where |r| < 1)?");
        q_math_hard_2.setOptions(Arrays.asList("a * r", "a / r", "a / (1 - r)", "a * (1 - r)"));
        q_math_hard_2.setAnswer("a / (1 - r)");
        q_math_hard_2.setTopic("Mathematics");
        q_math_hard_2.setDifficulty("Hard");
        qb.addQuestion(q_math_hard_2);

        Question q_math_hard_3 = new Question();
        q_math_hard_3.setQuestion("What is the derivative of sin(x) with respect to x?");
        q_math_hard_3.setOptions(Arrays.asList("cos(x)", "-cos(x)", "tan(x)", "cot(x)"));
        q_math_hard_3.setAnswer("cos(x)");
        q_math_hard_3.setTopic("Mathematics");
        q_math_hard_3.setDifficulty("Hard");
        qb.addQuestion(q_math_hard_3);

        Question q_math_hard_4 = new Question();
        q_math_hard_4.setQuestion("In a standard deck of 52 cards, what is the probability of drawing two aces in a row without replacement?");
        q_math_hard_4.setOptions(Arrays.asList("1/221", "1/169", "4/52", "1/13"));
        q_math_hard_4.setAnswer("1/221");
        q_math_hard_4.setTopic("Mathematics");
        q_math_hard_4.setDifficulty("Hard");
        qb.addQuestion(q_math_hard_4);

        Question q_math_hard_5 = new Question();
        q_math_hard_5.setQuestion("What does the 'Big O' notation primarily describe?");
        q_math_hard_5.setOptions(Arrays.asList("The exact running time of an algorithm", "The best-case running time of an algorithm", "The worst-case running time or space complexity of an algorithm", "The average running time of an algorithm"));
        q_math_hard_5.setAnswer("The worst-case running time or space complexity of an algorithm");
        q_math_hard_5.setTopic("Mathematics");
        q_math_hard_5.setDifficulty("Hard");
        qb.addQuestion(q_math_hard_5);

        Question q_math_hard_6 = new Question();
        q_math_hard_6.setQuestion("What is the 'Riemann Hypothesis' concerned with?");
        q_math_hard_6.setOptions(Arrays.asList("The distribution of prime numbers", "The properties of complex numbers", "The fundamental theorem of calculus", "The solution to cubic equations"));
        q_math_hard_6.setAnswer("The distribution of prime numbers");
        q_math_hard_6.setTopic("Mathematics");
        q_math_hard_6.setDifficulty("Hard");
        qb.addQuestion(q_math_hard_6);

        Question q_math_hard_7 = new Question();
        q_math_hard_7.setQuestion("What is the concept of a 'Möbius strip' in topology?");
        q_math_hard_7.setOptions(Arrays.asList("A surface with two sides and one boundary", "A surface with one side and two boundaries", "A surface with one side and one boundary", "A closed surface with no boundaries"));
        q_math_hard_7.setAnswer("A surface with one side and one boundary");
        q_math_hard_7.setTopic("Mathematics");
        q_math_hard_7.setDifficulty("Hard");
        qb.addQuestion(q_math_hard_7);

        Question q_math_hard_8 = new Question();
        q_math_hard_8.setQuestion("What is a 'Tensor' in mathematics?");
        q_math_hard_8.setOptions(Arrays.asList("A scalar value", "A vector", "A matrix", "A generalization of scalars, vectors, and matrices to higher dimensions"));
        q_math_hard_8.setAnswer("A generalization of scalars, vectors, and matrices to higher dimensions");
        q_math_hard_8.setTopic("Mathematics");
        q_math_hard_8.setDifficulty("Hard");
        qb.addQuestion(q_math_hard_8);

        Question q_math_hard_9 = new Question();
        q_math_hard_9.setQuestion("The 'Four Color Theorem' states that any map can be colored using at most how many colors such that no two adjacent regions have the same color?");
        q_math_hard_9.setOptions(Arrays.asList("2", "3", "4", "5"));
        q_math_hard_9.setAnswer("4");
        q_math_hard_9.setTopic("Mathematics");
        q_math_hard_9.setDifficulty("Hard");
        qb.addQuestion(q_math_hard_9);

        Question q_math_hard_10 = new Question();
        q_math_hard_10.setQuestion("What mathematical constant is approximately 2.71828?");
        q_math_hard_10.setOptions(Arrays.asList("Pi (π)", "Phi (φ)", "Euler's number (e)", "The Golden Ratio"));
        q_math_hard_10.setAnswer("Euler's number (e)");
        q_math_hard_10.setTopic("Mathematics");
        q_math_hard_10.setDifficulty("Hard");
        qb.addQuestion(q_math_hard_10);

        // --- Planets Questions ---
        // Easy
        Question q_planets_easy_1 = new Question();
        q_planets_easy_1.setQuestion("Which planet is closest to the Sun?");
        q_planets_easy_1.setOptions(Arrays.asList("Earth", "Mars", "Mercury", "Venus"));
        q_planets_easy_1.setAnswer("Mercury");
        q_planets_easy_1.setTopic("Planets");
        q_planets_easy_1.setDifficulty("Easy");
        qb.addQuestion(q_planets_easy_1);

        Question q_planets_easy_2 = new Question();
        q_planets_easy_2.setQuestion("Which planet is known for its prominent ring system?");
        q_planets_easy_2.setOptions(Arrays.asList("Jupiter", "Saturn", "Uranus", "Neptune"));
        q_planets_easy_2.setAnswer("Saturn");
        q_planets_easy_2.setTopic("Planets");
        q_planets_easy_2.setDifficulty("Easy");
        qb.addQuestion(q_planets_easy_2);

        Question q_planets_easy_3 = new Question();
        q_planets_easy_3.setQuestion("What is the largest planet in our solar system?");
        q_planets_easy_3.setOptions(Arrays.asList("Earth", "Saturn", "Jupiter", "Neptune"));
        q_planets_easy_3.setAnswer("Jupiter");
        q_planets_easy_3.setTopic("Planets");
        q_planets_easy_3.setDifficulty("Easy");
        qb.addQuestion(q_planets_easy_3);

        Question q_planets_easy_4 = new Question();
        q_planets_easy_4.setQuestion("Which planet is often called Earth's 'sister planet' due to its similar size?");
        q_planets_easy_4.setOptions(Arrays.asList("Mars", "Venus", "Mercury", "Uranus"));
        q_planets_easy_4.setAnswer("Venus");
        q_planets_easy_4.setTopic("Planets");
        q_planets_easy_4.setDifficulty("Easy");
        qb.addQuestion(q_planets_easy_4);

        Question q_planets_easy_5 = new Question();
        q_planets_easy_5.setQuestion("How many planets are currently recognized in our solar system?");
        q_planets_easy_5.setOptions(Arrays.asList("7", "8", "9", "10"));
        q_planets_easy_5.setAnswer("8");
        q_planets_easy_5.setTopic("Planets");
        q_planets_easy_5.setDifficulty("Easy");
        qb.addQuestion(q_planets_easy_5);

        Question q_planets_easy_6 = new Question();
        q_planets_easy_6.setQuestion("Which is the only planet known to support life?");
        q_planets_easy_6.setOptions(Arrays.asList("Mars", "Venus", "Earth", "Jupiter"));
        q_planets_easy_6.setAnswer("Earth");
        q_planets_easy_6.setTopic("Planets");
        q_planets_easy_6.setDifficulty("Easy");
        qb.addQuestion(q_planets_easy_6);

        Question q_planets_easy_7 = new Question();
        q_planets_easy_7.setQuestion("True or False: All planets in our solar system orbit the Sun in the same direction.");
        q_planets_easy_7.setOptions(Arrays.asList("True", "False"));
        q_planets_easy_7.setAnswer("True");
        q_planets_easy_7.setTopic("Planets");
        q_planets_easy_7.setDifficulty("Easy");
        qb.addQuestion(q_planets_easy_7);

        Question q_planets_easy_8 = new Question();
        q_planets_easy_8.setQuestion("Which planet is farthest from the Sun?");
        q_planets_easy_8.setOptions(Arrays.asList("Uranus", "Neptune", "Saturn", "Pluto")); // Pluto is now a dwarf planet
        q_planets_easy_8.setAnswer("Neptune");
        q_planets_easy_8.setTopic("Planets");
        q_planets_easy_8.setDifficulty("Easy");
        qb.addQuestion(q_planets_easy_8);

        Question q_planets_easy_9 = new Question();
        q_planets_easy_9.setQuestion("What is the name of Earth's only natural satellite?");
        q_planets_easy_9.setOptions(Arrays.asList("Phobos", "Deimos", "Titan", "The Moon"));
        q_planets_easy_9.setAnswer("The Moon");
        q_planets_easy_9.setTopic("Planets");
        q_planets_easy_9.setDifficulty("Easy");
        qb.addQuestion(q_planets_easy_9);

        Question q_planets_easy_10 = new Question();
        q_planets_easy_10.setQuestion("Which planet is known for its 'Great Red Spot'?");
        q_planets_easy_10.setOptions(Arrays.asList("Mars", "Jupiter", "Saturn", "Neptune"));
        q_planets_easy_10.setAnswer("Jupiter");
        q_planets_easy_10.setTopic("Planets");
        q_planets_easy_10.setDifficulty("Easy");
        qb.addQuestion(q_planets_easy_10);

        // Medium
        Question q_planets_medium_1 = new Question();
        q_planets_medium_1.setQuestion("Which is the only planet that rotates clockwise (retrograde rotation) in our solar system?");
        q_planets_medium_1.setOptions(Arrays.asList("Mars", "Jupiter", "Venus", "Uranus"));
        q_planets_medium_1.setAnswer("Venus");
        q_planets_medium_1.setTopic("Planets");
        q_planets_medium_1.setDifficulty("Medium");
        qb.addQuestion(q_planets_medium_1);

        Question q_planets_medium_2 = new Question();
        q_planets_medium_2.setQuestion("What is the name of the dwarf planet that was once considered the ninth planet?");
        q_planets_medium_2.setOptions(Arrays.asList("Ceres", "Eris", "Pluto", "Haumea"));
        q_planets_medium_2.setAnswer("Pluto");
        q_planets_medium_2.setTopic("Planets");
        q_planets_medium_2.setDifficulty("Medium");
        qb.addQuestion(q_planets_medium_2);

        Question q_planets_medium_3 = new Question();
        q_planets_medium_3.setQuestion("Which gas makes up the majority of Jupiter's atmosphere?");
        q_planets_medium_3.setOptions(Arrays.asList("Oxygen", "Methane", "Hydrogen", "Helium"));
        q_planets_medium_3.setAnswer("Hydrogen");
        q_planets_medium_3.setTopic("Planets");
        q_planets_medium_3.setDifficulty("Medium");
        qb.addQuestion(q_planets_medium_3);

        Question q_planets_medium_4 = new Question();
        q_planets_medium_4.setQuestion("What causes the distinct blue-green color of Uranus and Neptune?");
        q_planets_medium_4.setOptions(Arrays.asList("Ammonia", "Methane", "Water vapor", "Sulfur"));
        q_planets_medium_4.setAnswer("Methane");
        q_planets_medium_4.setTopic("Planets");
        q_planets_medium_4.setDifficulty("Medium");
        qb.addQuestion(q_planets_medium_4);

        Question q_planets_medium_5 = new Question();
        q_planets_medium_5.setQuestion("Which of Saturn's moons is larger than the planet Mercury and has a thick atmosphere?");
        q_planets_medium_5.setOptions(Arrays.asList("Enceladus", "Titan", "Rhea", "Iapetus"));
        q_planets_medium_5.setAnswer("Titan");
        q_planets_medium_5.setTopic("Planets");
        q_planets_medium_5.setDifficulty("Medium");
        qb.addQuestion(q_planets_medium_5);

        Question q_planets_medium_6 = new Question();
        q_planets_medium_6.setQuestion("The asteroid belt is located between which two planets?");
        q_planets_medium_6.setOptions(Arrays.asList("Mars and Jupiter", "Jupiter and Saturn", "Earth and Mars", "Venus and Earth"));
        q_planets_medium_6.setAnswer("Mars and Jupiter");
        q_planets_medium_6.setTopic("Planets");
        q_planets_medium_6.setDifficulty("Medium");
        qb.addQuestion(q_planets_medium_6);

        Question q_planets_medium_7 = new Question();
        q_planets_medium_7.setQuestion("What is the phenomenon called when a planet appears to move backwards in its orbit from Earth's perspective?");
        q_planets_medium_7.setOptions(Arrays.asList("Progression", "Retrograde Motion", "Prograde Motion", "Orbital Decay"));
        q_planets_medium_7.setAnswer("Retrograde Motion");
        q_planets_medium_7.setTopic("Planets");
        q_planets_medium_7.setDifficulty("Medium");
        qb.addQuestion(q_planets_medium_7);

        Question q_planets_medium_8 = new Question();
        q_planets_medium_8.setQuestion("Which terrestrial planet has the most volcanic activity and a runaway greenhouse effect?");
        q_planets_medium_8.setOptions(Arrays.asList("Mars", "Earth", "Mercury", "Venus"));
        q_planets_medium_8.setAnswer("Venus");
        q_planets_medium_8.setTopic("Planets");
        q_planets_medium_8.setDifficulty("Medium");
        qb.addQuestion(q_planets_medium_8);

        Question q_planets_medium_9 = new Question();
        q_planets_medium_9.setQuestion("What is the term for a celestial body that orbits a planet?");
        q_planets_medium_9.setOptions(Arrays.asList("Asteroid", "Comet", "Moon (natural satellite)", "Star"));
        q_planets_medium_9.setAnswer("Moon (natural satellite)");
        q_planets_medium_9.setTopic("Planets");
        q_planets_medium_9.setDifficulty("Medium");
        qb.addQuestion(q_planets_medium_9);

        Question q_planets_medium_10 = new Question();
        q_planets_medium_10.setQuestion("Which gas giant has the fastest rotation, causing it to flatten at the poles?");
        q_planets_medium_10.setOptions(Arrays.asList("Saturn", "Uranus", "Neptune", "Jupiter"));
        q_planets_medium_10.setAnswer("Jupiter");
        q_planets_medium_10.setTopic("Planets");
        q_planets_medium_10.setDifficulty("Medium");
        qb.addQuestion(q_planets_medium_10);

        // Hard
        Question q_planets_hard_1 = new Question();
        q_planets_hard_1.setQuestion("What is the name of the hypothetical Planet Nine, believed to exist beyond Neptune?");
        q_planets_hard_1.setOptions(Arrays.asList("Persephone", "Tyche", "Phatom", "None of the above"));
        q_planets_hard_1.setAnswer("None of the above"); // It's "Planet Nine" or "Farthest Planet"
        q_planets_hard_1.setTopic("Planets");
        q_planets_hard_1.setDifficulty("Hard");
        qb.addQuestion(q_planets_hard_1);

        Question q_planets_hard_2 = new Question();
        q_planets_hard_2.setQuestion("Which moon of Jupiter is the most volcanically active body in the solar system?");
        q_planets_hard_2.setOptions(Arrays.asList("Europa", "Ganymede", "Io", "Callisto"));
        q_planets_hard_2.setAnswer("Io");
        q_planets_hard_2.setTopic("Planets");
        q_planets_hard_2.setDifficulty("Hard");
        qb.addQuestion(q_planets_hard_2);

        Question q_planets_hard_3 = new Question();
        q_planets_hard_3.setQuestion("What is the primary component of the ice giants Uranus and Neptune's interior?");
        q_planets_hard_3.setOptions(Arrays.asList("Molten Iron", "Metallic Hydrogen", "Water, Methane, and Ammonia Ices", "Silicate Rock"));
        q_planets_hard_3.setAnswer("Water, Methane, and Ammonia Ices");
        q_planets_hard_3.setTopic("Planets");
        q_planets_hard_3.setDifficulty("Hard");
        qb.addQuestion(q_planets_hard_3);

        Question q_planets_hard_4 = new Question();
        q_planets_hard_4.setQuestion("Which feature on Mars is the largest volcano in the solar system?");
        q_planets_hard_4.setOptions(Arrays.asList("Valles Marineris", "Olympus Mons", "Hellas Planitia", "Tharsis Montes"));
        q_planets_hard_4.setAnswer("Olympus Mons");
        q_planets_hard_4.setTopic("Planets");
        q_planets_hard_4.setDifficulty("Hard");
        qb.addQuestion(q_planets_hard_4);

        Question q_planets_hard_5 = new Question();
        q_planets_hard_5.setQuestion("What is the name of the boundary beyond Neptune's orbit where the solar wind weakens and interstellar space begins?");
        q_planets_hard_5.setOptions(Arrays.asList("Kuiper Belt", "Oort Cloud", "Heliopause", "Termination Shock"));
        q_planets_hard_5.setAnswer("Heliopause");
        q_planets_hard_5.setTopic("Planets");
        q_planets_hard_5.setDifficulty("Hard");
        qb.addQuestion(q_planets_hard_5);

        Question q_planets_hard_6 = new Question();
        q_planets_hard_6.setQuestion("Which planet has a 'hot Jupiter' exoplanet classification, meaning it's a gas giant orbiting very close to its star?");
        q_planets_hard_6.setOptions(Arrays.asList("HD 209458 b", "Kepler-186f", "TRAPPIST-1e", "Proxima Centauri b"));
        q_planets_hard_6.setAnswer("HD 209458 b");
        q_planets_hard_6.setTopic("Planets");
        q_planets_hard_6.setDifficulty("Hard");
        qb.addQuestion(q_planets_hard_6);

        Question q_planets_hard_7 = new Question();
        q_planets_hard_7.setQuestion("What is the primary method used to detect exoplanets by observing the dimming of a star's light as a planet passes in front of it?");
        q_planets_hard_7.setOptions(Arrays.asList("Radial Velocity Method", "Direct Imaging", "Gravitational Lensing", "Transit Method"));
        q_planets_hard_7.setAnswer("Transit Method");
        q_planets_hard_7.setTopic("Planets");
        q_planets_hard_7.setDifficulty("Hard");
        qb.addQuestion(q_planets_hard_7);

        Question q_planets_hard_8 = new Question();
        q_planets_hard_8.setQuestion("Which type of stellar remnant is left after a massive star collapses and undergoes a supernova, but is not massive enough to become a black hole?");
        q_planets_hard_8.setOptions(Arrays.asList("White Dwarf", "Red Giant", "Neutron Star", "Brown Dwarf"));
        q_planets_hard_8.setAnswer("Neutron Star");
        q_planets_hard_8.setTopic("Planets");
        q_planets_hard_8.setDifficulty("Hard");
        qb.addQuestion(q_planets_hard_8);

        Question q_planets_hard_9 = new Question();
        q_planets_hard_9.setQuestion("What is the theoretical region around a star where conditions are just right for liquid water to exist on a planet's surface?");
        q_planets_hard_9.setOptions(Arrays.asList("Goldilocks Zone", "Frost Line", "Habitable Zone", "Roche Limit"));
        q_planets_hard_9.setAnswer("Habitable Zone");
        q_planets_hard_9.setTopic("Planets");
        q_planets_hard_9.setDifficulty("Hard");
        qb.addQuestion(q_planets_hard_9);

        Question q_planets_hard_10 = new Question();
        q_planets_hard_10.setQuestion("What is the name of the cloud of icy debris located beyond Neptune's orbit, where many short-period comets originate?");
        q_planets_hard_10.setOptions(Arrays.asList("Asteroid Belt", "Oort Cloud", "Kuiper Belt", "Scattered Disc"));
        q_planets_hard_10.setAnswer("Kuiper Belt");
        q_planets_hard_10.setTopic("Planets");
        q_planets_hard_10.setDifficulty("Hard");
        qb.addQuestion(q_planets_hard_10);

        // --- Science Questions ---
        // Easy
        Question q_science_easy_1 = new Question();
        q_science_easy_1.setQuestion("What is the process by which plants make their own food?");
        q_science_easy_1.setOptions(Arrays.asList("Respiration", "Transpiration", "Photosynthesis", "Germination"));
        q_science_easy_1.setAnswer("Photosynthesis");
        q_science_easy_1.setTopic("Science");
        q_science_easy_1.setDifficulty("Easy");
        qb.addQuestion(q_science_easy_1);

        Question q_science_easy_2 = new Question();
        q_science_easy_2.setQuestion("What is the smallest unit of matter?");
        q_science_easy_2.setOptions(Arrays.asList("Molecule", "Compound", "Atom", "Cell"));
        q_science_easy_2.setAnswer("Atom");
        q_science_easy_2.setTopic("Science");
        q_science_easy_2.setDifficulty("Easy");
        qb.addQuestion(q_science_easy_2);

        Question q_science_easy_3 = new Question();
        q_science_easy_3.setQuestion("What force pulls objects towards the center of the Earth?");
        q_science_easy_3.setOptions(Arrays.asList("Friction", "Tension", "Gravity", "Magnetism"));
        q_science_easy_3.setAnswer("Gravity");
        q_science_easy_3.setTopic("Science");
        q_science_easy_3.setDifficulty("Easy");
        qb.addQuestion(q_science_easy_3);

        Question q_science_easy_4 = new Question();
        q_science_easy_4.setQuestion("What are the three states of matter?");
        q_science_easy_4.setOptions(Arrays.asList("Hot, Cold, Warm", "Liquid, Solid, Gas", "Wet, Dry, Humid", "Big, Small, Medium"));
        q_science_easy_4.setAnswer("Liquid, Solid, Gas");
        q_science_easy_4.setTopic("Science");
        q_science_easy_4.setDifficulty("Easy");
        qb.addQuestion(q_science_easy_4);

        Question q_science_easy_5 = new Question();
        q_science_easy_5.setQuestion("What is the primary gas that plants absorb from the atmosphere?");
        q_science_easy_5.setOptions(Arrays.asList("Oxygen", "Nitrogen", "Carbon Dioxide", "Hydrogen"));
        q_science_easy_5.setAnswer("Carbon Dioxide");
        q_science_easy_5.setTopic("Science");
        q_science_easy_5.setDifficulty("Easy");
        qb.addQuestion(q_science_easy_5);

        Question q_science_easy_6 = new Question();
        q_science_easy_6.setQuestion("Which planet is known as the 'Morning Star' or 'Evening Star'?");
        q_science_easy_6.setOptions(Arrays.asList("Mars", "Jupiter", "Venus", "Mercury"));
        q_science_easy_6.setAnswer("Venus");
        q_science_easy_6.setTopic("Science");
        q_science_easy_6.setDifficulty("Easy");
        qb.addQuestion(q_science_easy_6);

        Question q_science_easy_7 = new Question();
        q_science_easy_7.setQuestion("What part of the plant conducts photosynthesis?");
        q_science_easy_7.setOptions(Arrays.asList("Roots", "Stem", "Leaves", "Flower"));
        q_science_easy_7.setAnswer("Leaves");
        q_science_easy_7.setTopic("Science");
        q_science_easy_7.setDifficulty("Easy");
        qb.addQuestion(q_science_easy_7);

        Question q_science_easy_8 = new Question();
        q_science_easy_8.setQuestion("What is the boiling point of water in Celsius?");
        q_science_easy_8.setOptions(Arrays.asList("0°C", "50°C", "100°C", "212°C"));
        q_science_easy_8.setAnswer("100°C");
        q_science_easy_8.setTopic("Science");
        q_science_easy_8.setDifficulty("Easy");
        qb.addQuestion(q_science_easy_8);

        Question q_science_easy_9 = new Question();
        q_science_easy_9.setQuestion("Which energy source is renewable?");
        q_science_easy_9.setOptions(Arrays.asList("Coal", "Oil", "Natural Gas", "Solar Power"));
        q_science_easy_9.setAnswer("Solar Power");
        q_science_easy_9.setTopic("Science");
        q_science_easy_9.setDifficulty("Easy");
        qb.addQuestion(q_science_easy_9);

        Question q_science_easy_10 = new Question();
        q_science_easy_10.setQuestion("What is the center of our solar system?");
        q_science_easy_10.setOptions(Arrays.asList("Earth", "Moon", "Jupiter", "The Sun"));
        q_science_easy_10.setAnswer("The Sun");
        q_science_easy_10.setTopic("Science");
        q_science_easy_10.setDifficulty("Easy");
        qb.addQuestion(q_science_easy_10);

        // Medium
        Question q_science_medium_1 = new Question();
        q_science_medium_1.setQuestion("What is the process by which liquid turns into gas?");
        q_science_medium_1.setOptions(Arrays.asList("Condensation", "Melting", "Evaporation", "Freezing"));
        q_science_medium_1.setAnswer("Evaporation");
        q_science_medium_1.setTopic("Science");
        q_science_medium_1.setDifficulty("Medium");
        qb.addQuestion(q_science_medium_1);

        Question q_science_medium_2 = new Question();
        q_science_medium_2.setQuestion("What part of a cell is responsible for generating most of the energy?");
        q_science_medium_2.setOptions(Arrays.asList("Nucleus", "Ribosome", "Mitochondria", "Cell Wall"));
        q_science_medium_2.setAnswer("Mitochondria");
        q_science_medium_2.setTopic("Science");
        q_science_medium_2.setDifficulty("Medium");
        qb.addQuestion(q_science_medium_2);

        Question q_science_medium_3 = new Question();
        q_science_medium_3.setQuestion("What is the SI unit of electric current?");
        q_science_medium_3.setOptions(Arrays.asList("Volt", "Watt", "Ohm", "Ampere"));
        q_science_medium_3.setAnswer("Ampere");
        q_science_medium_3.setTopic("Science");
        q_science_medium_3.setDifficulty("Medium");
        qb.addQuestion(q_science_medium_3);

        Question q_science_medium_4 = new Question();
        q_science_medium_4.setQuestion("Which type of rock is formed from the cooling and solidification of molten magma or lava?");
        q_science_medium_4.setOptions(Arrays.asList("Sedimentary", "Metamorphic", "Igneous", "Fossil"));
        q_science_medium_4.setAnswer("Igneous");
        q_science_medium_4.setTopic("Science");
        q_science_medium_4.setDifficulty("Medium");
        qb.addQuestion(q_science_medium_4);

        Question q_science_medium_5 = new Question();
        q_science_medium_5.setQuestion("What is the main function of red blood cells?");
        q_science_medium_5.setOptions(Arrays.asList("Fighting infection", "Clotting blood", "Carrying oxygen", "Producing antibodies"));
        q_science_medium_5.setAnswer("Carrying oxygen");
        q_science_medium_5.setTopic("Science");
        q_science_medium_5.setDifficulty("Medium");
        qb.addQuestion(q_science_medium_5);

        Question q_science_medium_6 = new Question();
        q_science_medium_6.setQuestion("What is the phenomenon where light bends as it passes from one medium to another?");
        q_science_medium_6.setOptions(Arrays.asList("Reflection", "Diffraction", "Refraction", "Absorption"));
        q_science_medium_6.setAnswer("Refraction");
        q_science_medium_6.setTopic("Science");
        q_science_medium_6.setDifficulty("Medium");
        qb.addQuestion(q_science_medium_6);

        Question q_science_medium_7 = new Question();
        q_science_medium_7.setQuestion("Which part of the brain is responsible for balance and coordination?");
        q_science_medium_7.setOptions(Arrays.asList("Cerebrum", "Cerebellum", "Brainstem", "Thalamus"));
        q_science_medium_7.setAnswer("Cerebellum");
        q_science_medium_7.setTopic("Science");
        q_science_medium_7.setDifficulty("Medium");
        qb.addQuestion(q_science_medium_7);

        Question q_science_medium_8 = new Question();
        q_science_medium_8.setQuestion("What is the chemical symbol for gold?");
        q_science_medium_8.setOptions(Arrays.asList("Ag", "Au", "Fe", "Hg"));
        q_science_medium_8.setAnswer("Au");
        q_science_medium_8.setTopic("Science");
        q_science_medium_8.setDifficulty("Medium");
        qb.addQuestion(q_science_medium_8);

        Question q_science_medium_9 = new Question();
        q_science_medium_9.setQuestion("Which famous scientist developed the theory of relativity?");
        q_science_medium_9.setOptions(Arrays.asList("Isaac Newton", "Niels Bohr", "Marie Curie", "Albert Einstein"));
        q_science_medium_9.setAnswer("Albert Einstein");
        q_science_medium_9.setTopic("Science");
        q_science_medium_9.setDifficulty("Medium");
        qb.addQuestion(q_science_medium_9);

        Question q_science_medium_10 = new Question();
        q_science_medium_10.setQuestion("What is the name of the process where a solid turns directly into a gas, bypassing the liquid state?");
        q_science_medium_10.setOptions(Arrays.asList("Melting", "Boiling", "Sublimation", "Condensation"));
        q_science_medium_10.setAnswer("Sublimation");
        q_science_medium_10.setTopic("Science");
        q_science_medium_10.setDifficulty("Medium");
        qb.addQuestion(q_science_medium_10);

        // Hard
        Question q_science_hard_1 = new Question();
        q_science_hard_1.setQuestion("What is the Heisenberg Uncertainty Principle?");
        q_science_hard_1.setOptions(Arrays.asList("The position of an electron cannot be known", "It's impossible to know simultaneously the exact position and momentum of a particle", "Energy cannot be created or destroyed", "Light behaves as both a particle and a wave"));
        q_science_hard_1.setAnswer("It's impossible to know simultaneously the exact position and momentum of a particle");
        q_science_hard_1.setTopic("Science");
        q_science_hard_1.setDifficulty("Hard");
        qb.addQuestion(q_science_hard_1);

        Question q_science_hard_2 = new Question();
        q_science_hard_2.setQuestion("Which subatomic particle carries a positive charge?");
        q_science_hard_2.setOptions(Arrays.asList("Electron", "Neutron", "Proton", "Photon"));
        q_science_hard_2.setAnswer("Proton");
        q_science_hard_2.setTopic("Science");
        q_science_hard_2.setDifficulty("Hard");
        qb.addQuestion(q_science_hard_2);

        Question q_science_hard_3 = new Question();
        q_science_hard_3.setQuestion("What is the name of the theory that describes the origin and evolution of the universe?");
        q_science_hard_3.setOptions(Arrays.asList("Steady-State Theory", "Pulsating Universe Theory", "Big Bang Theory", "Multiverse Theory"));
        q_science_hard_3.setAnswer("Big Bang Theory");
        q_science_hard_3.setTopic("Science");
        q_science_hard_3.setDifficulty("Hard");
        qb.addQuestion(q_science_hard_3);

        Question q_science_hard_4 = new Question();
        q_science_hard_4.setQuestion("What is the process of nuclear fusion?");
        q_science_hard_4.setOptions(Arrays.asList("Splitting atomic nuclei", "Combining atomic nuclei to form heavier ones", "Decay of radioactive isotopes", "Conversion of mass into energy"));
        q_science_hard_4.setAnswer("Combining atomic nuclei to form heavier ones");
        q_science_hard_4.setTopic("Science");
        q_science_hard_4.setDifficulty("Hard");
        qb.addQuestion(q_science_hard_4);

        Question q_science_hard_5 = new Question();
        q_science_hard_5.setQuestion("Which fundamental force is responsible for holding the nucleus of an atom together?");
        q_science_hard_5.setOptions(Arrays.asList("Gravitational force", "Electromagnetic force", "Strong nuclear force", "Weak nuclear force"));
        q_science_hard_5.setAnswer("Strong nuclear force");
        q_science_hard_5.setTopic("Science");
        q_science_hard_5.setDifficulty("Hard");
        qb.addQuestion(q_science_hard_5);

        Question q_science_hard_6 = new Question();
        q_science_hard_6.setQuestion("What is the name of the phenomenon where certain materials emit light after absorbing radiation, even after the radiation source is removed?");
        q_science_hard_6.setOptions(Arrays.asList("Fluorescence", "Phosphorescence", "Bioluminescence", "Chemiluminescence"));
        q_science_hard_6.setAnswer("Phosphorescence");
        q_science_hard_6.setTopic("Science");
        q_science_hard_6.setDifficulty("Hard");
        qb.addQuestion(q_science_hard_6);

        Question q_science_hard_7 = new Question();
        q_science_hard_7.setQuestion("What is the most abundant element in the Earth's crust?");
        q_science_hard_7.setOptions(Arrays.asList("Iron", "Silicon", "Aluminum", "Oxygen"));
        q_science_hard_7.setAnswer("Oxygen");
        q_science_hard_7.setTopic("Science");
        q_science_hard_7.setDifficulty("Hard");
        qb.addQuestion(q_science_hard_7);

        Question q_science_hard_8 = new Question();
        q_science_hard_8.setQuestion("Which scientific law states that 'energy cannot be created or destroyed, but can be transformed from one form to another'?");
        q_science_hard_8.setOptions(Arrays.asList("Newton's First Law", "Law of Conservation of Momentum", "Law of Conservation of Energy", "Ohm's Law"));
        q_science_hard_8.setAnswer("Law of Conservation of Energy");
        q_science_hard_8.setTopic("Science");
        q_science_hard_8.setDifficulty("Hard");
        qb.addQuestion(q_science_hard_8);

        Question q_science_hard_9 = new Question();
        q_science_hard_9.setQuestion("What is the name of the process by which bacteria convert nitrogen gas from the atmosphere into ammonia?");
        q_science_hard_9.setOptions(Arrays.asList("Denitrification", "Nitrification", "Nitrogen Fixation", "Ammonification"));
        q_science_hard_9.setAnswer("Nitrogen Fixation");
        q_science_hard_9.setTopic("Science");
        q_science_hard_9.setDifficulty("Hard");
        qb.addQuestion(q_science_hard_9);

        Question q_science_hard_10 = new Question();
        q_science_hard_10.setQuestion("What is the study of heredity and the variation of inherited characteristics called?");
        q_science_hard_10.setOptions(Arrays.asList("Ecology", "Physiology", "Genetics", "Pathology"));
        q_science_hard_10.setAnswer("Genetics");
        q_science_hard_10.setTopic("Science");
        q_science_hard_10.setDifficulty("Hard");
        qb.addQuestion(q_science_hard_10);

        // --- Technology Questions ---
        // Easy
        Question q_tech_easy_1 = new Question();
        q_tech_easy_1.setQuestion("What does CPU stand for?");
        q_tech_easy_1.setOptions(Arrays.asList("Central Process Unit", "Computer Personal Unit", "Central Processing Unit", "Core Processor Unit"));
        q_tech_easy_1.setAnswer("Central Processing Unit");
        q_tech_easy_1.setTopic("Technology");
        q_tech_easy_1.setDifficulty("Easy");
        qb.addQuestion(q_tech_easy_1);

        Question q_tech_easy_2 = new Question();
        q_tech_easy_2.setQuestion("Which company developed the Windows operating system?");
        q_tech_easy_2.setOptions(Arrays.asList("Apple", "Google", "Microsoft", "IBM"));
        q_tech_easy_2.setAnswer("Microsoft");
        q_tech_easy_2.setTopic("Technology");
        q_tech_easy_2.setDifficulty("Easy");
        qb.addQuestion(q_tech_easy_2);

        Question q_tech_easy_3 = new Question();
        q_tech_easy_3.setQuestion("What is RAM primarily used for in a computer?");
        q_tech_easy_3.setOptions(Arrays.asList("Long-term storage", "Temporary data storage for active applications", "Displaying graphics", "Connecting to the internet"));
        q_tech_easy_3.setAnswer("Temporary data storage for active applications");
        q_tech_easy_3.setTopic("Technology");
        q_tech_easy_3.setDifficulty("Easy");
        qb.addQuestion(q_tech_easy_3);

        Question q_tech_easy_4 = new Question();
        q_tech_easy_4.setQuestion("What does 'WWW' stand for?");
        q_tech_easy_4.setOptions(Arrays.asList("World Wide Widget", "Web Without Wires", "World Wide Web", "Wireless Web World"));
        q_tech_easy_4.setAnswer("World Wide Web");
        q_tech_easy_4.setTopic("Technology");
        q_tech_easy_4.setDifficulty("Easy");
        qb.addQuestion(q_tech_easy_4);

        Question q_tech_easy_5 = new Question();
        q_tech_easy_5.setQuestion("Which device is used to input text into a computer?");
        q_tech_easy_5.setOptions(Arrays.asList("Monitor", "Printer", "Keyboard", "Mouse"));
        q_tech_easy_5.setAnswer("Keyboard");
        q_tech_easy_5.setTopic("Technology");
        q_tech_easy_5.setDifficulty("Easy");
        qb.addQuestion(q_tech_easy_5);

        Question q_tech_easy_6 = new Question();
        q_tech_easy_6.setQuestion("What is a 'firewall' in computer networking?");
        q_tech_easy_6.setOptions(Arrays.asList("A device that generates heat", "A security system that monitors and controls network traffic", "A type of internet browser", "A program that cleans your hard drive"));
        q_tech_easy_6.setAnswer("A security system that monitors and controls network traffic");
        q_tech_easy_6.setTopic("Technology");
        q_tech_easy_6.setDifficulty("Easy");
        qb.addQuestion(q_tech_easy_6);

        Question q_tech_easy_7 = new Question();
        q_tech_easy_7.setQuestion("What does USB stand for?");
        q_tech_easy_7.setOptions(Arrays.asList("Universal Serial Bus", "United Standard Board", "User System Backup", "Ultra Speed Bandwidth"));
        q_tech_easy_7.setAnswer("Universal Serial Bus");
        q_tech_easy_7.setTopic("Technology");
        q_tech_easy_7.setDifficulty("Easy");
        qb.addQuestion(q_tech_easy_7);

        Question q_tech_easy_8 = new Question();
        q_tech_easy_8.setQuestion("Which popular social media platform uses 'tweets'?");
        q_tech_easy_8.setOptions(Arrays.asList("Facebook", "Instagram", "Twitter", "TikTok"));
        q_tech_easy_8.setAnswer("Twitter");
        q_tech_easy_8.setTopic("Technology");
        q_tech_easy_8.setDifficulty("Easy");
        qb.addQuestion(q_tech_easy_8);

        Question q_tech_easy_9 = new Question();
        q_tech_easy_9.setQuestion("What is a 'pixel' in terms of computer graphics?");
        q_tech_easy_9.setOptions(Arrays.asList("A type of camera lens", "A unit of sound", "The smallest addressable element in a raster image", "A computer chip"));
        q_tech_easy_9.setAnswer("The smallest addressable element in a raster image");
        q_tech_easy_9.setTopic("Technology");
        q_tech_easy_9.setDifficulty("Easy");
        qb.addQuestion(q_tech_easy_9);

        Question q_tech_easy_10 = new Question();
        q_tech_easy_10.setQuestion("What is the common name for programs that provide functionality to users?");
        q_tech_easy_10.setOptions(Arrays.asList("Hardware", "Firmware", "Application Software", "Operating System"));
        q_tech_easy_10.setAnswer("Application Software");
        q_tech_easy_10.setTopic("Technology");
        q_tech_easy_10.setDifficulty("Easy");
        qb.addQuestion(q_tech_easy_10);

        // Medium
        Question q_tech_medium_1 = new Question();
        q_tech_medium_1.setQuestion("What is the purpose of an 'Operating System'?");
        q_tech_medium_1.setOptions(Arrays.asList("To run a single program", "To manage computer hardware and software resources", "To connect to the internet", "To display images on a screen"));
        q_tech_medium_1.setAnswer("To manage computer hardware and software resources");
        q_tech_medium_1.setTopic("Technology");
        q_tech_medium_1.setDifficulty("Medium");
        qb.addQuestion(q_tech_medium_1);

        Question q_tech_medium_2 = new Question();
        q_tech_medium_2.setQuestion("What is the difference between HTTP and HTTPS?");
        q_tech_medium_2.setOptions(Arrays.asList("HTTP is faster", "HTTPS is older", "HTTPS is the secure version of HTTP, using SSL/TLS encryption", "HTTP is for local networks only"));
        q_tech_medium_2.setAnswer("HTTPS is the secure version of HTTP, using SSL/TLS encryption");
        q_tech_medium_2.setTopic("Technology");
        q_tech_medium_2.setDifficulty("Medium");
        qb.addQuestion(q_tech_medium_2);

        Question q_tech_medium_3 = new Question();
        q_tech_medium_3.setQuestion("What is a 'blockchain'?");
        q_tech_medium_3.setOptions(Arrays.asList("A type of computer virus", "A decentralized, distributed ledger technology", "A method for securely sending emails", "A type of data compression algorithm"));
        q_tech_medium_3.setAnswer("A decentralized, distributed ledger technology");
        q_tech_medium_3.setTopic("Technology");
        q_tech_medium_3.setDifficulty("Medium");
        qb.addQuestion(q_tech_medium_3);

        Question q_tech_medium_4 = new Question();
        q_tech_medium_4.setQuestion("What does HTML stand for?");
        q_tech_medium_4.setOptions(Arrays.asList("Hypertext Markup Language", "Hyperlink Textual Module Language", "High-level Text Machine Language", "Home Tool Markup Language"));
        q_tech_medium_4.setAnswer("Hypertext Markup Language");
        q_tech_medium_4.setTopic("Technology");
        q_tech_medium_4.setDifficulty("Medium");
        qb.addQuestion(q_tech_medium_4);

        Question q_tech_medium_5 = new Question();
        q_tech_medium_5.setQuestion("What is the function of a 'router' in a computer network?");
        q_tech_medium_5.setOptions(Arrays.asList("To broadcast Wi-Fi signals", "To store data locally", "To forward data packets between computer networks", "To connect a computer to a monitor"));
        q_tech_medium_5.setAnswer("To forward data packets between computer networks");
        q_tech_medium_5.setTopic("Technology");
        q_tech_medium_5.setDifficulty("Medium");
        qb.addQuestion(q_tech_medium_5);

        Question q_tech_medium_6 = new Question();
        q_tech_medium_6.setQuestion("Which data storage device has no moving parts and is faster than a traditional HDD?");
        q_tech_medium_6.setOptions(Arrays.asList("Floppy Disk", "CD-ROM", "Solid State Drive (SSD)", "Magnetic Tape"));
        q_tech_medium_6.setAnswer("Solid State Drive (SSD)");
        q_tech_medium_6.setTopic("Technology");
        q_tech_medium_6.setDifficulty("Medium");
        qb.addQuestion(q_tech_medium_6);

        Question q_tech_medium_7 = new Question();
        q_tech_medium_7.setQuestion("What is the purpose of 'cloud computing'?");
        q_tech_medium_7.setOptions(Arrays.asList("To store data on your local computer", "To use a computer without an internet connection", "To deliver on-demand computing services over the internet", "To physically connect multiple computers together"));
        q_tech_medium_7.setAnswer("To deliver on-demand computing services over the internet");
        q_tech_medium_7.setTopic("Technology");
        q_tech_medium_7.setDifficulty("Medium");
        qb.addQuestion(q_tech_medium_7);

        Question q_tech_medium_8 = new Question();
        q_tech_medium_8.setQuestion("What is 'open source' software?");
        q_tech_medium_8.setOptions(Arrays.asList("Software that is expensive to use", "Software whose source code is freely available and can be modified", "Software that runs only on specific hardware", "Software developed by a single company"));
        q_tech_medium_8.setAnswer("Software whose source code is freely available and can be modified");
        q_tech_medium_8.setTopic("Technology");
        q_tech_medium_8.setDifficulty("Medium");
        qb.addQuestion(q_tech_medium_8);

        Question q_tech_medium_9 = new Question();
        q_tech_medium_9.setQuestion("What is the primary function of a GPU in a computer?");
        q_tech_medium_9.setOptions(Arrays.asList("Processing general tasks", "Handling network communications", "Accelerating graphics and video rendering", "Storing permanent data"));
        q_tech_medium_9.setAnswer("Accelerating graphics and video rendering");
        q_tech_medium_9.setTopic("Technology");
        q_tech_medium_9.setDifficulty("Medium");
        qb.addQuestion(q_tech_medium_9);

        Question q_tech_medium_10 = new Question();
        q_tech_medium_10.setQuestion("Which cybersecurity threat involves tricking individuals into revealing sensitive information?");
        q_tech_medium_10.setOptions(Arrays.asList("DDoS Attack", "Malware", "Phishing", "Ransomware"));
        q_tech_medium_10.setAnswer("Phishing");
        q_tech_medium_10.setTopic("Technology");
        q_tech_medium_10.setDifficulty("Medium");
        qb.addQuestion(q_tech_medium_10);

        // Hard
        Question q_tech_hard_1 = new Question();
        q_tech_hard_1.setQuestion("What is a 'Quantum Computer'?");
        q_tech_hard_1.setOptions(Arrays.asList("A very fast supercomputer", "A computer that uses quantum-mechanical phenomena like superposition and entanglement", "A computer that can predict the future", "A small, portable computer"));
        q_tech_hard_1.setAnswer("A computer that uses quantum-mechanical phenomena like superposition and entanglement");
        q_tech_hard_1.setTopic("Technology");
        q_tech_hard_1.setDifficulty("Hard");
        qb.addQuestion(q_tech_hard_1);

        Question q_tech_hard_2 = new Question();
        q_tech_hard_2.setQuestion("What is the purpose of 'VPN' (Virtual Private Network)?");
        q_tech_hard_2.setOptions(Arrays.asList("To speed up internet connection", "To create a secure, encrypted connection over a public network", "To block all internet access", "To share files directly between two computers"));
        q_tech_hard_2.setAnswer("To create a secure, encrypted connection over a public network");
        q_tech_hard_2.setTopic("Technology");
        q_tech_hard_2.setDifficulty("Hard");
        qb.addQuestion(q_tech_hard_2);

        Question q_tech_hard_3 = new Question();
        q_tech_hard_3.setQuestion("Which standard defines how devices on a network identify and communicate with each other?");
        q_tech_hard_3.setOptions(Arrays.asList("USB", "HDMI", "TCP/IP", "Bluetooth"));
        q_tech_hard_3.setAnswer("TCP/IP");
        q_tech_hard_3.setTopic("Technology");
        q_tech_hard_3.setDifficulty("Hard");
        qb.addQuestion(q_tech_hard_3);

        Question q_tech_hard_4 = new Question();
        q_tech_hard_4.setQuestion("What is the primary difference between IPv4 and IPv6?");
        q_tech_hard_4.setOptions(Arrays.asList("IPv6 is slower", "IPv4 uses 32-bit addresses, IPv6 uses 128-bit addresses", "IPv6 is only for mobile devices", "IPv4 offers more security features"));
        q_tech_hard_4.setAnswer("IPv4 uses 32-bit addresses, IPv6 uses 128-bit addresses");
        q_tech_hard_4.setTopic("Technology");
        q_tech_hard_4.setDifficulty("Hard");
        qb.addQuestion(q_tech_hard_4);

        Question q_tech_hard_5 = new Question();
        q_tech_hard_5.setQuestion("What is a 'container' in the context of software deployment (e.g., Docker)?");
        q_tech_hard_5.setOptions(Arrays.asList("A virtual machine", "A lightweight, portable, and self-sufficient executable package of an application", "A type of server hardware", "A database management system"));
        q_tech_hard_5.setAnswer("A lightweight, portable, and self-sufficient executable package of an application");
        q_tech_hard_5.setTopic("Technology");
        q_tech_hard_5.setDifficulty("Hard");
        qb.addQuestion(q_tech_hard_5);

        Question q_tech_hard_6 = new Question();
        q_tech_hard_6.setQuestion("Which algorithm is widely used for public-key cryptography to secure internet communications?");
        q_tech_hard_6.setOptions(Arrays.asList("AES", "MD5", "RSA", "SHA-256"));
        q_tech_hard_6.setAnswer("RSA");
        q_tech_hard_6.setTopic("Technology");
        q_tech_hard_6.setDifficulty("Hard");
        qb.addQuestion(q_tech_hard_6);

        Question q_tech_hard_7 = new Question();
        q_tech_hard_7.setQuestion("What is the role of 'DNS' (Domain Name System) in internet browsing?");
        q_tech_hard_7.setOptions(Arrays.asList("To encrypt web traffic", "To translate domain names into IP addresses", "To store website content", "To manage Wi-Fi connections"));
        q_tech_hard_7.setAnswer("To translate domain names into IP addresses");
        q_tech_hard_7.setTopic("Technology");
        q_tech_hard_7.setDifficulty("Hard");
        qb.addQuestion(q_tech_hard_7);

        Question q_tech_hard_8 = new Question();
        q_tech_hard_8.setQuestion("What is 'Serverless Computing'?");
        q_tech_hard_8.setOptions(Arrays.asList("Running applications on physical servers", "A cloud execution model where the cloud provider manages the server infrastructure", "Developing applications without any code", "Using only local servers without cloud integration"));
        q_tech_hard_8.setAnswer("A cloud execution model where the cloud provider manages the server infrastructure");
        q_tech_hard_8.setTopic("Technology");
        q_tech_hard_8.setDifficulty("Hard");
        qb.addQuestion(q_tech_hard_8);

        Question q_tech_hard_9 = new Question();
        q_tech_hard_9.setQuestion("What is 'Quantum Supremacy'?");
        q_tech_hard_9.setOptions(Arrays.asList("A quantum computer performing a task better than any classical computer", "The theoretical limit of quantum computing power", "A new type of quantum algorithm", "The state of a quantum computer after a calculation"));
        q_tech_hard_9.setAnswer("A quantum computer performing a task better than any classical computer");
        q_tech_hard_9.setTopic("Technology");
        q_tech_hard_9.setDifficulty("Hard");
        qb.addQuestion(q_tech_hard_9);

        Question q_tech_hard_10 = new Question();
        q_tech_hard_10.setQuestion("Which networking device operates at the Data Link Layer (Layer 2) of the OSI model and forwards frames based on MAC addresses?");
        q_tech_hard_10.setOptions(Arrays.asList("Router", "Hub", "Switch", "Repeater"));
        q_tech_hard_10.setAnswer("Switch");
        q_tech_hard_10.setTopic("Technology");
        q_tech_hard_10.setDifficulty("Hard");
        qb.addQuestion(q_tech_hard_10);

        // --- Programming Questions ---
        // Easy
        Question q_programming_easy_1 = new Question();
        q_programming_easy_1.setQuestion("Which keyword is used to declare a variable in Java?");
        q_programming_easy_1.setOptions(Arrays.asList("var", "let", "int", "const"));
        q_programming_easy_1.setAnswer("int"); // Example for int, but var/let/const are JS. In Java, it's type-specific.
        q_programming_easy_1.setTopic("Programming");
        q_programming_easy_1.setDifficulty("Easy");
        qb.addQuestion(q_programming_easy_1);

        Question q_programming_easy_2 = new Question();
        q_programming_easy_2.setQuestion("What does 'IDE' stand for in programming?");
        q_programming_easy_2.setOptions(Arrays.asList("Integrated Design Environment", "Interactive Development Engine", "Integrated Development Environment", "Intelligent Data Editor"));
        q_programming_easy_2.setAnswer("Integrated Development Environment");
        q_programming_easy_2.setTopic("Programming");
        q_programming_easy_2.setDifficulty("Easy");
        qb.addQuestion(q_programming_easy_2);

        Question q_programming_easy_3 = new Question();
        q_programming_easy_3.setQuestion("Which symbol is used for single-line comments in Java?");
        q_programming_easy_3.setOptions(Arrays.asList("/*", "#", "//", "--"));
        q_programming_easy_3.setAnswer("//");
        q_programming_easy_3.setTopic("Programming");
        q_programming_easy_3.setDifficulty("Easy");
        qb.addQuestion(q_programming_easy_3);

        Question q_programming_easy_4 = new Question();
        q_programming_easy_4.setQuestion("What is a 'bug' in programming?");
        q_programming_easy_4.setOptions(Arrays.asList("A type of insect", "An error or flaw in a computer program", "A new feature", "A programming language"));
        q_programming_easy_4.setAnswer("An error or flaw in a computer program");
        q_programming_easy_4.setTopic("Programming");
        q_programming_easy_4.setDifficulty("Easy");
        qb.addQuestion(q_programming_easy_4);

        Question q_programming_easy_5 = new Question();
        q_programming_easy_5.setQuestion("What does 'syntax' refer to in programming?");
        q_programming_easy_5.setOptions(Arrays.asList("The meaning of code", "The set of rules for writing code that the compiler/interpreter understands", "The speed of execution", "The logic of a program"));
        q_programming_easy_5.setAnswer("The set of rules for writing code that the compiler/interpreter understands");
        q_programming_easy_5.setTopic("Programming");
        q_programming_easy_5.setDifficulty("Easy");
        qb.addQuestion(q_programming_easy_5);

        Question q_programming_easy_6 = new Question();
        q_programming_easy_6.setQuestion("Which programming paradigm focuses on 'objects' and 'classes'?");
        q_programming_easy_6.setOptions(Arrays.asList("Procedural Programming", "Functional Programming", "Object-Oriented Programming", "Logical Programming"));
        q_programming_easy_6.setAnswer("Object-Oriented Programming");
        q_programming_easy_6.setTopic("Programming");
        q_programming_easy_6.setDifficulty("Easy");
        qb.addQuestion(q_programming_easy_6);

        Question q_programming_easy_7 = new Question();
        q_programming_easy_7.setQuestion("What is the output of `System.out.println(\"Hello World\");` in Java?");
        q_programming_easy_7.setOptions(Arrays.asList("Compile Error", "Hello World", "Runtime Error", "Null"));
        q_programming_easy_7.setAnswer("Hello World");
        q_programming_easy_7.setTopic("Programming");
        q_programming_easy_7.setDifficulty("Easy");
        qb.addQuestion(q_programming_easy_7);

        Question q_programming_easy_8 = new Question();
        q_programming_easy_8.setQuestion("Which keyword is used to exit a loop in Java?");
        q_programming_easy_8.setOptions(Arrays.asList("continue", "return", "break", "exit"));
        q_programming_easy_8.setAnswer("break");
        q_programming_easy_8.setTopic("Programming");
        q_programming_easy_8.setDifficulty("Easy");
        qb.addQuestion(q_programming_easy_8);

        Question q_programming_easy_9 = new Question();
        q_programming_easy_9.setQuestion("What is a 'compiler'?");
        q_programming_easy_9.setOptions(Arrays.asList("A program that executes code line by line", "A program that translates source code into machine code", "A tool for debugging", "A code editor"));
        q_programming_easy_9.setAnswer("A program that translates source code into machine code");
        q_programming_easy_9.setTopic("Programming");
        q_programming_easy_9.setDifficulty("Easy");
        qb.addQuestion(q_programming_easy_9);

        Question q_programming_easy_10 = new Question();
        q_programming_easy_10.setQuestion("What is the concept of 'variable' in programming?");
        q_programming_easy_10.setOptions(Arrays.asList("A fixed value", "A named storage location that can hold a value", "A mathematical equation", "A function call"));
        q_programming_easy_10.setAnswer("A named storage location that can hold a value");
        q_programming_easy_10.setTopic("Programming");
        q_programming_easy_10.setDifficulty("Easy");
        qb.addQuestion(q_programming_easy_10);

        // Medium
        Question q_programming_medium_1 = new Question();
        q_programming_medium_1.setQuestion("What is the purpose of the 'finally' block in a try-catch-finally statement in Java?");
        q_programming_medium_1.setOptions(Arrays.asList("To execute code only if an exception occurs", "To execute code only if no exception occurs", "To execute code regardless of whether an exception occurs or not", "To catch specific types of exceptions"));
        q_programming_medium_1.setAnswer("To execute code regardless of whether an exception occurs or not");
        q_programming_medium_1.setTopic("Programming");
        q_programming_medium_1.setDifficulty("Medium");
        qb.addQuestion(q_programming_medium_1);

        Question q_programming_medium_2 = new Question();
        q_programming_medium_2.setQuestion("What is 'Polymorphism' in Object-Oriented Programming?");
        q_programming_medium_2.setOptions(Arrays.asList("The ability of an object to take on many forms", "The hiding of data and methods within a class", "The process of creating new objects", "The inheritance of properties from a parent class"));
        q_programming_medium_2.setAnswer("The ability of an object to take on many forms");
        q_programming_medium_2.setTopic("Programming");
        q_programming_medium_2.setDifficulty("Medium");
        qb.addQuestion(q_programming_medium_2);

        Question q_programming_medium_3 = new Question();
        q_programming_medium_3.setQuestion("What does 'API' stand for in programming?");
        q_programming_medium_3.setOptions(Arrays.asList("Advanced Programming Interface", "Application Programming Interface", "Automated Process Integration", "Application Protocol Instruction"));
        q_programming_medium_3.setAnswer("Application Programming Interface");
        q_programming_medium_3.setTopic("Programming");
        q_programming_medium_3.setDifficulty("Medium");
        qb.addQuestion(q_programming_medium_3);

        Question q_programming_medium_4 = new Question();
        q_programming_medium_4.setQuestion("What is a 'Constructor' in Java?");
        q_programming_medium_4.setOptions(Arrays.asList("A method that builds the program", "A special method used to initialize objects", "A type of loop", "A class variable"));
        q_programming_medium_4.setAnswer("A special method used to initialize objects");
        q_programming_medium_4.setTopic("Programming");
        q_programming_medium_4.setDifficulty("Medium");
        qb.addQuestion(q_programming_medium_4);

        Question q_programming_medium_5 = new Question();
        q_programming_medium_5.setQuestion("What is 'recursion' in programming?");
        q_programming_medium_5.setOptions(Arrays.asList("A method that never stops", "A method that calls itself", "A method that returns a value", "A method that takes multiple arguments"));
        q_programming_medium_5.setAnswer("A method that calls itself");
        q_programming_medium_5.setTopic("Programming");
        q_programming_medium_5.setDifficulty("Medium");
        qb.addQuestion(q_programming_medium_5);

        Question q_programming_medium_6 = new Question();
        q_programming_medium_6.setQuestion("What is the purpose of 'version control' systems like Git?");
        q_programming_medium_6.setOptions(Arrays.asList("To speed up program execution", "To manage changes to source code over time", "To encrypt program files", "To debug code automatically"));
        q_programming_medium_6.setAnswer("To manage changes to source code over time");
        q_programming_medium_6.setTopic("Programming");
        q_programming_medium_6.setDifficulty("Medium");
        qb.addQuestion(q_programming_medium_6);

        Question q_programming_medium_7 = new Question();
        q_programming_medium_7.setQuestion("In Java, which collection class is used for storing key-value pairs?");
        q_programming_medium_7.setOptions(Arrays.asList("ArrayList", "LinkedList", "HashSet", "HashMap"));
        q_programming_medium_7.setAnswer("HashMap");
        q_programming_medium_7.setTopic("Programming");
        q_programming_medium_7.setDifficulty("Medium");
        qb.addQuestion(q_programming_medium_7);

        Question q_programming_medium_8 = new Question();
        q_programming_medium_8.setQuestion("What is 'Encapsulation' in OOP?");
        q_programming_medium_8.setOptions(Arrays.asList("Wrapping data and methods that operate on the data within a single unit or class", "Breaking down a problem into smaller functions", "Creating multiple copies of an object", "Allowing a class to inherit from multiple classes"));
        q_programming_medium_8.setAnswer("Wrapping data and methods that operate on the data within a single unit or class");
        q_programming_medium_8.setTopic("Programming");
        q_programming_medium_8.setDifficulty("Medium");
        qb.addQuestion(q_programming_medium_8);

        Question q_programming_medium_9 = new Question();
        q_programming_medium_9.setQuestion("What does 'JVM' stand for in Java?");
        q_programming_medium_9.setOptions(Arrays.asList("Java Visual Machine", "Joint Venture Model", "Java Virtual Machine", "Just Virtual Memory"));
        q_programming_medium_9.setAnswer("Java Virtual Machine");
        q_programming_medium_9.setTopic("Programming");
        q_programming_medium_9.setDifficulty("Medium");
        qb.addQuestion(q_programming_medium_9);

        Question q_programming_medium_10 = new Question();
        q_programming_medium_10.setQuestion("Which access modifier in Java makes a member accessible only within its own class?");
        q_programming_medium_10.setOptions(Arrays.asList("public", "protected", "default (package-private)", "private"));
        q_programming_medium_10.setAnswer("private");
        q_programming_medium_10.setTopic("Programming");
        q_programming_medium_10.setDifficulty("Medium");
        qb.addQuestion(q_programming_medium_10);

        // Hard
        Question q_programming_hard_1 = new Question();
        q_programming_hard_1.setQuestion("What is the 'Diamond Problem' in object-oriented programming?");
        q_programming_hard_1.setOptions(Arrays.asList("A problem with diamond-shaped inheritance hierarchies", "A problem related to multiple inheritance where a class inherits from two classes that have a common ancestor", "A problem with graphics rendering", "A type of data structure"));
        q_programming_hard_1.setAnswer("A problem related to multiple inheritance where a class inherits from two classes that have a common ancestor");
        q_programming_hard_1.setTopic("Programming");
        q_programming_hard_1.setDifficulty("Hard");
        qb.addQuestion(q_programming_hard_1);

        Question q_programming_hard_2 = new Question();
        q_programming_hard_2.setQuestion("What is 'Garbage Collection' in Java?");
        q_programming_hard_2.setOptions(Arrays.asList("A manual process of deleting unused objects", "An automatic process that reclaims memory occupied by objects that are no longer referenced", "A tool for finding bugs", "A method for optimizing code execution speed"));
        q_programming_hard_2.setAnswer("An automatic process that reclaims memory occupied by objects that are no longer referenced");
        q_programming_hard_2.setTopic("Programming");
        q_programming_hard_2.setDifficulty("Hard");
        qb.addQuestion(q_programming_hard_2);

        Question q_programming_hard_3 = new Question();
        q_programming_hard_3.setQuestion("Explain 'Dependency Injection' in software design.");
        q_programming_hard_3.setOptions(Arrays.asList("A method for writing independent functions", "A technique where an object receives other objects that it depends on", "A way to inject malicious code into a program", "A strategy for reducing dependencies between classes"));
        q_programming_hard_3.setAnswer("A technique where an object receives other objects that it depends on");
        q_programming_hard_3.setTopic("Programming");
        q_programming_hard_3.setDifficulty("Hard");
        qb.addQuestion(q_programming_hard_3);

        Question q_programming_hard_4 = new Question();
        q_programming_hard_4.setQuestion("What is a 'Design Pattern' in software engineering?");
        q_programming_hard_4.setOptions(Arrays.asList("A specific piece of code for a problem", "A reusable solution to a commonly occurring problem within a given context in software design", "A graphical user interface layout", "A programming language feature"));
        q_programming_hard_4.setAnswer("A reusable solution to a commonly occurring problem within a given context in software design");
        q_programming_hard_4.setTopic("Programming");
        q_programming_hard_4.setDifficulty("Hard");
        qb.addQuestion(q_programming_hard_4);

        Question q_programming_hard_5 = new Question();
        q_programming_hard_5.setQuestion("What is the purpose of 'serialization' in Java?");
        q_programming_hard_5.setOptions(Arrays.asList("To convert an object into a sequence of bits for storage or transmission", "To encrypt data for security", "To optimize memory usage", "To compile Java code"));
        q_programming_hard_5.setAnswer("To convert an object into a sequence of bits for storage or transmission");
        q_programming_hard_5.setTopic("Programming");
        q_programming_hard_5.setDifficulty("Hard");
        qb.addQuestion(q_programming_hard_5);

        Question q_programming_hard_6 = new Question();
        q_programming_hard_6.setQuestion("What is the 'CAP Theorem' in distributed systems?");
        q_programming_hard_6.setOptions(Arrays.asList("It states that it's impossible for a distributed data store to simultaneously provide more than two out of three guarantees: Consistency, Availability, and Partition tolerance", "A theorem about computer architecture", "A rule for network security", "A principle for designing efficient algorithms"));
        q_programming_hard_6.setAnswer("It states that it's impossible for a distributed data store to simultaneously provide more than two out of three guarantees: Consistency, Availability, and Partition tolerance");
        q_programming_hard_6.setTopic("Programming");
        q_programming_hard_6.setDifficulty("Hard");
        qb.addQuestion(q_programming_hard_6);

        Question q_programming_hard_7 = new Question();
        q_programming_hard_7.setQuestion("What is 'Test-Driven Development' (TDD)?");
        q_programming_hard_7.setOptions(Arrays.asList("Writing tests after the code is complete", "A software development process where tests are written before the code is implemented", "A method for writing complex algorithms", "A way to automatically generate code"));
        q_programming_hard_7.setAnswer("A software development process where tests are written before the code is implemented");
        q_programming_hard_7.setTopic("Programming");
        q_programming_hard_7.setDifficulty("Hard");
        qb.addQuestion(q_programming_hard_7);

        Question q_programming_hard_8 = new Question();
        q_programming_hard_8.setQuestion("What is the purpose of a 'Thread Pool' in concurrent programming?");
        q_programming_hard_8.setOptions(Arrays.asList("To create new threads for every task", "To manage and reuse a fixed number of threads to execute tasks", "To prevent deadlocks", "To synchronize access to shared resources"));
        q_programming_hard_8.setAnswer("To manage and reuse a fixed number of threads to execute tasks");
        q_programming_hard_8.setTopic("Programming");
        q_programming_hard_8.setDifficulty("Hard");
        qb.addQuestion(q_programming_hard_8);

        Question q_programming_hard_9 = new Question();
        q_programming_hard_9.setQuestion("Which concept in Java allows an object to notify other objects when its state changes?");
        q_programming_hard_9.setOptions(Arrays.asList("Inheritance", "Polymorphism", "Encapsulation", "Observer Pattern"));
        q_programming_hard_9.setAnswer("Observer Pattern");
        q_programming_hard_9.setTopic("Programming");
        q_programming_hard_9.setDifficulty("Hard");
        qb.addQuestion(q_programming_hard_9);

        Question q_programming_hard_10 = new Question();
        q_programming_hard_10.setQuestion("What is the 'Principle of Least Astonishment' in software design?");
        q_programming_hard_10.setOptions(Arrays.asList("Code should be surprising", "Code should behave in a way that is familiar and predictable to users/developers", "Code should be as short as possible", "Code should be complex to prevent unauthorized access"));
        q_programming_hard_10.setAnswer("Code should behave in a way that is familiar and predictable to users/developers");
        q_programming_hard_10.setTopic("Programming");
        q_programming_hard_10.setDifficulty("Hard");
        qb.addQuestion(q_programming_hard_10);

        // --- Algorithms Questions ---
        // Easy
        Question q_algorithms_easy_1 = new Question();
        q_algorithms_easy_1.setQuestion("What is an 'algorithm'?");
        q_algorithms_easy_1.setOptions(Arrays.asList("A type of computer program", "A step-by-step procedure for solving a problem or accomplishing a task", "A hardware component", "A programming language"));
        q_algorithms_easy_1.setAnswer("A step-by-step procedure for solving a problem or accomplishing a task");
        q_algorithms_easy_1.setTopic("Algorithms");
        q_algorithms_easy_1.setDifficulty("Easy");
        qb.addQuestion(q_algorithms_easy_1);

        Question q_algorithms_easy_2 = new Question();
        q_algorithms_easy_2.setQuestion("Which sorting algorithm repeatedly steps through the list, compares adjacent elements and swaps them if they are in the wrong order?");
        q_algorithms_easy_2.setOptions(Arrays.asList("Merge Sort", "Quick Sort", "Bubble Sort", "Insertion Sort"));
        q_algorithms_easy_2.setAnswer("Bubble Sort");
        q_algorithms_easy_2.setTopic("Algorithms");
        q_algorithms_easy_2.setDifficulty("Easy");
        qb.addQuestion(q_algorithms_easy_2);

        Question q_algorithms_easy_3 = new Question();
        q_algorithms_easy_3.setQuestion("What is a 'data structure'?");
        q_algorithms_easy_3.setOptions(Arrays.asList("A type of algorithm", "A specialized format for organizing and storing data", "A programming language", "A computer network"));
        q_algorithms_easy_3.setAnswer("A specialized format for organizing and storing data");
        q_algorithms_easy_3.setTopic("Algorithms");
        q_algorithms_easy_3.setDifficulty("Easy");
        qb.addQuestion(q_algorithms_easy_3);

        Question q_algorithms_easy_4 = new Question();
        q_algorithms_easy_4.setQuestion("Which search algorithm works by repeatedly dividing the search interval in half?");
        q_algorithms_easy_4.setOptions(Arrays.asList("Linear Search", "Binary Search", "Jump Search", "Interpolation Search"));
        q_algorithms_easy_4.setAnswer("Binary Search");
        q_algorithms_easy_4.setTopic("Algorithms");
        q_algorithms_easy_4.setDifficulty("Easy");
        qb.addQuestion(q_algorithms_easy_4);

        Question q_algorithms_easy_5 = new Question();
        q_algorithms_easy_5.setQuestion("What is the primary goal of optimizing an algorithm?");
        q_algorithms_easy_5.setOptions(Arrays.asList("To make it harder to understand", "To reduce its memory usage and/or execution time", "To add more features", "To make it compatible with more programming languages"));
        q_algorithms_easy_5.setAnswer("To reduce its memory usage and/or execution time");
        q_algorithms_easy_5.setTopic("Algorithms");
        q_algorithms_easy_5.setDifficulty("Easy");
        qb.addQuestion(q_algorithms_easy_5);

        Question q_algorithms_easy_6 = new Question();
        q_algorithms_easy_6.setQuestion("Which data structure uses LIFO (Last-In, First-Out) principle?");
        q_algorithms_easy_6.setOptions(Arrays.asList("Queue", "Stack", "Array", "Linked List"));
        q_algorithms_easy_6.setAnswer("Stack");
        q_algorithms_easy_6.setTopic("Algorithms");
        q_algorithms_easy_6.setDifficulty("Easy");
        qb.addQuestion(q_algorithms_easy_6);

        Question q_algorithms_easy_7 = new Question();
        q_algorithms_easy_7.setQuestion("What is 'Pseudocode'?");
        q_algorithms_easy_7.setOptions(Arrays.asList("Actual programming code", "A fake programming language", "A plain language description of the steps in an algorithm", "A type of debugging tool"));
        q_algorithms_easy_7.setAnswer("A plain language description of the steps in an algorithm");
        q_algorithms_easy_7.setTopic("Algorithms");
        q_algorithms_easy_7.setDifficulty("Easy");
        qb.addQuestion(q_algorithms_easy_7);

        Question q_algorithms_easy_8 = new Question();
        q_algorithms_easy_8.setQuestion("Which data structure uses FIFO (First-In, First-Out) principle?");
        q_algorithms_easy_8.setOptions(Arrays.asList("Stack", "Queue", "Tree", "Graph"));
        q_algorithms_easy_8.setAnswer("Queue");
        q_algorithms_easy_8.setTopic("Algorithms");
        q_algorithms_easy_8.setDifficulty("Easy");
        qb.addQuestion(q_algorithms_easy_8);

        Question q_algorithms_easy_9 = new Question();
        q_algorithms_easy_9.setQuestion("What is a 'flowchart' in algorithm design?");
        q_algorithms_easy_9.setOptions(Arrays.asList("A type of diagram that represents an algorithm or process", "A textual description of an algorithm", "A table of data", "A programming language syntax guide"));
        q_algorithms_easy_9.setAnswer("A type of diagram that represents an algorithm or process");
        q_algorithms_easy_9.setTopic("Algorithms");
        q_algorithms_easy_9.setDifficulty("Easy");
        qb.addQuestion(q_algorithms_easy_9);

        Question q_algorithms_easy_10 = new Question();
        q_algorithms_easy_10.setQuestion("Which term describes the time an algorithm takes to run as the input size grows?");
        q_algorithms_easy_10.setOptions(Arrays.asList("Memory usage", "Space complexity", "Time complexity", "Code readability"));
        q_algorithms_easy_10.setAnswer("Time complexity");
        q_algorithms_easy_10.setTopic("Algorithms");
        q_algorithms_easy_10.setDifficulty("Easy");
        qb.addQuestion(q_algorithms_easy_10);

        // Medium
        Question q_algorithms_medium_1 = new Question();
        q_algorithms_medium_1.setQuestion("Which sorting algorithm uses a 'divide and conquer' approach by recursively splitting the array in half?");
        q_algorithms_medium_1.setOptions(Arrays.asList("Bubble Sort", "Selection Sort", "Merge Sort", "Insertion Sort"));
        q_algorithms_medium_1.setAnswer("Merge Sort");
        q_algorithms_medium_1.setTopic("Algorithms");
        q_algorithms_medium_1.setDifficulty("Medium");
        qb.addQuestion(q_algorithms_medium_1);

        Question q_algorithms_medium_2 = new Question();
        q_algorithms_medium_2.setQuestion("What is a 'hash table' (or hash map)?");
        q_algorithms_medium_2.setOptions(Arrays.asList("A table for storing encrypted data", "A data structure that implements an associative array abstract data type, mapping keys to values", "A table for sorting numbers", "A list of ordered elements"));
        q_algorithms_medium_2.setAnswer("A data structure that implements an associative array abstract data type, mapping keys to values");
        q_algorithms_medium_2.setTopic("Algorithms");
        q_algorithms_medium_2.setDifficulty("Medium");
        qb.addQuestion(q_algorithms_medium_2);

        Question q_algorithms_medium_3 = new Question();
        q_algorithms_medium_3.setQuestion("Which algorithm is used to find the shortest path between nodes in a graph?");
        q_algorithms_medium_3.setOptions(Arrays.asList("Breadth-First Search (BFS)", "Depth-First Search (DFS)", "Dijkstra's Algorithm", "Prim's Algorithm"));
        q_algorithms_medium_3.setAnswer("Dijkstra's Algorithm");
        q_algorithms_medium_3.setTopic("Algorithms");
        q_algorithms_medium_3.setDifficulty("Medium");
        qb.addQuestion(q_algorithms_medium_3);

        Question q_algorithms_medium_4 = new Question();
        q_algorithms_medium_4.setQuestion("What is the worst-case time complexity of Quick Sort?");
        q_algorithms_medium_4.setOptions(Arrays.asList("O(n log n)", "O(n²)", "O(log n)", "O(n)"));
        q_algorithms_medium_4.setAnswer("O(n²)");
        q_algorithms_medium_4.setTopic("Algorithms");
        q_algorithms_medium_4.setDifficulty("Medium");
        qb.addQuestion(q_algorithms_medium_4);

        Question q_algorithms_medium_5 = new Question();
        q_algorithms_medium_5.setQuestion("Which data structure is best suited for implementing a priority queue?");
        q_algorithms_medium_5.setOptions(Arrays.asList("Linked List", "Array", "Hash Table", "Heap"));
        q_algorithms_medium_5.setAnswer("Heap");
        q_algorithms_medium_5.setTopic("Algorithms");
        q_algorithms_medium_5.setDifficulty("Medium");
        qb.addQuestion(q_algorithms_medium_5);

        Question q_algorithms_medium_6 = new Question();
        q_algorithms_medium_6.setQuestion("What is the purpose of 'dynamic programming'?");
        q_algorithms_medium_6.setOptions(Arrays.asList("Solving problems by breaking them down into smaller overlapping subproblems and storing the results", "Solving problems through random trials", "Solving problems by directly calculating every possibility", "Solving problems using a greedy approach"));
        q_algorithms_medium_6.setAnswer("Solving problems by breaking them down into smaller overlapping subproblems and storing the results");
        q_algorithms_medium_6.setTopic("Algorithms");
        q_algorithms_medium_6.setDifficulty("Medium");
        qb.addQuestion(q_algorithms_medium_6);

        Question q_algorithms_medium_7 = new Question();
        q_algorithms_medium_7.setQuestion("Which graph traversal algorithm uses a stack (explicitly or implicitly via recursion)?");
        q_algorithms_medium_7.setOptions(Arrays.asList("Breadth-First Search (BFS)", "Dijkstra's Algorithm", "Depth-First Search (DFS)", "Prim's Algorithm"));
        q_algorithms_medium_7.setAnswer("Depth-First Search (DFS)");
        q_algorithms_medium_7.setTopic("Algorithms");
        q_algorithms_medium_7.setDifficulty("Medium");
        qb.addQuestion(q_algorithms_medium_7);

        Question q_algorithms_medium_8 = new Question();
        q_algorithms_medium_8.setQuestion("What is the time complexity of searching for an element in a balanced Binary Search Tree?");
        q_algorithms_medium_8.setOptions(Arrays.asList("O(1)", "O(n)", "O(log n)", "O(n log n)"));
        q_algorithms_medium_8.setAnswer("O(log n)");
        q_algorithms_medium_8.setTopic("Algorithms");
        q_algorithms_medium_8.setDifficulty("Medium");
        qb.addQuestion(q_algorithms_medium_8);

        Question q_algorithms_medium_9 = new Question();
        q_algorithms_medium_9.setQuestion("Which algorithm is commonly used for finding cycles in a linked list?");
        q_algorithms_medium_9.setOptions(Arrays.asList("Floyd's Cycle-Finding Algorithm (Tortoise and Hare)", "Kruskal's Algorithm", "Bubble Sort", "Linear Search"));
        q_algorithms_medium_9.setAnswer("Floyd's Cycle-Finding Algorithm (Tortoise and Hare)");
        q_algorithms_medium_9.setTopic("Algorithms");
        q_algorithms_medium_9.setDifficulty("Medium");
        qb.addQuestion(q_algorithms_medium_9);

        Question q_algorithms_medium_10 = new Question();
        q_algorithms_medium_10.setQuestion("What is a 'greedy algorithm'?");
        q_algorithms_medium_10.setOptions(Arrays.asList("An algorithm that always makes the locally optimal choice at each stage with the hope of finding a global optimum", "An algorithm that explores all possible solutions", "An algorithm that uses recursion", "An algorithm that requires a lot of memory"));
        q_algorithms_medium_10.setAnswer("An algorithm that always makes the locally optimal choice at each stage with the hope of finding a global optimum");
        q_algorithms_medium_10.setTopic("Algorithms");
        q_algorithms_medium_10.setDifficulty("Medium");
        qb.addQuestion(q_algorithms_medium_10);

        // Hard
        Question q_algorithms_hard_1 = new Question();
        q_algorithms_hard_1.setQuestion("What is the significance of P vs NP problem in theoretical computer science?");
        q_algorithms_hard_1.setOptions(Arrays.asList("It determines if a problem can be solved in polynomial time", "It asks whether every problem whose solution can be quickly verified can also be quickly solved", "It classifies problems based on their memory requirements", "It defines the limits of quantum computing"));
        q_algorithms_hard_1.setAnswer("It asks whether every problem whose solution can be quickly verified can also be quickly solved");
        q_algorithms_hard_1.setTopic("Algorithms");
        q_algorithms_hard_1.setDifficulty("Hard");
        qb.addQuestion(q_algorithms_hard_1);

        Question q_algorithms_hard_2 = new Question();
        q_algorithms_hard_2.setQuestion("Which algorithm is used for finding the minimum spanning tree of a graph?");
        q_algorithms_hard_2.setOptions(Arrays.asList("Dijkstra's Algorithm", "Bellman-Ford Algorithm", "Prim's Algorithm", "Topological Sort"));
        q_algorithms_hard_2.setAnswer("Prim's Algorithm");
        q_algorithms_hard_2.setTopic("Algorithms");
        q_algorithms_hard_2.setDifficulty("Hard");
        qb.addQuestion(q_algorithms_hard_2);

        Question q_algorithms_hard_3 = new Question();
        q_algorithms_hard_3.setQuestion("What is 'Amortized Analysis' of algorithms?");
        q_algorithms_hard_3.setOptions(Arrays.asList("Analyzing the worst-case time of a single operation", "Analyzing the average time of a single operation", "Analyzing the average performance of a sequence of operations over time", "Analyzing the best-case performance of an algorithm"));
        q_algorithms_hard_3.setAnswer("Analyzing the average performance of a sequence of operations over time");
        q_algorithms_hard_3.setTopic("Algorithms");
        q_algorithms_hard_3.setDifficulty("Hard");
        qb.addQuestion(q_algorithms_hard_3);

        Question q_algorithms_hard_4 = new Question();
        q_algorithms_hard_4.setQuestion("What is the 'Master Theorem' used for in algorithm analysis?");
        q_algorithms_hard_4.setOptions(Arrays.asList("To solve linear equations", "To analyze the running time of recursive algorithms", "To prove algorithm correctness", "To optimize sorting algorithms"));
        q_algorithms_hard_4.setAnswer("To analyze the running time of recursive algorithms");
        q_algorithms_hard_4.setTopic("Algorithms");
        q_algorithms_hard_4.setDifficulty("Hard");
        qb.addQuestion(q_algorithms_hard_4);

        Question q_algorithms_hard_5 = new Question();
        q_algorithms_hard_5.setQuestion("Which type of data structure is used to implement a LRU (Least Recently Used) cache?");
        q_algorithms_hard_5.setOptions(Arrays.asList("Array", "Hash Table", "Doubly Linked List and Hash Map (combined)", "Stack"));
        q_algorithms_hard_5.setAnswer("Doubly Linked List and Hash Map (combined)");
        q_algorithms_hard_5.setTopic("Algorithms");
        q_algorithms_hard_5.setDifficulty("Hard");
        qb.addQuestion(q_algorithms_hard_5);

        Question q_algorithms_hard_6 = new Question();
        q_algorithms_hard_6.setQuestion("What is the Z-algorithm used for?");
        q_algorithms_hard_6.setOptions(Arrays.asList("Finding all occurrences of a pattern in a text", "Sorting an array", "Finding the shortest path in a graph", "Hashing data"));
        q_algorithms_hard_6.setAnswer("Finding all occurrences of a pattern in a text");
        q_algorithms_hard_6.setTopic("Algorithms");
        q_algorithms_hard_6.setDifficulty("Hard");
        qb.addQuestion(q_algorithms_hard_6);

        Question q_algorithms_hard_7 = new Question();
        q_algorithms_hard_7.setQuestion("Which complexity class contains problems that can be solved in polynomial time by a non-deterministic Turing machine?");
        q_algorithms_hard_7.setOptions(Arrays.asList("P", "NP", "NP-hard", "PSPACE"));
        q_algorithms_hard_7.setAnswer("NP");
        q_algorithms_hard_7.setTopic("Algorithms");
        q_algorithms_hard_7.setDifficulty("Hard");
        qb.addQuestion(q_algorithms_hard_7);

        Question q_algorithms_hard_8 = new Question();
        q_algorithms_hard_8.setQuestion("What is 'branch and bound' in optimization algorithms?");
        q_algorithms_hard_8.setOptions(Arrays.asList("A method for solving linear programming problems", "A general algorithm for finding optimal solutions of optimization problems, especially integer programming", "A technique for graph traversal", "A method for sorting large datasets"));
        q_algorithms_hard_8.setAnswer("A general algorithm for finding optimal solutions of optimization problems, especially integer programming");
        q_algorithms_hard_8.setTopic("Algorithms");
        q_algorithms_hard_8.setDifficulty("Hard");
        qb.addQuestion(q_algorithms_hard_8);

        Question q_algorithms_hard_9 = new Question();
        q_algorithms_hard_9.setQuestion("Which cryptographic algorithm is based on the difficulty of factoring large prime numbers?");
        q_algorithms_hard_9.setOptions(Arrays.asList("AES", "RSA", "SHA-256", "DES"));
        q_algorithms_hard_9.setAnswer("RSA");
        q_algorithms_hard_9.setTopic("Algorithms");
        q_algorithms_hard_9.setDifficulty("Hard");
        qb.addQuestion(q_algorithms_hard_9);

        Question q_algorithms_hard_10 = new Question();
        q_algorithms_hard_10.setQuestion("What is a 'Trie' data structure primarily used for?");
        q_algorithms_hard_10.setOptions(Arrays.asList("Storing numbers in a sorted order", "Efficient retrieval of a key in a large dataset of strings", "Implementing a stack", "Representing graphs"));
        q_algorithms_hard_10.setAnswer("Efficient retrieval of a key in a large dataset of strings");
        q_algorithms_hard_10.setTopic("Algorithms");
        q_algorithms_hard_10.setDifficulty("Hard");
        qb.addQuestion(q_algorithms_hard_10);

        // --- Data Science Questions ---
        // Easy
        Question q_datascience_easy_1 = new Question();
        q_datascience_easy_1.setQuestion("What is the primary goal of Data Science?");
        q_datascience_easy_1.setOptions(Arrays.asList("To collect data", "To extract insights and knowledge from data", "To store data", "To delete data"));
        q_datascience_easy_1.setAnswer("To extract insights and knowledge from data");
        q_datascience_easy_1.setTopic("Data Science");
        q_datascience_easy_1.setDifficulty("Easy");
        qb.addQuestion(q_datascience_easy_1);

        Question q_datascience_easy_2 = new Question();
        q_datascience_easy_2.setQuestion("Which programming language is very popular for data analysis and visualization due to libraries like Pandas and Matplotlib?");
        q_datascience_easy_2.setOptions(Arrays.asList("Java", "C++", "Python", "JavaScript"));
        q_datascience_easy_2.setAnswer("Python");
        q_datascience_easy_2.setTopic("Data Science");
        q_datascience_easy_2.setDifficulty("Easy");
        qb.addQuestion(q_datascience_easy_2);

        Question q_datascience_easy_3 = new Question();
        q_datascience_easy_3.setQuestion("What is 'Big Data'?");
        q_datascience_easy_3.setOptions(Arrays.asList("A large spreadsheet", "Data sets that are too large or complex for traditional data processing applications", "Data stored on a hard drive", "Data collected from social media"));
        q_datascience_easy_3.setAnswer("Data sets that are too large or complex for traditional data processing applications");
        q_datascience_easy_3.setTopic("Data Science");
        q_datascience_easy_3.setDifficulty("Easy");
        qb.addQuestion(q_datascience_easy_3);

        Question q_datascience_easy_4 = new Question();
        q_datascience_easy_4.setQuestion("Which type of chart is best for showing the distribution of a single numerical variable?");
        q_datascience_easy_4.setOptions(Arrays.asList("Bar Chart", "Line Chart", "Histogram", "Pie Chart"));
        q_datascience_easy_4.setAnswer("Histogram");
        q_datascience_easy_4.setTopic("Data Science");
        q_datascience_easy_4.setDifficulty("Easy");
        qb.addQuestion(q_datascience_easy_4);

        Question q_datascience_easy_5 = new Question();
        q_datascience_easy_5.setQuestion("What is 'Data Cleaning'?");
        q_datascience_easy_5.setOptions(Arrays.asList("Deleting all data", "The process of fixing or removing incorrect, corrupted, incorrectly formatted, duplicate, or incomplete data within a dataset", "Organizing data alphabetically", "Encrypting data"));
        q_datascience_easy_5.setAnswer("The process of fixing or removing incorrect, corrupted, incorrectly formatted, duplicate, or incomplete data within a dataset");
        q_datascience_easy_5.setTopic("Data Science");
        q_datascience_easy_5.setDifficulty("Easy");
        qb.addQuestion(q_datascience_easy_5);

        Question q_datascience_easy_6 = new Question();
        q_datascience_easy_6.setQuestion("What does 'EDA' stand for in Data Science?");
        q_datascience_easy_6.setOptions(Arrays.asList("Efficient Data Analysis", "Exploratory Data Analysis", "External Data Access", "Essential Data Analytics"));
        q_datascience_easy_6.setAnswer("Exploratory Data Analysis");
        q_datascience_easy_6.setTopic("Data Science");
        q_datascience_easy_6.setDifficulty("Easy");
        qb.addQuestion(q_datascience_easy_6);

        Question q_datascience_easy_7 = new Question();
        q_datascience_easy_7.setQuestion("Which statistical measure represents the most frequent value in a dataset?");
        q_datascience_easy_7.setOptions(Arrays.asList("Mean", "Median", "Mode", "Range"));
        q_datascience_easy_7.setAnswer("Mode");
        q_datascience_easy_7.setTopic("Data Science");
        q_datascience_easy_7.setDifficulty("Easy");
        qb.addQuestion(q_datascience_easy_7);

        Question q_datascience_easy_8 = new Question();
        q_datascience_easy_8.setQuestion("What is 'Supervised Learning' in Machine Learning?");
        q_datascience_easy_8.setOptions(Arrays.asList("Learning without labeled data", "Learning with labeled training data", "Learning by interacting with an environment", "Learning with continuous data"));
        q_datascience_easy_8.setAnswer("Learning with labeled training data");
        q_datascience_easy_8.setTopic("Data Science");
        q_datascience_easy_8.setDifficulty("Easy");
        qb.addQuestion(q_datascience_easy_8);

        Question q_datascience_easy_9 = new Question();
        q_datascience_easy_9.setQuestion("What is a 'Dataset'?");
        q_datascience_easy_9.setOptions(Arrays.asList("A single piece of data", "A collection of related data", "A type of database", "A data analysis tool"));
        q_datascience_easy_9.setAnswer("A collection of related data");
        q_datascience_easy_9.setTopic("Data Science");
        q_datascience_easy_9.setDifficulty("Easy");
        qb.addQuestion(q_datascience_easy_9);

        Question q_datascience_easy_10 = new Question();
        q_datascience_easy_10.setQuestion("Which tool is commonly used for creating interactive data visualizations in Python?");
        q_datascience_easy_10.setOptions(Arrays.asList("NumPy", "Pandas", "Matplotlib", "Scikit-learn"));
        q_datascience_easy_10.setAnswer("Matplotlib");
        q_datascience_easy_10.setTopic("Data Science");
        q_datascience_easy_10.setDifficulty("Easy");
        qb.addQuestion(q_datascience_easy_10);

        // Medium
        Question q_datascience_medium_1 = new Question();
        q_datascience_medium_1.setQuestion("What is 'Regression Analysis' in Data Science?");
        q_datascience_medium_1.setOptions(Arrays.asList("A method for grouping data points", "A statistical method used to determine the strength and character of the relationship between two or more variables", "A technique for predicting categorical outcomes", "A method for reducing data dimensionality"));
        q_datascience_medium_1.setAnswer("A statistical method used to determine the strength and character of the relationship between two or more variables");
        q_datascience_medium_1.setTopic("Data Science");
        q_datascience_medium_1.setDifficulty("Medium");
        qb.addQuestion(q_datascience_medium_1);

        Question q_datascience_medium_2 = new Question();
        q_datascience_medium_2.setQuestion("What is 'Feature Engineering' in Machine Learning?");
        q_datascience_medium_2.setOptions(Arrays.asList("Selecting the best algorithm for a problem", "The process of transforming raw data into features that better represent the underlying problem to the predictive models", "Evaluating model performance", "Deploying models to production"));
        q_datascience_medium_2.setAnswer("The process of transforming raw data into features that better represent the underlying problem to the predictive models");
        q_datascience_medium_2.setTopic("Data Science");
        q_datascience_medium_2.setDifficulty("Medium");
        qb.addQuestion(q_datascience_medium_2);

        Question q_datascience_medium_3 = new Question();
        q_datascience_medium_3.setQuestion("What is 'Bias-Variance Tradeoff' in Machine Learning?");
        q_datascience_medium_3.setOptions(Arrays.asList("A conflict between the amount of data and model complexity", "A conflict between a model's ability to minimize error from bias and error from variance", "A trade-off between training time and prediction time", "A choice between different programming languages"));
        q_datascience_medium_3.setAnswer("A conflict between a model's ability to minimize error from bias and error from variance");
        q_datascience_medium_3.setTopic("Data Science");
        q_datascience_medium_3.setDifficulty("Medium");
        qb.addQuestion(q_datascience_medium_3);

        Question q_datascience_medium_4 = new Question();
        q_datascience_medium_4.setQuestion("Which statistical test is used to compare the means of two groups?");
        q_datascience_medium_4.setOptions(Arrays.asList("Chi-squared test", "ANOVA", "T-test", "Correlation Coefficient"));
        q_datascience_medium_4.setAnswer("T-test");
        q_datascience_medium_4.setTopic("Data Science");
        q_datascience_medium_4.setDifficulty("Medium");
        qb.addQuestion(q_datascience_medium_4);

        Question q_datascience_medium_5 = new Question();
        q_datascience_medium_5.setQuestion("What is 'Clustering' in unsupervised learning?");
        q_datascience_medium_5.setOptions(Arrays.asList("Predicting a continuous value", "Grouping a set of objects in such a way that objects in the same group (cluster) are more similar to each other than to those in other groups", "Classifying data into predefined categories", "Reducing the number of features in a dataset"));
        q_datascience_medium_5.setAnswer("Grouping a set of objects in such a way that objects in the same group (cluster) are more similar to each other than to those in other groups");
        q_datascience_medium_5.setTopic("Data Science");
        q_datascience_medium_5.setDifficulty("Medium");
        qb.addQuestion(q_datascience_medium_5);

        Question q_datascience_medium_6 = new Question();
        q_datascience_medium_6.setQuestion("What does 'RMSE' stand for in model evaluation?");
        q_datascience_medium_6.setOptions(Arrays.asList("Root Mean Squared Error", "Randomized Model Selection Error", "Regression Model Standard Error", "Robust Mean Square Evaluation"));
        q_datascience_medium_6.setAnswer("Root Mean Squared Error");
        q_datascience_medium_6.setTopic("Data Science");
        q_datascience_medium_6.setDifficulty("Medium");
        qb.addQuestion(q_datascience_medium_6);

        Question q_datascience_medium_7 = new Question();
        q_datascience_medium_7.setQuestion("What is 'Cross-validation' in Machine Learning?");
        q_datascience_medium_7.setOptions(Arrays.asList("A technique for verifying data integrity", "A technique to assess how the results of a statistical analysis will generalize to an independent dataset", "A method for combining multiple models", "A way to reduce data dimensionality"));
        q_datascience_medium_7.setAnswer("A technique to assess how the results of a statistical analysis will generalize to an independent dataset");
        q_datascience_medium_7.setTopic("Data Science");
        q_datascience_medium_7.setDifficulty("Medium");
        qb.addQuestion(q_datascience_medium_7);

        Question q_datascience_medium_8 = new Question();
        q_datascience_medium_8.setQuestion("Which Python library is widely used for numerical operations, especially with multi-dimensional arrays?");
        q_datascience_medium_8.setOptions(Arrays.asList("Pandas", "Scikit-learn", "NumPy", "Matplotlib"));
        q_datascience_medium_8.setAnswer("NumPy");
        q_datascience_medium_8.setTopic("Data Science");
        q_datascience_medium_8.setDifficulty("Medium");
        qb.addQuestion(q_datascience_medium_8);

        Question q_datascience_medium_9 = new Question();
        q_datascience_medium_9.setQuestion("What is a 'Confusion Matrix' in classification problems?");
        q_datascience_medium_9.setOptions(Arrays.asList("A matrix that confuses the model", "A table that is often used to describe the performance of a classification model on a set of test data for which the true values are known", "A matrix used for data cleaning", "A graphical representation of data correlations"));
        q_datascience_medium_9.setAnswer("A table that is often used to describe the performance of a classification model on a set of test data for which the true values are known");
        q_datascience_medium_9.setTopic("Data Science");
        q_datascience_medium_9.setDifficulty("Medium");
        qb.addQuestion(q_datascience_medium_9);

        Question q_datascience_medium_10 = new Question();
        q_datascience_medium_10.setQuestion("What is the primary goal of 'Dimensionality Reduction'?");
        q_datascience_medium_10.setOptions(Arrays.asList("To increase the number of features", "To reduce the number of random variables under consideration", "To make data more complex", "To improve data storage efficiency only"));
        q_datascience_medium_10.setAnswer("To reduce the number of random variables under consideration");
        q_datascience_medium_10.setTopic("Data Science");
        q_datascience_medium_10.setDifficulty("Medium");
        qb.addQuestion(q_datascience_medium_10);

        // Hard
        Question q_datascience_hard_1 = new Question();
        q_datascience_hard_1.setQuestion("What is the difference between 'Bagging' and 'Boosting' in ensemble methods?");
        q_datascience_hard_1.setOptions(Arrays.asList("Bagging focuses on reducing bias, Boosting on reducing variance", "Bagging builds models independently, Boosting builds them sequentially with focus on misclassified samples", "Bagging uses decision trees, Boosting uses neural networks", "There is no significant difference"));
        q_datascience_hard_1.setAnswer("Bagging builds models independently, Boosting builds them sequentially with focus on misclassified samples");
        q_datascience_hard_1.setTopic("Data Science");
        q_datascience_hard_1.setDifficulty("Hard");
        qb.addQuestion(q_datascience_hard_1);

        Question q_datascience_hard_2 = new Question();
        q_datascience_hard_2.setQuestion("What is 'Stochastic Gradient Descent' (SGD)?");
        q_datascience_hard_2.setOptions(Arrays.asList("A batch processing method", "An optimization algorithm used to minimize a loss function by updating model parameters based on the gradient of the loss for a single randomly chosen training example", "A method for calculating complex derivatives", "An algorithm for data normalization"));
        q_datascience_hard_2.setAnswer("An optimization algorithm used to minimize a loss function by updating model parameters based on the gradient of the loss for a single randomly chosen training example");
        q_datascience_hard_2.setTopic("Data Science");
        q_datascience_hard_2.setDifficulty("Hard");
        qb.addQuestion(q_datascience_hard_2);

        Question q_datascience_hard_3 = new Question();
        q_datascience_hard_3.setQuestion("What is the 'Curse of Dimensionality' in Machine Learning?");
        q_datascience_hard_3.setOptions(Arrays.asList("The difficulty of collecting high-dimensional data", "The exponential increase in volume associated with adding extra dimensions to a mathematical space, causing data to become sparse", "A problem with low-dimensional data", "The challenge of visualizing high-dimensional data"));
        q_datascience_hard_3.setAnswer("The exponential increase in volume associated with adding extra dimensions to a mathematical space, causing data to become sparse");
        q_datascience_hard_3.setTopic("Data Science");
        q_datascience_hard_3.setDifficulty("Hard");
        qb.addQuestion(q_datascience_hard_3);

        Question q_datascience_hard_4 = new Question();
        q_datascience_hard_4.setQuestion("What is a 'Kernel Trick' in Support Vector Machines (SVMs)?");
        q_datascience_hard_4.setOptions(Arrays.asList("A trick to make SVMs run faster", "A method of transforming data into a higher-dimensional space without explicitly computing the coordinates of the data in that space", "A way to reduce the number of support vectors", "A technique for handling imbalanced datasets"));
        q_datascience_hard_4.setAnswer("A method of transforming data into a higher-dimensional space without explicitly computing the coordinates of the data in that space");
        q_datascience_hard_4.setTopic("Data Science");
        q_datascience_hard_4.setDifficulty("Hard");
        qb.addQuestion(q_datascience_hard_4);

        Question q_datascience_hard_5 = new Question();
        q_datascience_hard_5.setQuestion("What is 'Bayesian Inference'?");
        q_datascience_hard_5.setOptions(Arrays.asList("A method for frequentist statistics", "A method of statistical inference in which Bayes' theorem is used to update the probability for a hypothesis as more evidence or information becomes available", "A technique for hypothesis testing", "A non-parametric statistical method"));
        q_datascience_hard_5.setAnswer("A method of statistical inference in which Bayes' theorem is used to update the probability for a hypothesis as more evidence or information becomes available");
        q_datascience_hard_5.setTopic("Data Science");
        q_datascience_hard_5.setDifficulty("Hard");
        qb.addQuestion(q_datascience_hard_5);

        Question q_datascience_hard_6 = new Question();
        q_datascience_hard_6.setQuestion("What is the primary objective of a 'Principal Component Analysis' (PCA)?");
        q_datascience_hard_6.setOptions(Arrays.asList("To classify data into categories", "To predict a target variable", "To transform data into a new coordinate system such that the greatest variance by any projection of the data comes to lie on the first coordinate", "To cluster data points"));
        q_datascience_hard_6.setAnswer("To transform data into a new coordinate system such that the greatest variance by any projection of the data comes to lie on the first coordinate");
        q_datascience_hard_6.setTopic("Data Science");
        q_datascience_hard_6.setDifficulty("Hard");
        qb.addQuestion(q_datascience_hard_6);

        Question q_datascience_hard_7 = new Question();
        q_datascience_hard_7.setQuestion("In Time Series Analysis, what does 'ARIMA' stand for?");
        q_datascience_hard_7.setOptions(Arrays.asList("AutoRegressive Integrated Moving Average", "Average Regression Integrated Model Analysis", "Automated Real-time Indian Market Analysis", "Adaptive Recursive Iterative Model Algorithm"));
        q_datascience_hard_7.setAnswer("AutoRegressive Integrated Moving Average");
        q_datascience_hard_7.setTopic("Data Science");
        q_datascience_hard_7.setDifficulty("Hard");
        qb.addQuestion(q_datascience_hard_7);

        Question q_datascience_hard_8 = new Question();
        q_datascience_hard_8.setQuestion("What is 'Confounding Variable' in statistical studies?");
        q_datascience_hard_8.setOptions(Arrays.asList("A variable that has no effect on the outcome", "A variable that correlates with both the dependent and independent variable, distorting the observed relationship", "A variable that is always constant", "A variable that is easy to measure"));
        q_datascience_hard_8.setAnswer("A variable that correlates with both the dependent and independent variable, distorting the observed relationship");
        q_datascience_hard_8.setTopic("Data Science");
        q_datascience_hard_8.setDifficulty("Hard");
        qb.addQuestion(q_datascience_hard_8);

        Question q_datascience_hard_9 = new Question();
        q_datascience_hard_9.setQuestion("What is the 'ROC Curve' used for in classification model evaluation?");
        q_datascience_hard_9.setOptions(Arrays.asList("To visualize data clusters", "To assess the performance of a binary classifier system as its discrimination threshold is varied", "To plot regression results", "To compare different datasets"));
        q_datascience_hard_9.setAnswer("To assess the performance of a binary classifier system as its discrimination threshold is varied");
        q_datascience_hard_9.setTopic("Data Science");
        q_datascience_hard_9.setDifficulty("Hard");
        qb.addQuestion(q_datascience_hard_9);

        Question q_datascience_hard_10 = new Question();
        q_datascience_hard_10.setQuestion("Which data structure is often used to implement a 'decision tree' algorithm?");
        q_datascience_hard_10.setOptions(Arrays.asList("Linked List", "Array", "Tree", "Hash Map"));
        q_datascience_hard_10.setAnswer("Tree");
        q_datascience_hard_10.setTopic("Data Science");
        q_datascience_hard_10.setDifficulty("Hard");
        qb.addQuestion(q_datascience_hard_10);

        // --- Geography Questions ---
        // Easy
        Question q_geo_easy_1 = new Question();
        q_geo_easy_1.setQuestion("What is the capital of Japan?");
        q_geo_easy_1.setOptions(Arrays.asList("Beijing", "Seoul", "Tokyo", "Bangkok"));
        q_geo_easy_1.setAnswer("Tokyo");
        q_geo_easy_1.setTopic("Geography");
        q_geo_easy_1.setDifficulty("Easy");
        qb.addQuestion(q_geo_easy_1);

        Question q_geo_easy_2 = new Question();
        q_geo_easy_2.setQuestion("Which continent is the largest by land area?");
        q_geo_easy_2.setOptions(Arrays.asList("Africa", "Europe", "Asia", "North America"));
        q_geo_easy_2.setAnswer("Asia");
        q_geo_easy_2.setTopic("Geography");
        q_geo_easy_2.setDifficulty("Easy");
        qb.addQuestion(q_geo_easy_2);

        Question q_geo_easy_3 = new Question();
        q_geo_easy_3.setQuestion("What is the longest mountain range in South America?");
        q_geo_easy_3.setOptions(Arrays.asList("Rocky Mountains", "Alps", "Andes", "Himalayas"));
        q_geo_easy_3.setAnswer("Andes");
        q_geo_easy_3.setTopic("Geography");
        q_geo_easy_3.setDifficulty("Easy");
        qb.addQuestion(q_geo_easy_3);

        Question q_geo_easy_4 = new Question();
        q_geo_easy_4.setQuestion("Which country is famous for the Great Barrier Reef?");
        q_geo_easy_4.setOptions(Arrays.asList("Brazil", "Indonesia", "Australia", "Mexico"));
        q_geo_easy_4.setAnswer("Australia");
        q_geo_easy_4.setTopic("Geography");
        q_geo_easy_4.setDifficulty("Easy");
        qb.addQuestion(q_geo_easy_4);

        Question q_geo_easy_5 = new Question();
        q_geo_easy_5.setQuestion("What is the largest desert in the world?");
        q_geo_easy_5.setOptions(Arrays.asList("Sahara Desert", "Arabian Desert", "Gobi Desert", "Antarctic Polar Desert"));
        q_geo_easy_5.setAnswer("Antarctic Polar Desert"); // Antarctic is largest, then Sahara
        q_geo_easy_5.setTopic("Geography");
        q_geo_easy_5.setDifficulty("Easy");
        qb.addQuestion(q_geo_easy_5);

        Question q_geo_easy_6 = new Question();
        q_geo_easy_6.setQuestion("Which river flows through Cairo, Egypt?");
        q_geo_easy_6.setOptions(Arrays.asList("Amazon River", "Yangtze River", "Nile River", "Mississippi River"));
        q_geo_easy_6.setAnswer("Nile River");
        q_geo_easy_6.setTopic("Geography");
        q_geo_easy_6.setDifficulty("Easy");
        qb.addQuestion(q_geo_easy_6);

        Question q_geo_easy_7 = new Question();
        q_geo_easy_7.setQuestion("What is the smallest continent by land area?");
        q_geo_easy_7.setOptions(Arrays.asList("Europe", "Australia", "Antarctica", "South America"));
        q_geo_easy_7.setAnswer("Australia");
        q_geo_easy_7.setTopic("Geography");
        q_geo_easy_7.setDifficulty("Easy");
        qb.addQuestion(q_geo_easy_7);

        Question q_geo_easy_8 = new Question();
        q_geo_easy_8.setQuestion("Which sea is located between Europe and Africa?");
        q_geo_easy_8.setOptions(Arrays.asList("Black Sea", "Red Sea", "Mediterranean Sea", "Caspian Sea"));
        q_geo_easy_8.setAnswer("Mediterranean Sea");
        q_geo_easy_8.setTopic("Geography");
        q_geo_easy_8.setDifficulty("Easy");
        qb.addQuestion(q_geo_easy_8);

        Question q_geo_easy_9 = new Question();
        q_geo_easy_9.setQuestion("What is the common name for the Earth's outermost layer?");
        q_geo_easy_9.setOptions(Arrays.asList("Mantle", "Outer Core", "Crust", "Inner Core"));
        q_geo_easy_9.setAnswer("Crust");
        q_geo_easy_9.setTopic("Geography");
        q_geo_easy_9.setDifficulty("Easy");
        qb.addQuestion(q_geo_easy_9);

        Question q_geo_easy_10 = new Question();
        q_geo_easy_10.setQuestion("Which of these is a landlocked country?");
        q_geo_easy_10.setOptions(Arrays.asList("Japan", "Germany", "Switzerland", "Canada"));
        q_geo_easy_10.setAnswer("Switzerland");
        q_geo_easy_10.setTopic("Geography");
        q_geo_easy_10.setDifficulty("Easy");
        qb.addQuestion(q_geo_easy_10);

        // --- Geography Questions (Medium Difficulty) ---
        Question geoQ1 = new Question();
        geoQ1.setQuestion("Which river is the longest in South America?");
        geoQ1.setOptions(Arrays.asList("Paraná River", "Magdalena River", "Amazon River", "Orinoco River"));
        geoQ1.setAnswer("Amazon River");
        geoQ1.setTopic("Geography");
        geoQ1.setDifficulty("Medium");
        qb.addQuestion(geoQ1);

        Question geoQ2 = new Question();
        geoQ2.setQuestion("What is the capital city of Australia?");
        geoQ2.setOptions(Arrays.asList("Sydney", "Melbourne", "Canberra", "Perth"));
        geoQ2.setAnswer("Canberra");
        geoQ2.setTopic("Geography");
        geoQ2.setDifficulty("Medium");
        qb.addQuestion(geoQ2);

        Question geoQ3 = new Question();
        geoQ3.setQuestion("Which desert is the largest hot desert in the world?");
        geoQ3.setOptions(Arrays.asList("Gobi Desert", "Kalahari Desert", "Sahara Desert", "Arabian Desert"));
        geoQ3.setAnswer("Sahara Desert");
        geoQ3.setTopic("Geography");
        geoQ3.setDifficulty("Medium");
        qb.addQuestion(geoQ3);

        Question geoQ4 = new Question();
        geoQ4.setQuestion("Mount Everest is part of which mountain range?");
        geoQ4.setOptions(Arrays.asList("Andes", "Rockies", "Himalayas", "Alps"));
        geoQ4.setAnswer("Himalayas");
        geoQ4.setTopic("Geography");
        geoQ4.setDifficulty("Medium");
        qb.addQuestion(geoQ4);

        Question geoQ5 = new Question();
        geoQ5.setQuestion("Which strait separates Europe from Africa?");
        geoQ5.setOptions(Arrays.asList("Strait of Dover", "Strait of Gibraltar", "Bosphorus Strait", "Bab-el-Mandeb"));
        geoQ5.setAnswer("Strait of Gibraltar");
        geoQ5.setTopic("Geography");
        geoQ5.setDifficulty("Medium");
        qb.addQuestion(geoQ5);

        Question geoQ6 = new Question();
        geoQ6.setQuestion("What is the name of the longest river in Asia?");
        geoQ6.setOptions(Arrays.asList("Ganges River", "Yellow River", "Yangtze River", "Mekong River"));
        geoQ6.setAnswer("Yangtze River");
        geoQ6.setTopic("Geography");
        geoQ6.setDifficulty("Medium");
        qb.addQuestion(geoQ6);

        Question geoQ7 = new Question();
        geoQ7.setQuestion("Which country is known as the 'Land of the Rising Sun'?");
        geoQ7.setOptions(Arrays.asList("China", "South Korea", "Japan", "Vietnam"));
        geoQ7.setAnswer("Japan");
        geoQ7.setTopic("Geography");
        geoQ7.setDifficulty("Medium");
        qb.addQuestion(geoQ7);

        Question geoQ8 = new Question();
        geoQ8.setQuestion("The Great Barrier Reef is located off the coast of which country?");
        geoQ8.setOptions(Arrays.asList("New Zealand", "Indonesia", "Australia", "Philippines"));
        geoQ8.setAnswer("Australia");
        geoQ8.setTopic("Geography");
        geoQ8.setDifficulty("Medium");
        qb.addQuestion(geoQ8);

        Question geoQ9 = new Question();
        geoQ9.setQuestion("What is the largest lake in Africa?");
        geoQ9.setOptions(Arrays.asList("Lake Tanganyika", "Lake Malawi", "Lake Victoria", "Lake Chad"));
        geoQ9.setAnswer("Lake Victoria");
        geoQ9.setTopic("Geography");
        geoQ9.setDifficulty("Medium");
        qb.addQuestion(geoQ9);

        Question geoQ10 = new Question();
        geoQ10.setQuestion("Which mountain is the highest peak in North America?");
        geoQ10.setOptions(Arrays.asList("Mount Logan", "Mount Whitney", "Denali (Mount McKinley)", "Mount Elbert"));
        geoQ10.setAnswer("Denali (Mount McKinley)");
        geoQ10.setTopic("Geography");
        geoQ10.setDifficulty("Medium");
        qb.addQuestion(geoQ10);

        Question geoQ11 = new Question();
        geoQ11.setQuestion("Which ocean is the largest and deepest of Earth's oceans?");
        geoQ11.setOptions(Arrays.asList("Atlantic Ocean", "Indian Ocean", "Southern Ocean", "Pacific Ocean"));
        geoQ11.setAnswer("Pacific Ocean");
        geoQ11.setTopic("Geography");
        geoQ11.setDifficulty("Medium");
        qb.addQuestion(geoQ11);


// --- Geography Questions (Hard Difficulty) ---
        Question geoH1 = new Question();
        geoH1.setQuestion("What is the name of the deepest oceanic trench?");
        geoH1.setOptions(Arrays.asList("Puerto Rico Trench", "Java Trench", "Mariana Trench", "Kermadec Trench"));
        geoH1.setAnswer("Mariana Trench");
        geoH1.setTopic("Geography");
        geoH1.setDifficulty("Hard");
        qb.addQuestion(geoH1);

        Question geoH2 = new Question();
        geoH2.setQuestion("Which country shares the longest land border with China?");
        geoH2.setOptions(Arrays.asList("India", "Mongolia", "Russia", "Kazakhstan"));
        geoH2.setAnswer("Mongolia");
        geoH2.setTopic("Geography");
        geoH2.setDifficulty("Hard");
        qb.addQuestion(geoH2);

        Question geoH3 = new Question();
        geoH3.setQuestion("The 'Ring of Fire' is a major area in the basin of which ocean, known for volcanoes and earthquakes?");
        geoH3.setOptions(Arrays.asList("Atlantic Ocean", "Indian Ocean", "Pacific Ocean", "Arctic Ocean"));
        geoH3.setAnswer("Pacific Ocean");
        geoH3.setDifficulty("Hard");
        geoH3.setTopic("Geography");
        qb.addQuestion(geoH3);

        Question geoH4 = new Question();
        geoH4.setQuestion("Which of the following is the longest cave system in the world?");
        geoH4.setOptions(Arrays.asList("Jewel Cave", "Mammoth Cave", "Carlsbad Caverns", "Son Doong Cave"));
        geoH4.setAnswer("Mammoth Cave");
        geoH4.setTopic("Geography");
        geoH4.setDifficulty("Hard");
        qb.addQuestion(geoH4);

        Question geoH5 = new Question();
        geoH5.setQuestion("The Atacama Desert is primarily located in which country?");
        geoH5.setOptions(Arrays.asList("Peru", "Argentina", "Chile", "Bolivia"));
        geoH5.setAnswer("Chile");
        geoH5.setTopic("Geography");
        geoH5.setDifficulty("Hard");
        qb.addQuestion(geoH5);

        Question geoH6 = new Question();
        geoH6.setQuestion("What is the highest peak in the Andes Mountains?");
        geoH6.setOptions(Arrays.asList("Cotopaxi", "Ojos del Salado", "Mount Chimborazo", "Aconcagua"));
        geoH6.setAnswer("Aconcagua");
        geoH6.setTopic("Geography");
        geoH6.setDifficulty("Hard");
        qb.addQuestion(geoH6);

        Question geoH7 = new Question();
        geoH7.setQuestion("Which large island is split between three countries: Indonesia, Malaysia, and Brunei?");
        geoH7.setOptions(Arrays.asList("Sumatra", "New Guinea", "Borneo", "Java"));
        geoH7.setAnswer("Borneo");
        geoH7.setTopic("Geography");
        geoH7.setDifficulty("Hard");
        qb.addQuestion(geoH7);

        Question geoH8 = new Question();
        geoH8.setQuestion("The historical region of Mesopotamia was located between which two rivers?");
        geoH8.setOptions(Arrays.asList("Nile and Congo", "Indus and Ganges", "Tigris and Euphrates", "Yellow and Yangtze"));
        geoH8.setAnswer("Tigris and Euphrates");
        geoH8.setTopic("Geography");
        geoH8.setDifficulty("Hard");
        qb.addQuestion(geoH8);

        Question geoH9 = new Question();
        geoH9.setQuestion("Which European capital city is built on 14 islands?");
        geoH9.setOptions(Arrays.asList("Amsterdam", "Venice", "Copenhagen", "Stockholm"));
        geoH9.setAnswer("Stockholm");
        geoH9.setDifficulty("Hard");
        geoH9.setTopic("Geography");
        qb.addQuestion(geoH9);

        Question geoH10 = new Question();
        geoH10.setQuestion("What is the name of the southernmost tip of South America?");
        geoH10.setOptions(Arrays.asList("Cape Horn", "Cape of Good Hope", "Punta Arenas", "Ushuaia"));
        geoH10.setAnswer("Cape Horn");
        geoH10.setTopic("Geography");
        geoH10.setDifficulty("Hard");
        qb.addQuestion(geoH10);

        Question geoH11 = new Question();
        geoH11.setQuestion("Which body of water is bordered by Europe, Asia, and Africa?");
        geoH11.setOptions(Arrays.asList("Black Sea", "Caspian Sea", "Mediterranean Sea", "Red Sea"));
        geoH11.setAnswer("Mediterranean Sea");
        geoH11.setTopic("Geography");
        geoH11.setDifficulty("Hard");
        qb.addQuestion(geoH11);

        Question geoH12 = new Question();
        geoH12.setQuestion("The deepest part of the Mediterranean Sea is known as the 'Calypso Deep'. Off the coast of which country is it located?");
        geoH12.setOptions(Arrays.asList("Italy", "Greece", "Turkey", "Malta"));
        geoH12.setAnswer("Greece");
        geoH12.setTopic("Geography");
        geoH12.setDifficulty("Hard");
        qb.addQuestion(geoH12);

    }

    /**
     * Clears all documents from the 'questions' collection in MongoDB.
     * This is a utility method typically used for development/testing to reset data.
     */
    public static void clearQuestions() {
        try {
            MongoDatabase database = DatabaseConfig.getDatabase();
            MongoCollection<Document> questionsCollection = database.getCollection("questions");
            long deletedCount = questionsCollection.deleteMany(new Document()).getDeletedCount();
            System.out.println("Deleted " + deletedCount + " documents from the 'questions' collection.");
        } catch (Exception e) {
            System.err.println("Error clearing questions from MongoDB: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
