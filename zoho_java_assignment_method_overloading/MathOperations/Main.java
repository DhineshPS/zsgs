public class Main {
    public static void main(String[] args) {
        MathOperations mathOps = new MathOperations();

        System.out.println("Addition:");
        System.out.println("int: " + mathOps.add(5, 3));
        System.out.println("double: " + mathOps.add(5.5, 3.3));
        System.out.println("float: " + mathOps.add(5.5f, 3.3f));
        System.out.println("long: " + mathOps.add(5000000000L, 3000000000L));

        System.out.println("\nSubtraction:");
        System.out.println("int: " + mathOps.subtract(5, 3));
        System.out.println("double: " + mathOps.subtract(5.5, 3.3));
        System.out.println("float: " + mathOps.subtract(5.5f, 3.3f));
        System.out.println("long: " + mathOps.subtract(5000000000L, 3000000000L));

        System.out.println("\nMultiplication:");
        System.out.println("int: " + mathOps.multiply(5, 3));
        System.out.println("double: " + mathOps.multiply(5.5, 3.3));
        System.out.println("float: " + mathOps.multiply(5.5f, 3.3f));
        System.out.println("long: " + mathOps.multiply(5000000000L, 3000000000L));

        System.out.println("\nDivision:");
        System.out.println("int: " + mathOps.divide(6, 3));
        System.out.println("double: " + mathOps.divide(6.6, 3.3));
        System.out.println("float: " + mathOps.divide(6.6f, 3.3f));
        System.out.println("long: " + mathOps.divide(6000000000L, 3000000000L));
    }
}