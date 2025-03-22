public class Student {
    private int studentID;
    private String studentName;

    Student() {
        this.studentID = -1;
        this.studentName = "NA";
    }

    Student(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }

    int getStudentID() {
        return this.studentID;
    }

    String getStudentName() {
        return this.studentName;
    }

    void display() {
        System.out.println("Student ID : " + this.studentID);
        System.out.println("Student Name : " + this.studentName);
    }
}
