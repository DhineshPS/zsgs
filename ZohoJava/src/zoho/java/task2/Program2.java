//2) Write a program to define the functionality of a Bitwise operators.

package zoho.java.task2;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 15, num2 = 8;
		int bitwiseAnd, bitwiseOr, bitwiseXor, leftShift, rightShift, compliment;
		
		bitwiseAnd = num1 & num2;
		bitwiseOr = num1 | num2;
		bitwiseXor = num1 ^ num2;
		leftShift = num1 >> 2;
		rightShift = num2 << 2;
		urightShift = num1 >>> 2;
		compliment = (~num1);
		
		System.out.println("Bitwise And : " + bitwiseAnd + " Bit of answer is 1 if both num1 and num2 bits are 1, else 0");
		System.out.println("Bitwise Or : " + bitwiseOr + " Bit of answer is 1 if anyone of num1 or num2 bits are 1, else 0");
		System.out.println("Bitwise Xor : " + bitwiseXor + " Bit of answer is 1 if both num1 and num2 bits are not equal, else 0");
		System.out.println("Left shift : " + leftShift + " Shifting the binary bits of the number to left by n times");
		System.out.println("Right shift : " + rightShift + " Shifting the binary bits of the number to right by n times");
		System.out.println("Unsigned Right shift : " + urightShift + " Shifting the binary bits of the number to right by n times and left filled with 0's");
		System.out.println("Compliment : " + compliment + " Toggling of bits - 0 to 1 and 1 to 0, and answer is 2's complimented(-(n + 1))");
	}

}
