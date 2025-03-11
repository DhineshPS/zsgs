public class EmployeeMain {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Joker", 25, "Software Engineer", 50000);
        Employee employee2 = new Employee("Thanos", 30, "Senior Software Engineer", 70000);
        Employee employee3 = new Employee("Darkseid", 35, "Project Manager", 100000);
        Employee employee4 = new Employee();
        employee4.setName("Bane");
        employee4.setAge(35);
        employee4.setDesignation("Project Manager");
        employee4.setSalary(100000);
        employee4.setId();
        employee1.add(employee1);
        employee2.add(employee2);
        employee3.add(employee3);
        employee4.add(employee4);
        employee1.display();
    }

}
