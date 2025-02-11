//18) Write a program to sort the elements in odd positions in descending order and
//elements in ascending order.
//Eg 1:  Input:  13,2 4,15,12,10,5
//         Output: 13,2,12,10,5,15,4
//Eg 2:  Input: 1,2,3,4,5,6,7,8,9
//         Output: 9,2,7,4,5,6,3,8,1

package zoho.java.task2;

public class Program18 {
    public static void main(String[] args) {
        int[] arr = {13, 2, 4, 15, 12, 10, 5};
        sortOddEven(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    public static void sortOddEven(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i += 2) 
            for (int j = i + 2; j < n; j += 2) 
                if (arr[i] < arr[j]) 
                    swap(arr, i, j);
        for (int i = 1; i < n; i += 2) 
            for (int j = i + 2; j < n; j += 2) 
                if (arr[i] > arr[j]) 
                    swap(arr, i, j);
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
