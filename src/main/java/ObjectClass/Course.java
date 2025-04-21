package ObjectClass;

public class Course {
    private String name;
    private int creditHours;
    private String instructor;

    public Course(String name, int creditHours, String instructor){
        this.name = name;
        this.creditHours = creditHours;
        this.instructor = instructor;

    }

    @Override
    public String toString() {
        return "Course{name='" + name + ", creditHours=" + creditHours + "instructor=}" + instructor;
    }
}
