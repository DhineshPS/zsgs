public class Employee {
    public String empName;
    public String designation;
    public int age;

    Employee(String empName, String designation, int age) {
        this.empName = empName;
        this.designation = designation;
        this.age = age;
    }

    void getEmployeeDetails() {
        System.out.println("Employee name : " + empName);
        System.out.println("Emplyee designation : " + designation);
        System.out.println("Employee age : " + age);
    }
}