import java.util.Scanner;

public class Even_Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value of n : ");
        int n = scanner.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[] {8, 2, 4, 1, 5, 8, 2, 0, 6, 3, 7, 1, 3, 5, 6, 8};
        for(int i = 0; i < n; i++)
            arr1[i] = i + 1;

        int sum1 = 0;
        int sum2 = 0;

        for(int num : arr1)
            if(num % 2 == 0)
                sum1 += num;
        
        for(int num : arr2)
            if(num % 2 != 0)
                sum2 += num;
        
        System.out.println("Sum of even numbers = " + sum1);
        System.out.println("Sum of odd numbers = " + sum2);

    }
}
