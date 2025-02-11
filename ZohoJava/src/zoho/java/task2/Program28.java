//28) Write a program to find the sum of the series. The series will be like 1 +11 + 111 +
//1111 +.. n terms.
//Eg 1: Input:  Input the number of terms : 5
//Output :
//1 + 11 + 111 + 1111 + 11111
//The Sum is : 12345
//Eg 2: Input:  Input the number of terms : 3
//Output :
//1 + 11 + 111
//The Sum is : 123

package zoho.java.task2;

public class Program28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5;
		int it = 0, ans = 0;
		for(int i = 1; i <= num; i++)
		{
			ans += eleven(i);
		}
		System.out.println(ans);
	}
	
	public static int eleven(int n)
	{
		if(n == 1)
			return 1;
		return 1 + 10 * eleven(n - 1);
	}
}
