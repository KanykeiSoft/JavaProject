package Shape_Area;

public class Rectangle implements Shape{
    private final double length;
    private final double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return this.length * this.width;
    }

    @Override
    public double calculatePerimetr() {
        return 2 * (this.length * this.width);
    }
}
