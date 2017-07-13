package class_10;

/**
 * Created by User on 11.07.2017.
 */
public class Thread3 extends Thread {
    @Override
    public void run()  {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello, world");
            try{
                Thread.sleep(3000);
            }catch (InterruptedException in){
                System.err.println(in);
            }

        }
    }
}
