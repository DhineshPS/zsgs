public class Pattern25 {
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
            System.out.println();
        }
    }
}
