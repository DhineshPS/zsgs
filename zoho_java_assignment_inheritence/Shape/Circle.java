public class Circle extends Shape{

    public int radius;

    Circle(int radius) {
        this.radius = radius;
    }
    
    @Override
    public double area() {
        area = Math.PI * radius * radius;
        return area;
    }

    @Override
    public double circumference() {
        circumference = 2 * Math.PI * radius;
        return circumference;
    }

    public double fun() {
        return this.area;
    }
}
