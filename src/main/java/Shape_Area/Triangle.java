package Shape_Area;

public class Triangle implements Shape{
    private final double side1;
    private final double side2;
    private final double base;

    @Override
    public double calculateArea() {
        return 0;
    }

    @Override
    public double calculatePerimetr() {
        return 0;
    }

    public Triangle(double side1, double side2, double base) {
        this.side1 = side1;
        this.side2 = side2;
        this.base = base;
    }
}
