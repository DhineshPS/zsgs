public class MathOperations {

    static int a;
    static int b;

    static {
        a = 10;
        b = 3;
    }

    public static void main(String[] args) {
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + ((double) a / b));
        System.out.println("Power: " + Math.pow(a, b));
    }
}
