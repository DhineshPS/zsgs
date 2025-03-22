public class Shape {
    double area;
    double circumference;

    public int dimension1;
    public int dimension2;

    Shape() {
        this.dimension1 = 0;
        this.dimension2 = 0;
    }
    
    Shape(int dimension1, int dimension2) {
        this.dimension1 = dimension1;
        this.dimension2 = dimension2;
    }

    public double area() {
        area = dimension1 * dimension2;
        return area;
    }
    public double circumference() { 
        circumference = 2 * (dimension1 + dimension2);
        return circumference;
    }

    public double getArea() {
        return this.area;
    }

    public double getCircumference() {
        return this.circumference;
    }
}
