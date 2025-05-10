import java.util.Scanner;

public class BankService {

    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Welcome to Bank");
        System.out.print("Set Pin : ");
    
        Account userAccount = new Account(scanner.nextLine());
        
        boolean login = true;
        int passwordRetries;
        int choice;

        while(login) {
            System.out.println("1. Debit \n2. Credit \n3. Check Balance \n4. Exit \n\n Enter your Choice");
            choice = scanner.nextInt();

            switch(choice) {
                case 1 -> {

                }
            }
        }
    }

    private double scanAmount() {
        return scanner.nextDouble();
    }

    private boolean verifyPin() {
        
    }
}
