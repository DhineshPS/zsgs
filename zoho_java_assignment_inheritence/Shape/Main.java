public class Main {
    public static void main(String[] args) {
        Shape c1 = new Circle(5);
        Shape r1 = new Rectangle(4, 3);
        Shape t1 = new Triangle(4, 3);

        System.out.println(r1.area());
        System.out.println(r1.circumference());
        System.out.println(c1.area());
        System.out.println(c1.circumference());
        System.out.println(t1.area());
        System.out.println(t1.circumference());
        System.out.println();
        
        System.out.println(c1.getArea());
        System.out.println(c1.getCircumference());

        System.out.println(r1.getArea());
        System.out.println(r1.getCircumference());

        System.out.println(t1.getArea());
        System.out.println(t1.getCircumference());

    }
}
