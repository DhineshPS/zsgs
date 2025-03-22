public class Triangle extends Shape {
    private int breadth;
    private int height;
    public Triangle(int breadth, int height) {
        super(breadth, height);
        this.breadth = breadth;
        this.height = height;
    }

    @Override
    public double area() {
        area = 0.5 * breadth * height;
        return area;
    }

    @Override
    public double circumference() {
        circumference = breadth + height + Math.sqrt(Math.pow(breadth, 2) + Math.pow(height, 2));
        return circumference;
    }
    
}
