package university.students;

public class Student {
    private String name;
    private int rollNumber;
    private String department;

    public Student(String name, int rollNumber, String department) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Student: " + name + " (Roll No: " + rollNumber + ", Dept: " + department + ")";
    }
}
