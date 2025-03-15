
import java.util.Scanner;

public class Greatest3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 3 numbers : ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int greatest = (num1 > num2 && num2 > num3) ? num1 : (num2 > num3) ? num2 : num3;

        System.out.println("The greatest of 3 numbers is : " + greatest);
    }
}
