public class Pattern9 {
    public static void main(String[] args) {
        int n = 4;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n - i; j++) 
                System.out.print(" ");
            for(int j = 0; j <= i; j++) 
                System.out.print("* ");
            System.out.println();
        }

        for(int i = 1; i < n; i++) {
            System.out.print(" ");
            for(int j = 0; j < i ; j++)
                System.out.print(" ");
            for(int j = n - i; j > 0; j--)
                System.out.print("* ");
            System.out.println();
        }
    }
}
