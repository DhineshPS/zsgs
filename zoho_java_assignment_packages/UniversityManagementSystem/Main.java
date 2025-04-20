import university.courses.Course;
import university.faculty.Faculty;
import university.students.Student;

public class Main {
    public static void main(String[] args) {
        // Create Students
        Student s1 = new Student("Alice", 101, "Computer Science");
        Student s2 = new Student("Bob", 102, "Mechanical");

        // Create Courses
        Course c1 = new Course("Data Structures", "CS201", 4);
        Course c2 = new Course("Thermodynamics", "ME301", 3);

        // Create Faculty
        Faculty f1 = new Faculty("Dr. Smith", 5001);
        Faculty f2 = new Faculty("Prof. John", 5002);

        // Assign Courses
        f1.assignCourse(c1);
        f2.assignCourse(c2);

        // Display Info
        System.out.println("--- Students ---");
        System.out.println(s1);
        System.out.println(s2);

        System.out.println("\n--- Courses ---");
        System.out.println(c1);
        System.out.println(c2);

        System.out.println("\n--- Faculty ---");
        System.out.println(f1);
        System.out.println(f2);
    }
}
