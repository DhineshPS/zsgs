//29) Write a program to print the alphabet 'C' with the stars based on the given numbers
//Eg 1:  Input: 4
//        Output:
//****
//*
//*
//****

package zoho.java.task2;

public class Program29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		pattern(n);
	}
	public static void pattern(int n) {
		for(int i = 0; i < n; i++)
		{
			if(i == 0 || i == n - 1)
				for(int j = 0; j < n - 1; j++)
					System.out.print("*");
			System.out.println("*");
		}
	}
}
