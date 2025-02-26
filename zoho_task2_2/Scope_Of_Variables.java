public class Scope_Of_Variables {
    public static void main(String[] args) {
        int outsideVar = 10; // Declared outside the if block (Global to main method)

        if (outsideVar > 5) {
            int insideVar = 20; // Declared inside the if block (Local to if block)
            System.out.println("Inside if block:");
            System.out.println("outsideVar: " + outsideVar); // Accessible
            System.out.println("insideVar: " + insideVar);   // Accessible
        }

        System.out.println("\nOutside if block:");
        System.out.println("outsideVar: " + outsideVar); // Accessible

        System.out.println("insideVar: " + insideVar); // Compiler Error: Cannot find symbol 'insideVar'
    }
}
