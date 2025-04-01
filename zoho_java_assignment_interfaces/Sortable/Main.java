import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean loop = true, s = true;

        while(loop) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter n : ");
            int n = scanner.nextInt();
            int[] arr = new int[n];
            System.out.print("Enter array elements : ");
            for(int i = 0; i < n; i++) 
                arr[i] = scanner.nextInt();

            scanner.nextLine();
            System.out.print("Unsorted Array : ");
            for(int x : arr)
                System.out.print(x + " ");

            while(s) {
                System.out.println("Available Sorts\n1. Bubble sort \n2. Quick sort \n3. Merge sort");
                System.out.println("\nEnter option to select sort");

                String choice = scanner.nextLine();
                Sortable sorter = SortableFactory.getSort(choice);
                if(sorter == null)
                    System.out.println("Enter valid choice !");
                else {
                    System.out.println(sorter.sortName());
                    sorter.sort(arr);
                    System.out.print("Sorted Array : ");
                    for(int x : arr)
                        System.out.print(x + " ");
                }
                System.out.println("Do you want sort again?(Y/N)");
                Character c = scanner.next().toUpperCase().charAt(0);
                scanner.nextLine();
                if(c == 'N')
                    s = false;
            }
            System.out.println("Do you want to continue?(Y/N)");
            Character c = scanner.next().toUpperCase().charAt(0);
            if(c == 'N')
                loop = false;
        }

        
        

    }
}
