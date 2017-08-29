import java.util.Scanner;

/**
 * Created by User on 14.07.2017.
 */
public class Book {
    private Teacher teacher;
    private Student[] students;

    public Book(Teacher teacher, Student[] students) {
        this.teacher = teacher;
        this.students = students;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public void changeRateForAllStudents(Teacher teacher, Student[] students, Scanner scanner){
        for (Student s: students){
            teacher.changeRate(s, scanner);
        }
    }
}
