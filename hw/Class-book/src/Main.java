import java.util.Scanner;

/**
 * Created by User on 14.07.2017.
 */
public class Main {
    public static void main(String[] args) {
        Subject subject = null;

        Subject[] sub = new Subject[3];
        Student[] students = new Student[2];
        try {
            sub[0] = new Subject("physics");
            sub[1] = new Subject("algebra");
            sub[2] = new Subject("biology");
        }catch (NameSubjectExeption n){
            System.err.println(n);
        }
        Teacher teacher = new Teacher("Olena Stepanivna");

        Student student = new Student("Vasul Gumen", sub);
        Student student2 = new Student("Sasha Geruk", sub);

        students[0] = student;
        students[1] = student2;
        Book book = new Book(teacher, students);

        Scanner scanner = new Scanner(System.in);

        teacher.changeRate(student, scanner);
        //book.changeRateForAllStudents(teacher, students, scanner);
    }
}
