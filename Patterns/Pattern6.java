public class Pattern6 {
    public static void main(String[] args) {
        int n = 4;
        int x = 0;
        for(int i = 0; i < n; i++) {
            if(i % 2 == 0)
                x = 0;
            for(int j = 0; j <= i; j++) {
                x = x == 0 ? 1 : 0;
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
