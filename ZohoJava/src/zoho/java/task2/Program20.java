//Pattern Program

/*
 *       1
        121
       12321
      1234321
     123454321
    12345654321
   1234567654321
  123456787654321
 12345678987654321
*/
package zoho.java.task2;
import java.util.Scanner;

public class Program20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the value of n : ");
		int n = scanner.nextInt();
		pattern(n);
		scanner.close();
		
	}
	
	public static void pattern(int n) {
		for(int lines = 1; lines <= n; lines++)
		{
			for(int spaces = n - lines; spaces >= 0; spaces--)
				System.out.print(" ");
			for(int firstSet = 1; firstSet <= lines; firstSet++)
				System.out.print(firstSet);
			if(lines > 1)
				for(int secondSet = lines - 1; secondSet >= 1; secondSet--)
					System.out.print(secondSet);
			System.out.println();
		}
	}

}
