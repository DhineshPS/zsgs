package zoho_task2_1;

import java.util.Scanner;

public class Weekday {
    enum Day {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Day number : ");
        int day = scanner.nextInt();

        if(day >= 1 && day <= 7)
            System.out.println(Day.values()[day - 1]);
        else
            System.out.println("Not a Weekday");

    }
}
