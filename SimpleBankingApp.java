import java.util.Scanner;

public class SimpleBankingApp {

    static class BankAccount {
        private double balance;

        public BankAccount() {
            this.balance = 0.0;
        }

        // Deposit money into the account
        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println("Deposited: $" + amount);
            } else {
                System.out.println("Deposit amount must be positive.");
            }
        }

        // Withdraw money from the account
        public void withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                System.out.println("Withdrew: $" + amount);
            } else if (amount <= 0) {
                System.out.println("Withdrawal amount must be positive.");
            } else {
                System.out.println("Insufficient balance.");
            }
        }

        // Check the account balance
        public void checkBalance() {
            System.out.println("Current Balance: $" + balance);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount account = new BankAccount(); // Create a new bank account
        int choice;

        do {
            // Displaying the menu options
            System.out.println("\n--- Simple Banking Application ---");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            // Switch case to handle different choices
            switch (choice) {
                case 1:
                    // Deposit money
                    System.out.print("Enter deposit amount: $");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;

                case 2:
                    // Withdraw money
                    System.out.print("Enter withdrawal amount: $");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;

                case 3:
                    // Check balance
                    account.checkBalance();
                    break;

                case 4:
                    // Exit the program
                    System.out.println("Exiting... Thank you for using Simple Banking Application!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 4); // Keep looping until the user chooses to exit

        scanner.close();
    }
}
