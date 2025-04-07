package MethodJ;

public class OverLoad {
    public void add(int num1, int num2){
        System.out.println("method called add (int num1, int num2)");

        int sum = num1+num2;
        System.out.println("Sum" + sum);
    }

    public void add(int num1, int num2, int num3){
        System.out.println("method called add (int num1, int num2, int num3)");

        int sum = num1+num2 + num3;
        System.out.println("Sum" + sum);
    }

    public void add(double num1, double num2){
        System.out.println("method called add (double num1, double num2)");

        double sum = num1+num2;
        System.out.println("Sum" + sum);
    }
    public void subtract(int num1, int num2){
        System.out.println("subtract (int num1, int num2)");
        int difference =num1-num2;
        System.out.println("Subtraction" + difference);
    }

    public void subtract(double num1, double num2){
        System.out.println("subtract (double num1, double num2)");
        double difference =num1-num2;
        System.out.println("Subtraction" + difference);
    }
    public static void main(String[] args) {
        OverLoad math = new OverLoad();
        math.add(10,13);
        math.add(12,23,45);
        math.add(2,6);
        math.add(12.3, 15.3);
        System.out.println();
        math.subtract(23.4,12);

    }
}
