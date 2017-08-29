import java.util.Scanner;

/**
 * Created by User on 14.07.2017.
 */
public class Teacher implements ToRate {
    private String name;


    public Teacher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void changeRate(Student student, Scanner scanner) {
        int rate;
        for (int i = 0; i < student.getSubjects().length ; i++){
            System.out.println(this.getName() + " enter rate for student " + student.getName()+ "in subject: " + student.getSubjects()[i].getName());
                rate = scanner.nextInt();
                if (rate > 1 && rate < 12)
                    student.getSubjects()[i].setRate(rate);
                    else {
                        System.out.println("You entered wrong subject or rate, try again");
                        i--;
            }
        }
    }
}
