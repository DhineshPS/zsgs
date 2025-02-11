//Pattern program
/*
 * * * * * * * * * 
  * * * * * * * * 
   * * * * * * * 
    * * * * * * 
     * * * * * 
      * * * * 
       * * * 
        * * 
         * 

 */
package zoho.java.task2;

import java.util.Scanner;

public class Program22 {

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
			for(int spaces = 1; spaces <= lines; spaces++)
				System.out.print(" ");
			for(int secondSet = n - lines + 1; secondSet >= 1; secondSet--)
				System.out.print("* ");
			System.out.println();
		}
	}

}
