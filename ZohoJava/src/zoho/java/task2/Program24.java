//Write a program to make such a pattern like a pyramid with numbers increased by 1.
//Eg:  Input : 10
//Output:
//     1
//    2 3
//  4 5 6
// 7 8 9 10

package zoho.java.task2;

public class Program24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		pattern(n);
	}
	
	public static void pattern(int n) {
		int num = 1, rows = 1;
        while (num <= n) {
            for (int spaces = n - rows; spaces > 0; spaces--) {
                System.out.print(" ");
            }
            for (int i = 0; i < rows && num <= n; i++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
            rows++;
        }
	}

}
