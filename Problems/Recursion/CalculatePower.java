// How to calculate the power of a number like power(int number, int power) like power(2, 3) should return 8, using recursion? 


public class CalculatePower {
    public static void main(String[] args) {
        int n = 5;
        int m = 3;

        System.out.println(power(n, m));
    }    

    public static int power(int n, int m) {
        if(m == 0) 
            return 1;
        return n * power(n, m - 1);
    }
}
