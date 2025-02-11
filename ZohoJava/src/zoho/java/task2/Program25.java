//25) Write a program to print the following output for the given input. You can assume
//the string is of odd length
//Eg 1:  Input: 12345
//        Output:
//1       5
//  2   4
//    3
//  2   4
//1        5

package zoho.java.task2;

public class Program25 {
    public static void main(String[] args) {
        String str = "12345";
        pattern(str);
    }

    public static void pattern(String str) {
        int len = str.length();
        
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (j == i || j == len - i - 1) {
                    System.out.print(str.charAt(j));
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

