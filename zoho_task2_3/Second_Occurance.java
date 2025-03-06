
import java.util.Scanner;

public class Second_Occurance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[] {1, 4, 5, 3, 8, 2, 5, 1, 4, 5, 9, 3, 1, 0};
        for(int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
        System.out.print("Enter element to search second occurence : ");
        int searchNumber = scanner.nextInt();
        int count = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == searchNumber)
                count++;
            if(count == 2) {
                System.out.println("The second occurence of the given number is : " + i + " index");
                break;
            }
        }
        if(count < 2)
            System.out.println(searchNumber + " does not appear twice");
    }
}
