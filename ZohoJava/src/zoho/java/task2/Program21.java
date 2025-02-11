//Pattern Program

/*
 *        9
         898
        78987
       6789876
      567898765
     45678987654
    3456789876543
   234567898765432
  12345678987654321

*/
package zoho.java.task2;

import java.util.Scanner;

public class Program21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the value of n : ");
		int n = scanner.nextInt();
		pattern(n);
		scanner.close();
		
	}
	
	public static void pattern(int n) {
		for(int lines = n; lines >= 1; lines--)
		{
			for(int spaces = lines; spaces >= 0; spaces--)
				System.out.print(" ");
			for(int firstSet = lines; firstSet <= n; firstSet++)
				System.out.print(firstSet);
			if(lines < n)
				for(int secondSet = n - 1; secondSet >= lines; secondSet--)
					System.out.print(secondSet);
			System.out.println();
		}
	}

}
