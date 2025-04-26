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
    public Department(String name, String description, int capacity,Employee1[] employees){

        this(name, description, capacity);
        this.employees = employees;
    }
    public void addEmployee(Employee1 employee1){
        if(this.employees == null){
           this.employees = new Employee1[this.employeeCapacity];

        }
        if(this.index < this.employees.length){
            this.employees[index] = employee1;
            index++;
        }
        else{
            System.out.println("Failed to add employee in the department - ");
        }
    }

}
