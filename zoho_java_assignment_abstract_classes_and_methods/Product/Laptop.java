public class Laptop extends Product{
    Laptop(double price, String description) {
        super(price, description);
    }

    double getPrice() {
        return this.price;
    }

    String getDescription() {
        return this.description;
    }
}
