public abstract class Employee {
    public String empName;
    public String designation;
    public int age;

    Employee(String empName, String designation, int age) {
        this.empName = empName;
        this.designation = designation;
        this.age = age;
    }
    abstract void getEmployeeDetails();
    abstract double calculatePay();
    
}