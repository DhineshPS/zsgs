public class Pattern22 {
    public static void main(String[] args) {
        int n = 4;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n - i; j++)
                System.out.print(" ");
            System.out.print("*");
            for(int j = 0; j < 2 * i - 1; j++)
                System.out.print(" ");
            if(i != 0)
                System.out.print("*");
            System.out.println();
        }

        for(int i = n - 2; i >= 0; i--) {
            for(int j = 0; j < n - i; j++)
                System.out.print(" ");
            System.out.print("*");
            for(int j = 0; j < 2 * i - 1; j++)
                System.out.print(" ");
            if(i != 0)
                System.out.print("*");
            System.out.println();
        }
    }
}
