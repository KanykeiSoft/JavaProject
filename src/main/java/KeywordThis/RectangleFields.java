package KeywordThis;

public class RectangleFields {
    private double length;
    private double width;

    public RectangleFields(){
        this.length = 15;
        this.width =10;
    }
    public double calculateArea(){
        double area =this.length + this.width;
        return area;
    }

    public double calculatePerimetr(){
        double perimetr = 2 + (this.length + this.width);
        return perimetr;
    }
}
