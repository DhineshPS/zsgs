//19) Java Program to left rotate the elements of a multidimensional array.


package zoho.java.task2;

public class Program19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		for(int i = 0; i < 3; i++)
		{
			int temp = matrix[i][0];
			int j;
			for(j = 0; j < matrix[i].length - 1; j++)
			{
				matrix[i][j] = matrix[i][j + 1];
			}
			matrix[i][j] = temp;
		}
	}

}
