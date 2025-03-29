public class SalariedEmployee extends Employee{
    public double monthlySalary;
    public int overtime;

    SalariedEmployee(String empName, String designation, int age, double monthlySalary, int overtime) {
        super(empName, designation, age);
        this.monthlySalary = monthlySalary;
        this.overtime = overtime;
    }

    @Override
    void getEmployeeDetails() {
        System.out.println("Emplyee Name : " + empName);
        System.out.println("Employee designation : " + designation);
        System.out.println("Emplyee age : " + age);
        System.out.println("Emplyee Hourly Salary : " + monthlySalary);
        System.out.println("Employee Overtime hours : " + overtime);
    }

    @Override
    double calculatePay() {
        return monthlySalary + overtime * 100;
    }
}
