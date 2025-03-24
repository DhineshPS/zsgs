public class Main {
    public static void main(String[] args) {
        Car c1 = new Car();
        Bike b1 = new Bike();

        c1.display();
        b1.display();

        Car c2 = new Car("Porsche", "Sports-car", 4, 6, "Petrol");
        Bike b2 = new Bike("Splender", "Family-bike", 2, 4, "2-Stroke");

        c2.display();
        b2.display();
    }
}
