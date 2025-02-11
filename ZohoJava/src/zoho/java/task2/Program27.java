//27) Find if a String2 is substring of String1. If it is, return the index of the first
//occurrence. else return -1.
//Eg 1: Input: String 1: test123string
//          String 2: 123
//         Output: 4
//Eg 2:  Input: String 1: testing12
//         String 2: 1234
//         Output: -1

package zoho.java.task2;

public class Program27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "test123string";
		String str2 = "123";
		boolean isFound = false;
		for(int i = 0; i < str1.length() - str2.length(); i++)
		{
			if(str1.substring(i, i + str2.length()).equals(str2))
			{
				System.out.println(i);
				isFound = true;
				break;
			}
		}
		if(!isFound)
			System.out.println(-1);
	}

}
