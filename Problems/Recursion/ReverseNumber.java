// Program to reverse a number using recursion in Java?  


public class ReverseNumber {
    public static void main(String[] args) {
        int n = 12345;
    
        System.out.println(reverse(n, 0));
    }

    public static int reverse(int n, int rev) {
        if(n == 0)
            return rev;
        rev = rev * 10 + n % 10;
        return reverse(n / 10, rev);
    }
}
