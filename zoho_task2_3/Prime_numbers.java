
public class Prime_numbers {
    public static void main(String[] args) {
        for(int i = 1; i <= 30; i++)
            if(isPrime(i))
                System.out.print(i + " ");
    }

    static boolean isPrime(int num) {
        int count = 0;
        for(int i = 1; i <= num; i++) {
            if(num % i == 0)
                count++;
        }
        if(count == 2)
            return true;
        return false;
    }
}
