package class_10;

/**
 * Created by User on 11.07.2017.
 */
public class Thread2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Peace in the peace");
            try {
                Thread.sleep(2000);
            }catch (InterruptedException in){
                System.err.println(in);
            }

        }
    }
}
