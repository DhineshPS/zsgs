public class ZSGSStudent extends Student {
    private int uniqueID;
    private String zsMail;

    ZSGSStudent() {
        super();
        this.uniqueID = 0;
        this.zsMail = "NA";
    }

    ZSGSStudent(int studentID, String studentName, int uniqueID, String zsMail) {
        super(studentID, studentName);
        this.uniqueID = uniqueID;
        this.zsMail = zsMail;
    }

    @Override
    void display() {
        System.out.println("Student ID : " + super.getStudentID());
        System.out.println("Student Name : " + super.getStudentName());
        System.out.println("Student UniqueID : " + this.uniqueID);
        System.out.println("Student ZS Mail : " + this.zsMail);
    }
}
