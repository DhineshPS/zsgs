package zoho_task2_1;

public class Swap_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 8;
		int num2 = 12;
		System.out.println("Before Swapping Type 1 : " + num1 + " " + num2);

		
		// Type 1
		int temp = num1;
		num1 = num2;
		num2 = temp;

		int num3 = 24;
		int num4 = 10;
		System.out.println("SBefore wapping Type 2 : " + num3 + " " + num4);

		
		// Type 2
		num3 ^= num4;
		num4 ^= num3;
		num3 ^= num4;
		
		int num5 = 73;
		int num6 = 34;
		System.out.println("Before Swapping Type 3 : " + num5 + " " + num6);

		
		// Type 3
		num5 = num5 + num6;
		num6 = num5 - num6;
		num5 = num5 - num6;
		
		System.out.println("Swapping Type 1 : " + num1 + " " + num2);
		System.out.println("Swapping Type 2 : " + num3 + " " + num4);
		System.out.println("Swapping Type 3 : " + num5 + " " + num6);

	}

}
