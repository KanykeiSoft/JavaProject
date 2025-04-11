package Oop;

public class Student extends Person{
    private long id;
    private String degreeProgram;
    private double cqpa;


    public Student(){
        this.id = 2435;
        this.degreeProgram = "Not-assigned";
        this.cqpa = 0.0;
    }
    public Student(

            String name,
            int age,
            String gender,
            long id,
            String degreeProgram,
            double cqpa
            ){
        setFullName(name);
        setGender(gender);
        setAge(age);
        this.id =id;
        this.degreeProgram = degreeProgram;
        this.cqpa =cqpa;

    }
}
