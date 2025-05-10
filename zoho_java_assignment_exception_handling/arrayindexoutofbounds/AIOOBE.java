public class AIOOBE {
    public static void main(String[] args) {
        int[] arr = new int[10];

        try {
            for(int i = 0; i < 20; i++) {
                System.out.println(arr[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index is beyond the capacity of the array!");
        }
    }
}
