import java.util.Scanner;

public class MenuDrivenProgram {

    // Method to display the menu options
    public static void displayMenu() {
        System.out.println("Menu:");
        System.out.println("1. Greet User");
        System.out.println("2. Check Even/Odd");
        System.out.println("3. Exit");
        System.out.print("Enter your choice (1-3): ");
    }

    // Method to handle the user's menu choice
    public static void handleMenuChoice(int choice) {
        switch (choice) {
            case 1:
                greetUser();
                break;
            case 2:
                checkEvenOrOdd();
                break;
            case 3:
                System.out.println("Exiting program. Goodbye!");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice. Please enter a valid option (1-3).");
        }
    }

    // Helper method to greet the user
    public static void greetUser() {
        System.out.println("Hello! Welcome!");
    }

    // Helper method to check if the number is even or odd
    public static void checkEvenOrOdd() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        
        if (number % 2 == 0) {
            System.out.println(number + " is an Even number.");
        } else {
            System.out.println(number + " is an Odd number.");
        }
    }

    // Main program flow
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            // Display the menu
            displayMenu();

            // Get user's choice
            int choice = scanner.nextInt();

            // Handle the user's choice
            handleMenuChoice(choice);
        }
    }
}
