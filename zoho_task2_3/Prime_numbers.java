
public class Prime_numbers {
    public static void main(String[] args) {
        for(int i = 1; i <= 30; i++)
            if(isPrime(i))
                System.out.print(i + " ");
    }

    static boolean isPrime(int num) {
        if(num < 2)
            return false;
        for(int i = 2; i * i <= num; i++) {
            if(num % i == 0)
                return false;
        }
            return true;
    }
}
