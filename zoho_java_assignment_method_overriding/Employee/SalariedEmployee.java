public class SalariedEmployee extends Employee{
    public double monthlySalary;
    public int workDays;

    SalariedEmployee(String empName, String designation, int age, double monthlySalary, int workDays) {
        super(empName, designation, age);
        this.monthlySalary = monthlySalary;
        this.workDays = workDays;
    }

    @Override
    void getEmployeeDetails() {
        System.out.println("Employee name : " + empName);
        System.out.println("Emplyee designation : " + designation);
        System.out.println("Employee age : " + age);
        System.out.println("Emplyee Hourly Salary : " + monthlySalary);
        System.out.println("Employee Work hours : " + workDays);
    }
}
