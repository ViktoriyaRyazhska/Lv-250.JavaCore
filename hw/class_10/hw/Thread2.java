package class_10.hw;

/**
 * Created by User on 11.07.2017.
 */
public class Thread2 extends Thread {
    private String name;

    public Thread2(String name) {
        this.name = name;

    }

    @Override
    public void run() {
        for (int i = 0; i < 9; i++) {
            System.out.println(name + " " + i);
        }
    }
}
