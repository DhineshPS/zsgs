
import java.util.Scanner;

public class Celsius2Fahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in celsius : ");
        double temp = scanner.nextDouble();
        double tempf = (9 / 5.0) * temp + 32;
        System.out.println("Temperature in fahrenheit : " + tempf);
    }
}
