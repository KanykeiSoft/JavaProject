package KeywordThis;

public class Rectangle_ConstCall {
    private double length;
    private double width;

    public Rectangle_ConstCall(){
        this(15, 10);
//        this.width = 15;
//        this.length =10;
    }

    public Rectangle_ConstCall(double length, double width){
        this.length = length;
        this.width = width;
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
