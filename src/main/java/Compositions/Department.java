package Compositions;

public class Department {
    private String name;
    private String description;
    private int employeeCapacity;
    private Employee1[] employees;
    private int index =0;

    public Department(String name, String description, int employeeCapacity){
        this.name = name;
        this.description = description;
        this.employeeCapacity = employeeCapacity;
    }

}
