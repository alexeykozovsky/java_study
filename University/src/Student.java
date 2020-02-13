import java.io.Serializable;
import java.util.Objects;

public class Student implements Serializable {
    private String name;
    private int mark;
    private static final long serialVersionUID = 1L;


    public Student(String name, int mark) {
        this.name = name;
        this.mark = mark;
    }

    public int getMark() {
        return mark;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Student student = (Student) object;
        return Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", mark=" + mark +
                '}';
    }
}
