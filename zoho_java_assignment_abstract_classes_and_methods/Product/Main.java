public class Main {
    public static void main(String[] args) {
        Product mobile = new Mobile(100000, "Iphone 24 pro max");
        Product laptop = new Laptop(240000, "Asus ROG tuf f10");

        System.out.println("Mobile Description" + mobile.getDescription());
        System.out.println("Mobile Price = Rs." + mobile.getPrice());

        System.out.println("Mobile Description" + laptop.getDescription());
        System.out.println("Mobile Price = Rs." + laptop.getPrice());
    
    }
}
