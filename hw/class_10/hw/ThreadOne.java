package class_10.hw;

/**
 * Created by User on 12.07.2017.
 */
public class ThreadOne extends Thread {
    private String name;
    private Thread t;

    public ThreadOne(String name, Thread t) {
        this.name = name;
        this.t = t;
    }

    @Override
    public void run() {
        t.start();
        for (int i = 0; i < 3 ; i++) {
            System.out.println("Thread one");
        }
    }
}
