public class Pattern19 {
    public static void main(String[] args) {
        int n = 4;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < i; j++)
                System.out.print(" ");
            for(int j = i; j < n; j++)
                System.out.print(j + 1 + " ");
            System.out.println();
        }

        for(int i = 1; i < n; i++) {
            for(int j = 0; j < n - i - 1; j++)
                System.out.print(" ");
            for(int j = n; j >= n - i; j--)
                System.out.print(j + " ");
            System.out.println();
        }
    }
}
