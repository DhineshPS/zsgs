// How to calculate Greatest Common Division GCD using Euclid's algorithm using recursion?


public class GCD {
    public static void main(String[] args) {
        int n = 18, m = 12;
        System.out.println(gcd(n, m));
    }

    public static int gcd(int n, int m) {
        if(m == 0)
            return n;
        return gcd(m, n % m);
    }
}
