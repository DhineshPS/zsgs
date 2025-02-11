//Pattern Program
/*
 9 9 9 9 9 9 9 9 9 
  8 8 8 8 8 8 8 8 
   7 7 7 7 7 7 7 
    6 6 6 6 6 6 
     5 5 5 5 5 
      4 4 4 4 
       3 3 3 
        2 2 
         1
 */

package zoho.java.task2;

import java.util.Scanner;

public class Program23 {

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
			for(int spaces = 0; spaces <= n - lines; spaces++)
				System.out.print(" ");
			for(int secondSet = lines; secondSet >= 1; secondSet--)
				System.out.print(lines + " ");
			System.out.println();
		}
	}

}
