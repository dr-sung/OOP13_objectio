
import java.io.Serializable;

public class Student implements Serializable {

    private final String name;
    private final int id;
    private final double gpa;

    public Student(String name, int id, double gpa) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return name + " " + id + " " + gpa;
    }
}