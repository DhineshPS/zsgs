import java.util.Scanner;
public class RightRotateArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int numberOfElements = scanner.nextInt();
        System.out.println("Enter the array elemnets : ");
        int[] arr = new int[numberOfElements];
        for(int i = 0; i < numberOfElements; i++)
            arr[i] = scanner.nextInt();
        
        System.out.println("Enter the amount of right shift : ");
        int rotateAmount = scanner.nextInt();
        rotateAmount =  rotateAmount % numberOfElements;
        reverse(arr, 0, numberOfElements - rotateAmount - 1);
        reverse(arr, numberOfElements - rotateAmount, numberOfElements - 1);
        reverse(arr, 0, numberOfElements - 1);
        System.out.println("Array elements after right rotate : ");
        for(int x : arr)
            System.out.print(x + " ");
    }

    static void reverse(int[] arr, int start, int end) {
        int temp;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}