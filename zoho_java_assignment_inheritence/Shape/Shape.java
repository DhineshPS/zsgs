public class Shape {
    double area;
    double circumference;

    public int length;
    public int width;

    Shape() {

    }
    
    Shape(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public double area() {
        area = length * width;
        return area;
    }
    public double circumference() { 
        circumference = 2 * (length + width);
        return circumference;
    }

    public double getArea() {
        return this.area;
    }

    public double getCircumference() {
        return this.circumference;
    }
}
