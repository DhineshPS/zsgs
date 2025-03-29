public class Mobile extends Product{
    Mobile(double price, String description) {
        super(price, description);
    }

    double getPrice() {
        return this.price;
    }

    String getDescription() {
        return this.description;
    }
}
