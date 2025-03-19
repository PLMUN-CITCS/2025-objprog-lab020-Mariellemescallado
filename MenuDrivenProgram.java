import java.util.Scanner;

public class MenuDrivenProgram {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        
        // Loop to continuously show menu until user chooses to exit
        do {
            displayMenu();
            choice = scanner.nextInt(); // Read user input for menu choice
            handleMenuChoice(choice, scanner); // Process the user's choice
        } while (choice != 3); // Loop continues until the user chooses to exit

        scanner.close();
    }

    // Method to display the menu options
    public static void displayMenu() {
        System.out.println("Menu:");
        System.out.println("1. Greet User");
        System.out.println("2. Check Even/Odd");
        System.out.println("3. Exit");
        System.out.print("Enter your choice (1-3): ");
    }

    // Method to handle the menu choice
    public static void handleMenuChoice(int choice, Scanner scanner) {
        if (choice == 1) {
            greetUser(); // Call greetUser() if choice is 1
        } else if (choice == 2) {
            checkEvenOrOdd(scanner); // Call checkEvenOrOdd() if choice is 2
        } else if (choice == 3) {
            System.out.println("Exiting program. Goodbye!"); // Exit message if choice is 3
        } else {
            System.out.println("Invalid choice. Please choose a valid option (1-3)."); // Error message for invalid choice
        }
    }

    // Helper method to greet the user
    public static void greetUser() {
        System.out.println("Hello! Welcome!");
    }

    // Helper method to check if a number is even or odd
    public static void checkEvenOrOdd(Scanner scanner) {
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt(); // Read the integer input
        if (num % 2 == 0) {
            System.out.println(num + " is an Even number.");
        } else {
            System.out.println(num + " is an Odd number.");
        }
    }
}
