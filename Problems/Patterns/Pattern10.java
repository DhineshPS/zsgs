public class Pattern10 {
    public static void main(String[] args) {
        int n = 5;

        for(int i = 0; i < n; i++) {
            if(i % 2 == 0)
                System.out.print("* ");
            else    
                System.out.print("  * ");
            for(int j = 0; 2 * j + 1 < i; j++) {
                System.out.print("  ");
                System.out.print("* ");
            }
            
            for(int j = 0; j < 3 * n - 4 * i - 2; j++)
                System.out.print(" ");
            if(i != n - 1)
                for(int j = 0; 2 * j <= i; j++) {
                    System.out.print(" *");
                    System.out.print("  ");
                }
            else {
                System.out.print(" ");
                for(int j = 0; 2 * j + 2 <= i; j++) {
                    System.out.print(" *");
                    System.out.print("  ");
                }
            }
            System.out.println();            
        }

        for(int i = n - 2; i >= 0; i--) {
            if(i % 2 == 0)
                System.out.print("* ");
            else    
                System.out.print("  * ");
            for(int j = 0; 2 * j + 1 < i; j++) {
                System.out.print("  ");
                System.out.print("* ");
            }

            for(int j = 0; j < 3 * n - 4 * i - 2; j++)
                System.out.print(" ");
            
            for(int j = 0; 2 * j <= i; j++) {
                System.out.print(" *");
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}
