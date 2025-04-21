package MethodJ;

public class Employee {
    private String name;
    private int id;
    private  double salary;

    public Employee(){

    }
    public Employee(String name, int id, double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    public double calculateSalary(){
        return this.salary;

    }
    public void setId(int id){
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
