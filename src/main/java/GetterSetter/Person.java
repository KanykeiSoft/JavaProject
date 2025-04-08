package GetterSetter;

public class Person {
    private String name;
    private int age;

    public String getName(){
        return name;
    }

    public void setName(String name) {
        if (name.length() < 3 || name.length() > 25) {
            System.out.println("Error -name should contain at least ...");
        } else {
            this.name = name;
        }
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        if(age<= 0 || age> 120){
            System.out.println("ERROR");
        }
        else{
            this.age = age;
        }
    }
    public static void main(String[] args) {
        Person persons = new Person();
        persons.setName("a");
        persons.setName("koka");
        System.out.println("Name " + persons.getName());
        persons.setAge(-10);
        persons.setAge(40);
        persons.getName();
        System.out.println("Age " + persons.getAge());

    }
}
