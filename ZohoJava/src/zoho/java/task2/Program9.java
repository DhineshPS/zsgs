//9) Write a program to display the number in reverse order without use of String
//functions.
//Eg 1:  Input: 12345
//Output :The number in reverse order is : 54321
package zoho.java.task2;

public class Program9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 12345;
		System.out.println("Reverse of " + num + " is " + reverse(num, 0));
	}
	
	public static int reverse(int num, int rev) {
		if(num == 0)
			return rev;
		return reverse(num / 10, rev * 10 + num % 10);
	}

}
