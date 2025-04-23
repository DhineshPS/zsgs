public class Pattern7 {
    public static void main(String[] args) {
        int n = 4; 

        for(int i = 0; i < n; i++) {
            for(int j = n - 1; j > i; j--) 
                System.out.print("  ");
            for(int j = i; j >= 0; j--) 
                System.out.print(j + 1 + " ");
            for(int j = 1; j <= i; j++) 
                System.out.print(j + 1 + " ");
            System.out.println();
        }
    }
}
