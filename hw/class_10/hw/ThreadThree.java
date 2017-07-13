package class_10.hw;

/**
 * Created by User on 12.07.2017.
 */
public class ThreadThree extends Thread {
    private String name;
    private Thread t;

    public ThreadThree(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread number three");
        }
    }
}
