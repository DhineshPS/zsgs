public class Factorial {
    public static void main(String[] args) {
        int num = 5;
        int fact = factorial(num);
        System.out.println(fact);
    }

    private static int factorial(int num) {
        for(int i = num - 1; i >= 1; i--)
            num = num * i;
        return num;
    }
}
