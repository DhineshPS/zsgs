//16) Given two sorted arrays, merge them such that the elements are not repeated
//Example 1:
//Input: Array 1: 2,4,5,6,7,9,10,13
//         Array 2: 2,3,4,5,6,7,8,9,11,15
//Output: Merged array: 2,3,4,5,6,7,8,9,10,11,13,15

package zoho.java.task2;
import java.util.ArrayList;
public class Program16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> merged = new ArrayList<>();
		int[] arr1 = {2,4,5,6,7,9,10,13};
		int[] arr2 = {2,3,4,5,6,7,8,9,11,15};
		int i = 0, j = 0;
		while(i < arr1.length && j < arr2.length)
		{
			if(arr1[i] == arr2[j])
				{
					merged.add(arr1[i]);
					i++;
					j++;
				}
			else if(arr1[i] > arr2[j])
			{
				merged.add(arr2[j]);
				j++;
			}
			else
			{
				merged.add(arr1[i]);
				i++;
			}
		}
		while(i < arr1.length)
		{
			merged.add(arr1[i]);
			i++;
		}
		while(j < arr2.length)
		{
			merged.add(arr2[j]);
			j++;
		}
		for(int m : merged)
			System.out.print(m + " ");
	}

}
