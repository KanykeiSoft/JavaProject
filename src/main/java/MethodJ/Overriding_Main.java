package MethodJ;

public class Overriding_Main {
    public static void main(String[] args) {
        Employee koka = new Employee("Koka", 12,5000);
        System.out.println("Employee salary: " + koka.calculateSalary());
        HourlyEmployee aidar = new HourlyEmployee("Aidar", 2, 160, 20);
        System.out.println("HourlyEmployee salary " + aidar.calculateSalary());

    }
}
