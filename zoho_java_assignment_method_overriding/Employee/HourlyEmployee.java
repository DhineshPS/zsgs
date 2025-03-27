public class HourlyEmployee extends Employee{
    public double hourlySalary;
    public int workHours;

    HourlyEmployee(String empName, String designation, int age, double hourlySalary, int workHours) {
        super(empName, designation, age);
        this.hourlySalary = hourlySalary;
        this.workHours = workHours;
    }

    @Override
    void getEmployeeDetails() {
        System.out.println("Employee name : " + empName);
        System.out.println("Emplyee designation : " + designation);
        System.out.println("Employee age : " + age);
        System.out.println("Emplyee Hourly Salary : " + hourlySalary);
        System.out.println("Employee Work hours : " + workHours);
    }
    
}
