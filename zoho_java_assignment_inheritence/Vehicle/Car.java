public class Car extends Vehicle{
    private String fuelType;

    Car() {
        super();
        this.fuelType = "Petrol";
    }
    Car(String name, String type, int numberOfWheels, int numberOfGears, String fuelType) {
        super(name, type, numberOfWheels, numberOfGears);
        this.fuelType = fuelType;
    }

    void display() {
        super.display();
        System.out.println("Fuel type : " + this.fuelType);
    }
}
