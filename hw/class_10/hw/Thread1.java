package class_10.hw;

/**
 * Created by User on 11.07.2017.
 */
public class Thread1 extends Thread {
    private String name;

    public Thread1(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 8 ; i++) {
            System.out.println(name + " " + i);
        }
    }
}
