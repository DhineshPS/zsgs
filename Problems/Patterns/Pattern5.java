public class Pattern5 {
    
    public static void main(String[] args) {
        int n = 4;
        int c = 0;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j <= i; j++) 
                System.out.print(++c + " ");
            System.out.println();
        }

    }
}
