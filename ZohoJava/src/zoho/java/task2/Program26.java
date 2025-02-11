//Pattern program
/*
********************
*********__*********
********____********
*******______*******
******________******
*****__________*****
****____________****
***______________***
**________________**
**________________**
***______________***
****____________****
*****__________*****
******________******
*******______*******
********____********
*********__*********
********************
 */

package zoho.java.task2;

public class Program26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		pattern(n);
	}
	
	public static void pattern(int n) {
		for(int i = 1; i <= n; i++)
		{
				for(int j = i; j <= n; j++)
					System.out.print("*");
				for(int k = 0; k < (i - 1) * 2; k++)
					System.out.print("_");
				for(int j = i; j <= n; j++)
					System.out.print("*");
				
				System.out.println();

		}
		for(int i = n * 2 - 1; i > n; i--)
			{
				for(int j = n; j >= i - n; j--)
					System.out.print("*");
				for(int k = 0; k < (i - n - 1) * 2; k++)
					System.out.print("_");
				for(int j = n; j >= i - n; j--)
					System.out.print("*");
				System.out.println();

			}
	}
}
