
import java.util.Scanner;

public class Student_grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Student mark : ");
        int mark = scanner.nextInt();
        
        System.out.println("Student secured : " + grade(mark) + " Grade");
    }

    static char grade(int mark) {
        if(mark >= 90 && mark <= 100)
            return 'O';
        else if(mark >= 80 && mark < 90)
            return 'A';
        else if(mark >= 70 && mark < 80)
            return 'B';
        else if(mark >= 60 && mark < 70)
            return 'C';
        else if(mark >= 50 && mark < 60)
            return 'D';
        System.out.println("Student Failed");
        return 'F';
    }
}
