//6) Evaluate the following expression on paper and on program and understand the
//difference
//i)++a-b–                   ii)a%b++     iii)a*=b+5               iv)x=69>>>2

package zoho.java.task2;

public class Program6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5, b = 10;
		System.out.println(++a-b--); // ++a(pre-increment)->a=5+1=6, ++a-b->6-10=4, b--(post-decrement)->b=b-1 ends & a=6,b=9
		System.out.println(a%b++);	// a=6,b=9, %->remainder, 6%9=6, b++->b=10
		System.out.println(a*=b+5 );// a=6,b=10, a*=(b+5) => a*=10+5=15, a=a*15, a=90
		System.out.println(69>>>2);//binary of 69->1000101, (>>> right shifts by n times & adds zero to leftmost bits) -> 0010001->17
	}

}
