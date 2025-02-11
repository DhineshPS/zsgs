/*
 30) Given a N*N square matrix, return an array of its anti-diagonals. Look at the example for more
details.
Example
Input:
1 2 3
4 5 6
7 8 9
Output : [
[1],
[2, 4],
[3, 5, 7],
[6, 8],
[9]
]
Input :
1 2
3 4
Output :
[ [1],
[2, 3],
[4]
]
 */

package zoho.java.task2;

public class Program30 {
	public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        printAntiDiagonals(matrix);
    }

    public static void printAntiDiagonals(int[][] matrix) {
        int n = matrix.length;
        for (int col = 0; col < n; col++) {
            int i = 0, j = col;
            while (i < n && j >= 0) {
                System.out.print(matrix[i][j] + " ");
                i++;
                j--;
            }
            System.out.println();
        }
        for (int row = 1; row < n; row++) {
            int i = row, j = n - 1;
            while (i < n && j >= 0) {
                System.out.print(matrix[i][j] + " ");
                i++;
                j--;
            }
            System.out.println();
        }
    }
}
