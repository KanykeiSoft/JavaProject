package Shape_Area;

public class Circle implements Shape{
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        double area = Math.PI * Math.pow(this.radius, 2);
        return Math.round(area * 10.0 ) / 10.0;
    }

    @Override
    public double calculatePerimetr() {
        double circumference = 2 * Math.PI * this.radius;
        return Math.round(circumference * 10.0) / 10.0;
    }
}
