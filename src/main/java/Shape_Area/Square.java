package Shape_Area;

import java.util.PrimitiveIterator;

public class Square implements Shape{
    private final double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return this.side * this.side;
    }

    @Override
    public double calculatePerimetr() {
        return 4 * this.side;
    }
}
