//7) Evaluate the following expression on paper and on program and understand the
//difference
//a+=a++ + ++a + –a + a–; when a=28

package zoho.java.task2;

public class Program7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 28;
		a += a++ + ++a + --a + a--;
		//  28++ + ++29
		//           30 + --30
		//				    29 + 29--, a = 28
		//	28   +  30  + 29  + 29  = 116
		// a += 116, a = 28
		// a = a + 116
		// a = 28 + 116 = 144
		System.out.println(a);
	}

}
