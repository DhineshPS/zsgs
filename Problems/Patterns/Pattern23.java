public class Pattern23 {
    public static void main(String[] args) {
        int n = 4;

        for(int i = n - 1; i >= 0; i--) {
            for(int j = 0; j < n - i; j++)
                System.out.print(" ");
            if(i == 0 || i == n - 1)
                for(int j = 0; j <= i; j++)
                    System.out.print("* ");
            else {
                System.out.print("*");
                for(int j = 0; j < 2 * i - 1; j++)
                    System.out.print(" ");
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = 1; i < n; i++) {
            for(int j = 0; j < n - i; j++)
                System.out.print(" ");
            if(i == 0 || i == n - 1)
                for(int j = 0; j <= i; j++)
                    System.out.print("* ");
            else {
                System.out.print("*");
                for(int j = 0; j < 2 * i - 1; j++)
                    System.out.print(" ");
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
