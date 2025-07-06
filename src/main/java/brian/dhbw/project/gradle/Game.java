package brian.dhbw.project.gradle;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // This scanner will use the redirected System.in

        System.out.println("Enter your name: ");
        String playerName = scanner.nextLine();

        System.out.println("Choose a quiz topic:");
        System.out.println("1. Animal");
        System.out.println("2. Planets");
        System.out.println("3. Artificial Intelligence");
        System.out.println("4. General Knowledge");
        System.out.println("5. History");
        System.out.println("6. Science");
        System.out.println("7. Technology");
        System.out.println("8. Mathematics");
        System.out.println("9. Programming");
        System.out.println("10. Algorithms");
        System.out.println("11. Data Science");
        System.out.println("12. Geography");
        int topicChoice = getValidIntInput(scanner, "Enter the number of your choice: ");

        String topic = switch (topicChoice) {
            case 1 -> "Animal";
            case 2 -> "Planets";
            case 3 -> "Artificial Intelligence";
            case 4 -> "General Knowledge";
            case 5 -> "History";
            case 6 -> "Science";
            case 7 -> "Technology";
            case 8 -> "Mathematics";
            case 9 -> "Programming";
            case 10 -> "Algorithms";
            case 11 -> "Data Science";
            case 12 -> "Geography";
            default -> {
                System.out.println("Invalid choice. Defaulting to Animal.");
                yield "Animal";
            }
        };

        System.out.println("Choose a difficulty level:");
        System.out.println("1. Easy");
        System.out.println("2. Medium");
        System.out.println("3. Hard");
        int difficultyChoice = getValidIntInput(scanner, "Enter the number of your choice: ");

        String difficulty;
        switch (difficultyChoice) {
            case 1:
                difficulty = "Easy";
                break;
            case 2:
                difficulty = "Medium";
                break;
            case 3:
                difficulty = "Hard";
                break;
            default:
                System.out.println("Invalid choice. Defaulting to Easy.");
                difficulty = "Easy";
                break;
        }

        // Close scanner
        scanner.close();
    }

    private static int getValidIntInput(Scanner scanner, String prompt) {
        int input;
        while (true) {
            System.out.println(prompt);
            if (scanner.hasNextInt()) {
                input = scanner.nextInt();
                scanner.nextLine();
                break;
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine();
            }
        }
        return input;
    }
}
