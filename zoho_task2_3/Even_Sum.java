import java.util.Scanner;

public class Even_Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value of n : ");
        int n = scanner.nextInt();
        int[] arr1 = new int[] {8, 2, 4, 1, 5, 8, 2, 0, 6, 3, 7, 1, 3, 5, 6, 8};

        int evenSum = 0;

        for(int num : arr1) {
            if(num % 2 != 0)
                continue;
            evenSum += num;
        }
        
        
        System.out.println("Sum of even numbers = " + evenSum);

    }
}
