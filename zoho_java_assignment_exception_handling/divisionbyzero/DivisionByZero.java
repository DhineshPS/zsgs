import java.util.Scanner;

public class DivisionByZero {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num1, num2;
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();

        try {
            System.out.println(num1 / num2);
        } catch (ArithmeticException e) {
            System.out.println("Cannot Divide by zero!");
        }
    }
}
