
import java.util.Scanner;

public class Multiplication_table {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Table number : ");
        int num = scanner.nextInt();
        System.out.print("Enter Table start : ");
        int tableStart = scanner.nextInt();
        System.out.print("Enter Table end : ");
        int tableEnd = scanner.nextInt();
        System.out.println(num + " Table :");

        for(int i = tableStart; i <= tableEnd; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }
        
    }
}
