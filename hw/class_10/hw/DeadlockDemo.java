package class_10.hw;

/**
 * Created by User on 12.07.2017.
 */
public class DeadlockDemo {
    public final static  Object first = new Object();
    public final static Object second = new Object();

    public static void main(String[] args) {

        Thread t1 = new Thread(){
            @Override
            public void run() {
                synchronized (first) {
                    Thread.yield();
                        synchronized (second) {
                            System.out.println("Success!");
                        }
                    }}};
        Thread t2 = new Thread() {
            public void run() {
                synchronized (second) {
                    Thread.yield();
                    synchronized (first) {
                        System.out.println("Success!");
                    }}}};
        t1.start();
        t2.start();

        if(t1.isAlive())
            t1.notifyAll();

    }
}
