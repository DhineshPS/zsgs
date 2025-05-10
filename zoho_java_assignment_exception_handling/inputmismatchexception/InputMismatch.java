import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String phoneNumber = scanner.next();

        try {
            checkValid(phoneNumber);
            System.out.println("Valid Phone Number!");
        } catch (InputMismatchException e) {
            System.out.println("Phone numbers must contain only 10 digits");
        }
    }

    private static void checkValid(String phoneNumber) throws InputMismatchException{
        if(phoneNumber.length() != 10)
            throw new InputMismatchException();

        for(int i = 0; i < 10; i++) {
            if(phoneNumber.charAt(i) <= '0' && phoneNumber.charAt(i) >= '9')
                throw new InputMismatchException();
        }
    }
}
