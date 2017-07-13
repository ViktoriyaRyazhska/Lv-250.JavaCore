package class_10;

/**
 * Created by User on 11.07.2017.
 */
public class Main {
    public static void main(String[] args) {
       Runnable r = new Thread2();
       Thread thread2 = new Thread(r);
       thread2.start();

       Thread3 thread3 = new Thread3();
       thread3.start();

       try{
       thread2.join();
       thread3.join();
       }catch (InterruptedException in){
           System.out.println(in);
       }
      // Thread.yield();

        System.out.println("My name is Nata");
    }
}
