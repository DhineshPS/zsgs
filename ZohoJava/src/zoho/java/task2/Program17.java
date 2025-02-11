//17) Alternate sorting: Given an array of integers, rearrange the array in such a way that
//the first element is first maximum and second element is first minimum.
// Example:  Input : {1, 2, 3, 4, 5, 6, 7}
//Output: {7, 1, 6, 2, 5, 3, 4}
package zoho.java.task2;
import java.util.Arrays;
public class Program17 {
	public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        alternateSort(arr);
    }

    public static void alternateSort(int[] arr) {
        Arrays.sort(arr);         
        int left = 0, right = arr.length - 1;         
        while (left < right) {
            System.out.print(arr[right--] + " "); 
            System.out.print(arr[left++] + " "); 
        }
        if (left == right) { 
            System.out.print(arr[left]);
        }
    }
}
