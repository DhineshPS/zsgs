package zoho_task2_1;

public class Type_Conversions {
	public static void main(String[] args) {
        // WIDENING (IMPLICIT) CONVERSIONS
        byte byteVal = 10;
        short shortVal = byteVal;  // byte -> short
        int intVal = shortVal;      // short -> int
        long longVal = intVal;      // int -> long
        float floatVal = longVal;   // long -> float
        double doubleVal = floatVal; // float -> double

        System.out.println("Widening Conversions (Implicit):");
        System.out.println("byte to short: " + shortVal);
        System.out.println("short to int: " + intVal);
        System.out.println("int to long: " + longVal);
        System.out.println("long to float: " + floatVal);
        System.out.println("float to double: " + doubleVal);

        // NARROWING (EXPLICIT) CONVERSIONS
        double doubleVal2 = 99.99;
        float floatVal2 = (float) doubleVal2; // double -> float
        long longVal2 = (long) floatVal2;    // float -> long
        int intVal2 = (int) longVal2;        // long -> int
        short shortVal2 = (short) intVal2;   // int -> short
        byte byteVal2 = (byte) shortVal2;    // short -> byte

        System.out.println("\nNarrowing Conversions (Explicit):");
        System.out.println("double to float: " + floatVal2);
        System.out.println("float to long: " + longVal2);
        System.out.println("long to int: " + intVal2);
        System.out.println("int to short: " + shortVal2);
        System.out.println("short to byte: " + byteVal2);

        // CHAR CONVERSIONS
        char charVal = 'A';
        int charToInt = charVal; // char -> int (implicit)
        char intToChar = (char) charToInt; // int -> char (explicit)

        System.out.println("\nCharacter Conversions:");
        System.out.println("char to int: " + charToInt);
        System.out.println("int to char: " + intToChar);
    }
}
