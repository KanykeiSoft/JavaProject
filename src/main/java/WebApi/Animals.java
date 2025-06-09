package WebApi;

import java.io.Serializable;

public class Animals implements Serializable {
    private String name;
    private String type;
    private int age;

    public Animals(String name, String type, int age) {
        this.name = name;
        this.type = type;
        this.age = age;
    }

    @Override
    public String toString() {
        return type + ": " + name + " (" + age + " years old)";
    }
    public static void main(String[] args) {

    }
}
