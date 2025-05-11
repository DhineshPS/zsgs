import java.util.Scanner;

public class BankService {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Welcome to Bank");
        System.out.print("Set Pin: ");
        Account userAccount = new Account(scanner.nextLine());

        boolean login = true;
        int choice;

        while (login) {
            System.out.println("\n1. Debit \n2. Credit \n3. Check Balance \n4. Exit \n\nEnter your Choice:");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    if (verifyPin(userAccount)) {
                        System.out.print("Enter amount to debit: ");
                        double amount = scanAmount();
                        userAccount.debitToAccount(amount);
                    }
                }
                case 2 -> {
                    if (verifyPin(userAccount)) {
                        System.out.print("Enter amount to credit: ");
                        double amount = scanAmount();
                        userAccount.creditToAccount(amount);
                    }
                }
                case 3 -> {
                    if (verifyPin(userAccount)) {
                        System.out.println("Current Balance: " + userAccount.getBalance());
                    }
                }
                case 4 -> {
                    login = false;
                    System.out.println("Thank you for using our service!");
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static double scanAmount() {
        try {
            return scanner.nextDouble();
        } catch (Exception e) {
            System.out.println("Invalid amount. Please enter a valid number.");
            scanner.nextLine();
            return 0;
        }
    }

    private static boolean verifyPin(Account account) {
        System.out.print("Enter your PIN: ");
        String enteredPin = scanner.next();
        try {
            account.checkpin(enteredPin);
            return true;
        } catch (WrongPinException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
