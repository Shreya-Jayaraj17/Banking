import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Welcome to Simple Bank System");

        System.out.print("Enter Account Holder Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Account Number: ");
        String accNo = scanner.nextLine();

        BankAccount account = new BankAccount(name, accNo);

        int choice;
        do {
            System.out.println("\n==== Menu ====");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Check Balance");
            System.out.println("4. View Transaction History");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter amount to deposit: $");
                    double deposit = scanner.nextDouble();
                    account.deposit(deposit);
                }
                case 2 -> {
                    System.out.print("Enter amount to withdraw: $");
                    double withdraw = scanner.nextDouble();
                    account.withdraw(withdraw);
                }
                case 3 -> account.showBalance();
                case 4 -> account.showTransactionHistory();
                case 5 -> System.out.println("Exiting. Thank you!");
                default -> System.out.println("Invalid choice.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
