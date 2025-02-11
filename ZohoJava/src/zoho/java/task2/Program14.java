//14) Java Program to copy all elements of one array into another array

package zoho.java.task2;

public class Program14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {4, 2, 11, 10, 1, 7, 3, 24};
		int[] arr2 = new int[arr1.length];
		for(int i = 0; i < arr1.length; i++)
			arr2[i] = arr1[i];
		for(int i = 0; i < arr2.length; i++)
			System.out.print(arr2[i] + " ");
	}

}
