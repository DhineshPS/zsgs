public class Main {
    public static void main(String[] args) {
        Student st1 = new ZSGSStudent();
        Student st2 = new ZSGSStudent(1234, "Dhinesh", 410, "dhinesh.ps@zohotrainees.com");
        st1.display();
        st2.display();

        ZSGSStudent z1 = (ZSGSStudent)st2; // downcasting
        z1.display();

        // Student st3 = new Student();
        // ZSGSStudent z2 = (ZSGSStudent)st3;   -> error

        // z2.display();
    }
}
