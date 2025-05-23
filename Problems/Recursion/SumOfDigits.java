// How to calculate the sum of digits using recursion in Java?

public class SumOfDigits {
    public static void main(String[] args) {
        int n = 12345;
        System.out.println(digitsSum(n));
    }

    public static int digitsSum(int n) {
        if(n == 0)
            return 0;
        return n % 10 + digitsSum(n / 10);
    }
}
