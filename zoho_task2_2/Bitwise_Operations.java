import java.util.Scanner;

public class Bitwise_Operations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        //Operations
        System.out.println("Bitwise AND : " + (num1 & num2));
        System.out.println("Bitwise OR : " + (num1 | num2));
        System.out.println("Bitwise XOR : " + (num1 ^ num2));
        System.out.println("Left Shift : " + (num1 << 2));  // multiplies num by 2^n
        System.out.println("Right Shift : " + (num2 >> 2)); // divides num by 2^n
        System.out.println("Unsigned Right Shift : " + (num1 >>> 3)); // right shifts and fills zero, neglects sign
    }
}
