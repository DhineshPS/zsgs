public class Vehicle {
    private String name;
    private int numberOfWheels;
    private int numberOfGears;
    private String type;

    Vehicle() {
        this.numberOfWheels = 0;
        this.numberOfGears = 0;
        this.name = "NA";
        this.type = "NA";
    }

    Vehicle(String name, String type, int numberOfWheels, int numberOfGears) {
        this.numberOfWheels = numberOfWheels;
        this.numberOfGears = numberOfGears;
        this.name = name;
        this.type = type;
    }
    
    void display() {
        System.out.println("Name : " + this.name);
        System.out.println("Type : " + this.type);
        System.out.println("Number of Wheels : " + this.numberOfWheels);
        System.out.println("Number of Gears : " + this.numberOfGears);
    }
}
