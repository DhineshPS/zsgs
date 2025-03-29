public class Triangle extends Shape {

    public Triangle(int breadth, int height) {
        super(breadth, height);
    }

    @Override
    public double area() {
        area = 0.5 * super.getArea();
        return area;
    }

    @Override
    public double circumference() {
        circumference = dimension1 + dimension2 + Math.sqrt(Math.pow(dimension1, 2) + Math.pow(dimension2, 2));
        return circumference;
    }
    
}
