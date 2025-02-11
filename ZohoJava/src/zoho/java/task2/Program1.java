//1) Write a program to print a letters from the user input character to 'Z' without using
//strings.
//Example 1:  input : X
//Output : XYZ
//Example 2:  Input : M
//Output : MNOPQRSTUWXYZ
package zoho.java.task2;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c = 'M';
		do {
		System.out.print(Character.valueOf(c++));
		}while(c != 'Z' + 1);
	}

}
