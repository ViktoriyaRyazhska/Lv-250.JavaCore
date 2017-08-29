/**
 * Created by User on 14.07.2017.
 */
public class Student {
    private String name;
    private Subject[] subjects;

    public Student(String name, Subject[] subjects) {
        this.name = name;
        this.subjects = subjects;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Subject[] getSubjects() {
        return subjects;
    }

    public void setSubjects(Subject[] subjects) {
        this.subjects = subjects;
    }
}
