import java.util.Scanner;

public class NoOfDays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter day: ");
        int day = sc.nextInt();

        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        int days = calculateDaysPassed(day, month, year);

        if (days == -1) {
            System.out.println("Invalid date entered.");
        } else {
            System.out.println("Days passed in " + year + " till " + day + "/" + month + ": " + days);
        }

        sc.close();
    }

    public static int calculateDaysPassed(int day, int month, int year) {
        int[] daysInMonth = { 31, 28, 31, 30, 31, 30,
                              31, 31, 30, 31, 30, 31 };

        // Leap year adjustment
        if (isLeapYear(year)) {
            daysInMonth[1] = 29; 
            }

        if (month < 1 || month > 12 || day < 1 || day > daysInMonth[month - 1]) {
            return -1; 
        }

        int totalDays = 0;
        for (int i = 0; i < month - 1; i++) {
            totalDays += daysInMonth[i];
        }

        totalDays += day;
        return totalDays;
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
