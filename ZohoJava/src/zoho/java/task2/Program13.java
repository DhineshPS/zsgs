//13) Java Program to print the smallest element in an array

package zoho.java.task2;

public class Program13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4, 2, 11, 10, 1, 7, 3, 24};
		int min = arr[0];
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] < min)
				min = arr[i];
		}
		System.out.println("Minimum number : " + min);
	}

}
