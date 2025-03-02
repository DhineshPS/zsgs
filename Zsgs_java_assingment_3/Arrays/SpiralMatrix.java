import java.util.Scanner;

public class SpiralMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the matrix (N):");
        int n = scanner.nextInt();

        int[][] spiralMatrix = new int[n][n];
        int top = 0, bottom = n - 1;
        int left = 0, right = n - 1;
        int num = 1;

        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                spiralMatrix[top][i] = num++;
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                spiralMatrix[i][right] = num++;
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    spiralMatrix[bottom][i] = num++;
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    spiralMatrix[i][left] = num++;
                }
                left++;
            }
        }

        System.out.println("Spiral Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(spiralMatrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}