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

    @Override
    public String toString() {
        String departmentString = "";
        departmentString +="\n====================\n";
        departmentString += "\tDepartment\n";
        departmentString += "======================\n";
        departmentString += "name =" +name;
        departmentString += "\ndescription = "+ description;
        departmentString += "\nemployeeCapacity = "+ employeeCapacity;
        for(int i = 0; i < index; i++ ){
            departmentString += this.employees[i].toString();
        }

        return departmentString;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getEmployeeCapacity() {
        return employeeCapacity;
    }

    public Employee1[] getEmployees(){
        return employees;
    }
    public int  getIndex(int index){
        return  index;
    }
}
