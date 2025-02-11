//12) Program to Check Whether a Character is an Alphabet or not

package zoho.java.task2;

public class Program12 {
	public static void main(String[] args)
	{
		char c1 = 'X', c2 = '1', c3 = '%';
		System.out.println(c1 + " is Alphabet : " +isAlphabet(c1));
		System.out.println(c2 + " is Alphabet : " +isAlphabet(c2));
		System.out.println(c3 + " is Alphabet : " +isAlphabet(c3));
				
	}
	public static boolean isAlphabet(char c) {
		if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
			return true;
		return false;
	}
}
