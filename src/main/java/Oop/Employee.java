package Oop;

public class Employee extends Person{
    private String department;
    private String jobTitle;
    private double salary;
    private String companyName;

    public Employee(){
        this.department = "not-assigned";
        this.jobTitle = "unknown";
        this.salary = 0;
        this.companyName = "unknown";
    }

    public Employee(
         String name,
         int age,
         String gender,
         String department,
         String jobTitle,
         double salary,
         String companyName
    ){
        setFullName(name);
        setAge(age);
        setGender(gender);
        this.department = department;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.companyName = companyName;

    }
}
