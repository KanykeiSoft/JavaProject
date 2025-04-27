package Compositions;

public class Employee1 {
    private int id;
    private String name;
    private int age;
    private int address;

    public Employee1(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;

    }

    public Employee1(String name, int id, int age, int address) {
        this(id, name, age);
        this.address = address;
    }

    @Override
    public String toString() {
        String employeeString = "";
        employeeString +="\n====================\n";
        employeeString += "\tEmployee\n";
        employeeString += "======================\n";
        employeeString += "id =" +id;
        employeeString += "\nname =" + name;
        employeeString += "\nage = "+ age;
        employeeString += "\naddress = "+ address;
        return  employeeString;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAddress() {
        return address;
    }

    public void setAddress(int address) {
        this.address = address;
    }
}
