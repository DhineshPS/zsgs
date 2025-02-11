//10) Using Recursion, reverse the string such as
//Eg 1:  Input: one two three
//       Output: three two one
//Eg 2:  Input: I love india
//       Output: india love I
package zoho.java.task2;

public class Program10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "one two three";
		System.out.println(reverse(str));
	}
	
public static String reverse(String str) {
	if(str.isEmpty())
		return str;
	int spaceIndex = str.lastIndexOf(' ');
	if(spaceIndex < 0)
		return str;
	return str.substring(spaceIndex + 1) + " " + reverse(str.substring(0, spaceIndex));
	}
}

