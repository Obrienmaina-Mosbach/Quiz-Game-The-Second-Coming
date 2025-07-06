package brian.dhbw.project.gradle;

import java.util.Arrays;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class DataInitializer {

    // --- Main Method (one-time execution) ---
    /*
    public static void main(String[] args) {
        System.out.println("Executing Data Initializer tasks...");
        // Encapsulation/Abstraction
        clearQuestions();
        initializeData();

        // Abstraction
        //shutting down the MongoDB client connection.
        DatabaseConfig.closeConnection();
        System.out.println("Data initialization complete.");
    }
    */

    public static void initializeData() {
        // Instantiating QuestionBank.
        QuestionBank qb = new QuestionBank("dummy", "dummy");


        System.out.println("Adding sample questions...");

        // ---(Easy Difficulty) ---
        //`MultipleChoiceQuestion` objects encapsulate their question text, options, answer, topic, and difficulty.
        MultipleChoiceQuestion q_animal_easy_1 = new MultipleChoiceQuestion(
                "Which animal is known as the 'King of the Jungle'?",
                Arrays.asList("Tiger", "Elephant", "Lion", "Cheetah"),
                "Lion",
                "Animal",
                "Easy"
        );
        qb.addQuestion(q_animal_easy_1);

        MultipleChoiceQuestion q_animal_easy_2 = new MultipleChoiceQuestion(
                "What is the fastest land animal?",
                Arrays.asList("Cheetah", "Leopard", "Horse", "Kangaroo"),
                "Cheetah",
                "Animal",
                "Easy"
        );
        qb.addQuestion(q_animal_easy_2);

        MultipleChoiceQuestion q_animal_easy_3 = new MultipleChoiceQuestion(
                "Which animal is famous for its black and white stripes?",
                Arrays.asList("Tiger", "Zebra", "Panda", "Skunk"),
                "Zebra",
                "Animal",
                "Easy"
        );
        qb.addQuestion(q_animal_easy_3);

        MultipleChoiceQuestion q_animal_easy_4 = new MultipleChoiceQuestion(
                "Which bird is known for its ability to mimic human speech?",
                Arrays.asList("Sparrow", "Eagle", "Parrot", "Owl"),
                "Parrot",
                "Animal",
                "Easy"
        );
        qb.addQuestion(q_animal_easy_4);

        MultipleChoiceQuestion q_animal_easy_5 = new MultipleChoiceQuestion(
                "What do pandas mainly eat?",
                Arrays.asList("Grass", "Bamboo", "Fruits", "Fish"),
                "Bamboo",
                "Animal",
                "Easy"
        );
        qb.addQuestion(q_animal_easy_5);

        MultipleChoiceQuestion q_animal_easy_6 = new MultipleChoiceQuestion(
                "Which sea creature has eight tentacles?",
                Arrays.asList("Octopus", "Jellyfish", "Squid", "Starfish"),
                "Octopus",
                "Animal",
                "Easy"
        );
        qb.addQuestion(q_animal_easy_6);

        MultipleChoiceQuestion q_animal_easy_7 = new MultipleChoiceQuestion(
                "Which animal is known for being the largest mammal?",
                Arrays.asList("Elephant", "Blue Whale", "Giraffe", "Hippopotamus"),
                "Blue Whale",
                "Animal",
                "Easy"
        );
        qb.addQuestion(q_animal_easy_7);

        MultipleChoiceQuestion q_animal_easy_8 = new MultipleChoiceQuestion(
                "Which animal is commonly known as 'man's best friend'?",
                Arrays.asList("Cat", "Horse", "Dog", "Rabbit"),
                "Dog",
                "Animal",
                "Easy"
        );
        qb.addQuestion(q_animal_easy_8);

        MultipleChoiceQuestion q_animal_easy_9 = new MultipleChoiceQuestion(
                "What is the only mammal capable of true flight?",
                Arrays.asList("Eagle", "Bat", "Flying Squirrel", "Owl"),
                "Bat",
                "Animal",
                "Easy"
        );
        qb.addQuestion(q_animal_easy_9);

        MultipleChoiceQuestion q_animal_easy_10 = new MultipleChoiceQuestion(
                "What do bees produce?",
                Arrays.asList("Milk", "Honey", "Sugar", "Nectar"),
                "Honey",
                "Animal",
                "Easy"
        );
        qb.addQuestion(q_animal_easy_10);

        // --- Existing Animal Questions (Hard) ---
        MultipleChoiceQuestion q_animal_hard_1 = new MultipleChoiceQuestion(
                "What is the fastest land animal in the world?",
                Arrays.asList("Cheetah", "Lion", "Antelope", "Tiger"),
                "Cheetah",
                "Animal",
                "Hard"
        );
        qb.addQuestion(q_animal_hard_1);

        MultipleChoiceQuestion q_animal_hard_2 = new MultipleChoiceQuestion(
                "Which bird is known for its ability to mimic human speech?",
                Arrays.asList("African Grey Parrot", "Cockatoo", "Macaw", "Eagle"),
                "African Grey Parrot",
                "Animal",
                "Hard"
        );
        qb.addQuestion(q_animal_hard_2);

        MultipleChoiceQuestion q_animal_hard_3 = new MultipleChoiceQuestion(
                "What is the largest species of shark?",
                Arrays.asList("Great White Shark", "Tiger Shark", "Whale Shark", "Hammerhead Shark"),
                "Whale Shark",
                "Animal",
                "Hard"
        );
        qb.addQuestion(q_animal_hard_3);

        MultipleChoiceQuestion q_animal_hard_4 = new MultipleChoiceQuestion(
                "Which animal has the longest lifespan?",
                Arrays.asList("Bowhead Whale", "Elephant", "Giant Tortoise", "Koi Fish"),
                "Bowhead Whale",
                "Animal",
                "Hard"
        );
        qb.addQuestion(q_animal_hard_4);

        MultipleChoiceQuestion q_animal_hard_5 = new MultipleChoiceQuestion(
                "Which species of jellyfish is considered biologically immortal?",
                Arrays.asList("Aurelia Aurita", "Turritopsis dohrnii", "Mastigias Papua", "Chrysaora Fuscescens"),
                "Turritopsis dohrnii",
                "Animal",
                "Hard"
        );
        qb.addQuestion(q_animal_hard_5);

        MultipleChoiceQuestion q_animal_hard_6 = new MultipleChoiceQuestion(
                "What is the only mammal capable of true flight?",
                Arrays.asList("Bat", "Flying Squirrel", "Colugo", "Sugar Glider"),
                "Bat",
                "Animal",
                "Hard"
        );
        qb.addQuestion(q_animal_hard_6);

        MultipleChoiceQuestion q_animal_hard_7 = new MultipleChoiceQuestion(
                "Which mammal is known to have the longest migration?",
                Arrays.asList("Gray Whale", "Caribou", "Monarch Butterfly", "Humpback Whale"),
                "Gray Whale",
                "Animal",
                "Hard"
        );
        qb.addQuestion(q_animal_hard_7);

        MultipleChoiceQuestion q_animal_hard_8 = new MultipleChoiceQuestion(
                "Which species of frog is known to freeze and then thaw out without harm?",
                Arrays.asList("Wood Frog", "Bullfrog", "Tree Frog", "Glass Frog"),
                "Wood Frog",
                "Animal",
                "Hard"
        );
        qb.addQuestion(q_animal_hard_8);

        MultipleChoiceQuestion q_animal_hard_9 = new MultipleChoiceQuestion(
                "What animal has the most powerful bite force relative to its size?",
                Arrays.asList("Saltwater Crocodile", "Tiger Beetle", "Jaguar", "Great White Shark"),
                "Tiger Beetle",
                "Animal",
                "Hard"
        );
        qb.addQuestion(q_animal_hard_9);

        MultipleChoiceQuestion q_animal_hard_10 = new MultipleChoiceQuestion(
                "Which animal is capable of regenerating entire limbs and organs?",
                Arrays.asList("Axolotl", "Starfish", "Gecko", "Lizard"),
                "Axolotl",
                "Animal",
                "Hard"
        );
        qb.addQuestion(q_animal_hard_10);

        MultipleChoiceQuestion q_animal_hard_11 = new MultipleChoiceQuestion(
                "What is the fastest marine animal?",
                Arrays.asList("Black Marlin", "Sailfish", "Dolphin", "Bluefin Tuna"),
                "Black Marlin",
                "Animal",
                "Hard"
        );
        qb.addQuestion(q_animal_hard_11);

        MultipleChoiceQuestion q_animal_hard_12 = new MultipleChoiceQuestion(
                "Which animal's heart can beat more than 1,000 times per minute?",
                Arrays.asList("Hummingbird", "Bat", "Shrew", "Cheetah"),
                "Hummingbird",
                "Animal",
                "Hard"
        );
        qb.addQuestion(q_animal_hard_12);

        MultipleChoiceQuestion q_animal_hard_13 = new MultipleChoiceQuestion(
                "What is the largest living species of turtle?",
                Arrays.asList("Leatherback Sea Turtle", "Green Sea Turtle", "Loggerhead Turtle", "Hawksbill Turtle"),
                "Leatherback Sea Turtle",
                "Animal",
                "Hard"
        );
        qb.addQuestion(q_animal_hard_13);

        MultipleChoiceQuestion q_animal_hard_14 = new MultipleChoiceQuestion(
                "Which mammal produces the smallest eggs?",
                Arrays.asList("Echidna", "Platypus", "Kangaroo", "Opossum"),
                "Echidna",
                "Animal",
                "Hard"
        );
        qb.addQuestion(q_animal_hard_14);

        MultipleChoiceQuestion q_animal_hard_15 = new MultipleChoiceQuestion(
                "Which animal has the longest neck in relation to its body size?",
                Arrays.asList("Giraffe", "Camel", "Okapi", "Long-necked Dinosaur"),
                "Giraffe",
                "Animal",
                "Hard"
        );
        qb.addQuestion(q_animal_hard_15);

        // --- Existing Animal Questions (Medium) ---
        MultipleChoiceQuestion q_animal_medium_1 = new MultipleChoiceQuestion(
                "Which animal is known for its distinctive black and white coat and primarily eats bamboo?",
                Arrays.asList("Giant Panda", "Zebra", "Koala", "Skunk"),
                "Giant Panda",
                "Animal",
                "Medium"
        );
        qb.addQuestion(q_animal_medium_1);

        MultipleChoiceQuestion q_animal_medium_2 = new MultipleChoiceQuestion(
                "Which species of fish is known for its ability to change sex during its lifetime?",
                Arrays.asList("Clownfish", "Anglerfish", "Lionfish", "Goldfish"),
                "Clownfish",
                "Animal",
                "Medium"
        );
        qb.addQuestion(q_animal_medium_2);

        MultipleChoiceQuestion q_animal_medium_3 = new MultipleChoiceQuestion(
                "Which animal is the largest terrestrial mammal on Earth?",
                Arrays.asList("African Elephant", "White Rhino", "Giraffe", "Hippopotamus"),
                "African Elephant",
                "Animal",
                "Medium"
        );
        qb.addQuestion(q_animal_medium_3);

        MultipleChoiceQuestion q_animal_medium_4 = new MultipleChoiceQuestion(
                "What is the primary diet of a koala?",
                Arrays.asList("Eucalyptus leaves", "Bamboo", "Grass", "Insects"),
                "Eucalyptus leaves",
                "Animal",
                "Medium"
        );
        qb.addQuestion(q_animal_medium_4);

        MultipleChoiceQuestion q_animal_medium_5 = new MultipleChoiceQuestion(
                "Which animal can sleep for up to 20 hours a day?",
                Arrays.asList("Koala", "Cat", "Sloth", "Lion"),
                "Sloth",
                "Animal",
                "Medium"
        );
        qb.addQuestion(q_animal_medium_5);

        MultipleChoiceQuestion q_animal_medium_6 = new MultipleChoiceQuestion(
                "Which species of bird is capable of flying backward?",
                Arrays.asList("Hummingbird", "Eagle", "Pigeon", "Albatross"),
                "Hummingbird",
                "Animal",
                "Medium"
        );
        qb.addQuestion(q_animal_medium_6);

        MultipleChoiceQuestion q_animal_medium_7 = new MultipleChoiceQuestion(
                "Which mammal is known to have the shortest gestation period?",
                Arrays.asList("Opossum", "Human", "Kangaroo", "Horse"),
                "Opossum",
                "Animal",
                "Medium"
        );
        qb.addQuestion(q_animal_medium_7);

        MultipleChoiceQuestion q_animal_medium_8 = new MultipleChoiceQuestion(
                "Which reptile is known for having a shell and retracting its head and limbs for protection?",
                Arrays.asList("Turtle", "Crocodile", "Lizard", "Gecko"),
                "Turtle",
                "Animal",
                "Medium"
        );
        qb.addQuestion(q_animal_medium_8);

        MultipleChoiceQuestion q_animal_medium_9 = new MultipleChoiceQuestion(
                "What animal is known for its exceptional memory and intelligence, and is the largest land carnivore?",
                Arrays.asList("Lion", "Polar Bear", "Elephant", "Orangutan"),
                "Polar Bear",
                "Animal",
                "Medium"
        );
        qb.addQuestion(q_animal_medium_9);

        MultipleChoiceQuestion q_animal_medium_10 = new MultipleChoiceQuestion(
                "Which animal is known to communicate through echolocation?",
                Arrays.asList("Dolphin", "Bat", "Whale", "All of the above"),
                "All of the above",
                "Animal",
                "Medium"
        );
        qb.addQuestion(q_animal_medium_10);

        MultipleChoiceQuestion q_animal_medium_11 = new MultipleChoiceQuestion(
                "What is the fastest aquatic animal?",
                Arrays.asList("Blue Whale", "Sailfish", "Shark", "Marlin"),
                "Sailfish",
                "Animal",
                "Medium"
        );
        qb.addQuestion(q_animal_medium_11);

        MultipleChoiceQuestion q_animal_medium_12 = new MultipleChoiceQuestion(
                "Which animal has the longest migration distance of any mammal?",
                Arrays.asList("Gray Whale", "Caribou", "Monarch Butterfly", "Humpback Whale"),
                "Gray Whale",
                "Animal",
                "Medium"
        );
        qb.addQuestion(q_animal_medium_12);

        MultipleChoiceQuestion q_animal_medium_13 = new MultipleChoiceQuestion(
                "Which species of bear is native to North America and has a black, brown, or white coat?",
                Arrays.asList("Grizzly Bear", "Polar Bear", "Sun Bear", "Black Bear"),
                "Black Bear",
                "Animal",
                "Medium"
        );
        qb.addQuestion(q_animal_medium_13);

        // --- New Topics ---

        // --- Artificial Intelligence Questions ---
        // Easy
        MultipleChoiceQuestion q_ai_easy_1 = new MultipleChoiceQuestion(
                "What does AI stand for?",
                Arrays.asList("Automated Intelligence", "Artificial Intelligence", "Advanced Integration", "Analytical Insight"),
                "Artificial Intelligence",
                "Artificial Intelligence",
                "Easy"
        );
        qb.addQuestion(q_ai_easy_1);

        MultipleChoiceQuestion q_ai_easy_2 = new MultipleChoiceQuestion(
                "Which famous game did Deep Blue, an IBM computer, defeat in 1997?",
                Arrays.asList("Checkers", "Chess", "Go", "Poker"),
                "Chess",
                "Artificial Intelligence",
                "Easy"
        );
        qb.addQuestion(q_ai_easy_2);

        MultipleChoiceQuestion q_ai_easy_3 = new MultipleChoiceQuestion(
                "Is a robot an example of AI?",
                Arrays.asList("Yes", "No", "Only if it has feelings", "Only if it can speak"),
                "Yes",
                "Artificial Intelligence",
                "Easy"
        );
        qb.addQuestion(q_ai_easy_3);

        MultipleChoiceQuestion q_ai_easy_4 = new MultipleChoiceQuestion(
                "What is the goal of Artificial Intelligence?",
                Arrays.asList("To replace humans", "To make computers smarter", "To automate all jobs", "To build self-driving cars"),
                "To make computers smarter",
                "Artificial Intelligence",
                "Easy"
        );
        qb.addQuestion(q_ai_easy_4);

        MultipleChoiceQuestion q_ai_easy_5 = new MultipleChoiceQuestion(
                "Which of these is a common application of AI?",
                Arrays.asList("Word processing", "Email sending", "Voice assistants", "Photo editing"),
                "Voice assistants",
                "Artificial Intelligence",
                "Easy"
        );
        qb.addQuestion(q_ai_easy_5);

        MultipleChoiceQuestion q_ai_easy_6 = new MultipleChoiceQuestion(
                "True or False: AI can learn from data.",
                Arrays.asList("True", "False"),
                "True",
                "Artificial Intelligence",
                "Easy"
        );
        qb.addQuestion(q_ai_easy_6);

        MultipleChoiceQuestion q_ai_easy_7 = new MultipleChoiceQuestion(
                "What is a chatbot?",
                Arrays.asList("A type of computer virus", "A software program that simulates human conversation", "A device for charging phones", "A small robot"),
                "A software program that simulates human conversation",
                "Artificial Intelligence",
                "Easy"
        );
        qb.addQuestion(q_ai_easy_7);

        MultipleChoiceQuestion q_ai_easy_8 = new MultipleChoiceQuestion(
                "Which AI capability allows a system to understand human language?",
                Arrays.asList("Image Recognition", "Natural Language Processing", "Robotics", "Predictive Analytics"),
                "Natural Language Processing",
                "Artificial Intelligence",
                "Easy"
        );
        qb.addQuestion(q_ai_easy_8);

        MultipleChoiceQuestion q_ai_easy_9 = new MultipleChoiceQuestion(
                "What is the core idea behind Machine Learning?",
                Arrays.asList("Teaching machines to do tasks explicitly", "Enabling machines to learn from data without explicit programming", "Making machines physically strong", "Designing machines with human-like features"),
                "Enabling machines to learn from data without explicit programming",
                "Artificial Intelligence",
                "Easy"
        );
        qb.addQuestion(q_ai_easy_9);

        MultipleChoiceQuestion q_ai_easy_10 = new MultipleChoiceQuestion(
                "Which scientist is often considered the 'father of AI'?",
                Arrays.asList("Albert Einstein", "Alan Turing", "Isaac Newton", "Stephen Hawking"),
                "Alan Turing",
                "Artificial Intelligence",
                "Easy"
        );
        qb.addQuestion(q_ai_easy_10);

        // Medium
        MultipleChoiceQuestion q_ai_medium_1 = new MultipleChoiceQuestion(
                "Which branch of AI focuses on enabling computers to 'see' and interpret digital images?",
                Arrays.asList("Natural Language Processing", "Robotics", "Computer Vision", "Expert Systems"),
                "Computer Vision",
                "Artificial Intelligence",
                "Medium"
        );
        qb.addQuestion(q_ai_medium_1);

        MultipleChoiceQuestion q_ai_medium_2 = new MultipleChoiceQuestion(
                "What is the 'Turing Test' designed to assess?",
                Arrays.asList("A computer's processing speed", "A machine's ability to exhibit intelligent behavior equivalent to, or indistinguishable from, that of a human", "The security of an AI system", "The memory capacity of an AI"),
                "A machine's ability to exhibit intelligent behavior equivalent to, or indistinguishable from, that of a human",
                "Artificial Intelligence",
                "Medium"
        );
        qb.addQuestion(q_ai_medium_2);

        MultipleChoiceQuestion q_ai_medium_3 = new MultipleChoiceQuestion(
                "Which concept involves training neural networks with massive datasets?",
                Arrays.asList("Shallow Learning", "Deep Learning", "Reinforcement Learning", "Supervised Learning"),
                "Deep Learning",
                "Artificial Intelligence",
                "Medium"
        );
        qb.addQuestion(q_ai_medium_3);

        MultipleChoiceQuestion q_ai_medium_4 = new MultipleChoiceQuestion(
                "What kind of learning involves an AI agent learning by interacting with an environment and receiving rewards or penalties?",
                Arrays.asList("Unsupervised Learning", "Supervised Learning", "Reinforcement Learning", "Semi-supervised Learning"),
                "Reinforcement Learning",
                "Artificial Intelligence",
                "Medium"
        );
        qb.addQuestion(q_ai_medium_4);

        MultipleChoiceQuestion q_ai_medium_5 = new MultipleChoiceQuestion(
                "Which AI algorithm is used to classify data points into different groups based on similarity?",
                Arrays.asList("Linear Regression", "Decision Tree", "K-Means Clustering", "Support Vector Machine"),
                "K-Means Clustering",
                "Artificial Intelligence",
                "Medium"
        );
        qb.addQuestion(q_ai_medium_5);

        MultipleChoiceQuestion q_ai_medium_6 = new MultipleChoiceQuestion(
                "What is an 'Expert System' in AI?",
                Arrays.asList("A system that can learn from scratch", "A system that mimics the decision-making ability of a human expert", "A system for building robots", "A system that predicts stock market trends"),
                "A system that mimics the decision-making ability of a human expert",
                "Artificial Intelligence",
                "Medium"
        );
        qb.addQuestion(q_ai_medium_6);

        MultipleChoiceQuestion q_ai_medium_7 = new MultipleChoiceQuestion(
                "What does NLP stand for in the context of AI?",
                Arrays.asList("New Language Protocol", "Natural Logic Programming", "Natural Language Processing", "Neural Linguistic Parameters"),
                "Natural Language Processing",
                "Artificial Intelligence",
                "Medium"
        );
        qb.addQuestion(q_ai_medium_7);

        MultipleChoiceQuestion q_ai_medium_8 = new MultipleChoiceQuestion(
                "Which AI technique is often used for recommendation systems (e.g., Netflix, Amazon)?",
                Arrays.asList("Computer Vision", "Natural Language Generation", "Collaborative Filtering", "Robotics"),
                "Collaborative Filtering",
                "Artificial Intelligence",
                "Medium"
        );
        qb.addQuestion(q_ai_medium_8);

        MultipleChoiceQuestion q_ai_medium_9 = new MultipleChoiceQuestion(
                "What is 'Overfitting' in Machine Learning?",
                Arrays.asList("When a model performs poorly on training data", "When a model learns the training data too well, including noise, and performs poorly on new data", "When a model is too simple to capture the underlying patterns", "When a model runs out of memory"),
                "When a model learns the training data too well, including noise, and performs poorly on new data",
                "Artificial Intelligence",
                "Medium"
        );
        qb.addQuestion(q_ai_medium_9);

        MultipleChoiceQuestion q_ai_medium_10 = new MultipleChoiceQuestion(
                "Which concept in AI describes the ability of a system to understand the context of human speech?",
                Arrays.asList("Speech Recognition", "Sentiment Analysis", "Contextual AI", "Syntax Analysis"),
                "Contextual AI",
                "Artificial Intelligence",
                "Medium"
        );
        qb.addQuestion(q_ai_medium_10);

        // Hard
        MultipleChoiceQuestion q_ai_hard_3 = new MultipleChoiceQuestion(
                "Which type of AI is designed to mimic human cognitive abilities, including learning, problem-solving, and decision-making?",
                Arrays.asList("Narrow AI", "General AI", "Super AI", "Weak AI"),
                "General AI",
                "Artificial Intelligence",
                "Hard"
        );
        qb.addQuestion(q_ai_hard_3);

        MultipleChoiceQuestion q_ai_hard_4 = new MultipleChoiceQuestion(
                "What is a 'Generative Adversarial Network' (GAN)?",
                Arrays.asList("A type of neural network used for classification", "A framework where two neural networks compete against each other to generate new data", "A network designed for cybersecurity threats", "A system for predicting financial markets"),
                "A framework where two neural networks compete against each other to generate new data",
                "Artificial Intelligence",
                "Hard"
        );
        qb.addQuestion(q_ai_hard_4);

        MultipleChoiceQuestion q_ai_hard_5 = new MultipleChoiceQuestion(
                "Which AI concept deals with creating intelligent agents that can perceive their environment and take actions to maximize their chance of achieving their goals?",
                Arrays.asList("Perceptron", "Agent-based AI", "Symbolic AI", "Evolutionary Computing"),
                "Agent-based AI",
                "Artificial Intelligence",
                "Hard"
        );
        qb.addQuestion(q_ai_hard_5);

        MultipleChoiceQuestion q_ai_hard_6 = new MultipleChoiceQuestion(
                "What is the primary challenge in developing 'Strong AI' or 'Artificial General Intelligence' (AGI)?",
                Arrays.asList("Lack of processing power", "Difficulty in mimicking human consciousness and common sense reasoning", "Insufficient data for training", "High cost of development"),
                "Difficulty in mimicking human consciousness and common sense reasoning",
                "Artificial Intelligence",
                "Hard"
        );
        qb.addQuestion(q_ai_hard_6);

        MultipleChoiceQuestion q_ai_hard_7 = new MultipleChoiceQuestion(
                "Which technique is used to reduce the dimensionality of data while preserving its essential information?",
                Arrays.asList("Gradient Descent", "Principal Component Analysis (PCA)", "Backpropagation", "Clustering"),
                "Principal Component Analysis (PCA)",
                "Artificial Intelligence",
                "Hard"
        );
        qb.addQuestion(q_ai_hard_7);

        MultipleChoiceQuestion q_ai_hard_8 = new MultipleChoiceQuestion(
                "In the context of neural networks, what is a 'Convolutional Layer' primarily used for?",
                Arrays.asList("Performing arithmetic operations", "Extracting features from input data, especially images", "Managing data flow between layers", "Storing learned weights"),
                "Extracting features from input data, especially images",
                "Artificial Intelligence",
                "Hard"
        );
        qb.addQuestion(q_ai_hard_8);

        MultipleChoiceQuestion q_ai_hard_9 = new MultipleChoiceQuestion(
                "What is 'Transfer Learning' in Machine Learning?",
                Arrays.asList("Training a model from scratch on a new dataset", "Applying a model trained on one task to a different but related task", "Transferring data between different machine learning models", "Learning from multiple data sources simultaneously"),
                "Applying a model trained on one task to a different but related task",
                "Artificial Intelligence",
                "Hard"
        );
        qb.addQuestion(q_ai_hard_9);

        MultipleChoiceQuestion q_ai_hard_10 = new MultipleChoiceQuestion(
                "Which AI subfield focuses on enabling robots to interact with the physical world?",
                Arrays.asList("Natural Language Processing", "Computer Vision", "Robotics", "Expert Systems"),
                "Robotics",
                "Artificial Intelligence",
                "Hard"
        );
        qb.addQuestion(q_ai_hard_10);

        // --- Planets Questions ---
        // Easy
        MultipleChoiceQuestion q_planets_easy_1 = new MultipleChoiceQuestion(
                "Which planet is closest to the Sun?",
                Arrays.asList("Earth", "Mars", "Mercury", "Venus"),
                "Mercury",
                "Planets",
                "Easy"
        );
        qb.addQuestion(q_planets_easy_1);

        MultipleChoiceQuestion q_planets_easy_2 = new MultipleChoiceQuestion(
                "Which planet is known as the 'Blue Planet'?",
                Arrays.asList("Mars", "Earth", "Neptune", "Uranus"),
                "Earth",
                "Planets",
                "Easy"
        );
        qb.addQuestion(q_planets_easy_2);

        MultipleChoiceQuestion q_planets_easy_3 = new MultipleChoiceQuestion(
                "What is the largest planet in our solar system?",
                Arrays.asList("Earth", "Saturn", "Neptune", "Jupiter"),
                "Jupiter",
                "Planets",
                "Easy"
        );
        qb.addQuestion(q_planets_easy_3);

        MultipleChoiceQuestion q_planets_easy_4 = new MultipleChoiceQuestion(
                "Which planet has prominent rings made of ice and rock?",
                Arrays.asList("Jupiter", "Mars", "Saturn", "Uranus"),
                "Saturn",
                "Planets",
                "Easy"
        );
        qb.addQuestion(q_planets_easy_4);

        MultipleChoiceQuestion q_planets_easy_5 = new MultipleChoiceQuestion(
                "Which planet is known as the 'Morning Star' or 'Evening Star'?",
                Arrays.asList("Mars", "Venus", "Mercury", "Jupiter"),
                "Venus",
                "Planets",
                "Easy"
        );
        qb.addQuestion(q_planets_easy_5);

        MultipleChoiceQuestion q_planets_easy_6 = new MultipleChoiceQuestion(
                "How many planets are currently recognized in our solar system?",
                Arrays.asList("7", "8", "9", "10"),
                "8",
                "Planets",
                "Easy"
        );
        qb.addQuestion(q_planets_easy_6);

        MultipleChoiceQuestion q_planets_easy_7 = new MultipleChoiceQuestion(
                "Which planet is farthest from the Sun?",
                Arrays.asList("Mars", "Jupiter", "Neptune", "Uranus"),
                "Neptune",
                "Planets",
                "Easy"
        );
        qb.addQuestion(q_planets_easy_7);

        MultipleChoiceQuestion q_planets_easy_8 = new MultipleChoiceQuestion(
                "What is the name of Earth's only natural satellite?",
                Arrays.asList("Phobos", "Deimos", "Moon", "Titan"),
                "Moon",
                "Planets",
                "Easy"
        );
        qb.addQuestion(q_planets_easy_8);

        MultipleChoiceQuestion q_planets_easy_9 = new MultipleChoiceQuestion(
                "Which planet is often called Earth's 'twin' due to its similar size?",
                Arrays.asList("Mars", "Venus", "Mercury", "Jupiter"),
                "Venus",
                "Planets",
                "Easy"
        );
        qb.addQuestion(q_planets_easy_9);

        MultipleChoiceQuestion q_planets_easy_10 = new MultipleChoiceQuestion(
                "What is the name of the largest volcano in the solar system, located on Mars?",
                Arrays.asList("Mount Everest", "Olympus Mons", "Mount Fuji", "Vesuvius"),
                "Olympus Mons",
                "Planets",
                "Easy"
        );
        qb.addQuestion(q_planets_easy_10);

        // Medium
        MultipleChoiceQuestion q_planets_medium_3 = new MultipleChoiceQuestion(
                "Which gas giant has a prominent 'Great Red Spot' that is a persistent storm?",
                Arrays.asList("Saturn", "Neptune", "Jupiter", "Uranus"),
                "Jupiter",
                "Planets",
                "Medium"
        );
        qb.addQuestion(q_planets_medium_3);

        MultipleChoiceQuestion q_planets_medium_4 = new MultipleChoiceQuestion(
                "What is the name of Saturn's largest moon, which has a thick atmosphere and lakes of liquid methane?",
                Arrays.asList("Europa", "Ganymede", "Titan", "Triton"),
                "Titan",
                "Planets",
                "Medium"
        );
        qb.addQuestion(q_planets_medium_4);

        MultipleChoiceQuestion q_planets_medium_5 = new MultipleChoiceQuestion(
                "Which planet rotates on its side, almost at a 90-degree angle to its orbit?",
                Arrays.asList("Neptune", "Uranus", "Mars", "Venus"),
                "Uranus",
                "Planets",
                "Medium"
        );
        qb.addQuestion(q_planets_medium_5);

        MultipleChoiceQuestion q_planets_medium_6 = new MultipleChoiceQuestion(
                "What is the name of the region beyond Neptune that contains many icy bodies, including Pluto?",
                Arrays.asList("Asteroid Belt", "Oort Cloud", "Kuiper Belt", "Hills Cloud"),
                "Kuiper Belt",
                "Planets",
                "Medium"
        );
        qb.addQuestion(q_planets_medium_6);

        MultipleChoiceQuestion q_planets_medium_7 = new MultipleChoiceQuestion(
                "Which terrestrial planet has the most extensive atmosphere, leading to a runaway greenhouse effect?",
                Arrays.asList("Mars", "Earth", "Venus", "Mercury"),
                "Venus",
                "Planets",
                "Medium"
        );
        qb.addQuestion(q_planets_medium_7);

        MultipleChoiceQuestion q_planets_medium_8 = new MultipleChoiceQuestion(
                "What is the name of the largest moon in the solar system, orbiting Jupiter?",
                Arrays.asList("Io", "Europa", "Ganymede", "Callisto"),
                "Ganymede",
                "Planets",
                "Medium"
        );
        qb.addQuestion(q_planets_medium_8);

        MultipleChoiceQuestion q_planets_medium_9 = new MultipleChoiceQuestion(
                "Which planet is characterized by its distinct blue color due to the presence of methane in its atmosphere?",
                Arrays.asList("Uranus", "Neptune", "Jupiter", "Saturn"),
                "Neptune",
                "Planets",
                "Medium"
        );
        qb.addQuestion(q_planets_medium_9);

        MultipleChoiceQuestion q_planets_medium_10 = new MultipleChoiceQuestion(
                "What is the phenomenon where a planet's magnetic field protects it from solar wind?",
                Arrays.asList("Atmospheric Shielding", "Gravitational Lensing", "Magnetosphere", "Ionosphere"),
                "Magnetosphere",
                "Planets",
                "Medium"
        );
        qb.addQuestion(q_planets_medium_10);

        // Hard
        MultipleChoiceQuestion q_planets_hard_1 = new MultipleChoiceQuestion(
                "What is the name of the hypothetical ninth planet, beyond Neptune, whose existence is inferred from gravitational effects on distant objects?",
                Arrays.asList("Pluto", "Eris", "Planet Nine", "Sedna"),
                "Planet Nine",
                "Planets",
                "Hard"
        );
        qb.addQuestion(q_planets_hard_1);

        MultipleChoiceQuestion q_planets_hard_2 = new MultipleChoiceQuestion(
                "Which of Jupiter's Galilean moons is believed to harbor a subsurface ocean of liquid water, making it a prime candidate for extraterrestrial life?",
                Arrays.asList("Io", "Europa", "Ganymede", "Callisto"),
                "Europa",
                "Planets",
                "Hard"
        );
        qb.addQuestion(q_planets_hard_2);

        MultipleChoiceQuestion q_planets_hard_3 = new MultipleChoiceQuestion(
                "What is the term for the boundary around a star where liquid water could exist on a planet's surface?",
                Arrays.asList("Goldilocks Zone", "Frost Line", "Habitable Zone", "Roche Limit"),
                "Habitable Zone",
                "Planets",
                "Hard"
        );
        qb.addQuestion(q_planets_hard_3);

        MultipleChoiceQuestion q_planets_hard_4 = new MultipleChoiceQuestion(
                "Which phenomenon causes the 'backward' (retrograde) rotation of Venus?",
                Arrays.asList("Tidal Locking", "Planetary Resonance", "Impact Event", "Orbital Perturbation"),
                "Impact Event",
                "Planets",
                "Hard"
        );
        qb.addQuestion(q_planets_hard_4);

        MultipleChoiceQuestion q_planets_hard_5 = new MultipleChoiceQuestion(
                "What is the name of the process by which a planet's core generates a magnetic field?",
                Arrays.asList("Thermonuclear Fusion", "Plate Tectonics", "Dynamo Effect", "Gravitational Collapse"),
                "Dynamo Effect",
                "Planets",
                "Hard"
        );
        qb.addQuestion(q_planets_hard_5);

        MultipleChoiceQuestion q_planets_hard_6 = new MultipleChoiceQuestion(
                "Which dwarf planet in the Kuiper Belt is larger than Pluto and has a moon named Dysnomia?",
                Arrays.asList("Haumea", "Makemake", "Eris", "Ceres"),
                "Eris",
                "Planets",
                "Hard"
        );
        qb.addQuestion(q_planets_hard_6);

        MultipleChoiceQuestion q_planets_hard_7 = new MultipleChoiceQuestion(
                "What is the term for the slight wobble in a star's position caused by the gravitational pull of orbiting planets, used to detect exoplanets?",
                Arrays.asList("Transit Method", "Radial Velocity Method", "Direct Imaging", "Gravitational Lensing"),
                "Radial Velocity Method",
                "Planets",
                "Hard"
        );
        qb.addQuestion(q_planets_hard_7);

        MultipleChoiceQuestion q_planets_hard_8 = new MultipleChoiceQuestion(
                "Which planet experiences the most extreme temperature variations between its day and night sides?",
                Arrays.asList("Mars", "Mercury", "Venus", "Moon"),
                "Mercury",
                "Planets",
                "Hard"
        );
        qb.addQuestion(q_planets_hard_8);

        MultipleChoiceQuestion q_planets_hard_9 = new MultipleChoiceQuestion(
                "What is the name of the hypothetical cloud of icy planetesimals believed to surround our solar system at its outermost edge?",
                Arrays.asList("Kuiper Belt", "Asteroid Belt", "Oort Cloud", "Hills Cloud"),
                "Oort Cloud",
                "Planets",
                "Hard"
        );
        qb.addQuestion(q_planets_hard_9);

        MultipleChoiceQuestion q_planets_hard_10 = new MultipleChoiceQuestion(
                "Which of Saturn's moons is known for its cryovolcanism, erupting water ice and other volatile compounds?",
                Arrays.asList("Titan", "Enceladus", "Rhea", "Iapetus"),
                "Enceladus",
                "Planets",
                "Hard"
        );
        qb.addQuestion(q_planets_hard_10);


        // --- General Knowledge Questions ---
        // Easy
        MultipleChoiceQuestion q_gk_easy_1 = new MultipleChoiceQuestion(
                "What is the capital city of France?",
                Arrays.asList("Berlin", "Madrid", "Paris", "Rome"),
                "Paris",
                "General Knowledge",
                "Easy"
        );
        qb.addQuestion(q_gk_easy_1);

        MultipleChoiceQuestion q_gk_easy_2 = new MultipleChoiceQuestion(
                "How many continents are there in the world?",
                Arrays.asList("5", "6", "7", "8"),
                "7",
                "General Knowledge",
                "Easy"
        );
        qb.addQuestion(q_gk_easy_2);

        MultipleChoiceQuestion q_gk_easy_3 = new MultipleChoiceQuestion(
                "Which planet is known as the 'Red Planet'?",
                Arrays.asList("Jupiter", "Mars", "Venus", "Saturn"),
                "Mars",
                "General Knowledge",
                "Easy"
        );
        qb.addQuestion(q_gk_easy_3);

        MultipleChoiceQuestion q_gk_easy_4 = new MultipleChoiceQuestion(
                "What is the largest ocean on Earth?",
                Arrays.asList("Atlantic Ocean", "Indian Ocean", "Arctic Ocean", "Pacific Ocean"),
                "Pacific Ocean",
                "General Knowledge",
                "Easy"
        );
        qb.addQuestion(q_gk_easy_4);

        MultipleChoiceQuestion q_gk_easy_5 = new MultipleChoiceQuestion(
                "What is the chemical symbol for water?",
                Arrays.asList("O2", "H2O", "CO2", "NaCl"),
                "H2O",
                "General Knowledge",
                "Easy"
        );
        qb.addQuestion(q_gk_easy_5);

        MultipleChoiceQuestion q_gk_easy_6 = new MultipleChoiceQuestion(
                "Who painted the Mona Lisa?",
                Arrays.asList("Vincent van Gogh", "Pablo Picasso", "Leonardo da Vinci", "Claude Monet"),
                "Leonardo da Vinci",
                "General Knowledge",
                "Easy"
        );
        qb.addQuestion(q_gk_easy_6);

        MultipleChoiceQuestion q_gk_easy_7 = new MultipleChoiceQuestion(
                "What is the highest mountain in the world?",
                Arrays.asList("Mount Kilimanjaro", "Mount Everest", "K2", "Mount Fuji"),
                "Mount Everest",
                "General Knowledge",
                "Easy"
        );
        qb.addQuestion(q_gk_easy_7);

        MultipleChoiceQuestion q_gk_easy_8 = new MultipleChoiceQuestion(
                "Which country is famous for the Great Wall?",
                Arrays.asList("India", "Japan", "China", "Egypt"),
                "China",
                "General Knowledge",
                "Easy"
        );
        qb.addQuestion(q_gk_easy_8);

        MultipleChoiceQuestion q_gk_easy_9 = new MultipleChoiceQuestion(
                "What is the currency of Japan?",
                Arrays.asList("Yuan", "Won", "Yen", "Dollar"),
                "Yen",
                "General Knowledge",
                "Easy"
        );
        qb.addQuestion(q_gk_easy_9);

        MultipleChoiceQuestion q_gk_easy_10 = new MultipleChoiceQuestion(
                "Which gas do plants absorb from the atmosphere?",
                Arrays.asList("Oxygen", "Nitrogen", "Carbon Dioxide", "Hydrogen"),
                "Carbon Dioxide",
                "General Knowledge",
                "Easy"
        );
        qb.addQuestion(q_gk_easy_10);

        // Medium
        MultipleChoiceQuestion q_gk_medium_1 = new MultipleChoiceQuestion(
                "Which city is known as the 'Eternal City'?",
                Arrays.asList("Athens", "Rome", "Jerusalem", "Istanbul"),
                "Rome",
                "General Knowledge",
                "Medium"
        );
        qb.addQuestion(q_gk_medium_1);

        MultipleChoiceQuestion q_gk_medium_2 = new MultipleChoiceQuestion(
                "What is the longest river in the world?",
                Arrays.asList("Amazon River", "Nile River", "Yangtze River", "Mississippi River"),
                "Nile River",
                "General Knowledge",
                "Medium"
        );
        qb.addQuestion(q_gk_medium_2);

        MultipleChoiceQuestion q_gk_medium_3 = new MultipleChoiceQuestion(
                "Who wrote 'Romeo and Juliet'?",
                Arrays.asList("Charles Dickens", "William Shakespeare", "Jane Austen", "Mark Twain"),
                "William Shakespeare",
                "General Knowledge",
                "Medium"
        );
        qb.addQuestion(q_gk_medium_3);

        MultipleChoiceQuestion q_gk_medium_4 = new MultipleChoiceQuestion(
                "What is the smallest country in the world?",
                Arrays.asList("Monaco", "Vatican City", "San Marino", "Liechtenstein"),
                "Vatican City",
                "General Knowledge",
                "Medium"
        );
        qb.addQuestion(q_gk_medium_4);

        MultipleChoiceQuestion q_gk_medium_5 = new MultipleChoiceQuestion(
                "Which element has the chemical symbol 'Fe'?",
                Arrays.asList("Fluorine", "Iron", "Gold", "Silver"),
                "Iron",
                "General Knowledge",
                "Medium"
        );
        qb.addQuestion(q_gk_medium_5);

        MultipleChoiceQuestion q_gk_medium_6 = new MultipleChoiceQuestion(
                "What is the capital of Australia?",
                Arrays.asList("Sydney", "Melbourne", "Canberra", "Brisbane"),
                "Canberra",
                "General Knowledge",
                "Medium"
        );
        qb.addQuestion(q_gk_medium_6);

        MultipleChoiceQuestion q_gk_medium_7 = new MultipleChoiceQuestion(
                "In which year did the Titanic sink?",
                Arrays.asList("1905", "1912", "1918", "1923"),
                "1912",
                "General Knowledge",
                "Medium"
        );
        qb.addQuestion(q_gk_medium_7);

        MultipleChoiceQuestion q_gk_medium_8 = new MultipleChoiceQuestion(
                "Which famous scientist developed the theory of relativity?",
                Arrays.asList("Isaac Newton", "Galileo Galilei", "Albert Einstein", "Stephen Hawking"),
                "Albert Einstein",
                "General Knowledge",
                "Medium"
        );
        qb.addQuestion(q_gk_medium_8);

        MultipleChoiceQuestion q_gk_medium_9 = new MultipleChoiceQuestion(
                "What is the largest desert in the world?",
                Arrays.asList("Sahara Desert", "Arabian Desert", "Gobi Desert", "Antarctic Polar Desert"),
                "Antarctic Polar Desert",
                "General Knowledge",
                "Medium"
        );
        qb.addQuestion(q_gk_medium_9);

        MultipleChoiceQuestion q_gk_medium_10 = new MultipleChoiceQuestion(
                "Which country is known as the 'Land of the Rising Sun'?",
                Arrays.asList("China", "South Korea", "Japan", "Vietnam"),
                "Japan",
                "General Knowledge",
                "Medium"
        );
        qb.addQuestion(q_gk_medium_10);

        // Hard
        MultipleChoiceQuestion q_gk_hard_1 = new MultipleChoiceQuestion(
                "Which ancient wonder of the world was located in Alexandria, Egypt?",
                Arrays.asList("Hanging Gardens of Babylon", "Lighthouse of Alexandria", "Colossus of Rhodes", "Statue of Zeus at Olympia"),
                "Lighthouse of Alexandria",
                "General Knowledge",
                "Hard"
        );
        qb.addQuestion(q_gk_hard_1);

        MultipleChoiceQuestion q_gk_hard_2 = new MultipleChoiceQuestion(
                "Who was the first woman to win a Nobel Prize?",
                Arrays.asList("Marie Curie", "Rosalind Franklin", "Dorothy Hodgkin", "Irène Joliot-Curie"),
                "Marie Curie",
                "General Knowledge",
                "Hard"
        );
        qb.addQuestion(q_gk_hard_2);

        MultipleChoiceQuestion q_gk_hard_3 = new MultipleChoiceQuestion(
                "What is the only letter in the alphabet that does not appear in the name of any U.S. state?",
                Arrays.asList("Z", "Q", "X", "J"),
                "Q",
                "General Knowledge",
                "Hard"
        );
        qb.addQuestion(q_gk_hard_3);

        MultipleChoiceQuestion q_gk_hard_4 = new MultipleChoiceQuestion(
                "Which philosopher is famous for the quote 'I think, therefore I am'?",
                Arrays.asList("Plato", "Socrates", "René Descartes", "Aristotle"),
                "René Descartes",
                "General Knowledge",
                "Hard"
        );
        qb.addQuestion(q_gk_hard_4);

        MultipleChoiceQuestion q_gk_hard_5 = new MultipleChoiceQuestion(
                "What is the largest organ in the human body?",
                Arrays.asList("Heart", "Brain", "Skin", "Liver"),
                "Skin",
                "General Knowledge",
                "Hard"
        );
        qb.addQuestion(q_gk_hard_5);

        MultipleChoiceQuestion q_gk_hard_6 = new MultipleChoiceQuestion(
                "Which historical event is associated with the phrase 'The shot heard 'round the world'?",
                Arrays.asList("Battle of Waterloo", "Attack on Pearl Harbor", "Battles of Lexington and Concord", "Fall of the Berlin Wall"),
                "Battles of Lexington and Concord",
                "General Knowledge",
                "Hard"
        );
        qb.addQuestion(q_gk_hard_6);

        MultipleChoiceQuestion q_gk_hard_7 = new MultipleChoiceQuestion(
                "What is the name of the deepest oceanic trench on Earth?",
                Arrays.asList("Puerto Rico Trench", "Java Trench", "Mariana Trench", "Kermadec Trench"),
                "Mariana Trench",
                "General Knowledge",
                "Hard"
        );
        qb.addQuestion(q_gk_hard_7);

        MultipleChoiceQuestion q_gk_hard_8 = new MultipleChoiceQuestion(
                "Who composed the 'Four Seasons'?",
                Arrays.asList("Wolfgang Amadeus Mozart", "Ludwig van Beethoven", "Johann Sebastian Bach", "Antonio Vivaldi"),
                "Antonio Vivaldi",
                "General Knowledge",
                "Hard"
        );
        qb.addQuestion(q_gk_hard_8);

        MultipleChoiceQuestion q_gk_hard_9 = new MultipleChoiceQuestion(
                "Which country is the largest producer of coffee in the world?",
                Arrays.asList("Colombia", "Vietnam", "Brazil", "Ethiopia"),
                "Brazil",
                "General Knowledge",
                "Hard"
        );
        qb.addQuestion(q_gk_hard_9);

        MultipleChoiceQuestion q_gk_hard_10 = new MultipleChoiceQuestion(
                "What is the process by which plants convert light energy into chemical energy?",
                Arrays.asList("Respiration", "Fermentation", "Photosynthesis", "Transpiration"),
                "Photosynthesis",
                "General Knowledge",
                "Hard"
        );
        qb.addQuestion(q_gk_hard_10);

        // --- History Questions ---
        // Easy
        MultipleChoiceQuestion q_history_easy_1 = new MultipleChoiceQuestion(
                "Who was the first President of the United States?",
                Arrays.asList("Thomas Jefferson", "Abraham Lincoln", "George Washington", "John Adams"),
                "George Washington",
                "History",
                "Easy"
        );
        qb.addQuestion(q_history_easy_1);

        MultipleChoiceQuestion q_history_easy_2 = new MultipleChoiceQuestion(
                "In which year did World War II end?",
                Arrays.asList("1939", "1942", "1945", "1950"),
                "1945",
                "History",
                "Easy"
        );
        qb.addQuestion(q_history_easy_2);

        MultipleChoiceQuestion q_history_easy_3 = new MultipleChoiceQuestion(
                "Which ancient civilization built the pyramids?",
                Arrays.asList("Roman", "Greek", "Egyptian", "Mayan"),
                "Egyptian",
                "History",
                "Easy"
        );
        qb.addQuestion(q_history_easy_3);

        MultipleChoiceQuestion q_history_easy_4 = new MultipleChoiceQuestion(
                "Who was the famous queen of ancient Egypt?",
                Arrays.asList("Nefertiti", "Hatshepsut", "Cleopatra", "Isis"),
                "Cleopatra",
                "History",
                "Easy"
        );
        qb.addQuestion(q_history_easy_4);

        MultipleChoiceQuestion q_history_easy_5 = new MultipleChoiceQuestion(
                "What was the main purpose of the Roman Colosseum?",
                Arrays.asList("A marketplace", "A government building", "An amphitheater for gladiatorial contests", "A library"),
                "An amphitheater for gladiatorial contests",
                "History",
                "Easy"
        );
        qb.addQuestion(q_history_easy_5);

        MultipleChoiceQuestion q_history_easy_6 = new MultipleChoiceQuestion(
                "Which explorer is credited with the first circumnavigation of the Earth?",
                Arrays.asList("Christopher Columbus", "Vasco da Gama", "Ferdinand Magellan", "James Cook"),
                "Ferdinand Magellan",
                "History",
                "Easy"
        );
        qb.addQuestion(q_history_easy_6);

        MultipleChoiceQuestion q_history_easy_7 = new MultipleChoiceQuestion(
                "What event marked the beginning of World War I?",
                Arrays.asList("Attack on Pearl Harbor", "Assassination of Archduke Franz Ferdinand", "Invasion of Poland", "Fall of the Berlin Wall"),
                "Assassination of Archduke Franz Ferdinand",
                "History",
                "Easy"
        );
        qb.addQuestion(q_history_easy_7);

        MultipleChoiceQuestion q_history_easy_8 = new MultipleChoiceQuestion(
                "Who led the Soviet Union during much of World War II?",
                Arrays.asList("Vladimir Lenin", "Joseph Stalin", "Nikita Khrushchev", "Mikhail Gorbachev"),
                "Joseph Stalin",
                "History",
                "Easy"
        );
        qb.addQuestion(q_history_easy_8);

        MultipleChoiceQuestion q_history_easy_9 = new MultipleChoiceQuestion(
                "The Magna Carta was signed in which country?",
                Arrays.asList("France", "Germany", "England", "Italy"),
                "England",
                "History",
                "Easy"
        );
        qb.addQuestion(q_history_easy_9);

        MultipleChoiceQuestion q_history_easy_10 = new MultipleChoiceQuestion(
                "What was the primary cause of the American Civil War?",
                Arrays.asList("Taxation without representation", "Slavery", "Religious freedom", "Territorial expansion"),
                "Slavery",
                "History",
                "Easy"
        );
        qb.addQuestion(q_history_easy_10);

        // Medium
        MultipleChoiceQuestion q_history_medium_1 = new MultipleChoiceQuestion(
                "Which empire was ruled by figures like Julius Caesar and Augustus?",
                Arrays.asList("Greek Empire", "Roman Empire", "Persian Empire", "Ottoman Empire"),
                "Roman Empire",
                "History",
                "Medium"
        );
        qb.addQuestion(q_history_medium_1);

        MultipleChoiceQuestion q_history_medium_2 = new MultipleChoiceQuestion(
                "The Renaissance originated in which European country?",
                Arrays.asList("France", "Germany", "Italy", "Spain"),
                "Italy",
                "History",
                "Medium"
        );
        qb.addQuestion(q_history_medium_2);

        MultipleChoiceQuestion q_history_medium_3 = new MultipleChoiceQuestion(
                "What was the name of the trade route connecting the East and West, famous for silk and spices?",
                Arrays.asList("Spice Route", "Amber Road", "Silk Road", "Tea Horse Road"),
                "Silk Road",
                "History",
                "Medium"
        );
        qb.addQuestion(q_history_medium_3);

        MultipleChoiceQuestion q_history_medium_4 = new MultipleChoiceQuestion(
                "Who was the leader of the Nazi Party in Germany during World War II?",
                Arrays.asList("Benito Mussolini", "Joseph Stalin", "Adolf Hitler", "Winston Churchill"),
                "Adolf Hitler",
                "History",
                "Medium"
        );
        qb.addQuestion(q_history_medium_4);

        MultipleChoiceQuestion q_history_medium_5 = new MultipleChoiceQuestion(
                "The fall of the Berlin Wall in 1989 symbolized the end of what era?",
                Arrays.asList("World War II", "The Cold War", "The Great Depression", "The Space Race"),
                "The Cold War",
                "History",
                "Medium"
        );
        qb.addQuestion(q_history_medium_5);

        MultipleChoiceQuestion q_history_medium_6 = new MultipleChoiceQuestion(
                "Which document declared the American colonies independent from Great Britain?",
                Arrays.asList("The U.S. Constitution", "The Bill of Rights", "The Declaration of Independence", "The Articles of Confederation"),
                "The Declaration of Independence",
                "History",
                "Medium"
        );
        qb.addQuestion(q_history_medium_6);

        MultipleChoiceQuestion q_history_medium_7 = new MultipleChoiceQuestion(
                "Who was the last pharaoh of ancient Egypt?",
                Arrays.asList("Hatshepsut", "Nefertiti", "Tutankhamun", "Cleopatra VII"),
                "Cleopatra VII",
                "History",
                "Medium"
        );
        qb.addQuestion(q_history_medium_7);

        MultipleChoiceQuestion q_history_medium_8 = new MultipleChoiceQuestion(
                "The Black Death, a devastating pandemic, occurred in which century?",
                Arrays.asList("12th century", "13th century", "14th century", "15th century"),
                "14th century",
                "History",
                "Medium"
        );
        qb.addQuestion(q_history_medium_8);

        MultipleChoiceQuestion q_history_medium_9 = new MultipleChoiceQuestion(
                "Which ancient city was famously destroyed by the eruption of Mount Vesuvius in 79 AD?",
                Arrays.asList("Rome", "Athens", "Pompeii", "Troy"),
                "Pompeii",
                "History",
                "Medium"
        );
        qb.addQuestion(q_history_medium_9);

        MultipleChoiceQuestion q_history_medium_10 = new MultipleChoiceQuestion(
                "Who was the leader of the civil rights movement in the United States?",
                Arrays.asList("Malcolm X", "Rosa Parks", "Martin Luther King Jr.", "Harriet Tubman"),
                "Martin Luther King Jr.",
                "History",
                "Medium"
        );
        qb.addQuestion(q_history_medium_10);

        // Hard
        MultipleChoiceQuestion q_history_hard_1 = new MultipleChoiceQuestion(
                "The Edict of Nantes, which granted substantial rights to Calvinist Protestants (Huguenots) in France, was signed by which king?",
                Arrays.asList("Louis XIV", "Henry IV", "Francis I", "Louis XIII"),
                "Henry IV",
                "History",
                "Hard"
        );
        qb.addQuestion(q_history_hard_1);

        MultipleChoiceQuestion q_history_hard_2 = new MultipleChoiceQuestion(
                "Which treaty officially ended World War I?",
                Arrays.asList("Treaty of Versailles", "Treaty of Paris", "Treaty of Trianon", "Treaty of Brest-Litovsk"),
                "Treaty of Versailles",
                "History",
                "Hard"
        );
        qb.addQuestion(q_history_hard_2);

        MultipleChoiceQuestion q_history_hard_3 = new MultipleChoiceQuestion(
                "The 'Glorious Revolution' of 1688-1689 took place in which country?",
                Arrays.asList("France", "England", "Germany", "United States"),
                "England",
                "History",
                "Hard"
        );
        qb.addQuestion(q_history_hard_3);

        MultipleChoiceQuestion q_history_hard_4 = new MultipleChoiceQuestion(
                "Who was the primary author of the U.S. Declaration of Independence?",
                Arrays.asList("George Washington", "Benjamin Franklin", "Thomas Jefferson", "James Madison"),
                "Thomas Jefferson",
                "History",
                "Hard"
        );
        qb.addQuestion(q_history_hard_4);

        MultipleChoiceQuestion q_history_hard_5 = new MultipleChoiceQuestion(
                "The Hundred Years' War was fought between which two countries?",
                Arrays.asList("England and Spain", "France and Germany", "England and France", "Italy and Austria"),
                "England and France",
                "History",
                "Hard"
        );
        qb.addQuestion(q_history_hard_5);

        MultipleChoiceQuestion q_history_hard_6 = new MultipleChoiceQuestion(
                "What was the name of the ship on which Charles Darwin made his famous voyage, leading to his theory of evolution?",
                Arrays.asList("HMS Victory", "HMS Endeavour", "HMS Beagle", "The Mayflower"),
                "HMS Beagle",
                "History",
                "Hard"
        );
        qb.addQuestion(q_history_hard_6);

        MultipleChoiceQuestion q_history_hard_7 = new MultipleChoiceQuestion(
                "Which ancient civilization developed the concept of zero and the decimal system?",
                Arrays.asList("Greek", "Roman", "Indian", "Babylonian"),
                "Indian",
                "History",
                "Hard"
        );
        qb.addQuestion(q_history_hard_7);

        MultipleChoiceQuestion q_history_hard_8 = new MultipleChoiceQuestion(
                "The Opium Wars were fought in the 19th century between which two entities?",
                Arrays.asList("Britain and India", "China and Japan", "Britain and China", "France and Vietnam"),
                "Britain and China",
                "History",
                "Hard"
        );
        qb.addQuestion(q_history_hard_8);

        MultipleChoiceQuestion q_history_hard_9 = new MultipleChoiceQuestion(
                "Who was the last emperor of Russia?",
                Arrays.asList("Peter the Great", "Catherine the Great", "Nicholas II", "Alexander I"),
                "Nicholas II",
                "History",
                "Hard"
        );
        qb.addQuestion(q_history_hard_9);

        MultipleChoiceQuestion q_history_hard_10 = new MultipleChoiceQuestion(
                "What was the primary goal of the Manhattan Project?",
                Arrays.asList("To develop the first jet engine", "To build the first atomic bomb", "To create the first computer", "To land a man on the moon"),
                "To build the first atomic bomb",
                "History",
                "Hard"
        );
        qb.addQuestion(q_history_hard_10);

        // --- Science Questions ---
        // Easy
        MultipleChoiceQuestion q_science_easy_1 = new MultipleChoiceQuestion(
                "What is the chemical symbol for oxygen?",
                Arrays.asList("O", "Ox", "O2", "Oz"),
                "O",
                "Science",
                "Easy"
        );
        qb.addQuestion(q_science_easy_1);

        MultipleChoiceQuestion q_science_easy_2 = new MultipleChoiceQuestion(
                "What force pulls objects towards the center of the Earth?",
                Arrays.asList("Friction", "Gravity", "Magnetism", "Tension"),
                "Gravity",
                "Science",
                "Easy"
        );
        qb.addQuestion(q_science_easy_2);

        MultipleChoiceQuestion q_science_easy_3 = new MultipleChoiceQuestion(
                "What is the process by which plants make their own food?",
                Arrays.asList("Respiration", "Digestion", "Photosynthesis", "Transpiration"),
                "Photosynthesis",
                "Science",
                "Easy"
        );
        qb.addQuestion(q_science_easy_3);

        MultipleChoiceQuestion q_science_easy_4 = new MultipleChoiceQuestion(
                "What is the largest organ in the human body?",
                Arrays.asList("Heart", "Brain", "Skin", "Liver"),
                "Skin",
                "Science",
                "Easy"
        );
        qb.addQuestion(q_science_easy_4);

        MultipleChoiceQuestion q_science_easy_5 = new MultipleChoiceQuestion(
                "What is the state of matter that has a definite shape and volume?",
                Arrays.asList("Liquid", "Gas", "Solid", "Plasma"),
                "Solid",
                "Science",
                "Easy"
        );
        qb.addQuestion(q_science_easy_5);

        MultipleChoiceQuestion q_science_easy_6 = new MultipleChoiceQuestion(
                "Which gas do humans breathe out?",
                Arrays.asList("Oxygen", "Nitrogen", "Carbon Dioxide", "Hydrogen"),
                "Carbon Dioxide",
                "Science",
                "Easy"
        );
        qb.addQuestion(q_science_easy_6);

        MultipleChoiceQuestion q_science_easy_7 = new MultipleChoiceQuestion(
                "What is the unit of electric current?",
                Arrays.asList("Volt", "Ohm", "Ampere", "Watt"),
                "Ampere",
                "Science",
                "Easy"
        );
        qb.addQuestion(q_science_easy_7);

        MultipleChoiceQuestion q_science_easy_8 = new MultipleChoiceQuestion(
                "Which part of the plant absorbs water and nutrients from the soil?",
                Arrays.asList("Leaves", "Stem", "Flowers", "Roots"),
                "Roots",
                "Science",
                "Easy"
        );
        qb.addQuestion(q_science_easy_8);

        MultipleChoiceQuestion q_science_easy_9 = new MultipleChoiceQuestion(
                "What is the common name for the phenomenon where light bends as it passes from one medium to another?",
                Arrays.asList("Reflection", "Refraction", "Diffraction", "Absorption"),
                "Refraction",
                "Science",
                "Easy"
        );
        qb.addQuestion(q_science_easy_9);

        MultipleChoiceQuestion q_science_easy_10 = new MultipleChoiceQuestion(
                "What is the smallest unit of matter?",
                Arrays.asList("Molecule", "Cell", "Atom", "Proton"),
                "Atom",
                "Science",
                "Easy"
        );
        qb.addQuestion(q_science_easy_10);

        // Medium
        MultipleChoiceQuestion q_science_medium_1 = new MultipleChoiceQuestion(
                "What is the process by which a liquid turns into a gas?",
                Arrays.asList("Condensation", "Melting", "Evaporation", "Freezing"),
                "Evaporation",
                "Science",
                "Medium"
        );
        qb.addQuestion(q_science_medium_1);

        MultipleChoiceQuestion q_science_medium_2 = new MultipleChoiceQuestion(
                "Which subatomic particle has a negative charge?",
                Arrays.asList("Proton", "Neutron", "Electron", "Photon"),
                "Electron",
                "Science",
                "Medium"
        );
        qb.addQuestion(q_science_medium_2);

        MultipleChoiceQuestion q_science_medium_3 = new MultipleChoiceQuestion(
                "What is the name of the process where a solid turns directly into a gas without passing through a liquid state?",
                Arrays.asList("Melting", "Sublimation", "Condensation", "Evaporation"),
                "Sublimation",
                "Science",
                "Medium"
        );
        qb.addQuestion(q_science_medium_3);

        MultipleChoiceQuestion q_science_medium_4 = new MultipleChoiceQuestion(
                "What is the main function of red blood cells?",
                Arrays.asList("Fighting infections", "Clotting blood", "Carrying oxygen", "Producing antibodies"),
                "Carrying oxygen",
                "Science",
                "Medium"
        );
        qb.addQuestion(q_science_medium_4);

        MultipleChoiceQuestion q_science_medium_5 = new MultipleChoiceQuestion(
                "Which type of energy is stored in the bonds of chemical compounds?",
                Arrays.asList("Kinetic energy", "Potential energy", "Thermal energy", "Chemical energy"),
                "Chemical energy",
                "Science",
                "Medium"
        );
        qb.addQuestion(q_science_medium_5);

        MultipleChoiceQuestion q_science_medium_6 = new MultipleChoiceQuestion(
                "What is the name of the instrument used to measure atmospheric pressure?",
                Arrays.asList("Thermometer", "Anemometer", "Barometer", "Hygrometer"),
                "Barometer",
                "Science",
                "Medium"
        );
        qb.addQuestion(q_science_medium_6);

        MultipleChoiceQuestion q_science_medium_7 = new MultipleChoiceQuestion(
                "Which planet is known as the 'Morning Star' or 'Evening Star'?",
                Arrays.asList("Mars", "Venus", "Mercury", "Jupiter"),
                "Venus",
                "Science",
                "Medium"
        );
        qb.addQuestion(q_science_medium_7);

        MultipleChoiceQuestion q_science_medium_8 = new MultipleChoiceQuestion(
                "What is the process by which heat is transferred through direct contact?",
                Arrays.asList("Convection", "Radiation", "Conduction", "Absorption"),
                "Conduction",
                "Science",
                "Medium"
        );
        qb.addQuestion(q_science_medium_8);

        MultipleChoiceQuestion q_science_medium_9 = new MultipleChoiceQuestion(
                "What is the primary component of Earth's atmosphere?",
                Arrays.asList("Oxygen", "Carbon Dioxide", "Nitrogen", "Argon"),
                "Nitrogen",
                "Science",
                "Medium"
        );
        qb.addQuestion(q_science_medium_9);

        MultipleChoiceQuestion q_science_medium_10 = new MultipleChoiceQuestion(
                "Which of the following is a renewable energy source?",
                Arrays.asList("Coal", "Natural Gas", "Solar Power", "Nuclear Energy"),
                "Solar Power",
                "Science",
                "Medium"
        );
        qb.addQuestion(q_science_medium_10);

        // Hard
        MultipleChoiceQuestion q_science_hard_1 = new MultipleChoiceQuestion(
                "What is the phenomenon where light particles (photons) exhibit both wave-like and particle-like properties?",
                Arrays.asList("Photoelectric Effect", "Quantum Entanglement", "Wave-Particle Duality", "Heisenberg Uncertainty Principle"),
                "Wave-Particle Duality",
                "Science",
                "Hard"
        );
        qb.addQuestion(q_science_hard_1);

        MultipleChoiceQuestion q_science_hard_2 = new MultipleChoiceQuestion(
                "Which law states that energy cannot be created or destroyed, only transformed from one form to another?",
                Arrays.asList("Newton's First Law", "Law of Conservation of Mass", "Law of Conservation of Energy", "Ohm's Law"),
                "Law of Conservation of Energy",
                "Science",
                "Hard"
        );
        qb.addQuestion(q_science_hard_2);

        MultipleChoiceQuestion q_science_hard_3 = new MultipleChoiceQuestion(
                "What is the process by which atomic nuclei combine to form a heavier nucleus, releasing immense energy?",
                Arrays.asList("Nuclear Fission", "Radioactive Decay", "Nuclear Fusion", "Chain Reaction"),
                "Nuclear Fusion",
                "Science",
                "Hard"
        );
        qb.addQuestion(q_science_hard_3);

        MultipleChoiceQuestion q_science_hard_4 = new MultipleChoiceQuestion(
                "Which type of chemical bond involves the sharing of electron pairs between atoms?",
                Arrays.asList("Ionic bond", "Metallic bond", "Covalent bond", "Hydrogen bond"),
                "Covalent bond",
                "Science",
                "Hard"
        );
        qb.addQuestion(q_science_hard_4);

        MultipleChoiceQuestion q_science_hard_5 = new MultipleChoiceQuestion(
                "What is the name of the theory that describes the universe's origin as an extremely hot, dense point that expanded rapidly?",
                Arrays.asList("Steady-State Theory", "Big Bang Theory", "Pulsating Universe Theory", "Multiverse Theory"),
                "Big Bang Theory",
                "Science",
                "Hard"
        );
        qb.addQuestion(q_science_hard_5);

        MultipleChoiceQuestion q_science_hard_6 = new MultipleChoiceQuestion(
                "Which fundamental force is responsible for holding atomic nuclei together?",
                Arrays.asList("Gravitational force", "Electromagnetic force", "Strong nuclear force", "Weak nuclear force"),
                "Strong nuclear force",
                "Science",
                "Hard"
        );
        qb.addQuestion(q_science_hard_6);

        MultipleChoiceQuestion q_science_hard_7 = new MultipleChoiceQuestion(
                "What is the name of the process by which a star collapses under its own gravity after exhausting its nuclear fuel?",
                Arrays.asList("Supernova", "Nebula formation", "Black hole formation", "White dwarf formation"),
                "Black hole formation",
                "Science",
                "Hard"
        );
        qb.addQuestion(q_science_hard_7);

        MultipleChoiceQuestion q_science_hard_8 = new MultipleChoiceQuestion(
                "Which type of radiation consists of high-energy photons and is produced by radioactive decay or nuclear processes?",
                Arrays.asList("Alpha radiation", "Beta radiation", "Gamma radiation", "X-rays"),
                "Gamma radiation",
                "Science",
                "Hard"
        );
        qb.addQuestion(q_science_hard_8);

        MultipleChoiceQuestion q_science_hard_9 = new MultipleChoiceQuestion(
                "What is the term for a substance that speeds up a chemical reaction without being consumed in the process?",
                Arrays.asList("Inhibitor", "Reactant", "Catalyst", "Product"),
                "Catalyst",
                "Science",
                "Hard"
        );
        qb.addQuestion(q_science_hard_9);

        MultipleChoiceQuestion q_science_hard_10 = new MultipleChoiceQuestion(
                "Which scientific principle states that two identical fermions cannot occupy the same quantum state simultaneously?",
                Arrays.asList("Heisenberg Uncertainty Principle", "Pauli Exclusion Principle", "Schrödinger Equation", "Planck's Law"),
                "Pauli Exclusion Principle",
                "Science",
                "Hard"
        );
        qb.addQuestion(q_science_hard_10);

        // --- Technology Questions ---
        // Easy
        MultipleChoiceQuestion q_tech_easy_1 = new MultipleChoiceQuestion(
                "What does CPU stand for?",
                Arrays.asList("Central Processing Unit", "Central Power Unit", "Computer Personal Unit", "Control Program Utility"),
                "Central Processing Unit",
                "Technology",
                "Easy"
        );
        qb.addQuestion(q_tech_easy_1);

        MultipleChoiceQuestion q_tech_easy_2 = new MultipleChoiceQuestion(
                "Which company developed the Windows operating system?",
                Arrays.asList("Apple", "Google", "Microsoft", "IBM"),
                "Microsoft",
                "Technology",
                "Easy"
        );
        qb.addQuestion(q_tech_easy_2);

        MultipleChoiceQuestion q_tech_easy_3 = new MultipleChoiceQuestion(
                "What is RAM short for?",
                Arrays.asList("Read Access Memory", "Random Access Memory", "Rapid Application Memory", "Remote Access Module"),
                "Random Access Memory",
                "Technology",
                "Easy"
        );
        qb.addQuestion(q_tech_easy_3);

        MultipleChoiceQuestion q_tech_easy_4 = new MultipleChoiceQuestion(
                "Which of these is a popular web browser?",
                Arrays.asList("Microsoft Word", "Google Chrome", "Adobe Photoshop", "Microsoft Excel"),
                "Google Chrome",
                "Technology",
                "Easy"
        );
        qb.addQuestion(q_tech_easy_4);

        MultipleChoiceQuestion q_tech_easy_5 = new MultipleChoiceQuestion(
                "What does 'Wi-Fi' stand for?",
                Arrays.asList("Wireless Fidelity", "Wireless Fiber", "Wired Fiber", "Web Fidelity"),
                "Wireless Fidelity",
                "Technology",
                "Easy"
        );
        qb.addQuestion(q_tech_easy_5);

        MultipleChoiceQuestion q_tech_easy_6 = new MultipleChoiceQuestion(
                "Which storage device uses flash memory to store data?",
                Arrays.asList("Hard Disk Drive (HDD)", "Floppy Disk", "Solid State Drive (SSD)", "CD-ROM"),
                "Solid State Drive (SSD)",
                "Technology",
                "Easy"
        );
        qb.addQuestion(q_tech_easy_6);

        MultipleChoiceQuestion q_tech_easy_7 = new MultipleChoiceQuestion(
                "What is the primary function of a firewall?",
                Arrays.asList("To speed up internet connection", "To block unwanted access to a network", "To store data", "To display images"),
                "To block unwanted access to a network",
                "Technology",
                "Easy"
        );
        qb.addQuestion(q_tech_easy_7);

        MultipleChoiceQuestion q_tech_easy_8 = new MultipleChoiceQuestion(
                "Which programming language is often used for web development, especially for interactive front-end elements?",
                Arrays.asList("Python", "Java", "JavaScript", "C++"),
                "JavaScript",
                "Technology",
                "Easy"
        );
        qb.addQuestion(q_tech_easy_8);

        MultipleChoiceQuestion q_tech_easy_9 = new MultipleChoiceQuestion(
                "What is the term for a global network of computers that allows users to share information?",
                Arrays.asList("Intranet", "Extranet", "Internet", "Local Area Network"),
                "Internet",
                "Technology",
                "Easy"
        );
        qb.addQuestion(q_tech_easy_9);

        MultipleChoiceQuestion q_tech_easy_10 = new MultipleChoiceQuestion(
                "Which company is known for its iPhone and MacBook products?",
                Arrays.asList("Samsung", "Google", "Microsoft", "Apple"),
                "Apple",
                "Technology",
                "Easy"
        );
        qb.addQuestion(q_tech_easy_10);

        // Medium
        MultipleChoiceQuestion q_tech_medium_1 = new MultipleChoiceQuestion(
                "What is an IP address?",
                Arrays.asList("A type of computer virus", "A unique numerical label assigned to each device connected to a computer network", "A software program for editing photos", "A brand of smartphone"),
                "A unique numerical label assigned to each device connected to a computer network",
                "Technology",
                "Medium"
        );
        qb.addQuestion(q_tech_medium_1);

        MultipleChoiceQuestion q_tech_medium_2 = new MultipleChoiceQuestion(
                "Which protocol is used for secure communication over a computer network, especially for web browsing?",
                Arrays.asList("HTTP", "FTP", "SMTP", "HTTPS"),
                "HTTPS",
                "Technology",
                "Medium"
        );
        qb.addQuestion(q_tech_medium_2);

        MultipleChoiceQuestion q_tech_medium_3 = new MultipleChoiceQuestion(
                "What does 'URL' stand for?",
                Arrays.asList("Universal Resource Locator", "Uniform Resource Link", "Unified Remote Login", "User Response Language"),
                "Universal Resource Locator",
                "Technology",
                "Medium"
        );
        qb.addQuestion(q_tech_medium_3);

        MultipleChoiceQuestion q_tech_medium_4 = new MultipleChoiceQuestion(
                "Which type of software is designed to protect your computer from malicious programs?",
                Arrays.asList("Spreadsheet software", "Antivirus software", "Video editing software", "Database management system"),
                "Antivirus software",
                "Technology",
                "Medium"
        );
        qb.addQuestion(q_tech_medium_4);

        MultipleChoiceQuestion q_tech_medium_5 = new MultipleChoiceQuestion(
                "What is the name of the open-source operating system based on the Linux kernel, primarily used on smartphones?",
                Arrays.asList("iOS", "Windows Phone", "Android", "BlackBerry OS"),
                "Android",
                "Technology",
                "Medium"
        );
        qb.addQuestion(q_tech_medium_5);

        MultipleChoiceQuestion q_tech_medium_6 = new MultipleChoiceQuestion(
                "Which technology allows a computer to simulate human intelligence?",
                Arrays.asList("Virtual Reality", "Augmented Reality", "Artificial Intelligence", "Machine Learning"),
                "Artificial Intelligence",
                "Technology",
                "Medium"
        );
        qb.addQuestion(q_tech_medium_6);

        MultipleChoiceQuestion q_tech_medium_7 = new MultipleChoiceQuestion(
                "What is a 'pixel' in digital imaging?",
                Arrays.asList("A unit of sound", "A single point in a graphic image", "A type of computer chip", "A video file format"),
                "A single point in a graphic image",
                "Technology",
                "Medium"
        );
        qb.addQuestion(q_tech_medium_7);

        MultipleChoiceQuestion q_tech_medium_8 = new MultipleChoiceQuestion(
                "Which company is known for its search engine and Android operating system?",
                Arrays.asList("Apple", "Microsoft", "Amazon", "Google"),
                "Google",
                "Technology",
                "Medium"
        );
        qb.addQuestion(q_tech_medium_8);

        MultipleChoiceQuestion q_tech_medium_9 = new MultipleChoiceQuestion(
                "What is the purpose of a 'router' in a network?",
                Arrays.asList("To store data", "To print documents", "To direct network traffic between different networks", "To display web pages"),
                "To direct network traffic between different networks",
                "Technology",
                "Medium"
        );
        qb.addQuestion(q_tech_medium_9);

        MultipleChoiceQuestion q_tech_medium_10 = new MultipleChoiceQuestion(
                "Which type of network connects devices within a limited geographical area, like a home or office?",
                Arrays.asList("WAN (Wide Area Network)", "LAN (Local Area Network)", "MAN (Metropolitan Area Network)", "GAN (Global Area Network)"),
                "LAN (Local Area Network)",
                "Technology",
                "Medium"
        );
        qb.addQuestion(q_tech_medium_10);

        // Hard
        MultipleChoiceQuestion q_tech_hard_1 = new MultipleChoiceQuestion(
                "What is the 'OSI model' primarily used for in networking?",
                Arrays.asList("Defining network security protocols", "Standardizing the functions of a communication system into seven layers", "Managing IP addresses", "Encrypting data transmissions"),
                "Standardizing the functions of a communication system into seven layers",
                "Technology",
                "Hard"
        );
        qb.addQuestion(q_tech_hard_1);

        MultipleChoiceQuestion q_tech_hard_2 = new MultipleChoiceQuestion(
                "Which encryption standard replaced WEP for Wi-Fi security due to its stronger security features?",
                Arrays.asList("WPA", "WPA2", "WEP2", "WPS"),
                "WPA2",
                "Technology",
                "Hard"
        );
        qb.addQuestion(q_tech_hard_2);

        MultipleChoiceQuestion q_tech_hard_3 = new MultipleChoiceQuestion(
                "What is the term for a piece of code or program that is designed to exploit a vulnerability in a computer system?",
                Arrays.asList("Virus", "Worm", "Trojan", "Exploit"),
                "Exploit",
                "Technology",
                "Hard"
        );
        qb.addQuestion(q_tech_hard_3);

        MultipleChoiceQuestion q_tech_hard_4 = new MultipleChoiceQuestion(
                "Which programming paradigm is based on the concept of 'objects', which can contain data and code?",
                Arrays.asList("Procedural Programming", "Functional Programming", "Object-Oriented Programming", "Logic Programming"),
                "Object-Oriented Programming",
                "Technology",
                "Hard"
        );
        qb.addQuestion(q_tech_hard_4);

        MultipleChoiceQuestion q_tech_hard_5 = new MultipleChoiceQuestion(
                "What is the purpose of 'DNS' in computer networking?",
                Arrays.asList("To encrypt data packets", "To translate domain names into IP addresses", "To manage network traffic", "To secure wireless connections"),
                "To translate domain names into IP addresses",
                "Technology",
                "Hard"
        );
        qb.addQuestion(q_tech_hard_5);

        MultipleChoiceQuestion q_tech_hard_6 = new MultipleChoiceQuestion(
                "Which type of database stores data in tables with rows and columns, and uses SQL for data manipulation?",
                Arrays.asList("NoSQL database", "Graph database", "Relational database", "Document database"),
                "Relational database",
                "Technology",
                "Hard"
        );
        qb.addQuestion(q_tech_hard_6);

        MultipleChoiceQuestion q_tech_hard_7 = new MultipleChoiceQuestion(
                "What is 'Quantum Computing'?",
                Arrays.asList("A type of supercomputing that uses classical physics", "A new form of cloud computing", "A computing paradigm that uses quantum-mechanical phenomena like superposition and entanglement", "A method for faster internet connections"),
                "A computing paradigm that uses quantum-mechanical phenomena like superposition and entanglement",
                "Technology",
                "Hard"
        );
        qb.addQuestion(q_tech_hard_7);

        MultipleChoiceQuestion q_tech_hard_8 = new MultipleChoiceQuestion(
                "Which component of a CPU performs arithmetic and logical operations?",
                Arrays.asList("Control Unit (CU)", "Memory Unit (MU)", "Arithmetic Logic Unit (ALU)", "Registers"),
                "Arithmetic Logic Unit (ALU)",
                "Technology",
                "Hard"
        );
        qb.addQuestion(q_tech_hard_8);

        MultipleChoiceQuestion q_tech_hard_9 = new MultipleChoiceQuestion(
                "What is the concept of 'Blockchain' primarily designed to ensure?",
                Arrays.asList("Centralized data storage", "Decentralized and immutable ledger of transactions", "Faster internet speeds", "Enhanced graphical processing"),
                "Decentralized and immutable ledger of transactions",
                "Technology",
                "Hard"
        );
        qb.addQuestion(q_tech_hard_9);

        MultipleChoiceQuestion q_tech_hard_10 = new MultipleChoiceQuestion(
                "Which network topology connects all devices to a single central cable?",
                Arrays.asList("Star topology", "Ring topology", "Bus topology", "Mesh topology"),
                "Bus topology",
                "Technology",
                "Hard"
        );
        qb.addQuestion(q_tech_hard_10);

        // --- Mathematics Questions ---
        // Easy
        MultipleChoiceQuestion q_math_easy_1 = new MultipleChoiceQuestion(
                "What is 5 + 3?",
                Arrays.asList("7", "8", "9", "10"),
                "8",
                "Mathematics",
                "Easy"
        );
        qb.addQuestion(q_math_easy_1);

        MultipleChoiceQuestion q_math_easy_2 = new MultipleChoiceQuestion(
                "What is the value of Pi (π) approximately?",
                Arrays.asList("3.0", "3.14", "3.5", "4.0"),
                "3.14",
                "Mathematics",
                "Easy"
        );
        qb.addQuestion(q_math_easy_2);

        MultipleChoiceQuestion q_math_easy_3 = new MultipleChoiceQuestion(
                "How many sides does a triangle have?",
                Arrays.asList("2", "3", "4", "5"),
                "3",
                "Mathematics",
                "Easy"
        );
        qb.addQuestion(q_math_easy_3);

        MultipleChoiceQuestion q_math_easy_4 = new MultipleChoiceQuestion(
                "What is 10 multiplied by 7?",
                Arrays.asList("17", "70", "7", "107"),
                "70",
                "Mathematics",
                "Easy"
        );
        qb.addQuestion(q_math_easy_4);

        MultipleChoiceQuestion q_math_easy_5 = new MultipleChoiceQuestion(
                "What is the square root of 25?",
                Arrays.asList("4", "5", "6", "7"),
                "5",
                "Mathematics",
                "Easy"
        );
        qb.addQuestion(q_math_easy_5);

        MultipleChoiceQuestion q_math_easy_6 = new MultipleChoiceQuestion(
                "If a square has a side length of 4 cm, what is its perimeter?",
                Arrays.asList("8 cm", "12 cm", "16 cm", "20 cm"),
                "16 cm",
                "Mathematics",
                "Easy"
        );
        qb.addQuestion(q_math_easy_6);

        MultipleChoiceQuestion q_math_easy_7 = new MultipleChoiceQuestion(
                "What is the next number in the sequence: 2, 4, 6, 8, ...?",
                Arrays.asList("9", "10", "11", "12"),
                "10",
                "Mathematics",
                "Easy"
        );
        qb.addQuestion(q_math_easy_7);

        MultipleChoiceQuestion q_math_easy_8 = new MultipleChoiceQuestion(
                "What is 15 divided by 3?",
                Arrays.asList("3", "4", "5", "6"),
                "5",
                "Mathematics",
                "Easy"
        );
        qb.addQuestion(q_math_easy_8);

        MultipleChoiceQuestion q_math_easy_9 = new MultipleChoiceQuestion(
                "How many degrees are in a right angle?",
                Arrays.asList("45", "90", "180", "360"),
                "90",
                "Mathematics",
                "Easy"
        );
        qb.addQuestion(q_math_easy_9);

        MultipleChoiceQuestion q_math_easy_10 = new MultipleChoiceQuestion(
                "What is the sum of angles in a triangle?",
                Arrays.asList("90 degrees", "180 degrees", "270 degrees", "360 degrees"),
                "180 degrees",
                "Mathematics",
                "Easy"
        );
        qb.addQuestion(q_math_easy_10);

        // Medium
        MultipleChoiceQuestion q_math_medium_1 = new MultipleChoiceQuestion(
                "What is the value of 'x' in the equation: 2x + 5 = 15?",
                Arrays.asList("5", "10", "7.5", "2.5"),
                "5",
                "Mathematics",
                "Medium"
        );
        qb.addQuestion(q_math_medium_1);

        MultipleChoiceQuestion q_math_medium_2 = new MultipleChoiceQuestion(
                "What is the formula for the area of a circle?",
                Arrays.asList("πr", "2πr", "πr²", "2πr²"),
                "πr²",
                "Mathematics",
                "Medium"
        );
        qb.addQuestion(q_math_medium_2);

        MultipleChoiceQuestion q_math_medium_3 = new MultipleChoiceQuestion(
                "What is a prime number?",
                Arrays.asList("A number divisible by 2", "A number greater than 1 that has no positive divisors other than 1 and itself", "Any odd number", "A number that ends in 0 or 5"),
                "A number greater than 1 that has no positive divisors other than 1 and itself",
                "Mathematics",
                "Medium"
        );
        qb.addQuestion(q_math_medium_3);

        MultipleChoiceQuestion q_math_medium_4 = new MultipleChoiceQuestion(
                "In a right-angled triangle, which side is opposite the right angle?",
                Arrays.asList("Adjacent", "Opposite", "Hypotenuse", "Leg"),
                "Hypotenuse",
                "Mathematics",
                "Medium"
        );
        qb.addQuestion(q_math_medium_4);

        MultipleChoiceQuestion q_math_medium_5 = new MultipleChoiceQuestion(
                "What is the value of 3! (3 factorial)?",
                Arrays.asList("3", "6", "9", "12"),
                "6",
                "Mathematics",
                "Medium"
        );
        qb.addQuestion(q_math_medium_5);

        MultipleChoiceQuestion q_math_medium_6 = new MultipleChoiceQuestion(
                "What is the result of 2^5 (2 to the power of 5)?",
                Arrays.asList("10", "16", "32", "64"),
                "32",
                "Mathematics",
                "Medium"
        );
        qb.addQuestion(q_math_medium_6);

        MultipleChoiceQuestion q_math_medium_7 = new MultipleChoiceQuestion(
                "What is the term for a sequence where each number is the sum of the two preceding ones (e.g., 0, 1, 1, 2, 3, 5...)?",
                Arrays.asList("Arithmetic sequence", "Geometric sequence", "Fibonacci sequence", "Harmonic sequence"),
                "Fibonacci sequence",
                "Mathematics",
                "Medium"
        );
        qb.addQuestion(q_math_medium_7);

        MultipleChoiceQuestion q_math_medium_8 = new MultipleChoiceQuestion(
                "What is the derivative of x^2?",
                Arrays.asList("x", "2x", "x^3/3", "2"),
                "2x",
                "Mathematics",
                "Medium"
        );
        qb.addQuestion(q_math_medium_8);

        MultipleChoiceQuestion q_math_medium_9 = new MultipleChoiceQuestion(
                "What is the term for a line that touches a curve at only one point?",
                Arrays.asList("Secant", "Chord", "Tangent", "Normal"),
                "Tangent",
                "Mathematics",
                "Medium"
        );
        qb.addQuestion(q_math_medium_9);

        MultipleChoiceQuestion q_math_medium_10 = new MultipleChoiceQuestion(
                "What is the probability of rolling a 6 on a standard six-sided die?",
                Arrays.asList("1/2", "1/3", "1/6", "1/12"),
                "1/6",
                "Mathematics",
                "Medium"
        );
        qb.addQuestion(q_math_medium_10);

        // Hard
        MultipleChoiceQuestion q_math_hard_1 = new MultipleChoiceQuestion(
                "What is the fundamental theorem of calculus?",
                Arrays.asList("It relates the derivative and integral of a function", "It states that every non-constant single-variable polynomial with complex coefficients has at least one complex root", "It describes the behavior of objects in motion", "It defines prime numbers"),
                "It relates the derivative and integral of a function",
                "Mathematics",
                "Hard"
        );
        qb.addQuestion(q_math_hard_1);

        MultipleChoiceQuestion q_math_hard_2 = new MultipleChoiceQuestion(
                "What is the value of 'i' (the imaginary unit)?",
                Arrays.asList("√1", "√-1", "0", "1"),
                "√-1",
                "Mathematics",
                "Hard"
        );
        qb.addQuestion(q_math_hard_2);

        MultipleChoiceQuestion q_math_hard_3 = new MultipleChoiceQuestion(
                "What is the term for a function that is its own derivative?",
                Arrays.asList("Polynomial function", "Exponential function", "Logarithmic function", "Trigonometric function"),
                "Exponential function",
                "Mathematics",
                "Hard"
        );
        qb.addQuestion(q_math_hard_3);

        MultipleChoiceQuestion q_math_hard_4 = new MultipleChoiceQuestion(
                "What is a 'Möbius strip'?",
                Arrays.asList("A type of knot", "A surface with only one side and one boundary component", "A complex geometric shape with multiple holes", "A mathematical formula for calculating volume"),
                "A surface with only one side and one boundary component",
                "Mathematics",
                "Hard"
        );
        qb.addQuestion(q_math_hard_4);

        MultipleChoiceQuestion q_math_hard_5 = new MultipleChoiceQuestion(
                "What is the 'Golden Ratio' approximately equal to?",
                Arrays.asList("1.414", "1.618", "2.718", "3.141"),
                "1.618",
                "Mathematics",
                "Hard"
        );
        qb.addQuestion(q_math_hard_5);

        MultipleChoiceQuestion q_math_hard_6 = new MultipleChoiceQuestion(
                "In set theory, what does '∅' represent?",
                Arrays.asList("Universal set", "Subset", "Empty set", "Intersection"),
                "Empty set",
                "Mathematics",
                "Hard"
        );
        qb.addQuestion(q_math_hard_6);

        MultipleChoiceQuestion q_math_hard_7 = new MultipleChoiceQuestion(
                "What is the name of the mathematical constant approximately equal to 2.71828, the base of the natural logarithm?",
                Arrays.asList("Pi (π)", "Euler's number (e)", "Golden Ratio (φ)", "Avogadro's number"),
                "Euler's number (e)",
                "Mathematics",
                "Hard"
        );
        qb.addQuestion(q_math_hard_7);

        MultipleChoiceQuestion q_math_hard_8 = new MultipleChoiceQuestion(
                "What is 'Fermat's Last Theorem'?",
                Arrays.asList("A theorem about prime numbers", "A theorem stating that no three positive integers a, b, and c can satisfy the equation a^n + b^n = c^n for any integer value of n greater than 2", "A theorem about geometric shapes", "A theorem related to calculus"),
                "A theorem stating that no three positive integers a, b, and c can satisfy the equation a^n + b^n = c^n for any integer value of n greater than 2",
                "Mathematics",
                "Hard"
        );
        qb.addQuestion(q_math_hard_8);

        MultipleChoiceQuestion q_math_hard_9 = new MultipleChoiceQuestion(
                "In graph theory, what is a 'Hamiltonian path'?",
                Arrays.asList("A path that visits every vertex in a graph exactly once", "A path that visits every edge in a graph exactly once", "The shortest path between two vertices", "A path that forms a closed loop"),
                "A path that visits every vertex in a graph exactly once",
                "Mathematics",
                "Hard"
        );
        qb.addQuestion(q_math_hard_9);

        MultipleChoiceQuestion q_math_hard_10 = new MultipleChoiceQuestion(
                "What is the term for a number that can be expressed as a fraction p/q, where p and q are integers and q is not zero?",
                Arrays.asList("Irrational number", "Real number", "Rational number", "Complex number"),
                "Rational number",
                "Mathematics",
                "Hard"
        );
        qb.addQuestion(q_math_hard_10);

        // --- Programming Questions ---
        // Easy
        MultipleChoiceQuestion q_prog_easy_1 = new MultipleChoiceQuestion(
                "Which keyword is used to declare a variable in Java?",
                Arrays.asList("var", "let", "int", "const"),
                "int",
                "Programming",
                "Easy"
        );
        qb.addQuestion(q_prog_easy_1);

        MultipleChoiceQuestion q_prog_easy_2 = new MultipleChoiceQuestion(
                "What does 'IDE' stand for in programming?",
                Arrays.asList("Integrated Development Environment", "Interactive Design Editor", "Internet Data Exchange", "Internal Debugging Engine"),
                "Integrated Development Environment",
                "Programming",
                "Easy"
        );
        qb.addQuestion(q_prog_easy_2);

        MultipleChoiceQuestion q_prog_easy_3 = new MultipleChoiceQuestion(
                "Which symbol is used for single-line comments in Java?",
                Arrays.asList("//", "/*", "#", "--"),
                "//",
                "Programming",
                "Easy"
        );
        qb.addQuestion(q_prog_easy_3);

        MultipleChoiceQuestion q_prog_easy_4 = new MultipleChoiceQuestion(
                "What is the correct way to print 'Hello World' in Java?",
                Arrays.asList("print('Hello World');", "System.out.println('Hello World');", "console.log('Hello World');", "printf('Hello World');"),
                "System.out.println('Hello World');",
                "Programming",
                "Easy"
        );
        qb.addQuestion(q_prog_easy_4);

        MultipleChoiceQuestion q_prog_easy_5 = new MultipleChoiceQuestion(
                "Which data type is used to store true/false values in Java?",
                Arrays.asList("string", "int", "boolean", "char"),
                "boolean",
                "Programming",
                "Easy"
        );
        qb.addQuestion(q_prog_easy_5);

        MultipleChoiceQuestion q_prog_easy_6 = new MultipleChoiceQuestion(
                "What is a 'loop' in programming?",
                Arrays.asList("A type of variable", "A way to repeat a block of code multiple times", "A function that performs calculations", "A method for storing data"),
                "A way to repeat a block of code multiple times",
                "Programming",
                "Easy"
        );
        qb.addQuestion(q_prog_easy_6);

        MultipleChoiceQuestion q_prog_easy_7 = new MultipleChoiceQuestion(
                "Which of these is NOT a valid Java access modifier?",
                Arrays.asList("public", "private", "protected", "global"),
                "global",
                "Programming",
                "Easy"
        );
        qb.addQuestion(q_prog_easy_7);

        MultipleChoiceQuestion q_prog_easy_8 = new MultipleChoiceQuestion(
                "What is 'syntax' in programming?",
                Arrays.asList("The meaning of the code", "The set of rules that define the combinations of symbols that are considered to be correctly structured programs", "The speed at which code runs", "The output of a program"),
                "The set of rules that define the combinations of symbols that are considered to be correctly structured programs",
                "Programming",
                "Easy"
        );
        qb.addQuestion(q_prog_easy_8);

        MultipleChoiceQuestion q_prog_easy_9 = new MultipleChoiceQuestion(
                "Which symbol is used to indicate the end of a statement in Java?",
                Arrays.asList(":", ";", ".", ","),
                ";",
                "Programming",
                "Easy"
        );
        qb.addQuestion(q_prog_easy_9);

        MultipleChoiceQuestion q_prog_easy_10 = new MultipleChoiceQuestion(
                "What does 'API' stand for?",
                Arrays.asList("Application Programming Interface", "Advanced Program Integration", "Automated Process Instruction", "Application Performance Indicator"),
                "Application Programming Interface",
                "Programming",
                "Easy"
        );
        qb.addQuestion(q_prog_easy_10);

        // Medium
        MultipleChoiceQuestion q_prog_medium_1 = new MultipleChoiceQuestion(
                "What is 'Object-Oriented Programming' (OOP)?",
                Arrays.asList("A programming paradigm based on the concept of 'objects'", "A method for writing code in a linear fashion", "A way to compile code faster", "A type of database management system"),
                "A programming paradigm based on the concept of 'objects'",
                "Programming",
                "Medium"
        );
        qb.addQuestion(q_prog_medium_1);

        MultipleChoiceQuestion q_prog_medium_2 = new MultipleChoiceQuestion(
                "Which of these is a 'checked exception' in Java?",
                Arrays.asList("NullPointerException", "ArrayIndexOutOfBoundsException", "IOException", "ArithmeticException"),
                "IOException",
                "Programming",
                "Medium"
        );
        qb.addQuestion(q_prog_medium_2);

        MultipleChoiceQuestion q_prog_medium_3 = new MultipleChoiceQuestion(
                "What is 'inheritance' in OOP?",
                Arrays.asList("The ability of an object to take on many forms", "A mechanism where one class acquires the properties and behaviors of another class", "Bundling data and methods into a single unit", "Hiding complex implementation details"),
                "A mechanism where one class acquires the properties and behaviors of another class",
                "Programming",
                "Medium"
        );
        qb.addQuestion(q_prog_medium_3);

        MultipleChoiceQuestion q_prog_medium_4 = new MultipleChoiceQuestion(
                "Which data structure follows the Last-In, First-Out (LIFO) principle?",
                Arrays.asList("Queue", "Stack", "Array", "Linked List"),
                "Stack",
                "Programming",
                "Medium"
        );
        qb.addQuestion(q_prog_medium_4);

        MultipleChoiceQuestion q_prog_medium_5 = new MultipleChoiceQuestion(
                "What is the purpose of the 'finally' block in a try-catch-finally statement?",
                Arrays.asList("To execute code only if an exception occurs", "To execute code only if no exception occurs", "To execute code regardless of whether an exception occurred or not", "To catch specific types of exceptions"),
                "To execute code regardless of whether an exception occurred or not",
                "Programming",
                "Medium"
        );
        qb.addQuestion(q_prog_medium_5);

        MultipleChoiceQuestion q_prog_medium_6 = new MultipleChoiceQuestion(
                "Which keyword is used to prevent a method from being overridden by subclasses in Java?",
                Arrays.asList("static", "abstract", "final", "private"),
                "final",
                "Programming",
                "Medium"
        );
        qb.addQuestion(q_prog_medium_6);

        MultipleChoiceQuestion q_prog_medium_7 = new MultipleChoiceQuestion(
                "What is 'polymorphism' in OOP?",
                Arrays.asList("Bundling data and methods into a single unit", "Hiding complex implementation details", "The ability of an object to take on many forms", "A mechanism where one class acquires properties of another"),
                "The ability of an object to take on many forms",
                "Programming",
                "Medium"
        );
        qb.addQuestion(q_prog_medium_7);

        MultipleChoiceQuestion q_prog_medium_8 = new MultipleChoiceQuestion(
                "What is the difference between '==' and '.equals()' for comparing objects in Java?",
                Arrays.asList("Both compare content", "== compares content, .equals() compares references", "== compares references, .equals() compares content (if overridden)", "Both compare references"),
                "== compares references, .equals() compares content (if overridden)",
                "Programming",
                "Medium"
        );
        qb.addQuestion(q_prog_medium_8);

        MultipleChoiceQuestion q_prog_medium_9 = new MultipleChoiceQuestion(
                "Which of these is a common version control system?",
                Arrays.asList("Jira", "Slack", "Git", "Trello"),
                "Git",
                "Programming",
                "Medium"
        );
        qb.addQuestion(q_prog_medium_9);

        MultipleChoiceQuestion q_prog_medium_10 = new MultipleChoiceQuestion(
                "What is 'recursion' in programming?",
                Arrays.asList("A loop that never ends", "A function that calls itself", "A method for sorting data", "A type of error handling"),
                "A function that calls itself",
                "Programming",
                "Medium"
        );
        qb.addQuestion(q_prog_medium_10);

        // Hard
        MultipleChoiceQuestion q_prog_hard_1 = new MultipleChoiceQuestion(
                "What is 'Garbage Collection' in Java?",
                Arrays.asList("A process that cleans up unused files on the hard drive", "A mechanism that automatically reclaims memory occupied by objects that are no longer referenced", "A tool for debugging memory leaks", "A way to optimize database queries"),
                "A mechanism that automatically reclaims memory occupied by objects that are no longer referenced",
                "Programming",
                "Hard"
        );
        qb.addQuestion(q_prog_hard_1);

        MultipleChoiceQuestion q_prog_hard_2 = new MultipleChoiceQuestion(
                "What is the 'volatile' keyword used for in Java concurrency?",
                Arrays.asList("To make a variable immutable", "To indicate that a variable's value will be modified by different threads and should always be read from main memory", "To prevent a variable from being serialized", "To make a variable accessible only within its class"),
                "To indicate that a variable's value will be modified by different threads and should always be read from main memory",
                "Programming",
                "Hard"
        );
        qb.addQuestion(q_prog_hard_2);

        MultipleChoiceQuestion q_prog_hard_3 = new MultipleChoiceQuestion(
                "What is a 'Deadlock' in multithreading?",
                Arrays.asList("A situation where a thread cannot acquire a lock", "A situation where two or more threads are blocked indefinitely, waiting for each other to release resources", "An error that occurs when a thread tries to access null data", "A method for preventing race conditions"),
                "A situation where two or more threads are blocked indefinitely, waiting for each other to release resources",
                "Programming",
                "Hard"
        );
        qb.addQuestion(q_prog_hard_3);

        MultipleChoiceQuestion q_prog_hard_4 = new MultipleChoiceQuestion(
                "Which design pattern provides a way to access the elements of an aggregate object sequentially without exposing its underlying representation?",
                Arrays.asList("Factory Method", "Singleton", "Observer", "Iterator"),
                "Iterator",
                "Programming",
                "Hard"
        );
        qb.addQuestion(q_prog_hard_4);

        MultipleChoiceQuestion q_prog_hard_5 = new MultipleChoiceQuestion(
                "What is 'Big O notation' used for in algorithm analysis?",
                Arrays.asList("To measure the exact execution time of an algorithm", "To describe the worst-case time or space complexity of an algorithm as the input size grows", "To determine the best-case scenario for an algorithm", "To calculate the average performance of an algorithm"),
                "To describe the worst-case time or space complexity of an algorithm as the input size grows",
                "Programming",
                "Hard"
        );
        qb.addQuestion(q_prog_hard_5);

        MultipleChoiceQuestion q_prog_hard_6 = new MultipleChoiceQuestion(
                "What is 'Dependency Injection'?",
                Arrays.asList("A technique for making code more dependent on other modules", "A design pattern in which a class receives its dependencies from external sources rather than creating them itself", "A method for injecting malicious code into a program", "A way to reduce the number of classes in a project"),
                "A design pattern in which a class receives its dependencies from external sources rather than creating them itself",
                "Programming",
                "Hard"
        );
        qb.addQuestion(q_prog_hard_6);

        MultipleChoiceQuestion q_prog_hard_7 = new MultipleChoiceQuestion(
                "Which of these is a characteristic of a 'pure function' in functional programming?",
                Arrays.asList("It has side effects", "It always returns the same output for the same input and has no side effects", "It modifies external state", "It relies on global variables"),
                "It always returns the same output for the same input and has no side effects",
                "Programming",
                "Hard"
        );
        qb.addQuestion(q_prog_hard_7);

        MultipleChoiceQuestion q_prog_hard_8 = new MultipleChoiceQuestion(
                "What is 'Reflection' in Java?",
                Arrays.asList("The ability of a program to execute code dynamically", "The ability of a program to examine or modify its own structure and behavior at runtime", "A method for creating mirror images of objects", "A technique for optimizing code performance"),
                "The ability of a program to examine or modify its own structure and behavior at runtime",
                "Programming",
                "Hard"
        );
        qb.addQuestion(q_prog_hard_8);

        MultipleChoiceQuestion q_prog_hard_9 = new MultipleChoiceQuestion(
                "What is 'Memoization' in programming?",
                Arrays.asList("A technique for storing data in a temporary memory location", "An optimization technique used primarily to speed up computer programs by storing the results of expensive function calls and returning the cached result when the same inputs occur again", "A method for encrypting data", "A process of converting code into machine language"),
                "An optimization technique used primarily to speed up computer programs by storing the results of expensive function calls and returning the cached result when the same inputs occur again",
                "Programming",
                "Hard"
        );
        qb.addQuestion(q_prog_hard_9);

        MultipleChoiceQuestion q_prog_hard_10 = new MultipleChoiceQuestion(
                "Which type of testing verifies that individual units or components of a software are working as expected?",
                Arrays.asList("Integration Testing", "System Testing", "Unit Testing", "Acceptance Testing"),
                "Unit Testing",
                "Programming",
                "Hard"
        );
        qb.addQuestion(q_prog_hard_10);

        // --- Algorithms Questions ---
        // Easy
        MultipleChoiceQuestion q_algo_easy_1 = new MultipleChoiceQuestion(
                "Which sorting algorithm repeatedly steps through the list, compares adjacent elements and swaps them if they are in the wrong order?",
                Arrays.asList("Merge Sort", "Quick Sort", "Bubble Sort", "Insertion Sort"),
                "Bubble Sort",
                "Algorithms",
                "Easy"
        );
        qb.addQuestion(q_algo_easy_1);

        MultipleChoiceQuestion q_algo_easy_2 = new MultipleChoiceQuestion(
                "What is the process of finding a specific item in a collection of items?",
                Arrays.asList("Sorting", "Searching", "Hashing", "Traversal"),
                "Searching",
                "Algorithms",
                "Easy"
        );
        qb.addQuestion(q_algo_easy_2);

        MultipleChoiceQuestion q_algo_easy_3 = new MultipleChoiceQuestion(
                "Which algorithm is used to find the shortest path between nodes in a graph?",
                Arrays.asList("Breadth-First Search (BFS)", "Depth-First Search (DFS)", "Dijkstra's Algorithm", "Prim's Algorithm"),
                "Dijkstra's Algorithm",
                "Algorithms",
                "Easy"
        );
        qb.addQuestion(q_algo_easy_3);

        MultipleChoiceQuestion q_algo_easy_4 = new MultipleChoiceQuestion(
                "What is a 'stack' data structure known for?",
                Arrays.asList("First-In, First-Out (FIFO)", "Last-In, First-Out (LIFO)", "Random Access", "Direct Access"),
                "Last-In, First-Out (LIFO)",
                "Algorithms",
                "Easy"
        );
        qb.addQuestion(q_algo_easy_4);

        MultipleChoiceQuestion q_algo_easy_5 = new MultipleChoiceQuestion(
                "Which algorithm works by repeatedly picking the smallest element from the unsorted part and putting it at the beginning?",
                Arrays.asList("Bubble Sort", "Insertion Sort", "Selection Sort", "Merge Sort"),
                "Selection Sort",
                "Algorithms",
                "Easy"
        );
        qb.addQuestion(q_algo_easy_5);

        MultipleChoiceQuestion q_algo_easy_6 = new MultipleChoiceQuestion(
                "What is the term for an algorithm that solves problems by breaking them down into smaller subproblems?",
                Arrays.asList("Greedy Algorithm", "Dynamic Programming", "Divide and Conquer", "Backtracking"),
                "Divide and Conquer",
                "Algorithms",
                "Easy"
        );
        qb.addQuestion(q_algo_easy_6);

        MultipleChoiceQuestion q_algo_easy_7 = new MultipleChoiceQuestion(
                "Which search algorithm works by repeatedly dividing the search interval in half?",
                Arrays.asList("Linear Search", "Binary Search", "Hash Search", "Jump Search"),
                "Binary Search",
                "Algorithms",
                "Easy"
        );
        qb.addQuestion(q_algo_easy_7);

        MultipleChoiceQuestion q_algo_easy_8 = new MultipleChoiceQuestion(
                "What is a 'queue' data structure known for?",
                Arrays.asList("Last-In, First-Out (LIFO)", "First-In, First-Out (FIFO)", "Random Access", "Direct Access"),
                "First-In, First-Out (FIFO)",
                "Algorithms",
                "Easy"
        );
        qb.addQuestion(q_algo_easy_8);

        MultipleChoiceQuestion q_algo_easy_9 = new MultipleChoiceQuestion(
                "Which algorithm is commonly used to traverse or search tree or graph data structures?",
                Arrays.asList("Bubble Sort", "Linear Search", "Breadth-First Search (BFS)", "Quick Sort"),
                "Breadth-First Search (BFS)",
                "Algorithms",
                "Easy"
        );
        qb.addQuestion(q_algo_easy_9);

        MultipleChoiceQuestion q_algo_easy_10 = new MultipleChoiceQuestion(
                "What is the process of arranging data in a specific order?",
                Arrays.asList("Searching", "Sorting", "Hashing", "Traversal"),
                "Sorting",
                "Algorithms",
                "Easy"
        );
        qb.addQuestion(q_algo_easy_10);

        // Medium
        MultipleChoiceQuestion q_algo_medium_1 = new MultipleChoiceQuestion(
                "Which sorting algorithm uses a 'pivot' element to partition the array into two sub-arrays?",
                Arrays.asList("Merge Sort", "Insertion Sort", "Quick Sort", "Heap Sort"),
                "Quick Sort",
                "Algorithms",
                "Medium"
        );
        qb.addQuestion(q_algo_medium_1);

        MultipleChoiceQuestion q_algo_medium_2 = new MultipleChoiceQuestion(
                "What is 'Dynamic Programming'?",
                Arrays.asList("A method for solving problems by breaking them into smaller overlapping subproblems and storing the results", "A technique for designing algorithms that always make the locally optimal choice", "A way to sort data in linear time", "A search algorithm for graphs"),
                "A method for solving problems by breaking them into smaller overlapping subproblems and storing the results",
                "Algorithms",
                "Medium"
        );
        qb.addQuestion(q_algo_medium_2);

        MultipleChoiceQuestion q_algo_medium_3 = new MultipleChoiceQuestion(
                "Which algorithm is used to find the minimum spanning tree of a connected, undirected graph?",
                Arrays.asList("Dijkstra's Algorithm", "Bellman-Ford Algorithm", "Prim's Algorithm", "Floyd-Warshall Algorithm"),
                "Prim's Algorithm",
                "Algorithms",
                "Medium"
        );
        qb.addQuestion(q_algo_medium_3);

        MultipleChoiceQuestion q_algo_medium_4 = new MultipleChoiceQuestion(
                "What is the time complexity of searching an element in a balanced Binary Search Tree (BST)?",
                Arrays.asList("O(1)", "O(log n)", "O(n)", "O(n log n)"),
                "O(log n)",
                "Algorithms",
                "Medium"
        );
        qb.addQuestion(q_algo_medium_4);

        MultipleChoiceQuestion q_algo_medium_5 = new MultipleChoiceQuestion(
                "Which algorithm is a comparison-based sorting algorithm that uses the divide and conquer paradigm?",
                Arrays.asList("Bubble Sort", "Insertion Sort", "Selection Sort", "Merge Sort"),
                "Merge Sort",
                "Algorithms",
                "Medium"
        );
        qb.addQuestion(q_algo_medium_5);

        MultipleChoiceQuestion q_algo_medium_6 = new MultipleChoiceQuestion(
                "What is a 'Hash Table' primarily used for?",
                Arrays.asList("Storing data in sorted order", "Efficiently storing and retrieving data using a key-value pair", "Representing hierarchical data", "Performing complex mathematical calculations"),
                "Efficiently storing and retrieving data using a key-value pair",
                "Algorithms",
                "Medium"
        );
        qb.addQuestion(q_algo_medium_6);

        MultipleChoiceQuestion q_algo_medium_7 = new MultipleChoiceQuestion(
                "Which algorithm finds the shortest paths from a single source vertex to all other vertices in a graph with non-negative edge weights?",
                Arrays.asList("Bellman-Ford Algorithm", "Floyd-Warshall Algorithm", "Dijkstra's Algorithm", "A* Search Algorithm"),
                "Dijkstra's Algorithm",
                "Algorithms",
                "Medium"
        );
        qb.addQuestion(q_algo_medium_7);

        MultipleChoiceQuestion q_algo_medium_8 = new MultipleChoiceQuestion(
                "What is 'Backtracking' in algorithm design?",
                Arrays.asList("A technique for optimizing recursive calls", "A general algorithm for finding all (or some) solutions to computational problems, by incrementally building candidates to the solutions, and abandoning a candidate ('backtracking') as soon as it determines that the candidate cannot possibly be completed to a valid solution", "A method for sorting elements in reverse order", "A strategy for parallelizing computations"),
                "A general algorithm for finding all (or some) solutions to computational problems, by incrementally building candidates to the solutions, and abandoning a candidate ('backtracking') as soon as it determines that the candidate cannot possibly be completed to a valid solution",
                "Algorithms",
                "Medium"
        );
        qb.addQuestion(q_algo_medium_8);

        MultipleChoiceQuestion q_algo_medium_9 = new MultipleChoiceQuestion(
                "What is the worst-case time complexity of Quick Sort?",
                Arrays.asList("O(n)", "O(n log n)", "O(n^2)", "O(log n)"),
                "O(n^2)",
                "Algorithms",
                "Medium"
        );
        qb.addQuestion(q_algo_medium_9);

        MultipleChoiceQuestion q_algo_medium_10 = new MultipleChoiceQuestion(
                "Which data structure is best suited for representing hierarchical relationships?",
                Arrays.asList("Array", "Linked List", "Tree", "Graph"),
                "Tree",
                "Algorithms",
                "Medium"
        );
        qb.addQuestion(q_algo_medium_10);

        // Hard
        MultipleChoiceQuestion q_algo_hard_1 = new MultipleChoiceQuestion(
                "Which algorithm is used to find the maximum flow in a flow network?",
                Arrays.asList("Dijkstra's Algorithm", "Kruskal's Algorithm", "Ford-Fulkerson Algorithm", "Prim's Algorithm"),
                "Ford-Fulkerson Algorithm",
                "Algorithms",
                "Hard"
        );
        qb.addQuestion(q_algo_hard_1);

        MultipleChoiceQuestion q_algo_hard_2 = new MultipleChoiceQuestion(
                "What is the 'Traveling Salesperson Problem' (TSP) an example of?",
                Arrays.asList("A sorting problem", "A graph traversal problem", "An NP-hard optimization problem", "A string matching problem"),
                "An NP-hard optimization problem",
                "Algorithms",
                "Hard"
        );
        qb.addQuestion(q_algo_hard_2);

        MultipleChoiceQuestion q_algo_hard_3 = new MultipleChoiceQuestion(
                "Which algorithm is a linear time sorting algorithm that sorts elements by processing digits from least significant to most significant?",
                Arrays.asList("Quick Sort", "Merge Sort", "Radix Sort", "Counting Sort"),
                "Radix Sort",
                "Algorithms",
                "Hard"
        );
        qb.addQuestion(q_algo_hard_3);

        MultipleChoiceQuestion q_algo_hard_4 = new MultipleChoiceQuestion(
                "What is the 'P vs NP' problem in theoretical computer science?",
                Arrays.asList("A problem about parallel computing", "A fundamental unsolved problem concerning whether every problem whose solution can be quickly verified can also be quickly found", "A problem related to network protocols", "A question about quantum computing"),
                "A fundamental unsolved problem concerning whether every problem whose solution can be quickly verified can also be quickly found",
                "Algorithms",
                "Hard"
        );
        qb.addQuestion(q_algo_hard_4);

        MultipleChoiceQuestion q_algo_hard_5 = new MultipleChoiceQuestion(
                "Which algorithm is used for finding patterns within a text (string matching)?",
                Arrays.asList("Knuth-Morris-Pratt (KMP) algorithm", "Boyer-Moore algorithm", "Rabin-Karp algorithm", "All of the above"),
                "All of the above",
                "Algorithms",
                "Hard"
        );
        qb.addQuestion(q_algo_hard_5);

        MultipleChoiceQuestion q_algo_hard_6 = new MultipleChoiceQuestion(
                "What is a 'Trie' (prefix tree) data structure primarily optimized for?",
                Arrays.asList("Storing numerical data", "Efficient retrieval of keys that share common prefixes", "Representing graphs", "Implementing queues"),
                "Efficient retrieval of keys that share common prefixes",
                "Algorithms",
                "Hard"
        );
        qb.addQuestion(q_algo_hard_6);

        MultipleChoiceQuestion q_algo_hard_7 = new MultipleChoiceQuestion(
                "Which algorithm solves the 'All-Pairs Shortest Path' problem in a weighted graph?",
                Arrays.asList("Dijkstra's Algorithm", "Bellman-Ford Algorithm", "Floyd-Warshall Algorithm", "A* Search Algorithm"),
                "Floyd-Warshall Algorithm",
                "Algorithms",
                "Hard"
        );
        qb.addQuestion(q_algo_hard_7);

        MultipleChoiceQuestion q_algo_hard_8 = new MultipleChoiceQuestion(
                "What is 'Amortized Analysis' in algorithm complexity?",
                Arrays.asList("Analyzing the average case performance of an algorithm", "Analyzing the worst-case performance of an algorithm over a sequence of operations", "Analyzing the best-case performance of an algorithm", "Analyzing algorithms that use approximation techniques"),
                "Analyzing the worst-case performance of an algorithm over a sequence of operations",
                "Algorithms",
                "Hard"
        );
        qb.addQuestion(q_algo_hard_8);

        MultipleChoiceQuestion q_algo_hard_9 = new MultipleChoiceQuestion(
                "Which algorithm is a greedy algorithm used to find a minimum spanning tree for a connected weighted graph?",
                Arrays.asList("Dijkstra's Algorithm", "Kruskal's Algorithm", "Bellman-Ford Algorithm", "Prim's Algorithm"),
                "Kruskal's Algorithm",
                "Algorithms",
                "Hard"
        );
        qb.addQuestion(q_algo_hard_9);

        MultipleChoiceQuestion q_algo_hard_10 = new MultipleChoiceQuestion(
                "What is the 'Master Theorem' used for?",
                Arrays.asList("Solving linear equations", "Analyzing the time complexity of recursive algorithms (divide and conquer)", "Calculating probabilities in algorithms", "Designing optimal data structures"),
                "Analyzing the time complexity of recursive algorithms (divide and conquer)",
                "Algorithms",
                "Hard"
        );
        qb.addQuestion(q_algo_hard_10);

        // --- Data Science Questions ---
        // Easy
        MultipleChoiceQuestion q_ds_easy_1 = new MultipleChoiceQuestion(
                "What is 'Data Science' primarily concerned with?",
                Arrays.asList("Writing computer programs", "Extracting knowledge and insights from data", "Designing computer hardware", "Building websites"),
                "Extracting knowledge and insights from data",
                "Data Science",
                "Easy"
        );
        qb.addQuestion(q_ds_easy_1);

        MultipleChoiceQuestion q_ds_easy_2 = new MultipleChoiceQuestion(
                "Which programming language is widely used in Data Science for data analysis and visualization?",
                Arrays.asList("Java", "C++", "Python", "HTML"),
                "Python",
                "Data Science",
                "Easy"
        );
        qb.addQuestion(q_ds_easy_2);

        MultipleChoiceQuestion q_ds_easy_3 = new MultipleChoiceQuestion(
                "What is a 'dataset' in Data Science?",
                Arrays.asList("A single piece of data", "A collection of related data", "A software program", "A type of algorithm"),
                "A collection of related data",
                "Data Science",
                "Easy"
        );
        qb.addQuestion(q_ds_easy_3);

        MultipleChoiceQuestion q_ds_easy_4 = new MultipleChoiceQuestion(
                "Which of these is a common step in the data science workflow?",
                Arrays.asList("Data Entry", "Data Cleaning", "Data Printing", "Data Deletion"),
                "Data Cleaning",
                "Data Science",
                "Easy"
        );
        qb.addQuestion(q_ds_easy_4);

        MultipleChoiceQuestion q_ds_easy_5 = new MultipleChoiceQuestion(
                "What does 'EDA' stand for in Data Science?",
                Arrays.asList("Efficient Data Analysis", "Exploratory Data Analysis", "External Data Access", "Essential Data Algorithms"),
                "Exploratory Data Analysis",
                "Data Science",
                "Easy"
        );
        qb.addQuestion(q_ds_easy_5);

        MultipleChoiceQuestion q_ds_easy_6 = new MultipleChoiceQuestion(
                "Which type of chart is best for showing the distribution of a single numerical variable?",
                Arrays.asList("Bar Chart", "Line Chart", "Histogram", "Pie Chart"),
                "Histogram",
                "Data Science",
                "Easy"
        );
        qb.addQuestion(q_ds_easy_6);

        MultipleChoiceQuestion q_ds_easy_7 = new MultipleChoiceQuestion(
                "What is 'Machine Learning' a subset of?",
                Arrays.asList("Artificial Intelligence", "Web Development", "Database Management", "Graphic Design"),
                "Artificial Intelligence",
                "Data Science",
                "Easy"
        );
        qb.addQuestion(q_ds_easy_7);

        MultipleChoiceQuestion q_ds_easy_8 = new MultipleChoiceQuestion(
                "Which term refers to the process of preparing raw data for analysis?",
                Arrays.asList("Data Mining", "Data Modeling", "Data Preprocessing", "Data Visualization"),
                "Data Preprocessing",
                "Data Science",
                "Easy"
        );
        qb.addQuestion(q_ds_easy_8);

        MultipleChoiceQuestion q_ds_easy_9 = new MultipleChoiceQuestion(
                "What is the purpose of a 'regression' model in Machine Learning?",
                Arrays.asList("To classify data into categories", "To predict a continuous numerical value", "To group similar data points", "To find associations between data items"),
                "To predict a continuous numerical value",
                "Data Science",
                "Easy"
        );
        qb.addQuestion(q_ds_easy_9);

        MultipleChoiceQuestion q_ds_easy_10 = new MultipleChoiceQuestion(
                "Which statistical measure describes the most frequent value in a dataset?",
                Arrays.asList("Mean", "Median", "Mode", "Range"),
                "Mode",
                "Data Science",
                "Easy"
        );
        qb.addQuestion(q_ds_easy_10);

        // Medium
        MultipleChoiceQuestion q_ds_medium_1 = new MultipleChoiceQuestion(
                "Which type of Machine Learning involves training a model on labeled data?",
                Arrays.asList("Unsupervised Learning", "Reinforcement Learning", "Supervised Learning", "Semi-supervised Learning"),
                "Supervised Learning",
                "Data Science",
                "Medium"
        );
        qb.addQuestion(q_ds_medium_1);

        MultipleChoiceQuestion q_ds_medium_2 = new MultipleChoiceQuestion(
                "What is 'Feature Engineering' in Machine Learning?",
                Arrays.asList("The process of selecting the best machine learning model", "The process of creating new features or transforming existing ones to improve model performance", "The process of deploying a machine learning model", "The process of evaluating model accuracy"),
                "The process of creating new features or transforming existing ones to improve model performance",
                "Data Science",
                "Medium"
        );
        qb.addQuestion(q_ds_medium_2);

        MultipleChoiceQuestion q_ds_medium_3 = new MultipleChoiceQuestion(
                "Which statistical test is used to determine if there is a significant difference between the means of two groups?",
                Arrays.asList("Chi-squared test", "ANOVA", "T-test", "Correlation coefficient"),
                "T-test",
                "Data Science",
                "Medium"
        );
        qb.addQuestion(q_ds_medium_3);

        MultipleChoiceQuestion q_ds_medium_4 = new MultipleChoiceQuestion(
                "What is 'Bias-Variance Trade-off' in Machine Learning?",
                Arrays.asList("A trade-off between model speed and memory usage", "A conflict in trying to minimize two sources of error (bias and variance) that prevent supervised learning algorithms from generalizing beyond their training set", "A balance between data cleaning and data visualization", "A trade-off between model complexity and interpretability"),
                "A conflict in trying to minimize two sources of error (bias and variance) that prevent supervised learning algorithms from generalizing beyond their training set",
                "Data Science",
                "Medium"
        );
        qb.addQuestion(q_ds_medium_4);

        MultipleChoiceQuestion q_ds_medium_5 = new MultipleChoiceQuestion(
                "Which data visualization technique is best for showing relationships between multiple variables in a dataset?",
                Arrays.asList("Scatter Plot", "Bar Chart", "Pie Chart", "Heatmap"),
                "Heatmap",
                "Data Science",
                "Medium"
        );
        qb.addQuestion(q_ds_medium_5);

        MultipleChoiceQuestion q_ds_medium_6 = new MultipleChoiceQuestion(
                "What is 'Overfitting' in Machine Learning?",
                Arrays.asList("When a model performs poorly on training data", "When a model learns the training data too well, including noise, and performs poorly on new data", "When a model is too simple to capture the underlying patterns", "When a model runs out of memory"),
                "When a model learns the training data too well, including noise, and performs poorly on new data",
                "Data Science",
                "Medium"
        );
        qb.addQuestion(q_ds_medium_6);

        MultipleChoiceQuestion q_ds_medium_7 = new MultipleChoiceQuestion(
                "Which Python library is commonly used for numerical operations and array manipulation in Data Science?",
                Arrays.asList("Pandas", "Matplotlib", "NumPy", "Scikit-learn"),
                "NumPy",
                "Data Science",
                "Medium"
        );
        qb.addQuestion(q_ds_medium_7);

        MultipleChoiceQuestion q_ds_medium_8 = new MultipleChoiceQuestion(
                "What is 'Clustering' in Machine Learning?",
                Arrays.asList("A supervised learning technique for classification", "An unsupervised learning technique for grouping similar data points", "A technique for predicting continuous values", "A method for reducing data dimensionality"),
                "An unsupervised learning technique for grouping similar data points",
                "Data Science",
                "Medium"
        );
        qb.addQuestion(q_ds_medium_8);

        MultipleChoiceQuestion q_ds_medium_9 = new MultipleChoiceQuestion(
                "Which metric is used to evaluate the performance of a classification model, representing the proportion of true positives among all positive predictions?",
                Arrays.asList("Accuracy", "Precision", "Recall", "F1-score"),
                "Precision",
                "Data Science",
                "Medium"
        );
        qb.addQuestion(q_ds_medium_9);

        MultipleChoiceQuestion q_ds_medium_10 = new MultipleChoiceQuestion(
                "What is the 'Central Limit Theorem'?",
                Arrays.asList("A theorem about the distribution of prime numbers", "A theorem stating that the distribution of sample means approaches a normal distribution as the sample size increases, regardless of the population's distribution", "A theorem used to calculate confidence intervals", "A theorem that describes the relationship between mean, median, and mode"),
                "A theorem stating that the distribution of sample means approaches a normal distribution as the sample size increases, regardless of the population's distribution",
                "Data Science",
                "Medium"
        );
        qb.addQuestion(q_ds_medium_10);

        // Hard
        MultipleChoiceQuestion q_ds_hard_1 = new MultipleChoiceQuestion(
                "Which technique is used to handle 'missing values' in a dataset by filling them with estimated values?",
                Arrays.asList("Outlier detection", "Feature scaling", "Imputation", "Normalization"),
                "Imputation",
                "Data Science",
                "Hard"
        );
        qb.addQuestion(q_ds_hard_1);

        MultipleChoiceQuestion q_ds_hard_2 = new MultipleChoiceQuestion(
                "What is 'Regularization' in Machine Learning?",
                Arrays.asList("A technique to make models more complex", "A set of techniques used to prevent overfitting by adding a penalty to the loss function", "A method for speeding up model training", "A process for selecting the best features"),
                "A set of techniques used to prevent overfitting by adding a penalty to the loss function",
                "Data Science",
                "Hard"
        );
        qb.addQuestion(q_ds_hard_2);

        MultipleChoiceQuestion q_ds_hard_3 = new MultipleChoiceQuestion(
                "Which type of neural network is particularly well-suited for processing sequential data like natural language or time series?",
                Arrays.asList("Convolutional Neural Network (CNN)", "Recurrent Neural Network (RNN)", "Feedforward Neural Network", "Generative Adversarial Network (GAN)"),
                "Recurrent Neural Network (RNN)",
                "Data Science",
                "Hard"
        );
        qb.addQuestion(q_ds_hard_3);

        MultipleChoiceQuestion q_ds_hard_4 = new MultipleChoiceQuestion(
                "What is 'Cross-validation' primarily used for in Machine Learning?",
                Arrays.asList("To increase the amount of training data", "To evaluate the performance of a machine learning model on an independent dataset and assess its generalization ability", "To reduce the dimensionality of data", "To visualize complex data patterns"),
                "To evaluate the performance of a machine learning model on an independent dataset and assess its generalization ability",
                "Data Science",
                "Hard"
        );
        qb.addQuestion(q_ds_hard_4);

        MultipleChoiceQuestion q_ds_hard_5 = new MultipleChoiceQuestion(
                "Which statistical method is used to model the relationship between a dependent variable and one or more independent variables?",
                Arrays.asList("Clustering", "Classification", "Regression Analysis", "Dimensionality Reduction"),
                "Regression Analysis",
                "Data Science",
                "Hard"
        );
        qb.addQuestion(q_ds_hard_5);

        MultipleChoiceQuestion q_ds_hard_6 = new MultipleChoiceQuestion(
                "What is 'A/B Testing' primarily used for?",
                Arrays.asList("To compare the performance of two different algorithms", "To test two versions of a product or feature against each other to determine which performs better", "To evaluate the accuracy of a predictive model", "To clean and preprocess large datasets"),
                "To test two versions of a product or feature against each other to determine which performs better",
                "Data Science",
                "Hard"
        );
        qb.addQuestion(q_ds_hard_6);

        MultipleChoiceQuestion q_ds_hard_7 = new MultipleChoiceQuestion(
                "Which Python library is a powerful tool for data manipulation and analysis, especially with tabular data (DataFrames)?",
                Arrays.asList("NumPy", "Matplotlib", "Pandas", "Seaborn"),
                "Pandas",
                "Data Science",
                "Hard"
        );
        qb.addQuestion(q_ds_hard_7);

        MultipleChoiceQuestion q_ds_hard_8 = new MultipleChoiceQuestion(
                "What is 'Ensemble Learning' in Machine Learning?",
                Arrays.asList("Training a single, very complex model", "Combining multiple machine learning models to achieve better predictive performance than any single model", "Learning from a very large dataset", "A technique for feature selection"),
                "Combining multiple machine learning models to achieve better predictive performance than any single model",
                "Data Science",
                "Hard"
        );
        qb.addQuestion(q_ds_hard_8);

        MultipleChoiceQuestion q_ds_hard_9 = new MultipleChoiceQuestion(
                "Which metric is used to evaluate the performance of a regression model, representing the average of the squared differences between predicted and actual values?",
                Arrays.asList("R-squared", "Mean Absolute Error (MAE)", "Mean Squared Error (MSE)", "Root Mean Squared Error (RMSE)"),
                "Mean Squared Error (MSE)",
                "Data Science",
                "Hard"
        );
        qb.addQuestion(q_ds_hard_9);

        MultipleChoiceQuestion q_ds_hard_10 = new MultipleChoiceQuestion(
                "What is 'Dimensionality Reduction' in Data Science?",
                Arrays.asList("Increasing the number of features in a dataset", "Reducing the number of random variables under consideration by obtaining a set of principal variables", "Making a model more complex", "Adding noise to a dataset"),
                "Reducing the number of random variables under consideration by obtaining a set of principal variables",
                "Data Science",
                "Hard"
        );
        qb.addQuestion(q_ds_hard_10);

        // --- Geography Questions ---
        // Easy
        MultipleChoiceQuestion q_geo_easy_1 = new MultipleChoiceQuestion(
                "What is the capital city of Japan?",
                Arrays.asList("Beijing", "Seoul", "Tokyo", "Bangkok"),
                "Tokyo",
                "Geography",
                "Easy"
        );
        qb.addQuestion(q_geo_easy_1);

        MultipleChoiceQuestion q_geo_easy_2 = new MultipleChoiceQuestion(
                "Which continent is the largest by land area?",
                Arrays.asList("Africa", "Europe", "Asia", "North America"),
                "Asia",
                "Geography",
                "Easy"
        );
        qb.addQuestion(q_geo_easy_2);

        MultipleChoiceQuestion q_geo_easy_3 = new MultipleChoiceQuestion(
                "What is the longest river in the world?",
                Arrays.asList("Amazon River", "Nile River", "Yangtze River", "Mississippi River"),
                "Nile River",
                "Geography",
                "Easy"
        );
        qb.addQuestion(q_geo_easy_3);

        MultipleChoiceQuestion q_geo_easy_4 = new MultipleChoiceQuestion(
                "Which country is known as the 'Land of the Rising Sun'?",
                Arrays.asList("China", "South Korea", "Japan", "Vietnam"),
                "Japan",
                "Geography",
                "Easy"
        );
        qb.addQuestion(q_geo_easy_4);

        MultipleChoiceQuestion q_geo_easy_5 = new MultipleChoiceQuestion(
                "What is the largest ocean on Earth?",
                Arrays.asList("Atlantic Ocean", "Indian Ocean", "Arctic Ocean", "Pacific Ocean"),
                "Pacific Ocean",
                "Geography",
                "Easy"
        );
        qb.addQuestion(q_geo_easy_5);

        MultipleChoiceQuestion q_geo_easy_6 = new MultipleChoiceQuestion(
                "Which desert is the largest hot desert in the world?",
                Arrays.asList("Gobi Desert", "Kalahari Desert", "Sahara Desert", "Arabian Desert"),
                "Sahara Desert",
                "Geography",
                "Easy"
        );
        qb.addQuestion(q_geo_easy_6);

        MultipleChoiceQuestion q_geo_easy_7 = new MultipleChoiceQuestion(
                "What is the capital city of Canada?",
                Arrays.asList("Toronto", "Vancouver", "Montreal", "Ottawa"),
                "Ottawa",
                "Geography",
                "Easy"
        );
        qb.addQuestion(q_geo_easy_7);

        MultipleChoiceQuestion q_geo_easy_8 = new MultipleChoiceQuestion(
                "Which mountain range runs along the western side of South America?",
                Arrays.asList("Rocky Mountains", "Andes Mountains", "Himalayas", "Alps"),
                "Andes Mountains",
                "Geography",
                "Easy"
        );
        qb.addQuestion(q_geo_easy_8);

        MultipleChoiceQuestion q_geo_easy_9 = new MultipleChoiceQuestion(
                "What is the name of the imaginary line that divides the Earth into the Northern and Southern Hemispheres?",
                Arrays.asList("Prime Meridian", "Tropic of Cancer", "Equator", "Arctic Circle"),
                "Equator",
                "Geography",
                "Easy"
        );
        qb.addQuestion(q_geo_easy_9);

        MultipleChoiceQuestion q_geo_easy_10 = new MultipleChoiceQuestion(
                "Which country is famous for its kangaroos and koalas?",
                Arrays.asList("New Zealand", "South Africa", "Australia", "Brazil"),
                "Australia",
                "Geography",
                "Easy"
        );
        qb.addQuestion(q_geo_easy_10);

        // Medium
        MultipleChoiceQuestion q_geo_medium_1 = new MultipleChoiceQuestion(
                "Which strait separates Europe from Africa?",
                Arrays.asList("Strait of Hormuz", "Strait of Malacca", "Strait of Gibraltar", "Bering Strait"),
                "Strait of Gibraltar",
                "Geography",
                "Medium"
        );
        qb.addQuestion(q_geo_medium_1);

        MultipleChoiceQuestion q_geo_medium_2 = new MultipleChoiceQuestion(
                "What is the highest mountain peak in North America?",
                Arrays.asList("Mount Logan", "Mount Rainier", "Denali (Mount McKinley)", "Mount Whitney"),
                "Denali (Mount McKinley)",
                "Geography",
                "Medium"
        );
        qb.addQuestion(q_geo_medium_2);

        MultipleChoiceQuestion q_geo_medium_3 = new MultipleChoiceQuestion(
                "Which sea is located between Europe and Africa?",
                Arrays.asList("Red Sea", "Black Sea", "Mediterranean Sea", "Caspian Sea"),
                "Mediterranean Sea",
                "Geography",
                "Medium"
        );
        qb.addQuestion(q_geo_medium_3);

        MultipleChoiceQuestion q_geo_medium_4 = new MultipleChoiceQuestion(
                "What is the name of the largest rainforest in the world?",
                Arrays.asList("Congo Rainforest", "Daintree Rainforest", "Amazon Rainforest", "Valdivian Temperate Rainforest"),
                "Amazon Rainforest",
                "Geography",
                "Medium"
        );
        qb.addQuestion(q_geo_medium_4);

        MultipleChoiceQuestion q_geo_medium_5 = new MultipleChoiceQuestion(
                "Which country is both an island and a continent?",
                Arrays.asList("Greenland", "Madagascar", "Australia", "Japan"),
                "Australia",
                "Geography",
                "Medium"
        );
        qb.addQuestion(q_geo_medium_5);

        MultipleChoiceQuestion q_geo_medium_6 = new MultipleChoiceQuestion(
                "What is the capital city of Brazil?",
                Arrays.asList("Rio de Janeiro", "São Paulo", "Brasília", "Salvador"),
                "Brasília",
                "Geography",
                "Medium"
        );
        qb.addQuestion(q_geo_medium_6);

        MultipleChoiceQuestion q_geo_medium_7 = new MultipleChoiceQuestion(
                "Which body of water separates the Arabian Peninsula from East Africa?",
                Arrays.asList("Persian Gulf", "Red Sea", "Arabian Sea", "Mediterranean Sea"),
                "Red Sea",
                "Geography",
                "Medium"
        );
        qb.addQuestion(q_geo_medium_7);

        MultipleChoiceQuestion q_geo_medium_8 = new MultipleChoiceQuestion(
                "What is the term for a narrow strip of land connecting two larger landmasses, with water on either side?",
                Arrays.asList("Peninsula", "Archipelago", "Isthmus", "Strait"),
                "Isthmus",
                "Geography",
                "Medium"
        );
        qb.addQuestion(q_geo_medium_8);

        MultipleChoiceQuestion q_geo_medium_9 = new MultipleChoiceQuestion(
                "Which European country is known for its fjords?",
                Arrays.asList("Sweden", "Finland", "Norway", "Denmark"),
                "Norway",
                "Geography",
                "Medium"
        );
        qb.addQuestion(q_geo_medium_9);

        MultipleChoiceQuestion q_geo_medium_10 = new MultipleChoiceQuestion(
                "What is the largest freshwater lake by surface area in the world?",
                Arrays.asList("Lake Superior", "Lake Victoria", "Lake Baikal", "Caspian Sea"),
                "Lake Superior",
                "Geography",
                "Medium"
        );
        qb.addQuestion(q_geo_medium_10);

        // Hard
        MultipleChoiceQuestion q_geo_hard_1 = new MultipleChoiceQuestion(
                "Which mountain range forms a natural border between Europe and Asia?",
                Arrays.asList("Alps", "Pyrenees", "Urals", "Caucasus"),
                "Urals",
                "Geography",
                "Hard"
        );
        qb.addQuestion(q_geo_hard_1);

        MultipleChoiceQuestion q_geo_hard_2 = new MultipleChoiceQuestion(
                "What is the name of the deepest point in all of Earth's oceans?",
                Arrays.asList("Puerto Rico Trench", "Java Trench", "Mariana Trench", "Kermadec Trench"),
                "Mariana Trench",
                "Geography",
                "Hard"
        );
        qb.addQuestion(q_geo_hard_2);

        MultipleChoiceQuestion q_geo_hard_3 = new MultipleChoiceQuestion(
                "Which country is the only one in the world that lies entirely in the Southern Hemisphere and is also an island continent?",
                Arrays.asList("New Zealand", "Madagascar", "Australia", "Indonesia"),
                "Australia",
                "Geography",
                "Hard"
        );
        qb.addQuestion(q_geo_hard_3);

        MultipleChoiceQuestion q_geo_hard_4 = new MultipleChoiceQuestion(
                "What is the name of the narrow waterway that separates the North Island and South Island of New Zealand?",
                Arrays.asList("Cook Strait", "Foveaux Strait", "Tasman Sea", "Bass Strait"),
                "Cook Strait",
                "Geography",
                "Hard"
        );
        qb.addQuestion(q_geo_hard_4);

        MultipleChoiceQuestion q_geo_hard_5 = new MultipleChoiceQuestion(
                "Which country has the most natural lakes?",
                Arrays.asList("USA", "Canada", "Russia", "China"),
                "Canada",
                "Geography",
                "Hard"
        );
        qb.addQuestion(q_geo_hard_5);

        MultipleChoiceQuestion q_geo_hard_6 = new MultipleChoiceQuestion(
                "What is the name of the largest coral reef system in the world?",
                Arrays.asList("Belize Barrier Reef", "New Caledonia Barrier Reef", "Great Barrier Reef", "Red Sea Coral Reef"),
                "Great Barrier Reef",
                "Geography",
                "Hard"
        );
        qb.addQuestion(q_geo_hard_6);

        MultipleChoiceQuestion q_geo_hard_7 = new MultipleChoiceQuestion(
                "Which city is located on two continents?",
                Arrays.asList("Rome", "Istanbul", "Cairo", "Moscow"),
                "Istanbul",
                "Geography",
                "Hard"
        );
        qb.addQuestion(q_geo_hard_7);

        MultipleChoiceQuestion q_geo_hard_8 = new MultipleChoiceQuestion(
                "What is the term for a large, naturally occurring formation of ice, typically found in polar and high-mountain regions?",
                Arrays.asList("Iceberg", "Glacier", "Ice Sheet", "Permafrost"),
                "Glacier",
                "Geography",
                "Hard"
        );
        qb.addQuestion(q_geo_hard_8);

        MultipleChoiceQuestion q_geo_hard_9 = new MultipleChoiceQuestion(
                "Which country is home to the most active volcano in the world, Kilauea?",
                Arrays.asList("Japan", "Italy", "United States (Hawaii)", "Indonesia"),
                "United States (Hawaii)",
                "Geography",
                "Hard"
        );
        qb.addQuestion(q_geo_hard_9);

        MultipleChoiceQuestion q_geo_hard_10 = new MultipleChoiceQuestion(
                "What is the name of the largest island in the Mediterranean Sea?",
                Arrays.asList("Crete", "Cyprus", "Sicily", "Sardinia"),
                "Sicily",
                "Geography",
                "Hard"
        );
        qb.addQuestion(q_geo_hard_10);


        System.out.println("Sample questions added to MongoDB.");
    }


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