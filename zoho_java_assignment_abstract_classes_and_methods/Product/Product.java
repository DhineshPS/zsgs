public abstract class Product {
    public double price;
    public String description;

    Product(double price, String description) {
        this.price = price;
        this.description = description;
    }

    abstract double getPrice();
    abstract String getDescription();
}
