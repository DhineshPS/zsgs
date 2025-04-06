// How to calculate the sum of arithmetic series from 1 to N, using recursion? 


public class SumOfArithmeticSeries {
    public static void main(String[] args) {
        int n = 20;
        System.out.println(sum(n));
    }

    public static int sum(int n) {
        if(n == 0)
            return 0;
        return n + sum(n - 1);
    }
}
