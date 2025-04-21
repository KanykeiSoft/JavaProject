package MethodJ;

public class HourlyEmployee extends Employee{
    private double hoursWorked;
    private double hourlyRate;

    @Override
    public double calculateSalary() {
        double salary = hourlyRate + hoursWorked;
        setSalary(salary);
        return salary;
    }

    public HourlyEmployee(String name, int id, double hoursWorked, double hourlyRate){
        setId(id);
        setName(name);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;


    }

}
