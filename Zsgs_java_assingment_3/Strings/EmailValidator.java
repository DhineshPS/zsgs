import java.util.Scanner;

public class EmailValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an email address to validate:");
        String email = scanner.nextLine();

        if (validateEmail(email)) 
            System.out.println("The email address is valid.");
         else 
            System.out.println("The email address is invalid.");
        
    }

    public static boolean validateEmail(String email) {
        int atIndex = email.indexOf('@');

        if (atIndex == -1) 
            return false; 

        String localPart = email.substring(0, atIndex);
        String domainPart = email.substring(atIndex + 1);

        if (localPart.isEmpty() || domainPart.isEmpty()) 
            return false;
        

        int dotIndex = domainPart.lastIndexOf('.');

        if (dotIndex == -1 || dotIndex == 0 || dotIndex == domainPart.length() - 1) 
            return false;
        

        return true;
    }
}