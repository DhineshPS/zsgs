// Write a Java program to convert Decimal to binary using recursion.


public class D2B {
    public static void main(String[] args) {
        int n = 17;
        System.out.println(d2b(n));
    }

    public static int d2b(int n) {
        if(n <= 1)  
            return n;

        return n % 2 + d2b(n / 2) * 10;
    }
}
