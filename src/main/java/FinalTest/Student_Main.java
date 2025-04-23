package FinalTest;

public class Student_Main {
    public static void main(String[] args) {
        Student st = new Student(20, "k", "kana", 45);
        st.printStudentData();

        st.setAge(24);
        System.out.println("age " + st.getAge());
    }

}
