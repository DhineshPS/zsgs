public class Bike extends Vehicle{
    private String engineType;

    Bike() {
        super();
        this.engineType = "X1";
    }
    Bike(String name, String type, int numberOfWheels, int numberOfGears, String engineType) {
        super(name, type, numberOfWheels, numberOfGears);
        this.engineType = engineType;
    }

    void display() {
        super.display();
        System.out.println("Engine type : " + this.engineType);
    }
}
