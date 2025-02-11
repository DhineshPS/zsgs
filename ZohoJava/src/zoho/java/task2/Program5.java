//Polynomial equation evaluation
package zoho.java.task2;

public class Program5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5, b = 4, c = 3;
		System.out.println(a +"x^2 + " + b + "x + " + c);
		double disc = b * b - 4 * a * c;
		if(disc == 0)
		{
			double root = - b / (2 * a);
			System.out.println("Root : " + root);
				return;
		}
		if(disc > 0)
		{
			double root1 = (- b + Math.sqrt(disc)) / (2 * a);
			double root2 = (- b - Math.sqrt(disc)) / (2 * a);
			System.out.println("Root1 : " + root1);
			System.out.println("Root2 : " + root2);
			return;
		}
		else {
            // Complex roots
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-disc) / (2 * a);
            System.out.println("Root 1: " + realPart + " + " + imaginaryPart + "i");
            System.out.println("Root 2: " + realPart + " - " + imaginaryPart + "i");
        }

	}

}
