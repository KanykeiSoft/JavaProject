package FinalTest;

public class Student {
    private final long id;
    private final String fullName;
    private final String email;
    private  int  age;

    public Student(long id, String fullName,String email, int age){
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.age = age;
    }
    public void printStudentData(){
        System.out.println("ID:" + id);
        System.out.println("fullName:" + fullName);

    }

    public int getAge() {
        return age;
    }
   public void setAge(int newAge){
        if(newAge > 0 && newAge < 100){
            age = newAge;
        }
   }


}
