import java.util.Scanner;

public class BMICalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your weight in kilograms: ");
        double weight = sc.nextDouble();

        System.out.print("Enter your height in meters: ");
        double height = sc.nextDouble();

        double bmi = calculateBMI(weight, height);
        System.out.printf("Your BMI is: %.2f\n", bmi);
        System.out.println("BMI Category: " + getBMICategory(bmi));

        sc.close();
    }

    public static double calculateBMI(double weight, double height) {
        if (height <= 0) return 0;
        return weight / (height * height);
    }

    public static String getBMICategory(double bmi) {
        if (bmi < 18.5)
            return "Underweight";
        else if (bmi < 24.9)
            return "Normal weight";
        else if (bmi < 29.9)
            return "Overweight";
        else
            return "Obese";
    }
}
