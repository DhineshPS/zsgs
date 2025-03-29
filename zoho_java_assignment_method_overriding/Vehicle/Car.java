public class Car extends Vehicle{
    @Override
    void startVehicle() {
        System.out.println("Car is starting");
    }
    @Override
    void stopVehicle() {
        System.out.println("Car is stopping");
    }
}
