import java.util.ArrayList;

public class Employee {
    private String name;
    private int age;
    private String designation;
    private double salary;
    private static int employeeId = 0;
    private int id;
    static ArrayList<Employee> employees = new ArrayList<>();

    Employee() {
        name = "";
        age = 0;
        designation = "";
        salary = 0;
    }

    Employee(String name, int age, String designation, double salary) {
        this.name = name;
        this.age = age;
        this.designation = designation;
        this.salary = salary;
        ++employeeId;
        this.id = employeeId;
    }
    
    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getDesignation() {
        return this.designation;
    }

    public double getSalary() {
        return this.salary;
    }

    public int getEmployeeId() {
        return Employee.employeeId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setId() {
        ++employeeId;
        this.id = employeeId;
    }

    public void add(Employee employee) {
        employees.add(employee);
    }

    void display() {
        for (Employee employee : employees) {
            System.out.println("Name: " + employee.getName());
            System.out.println("Age: " + employee.getAge());
            System.out.println("Designation: " + employee.getDesignation());
            System.out.println("Salary: " + employee.getSalary());
            System.out.println("Employee ID: " + employee.getId());
        }
    }
}
