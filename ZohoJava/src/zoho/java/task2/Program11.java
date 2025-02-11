//11) Write a program to give the following output for the given input:
//Eg 1:  Input: a1b10
//Output: abbbbbbbbbb
//Eg: 2:  Input: b3c6d15
//           Output: bbbccccccddddddddddddddd
//The number varies from 1 to 99.

package zoho.java.task2;

public class Program11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "b3c6d15";
		for(int i = 0; i < str.length();)
		{
			char c = str.charAt(i);
			i++;
			if(Character.isDigit(str.charAt(i + 1)))
			{
				int times = Integer.valueOf(str.substring(i, ++i + 1));
				print(c, times);
				i++;
				continue;
			}
			int times = Integer.valueOf(str.substring(i, i + 1));
			print(c, times);
			i++;
		}
	}
	
public static void print(char c, int times) {
	for(int i = 0; i < times; i++)
		System.out.print(c);
}

}
