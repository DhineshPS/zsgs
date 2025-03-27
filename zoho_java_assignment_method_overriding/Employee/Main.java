public class Main {
    public static void main(String[] args) {
        Employee e1 = new HourlyEmployee("Guru", "SD", 22, 1000, 6);
        e1.getEmployeeDetails();
        Employee e2 = new SalariedEmployee("Samy", "QA", 22, 100000, 5);
        e2.getEmployeeDetails();
    }
}
