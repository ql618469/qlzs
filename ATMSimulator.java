import java.util.Scanner;

public class ATMSimulator {
    public static void main(String[] args) {
        // Initialize account balance
        double balance = 1000.0;
        Scanner scanner = new Scanner(System.in);
        int choice;

        // Main loop to keep ATM running
        do {
            // Display menu
            System.out.println("\n1. Check balance");
            System.out.println("2. Withdraw money");
            System.out.println("3. Deposit money");
            System.out.println("0. Exit");
            System.out.print("Choose action: ");
            choice = scanner.nextInt();

            // Handle user choice with switch case
            switch (choice) {
                case 1:
                    // Check balance
                    System.out.printf("Current balance: %.1f\n", balance);
                    break;
                case 2:
                    // Withdraw money
                    System.out.print("Enter amount: ");
                    double withdrawAmount = scanner.nextDouble();

                    // Validate amount: positive and multiple of 100
                    if (withdrawAmount <= 0) {
                        System.out.println("Error: Amount must be positive.");
                    } else if (withdrawAmount % 100 != 0) {
                        System.out.println("Error: Amount must be a multiple of 100.");
                    } else if (withdrawAmount > balance) {
                        System.out.printf("Error: insufficient funds. Available: %.1f\n", balance);
                    } else {
                        balance -= withdrawAmount;
                        System.out.printf("Withdrawal successful! New balance: %.1f\n", balance);
                    }
                    break;
                case 3:
                    // Deposit money
                    System.out.print("Enter amount: ");
                    double depositAmount = scanner.nextDouble();

                    // Validate deposit amount
                    if (depositAmount <= 0) {
                        System.out.println("Error: Amount must be positive.");
                    } else if (depositAmount % 100 != 0) {
                        System.out.println("Error: Amount must be a multiple of 100.");
                    } else {
                        balance += depositAmount;
                        System.out.printf("Deposit successful! New balance: %.1f\n", balance);
                    }
                    break;
                case 0:
                    // Exit program
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    break;
                default:
                    // Invalid menu choice
                    System.out.println("Error: Invalid option. Please choose 0-3.");
            }
        } while (choice != 0);

        scanner.close();
    }
}