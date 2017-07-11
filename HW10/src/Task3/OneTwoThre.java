package Task3;

public class OneTwoThre extends Thread {
	 public static void main(String[] args) {  
	final Thread t1 = new Thread("One") {
       @Override
       public void run()  {
           System.out.println(Thread.currentThread().getName());
       }
   };
   t1.start();
   final Thread t2 = new Thread("Thread number two") {
       @Override
       public void run() {for (int i = 0; i < 3; i++) {
                      try {
               t1.join();
           } catch ( InterruptedException e ) {
                             e.printStackTrace();
           }
           System.out.println(Thread.currentThread().getName());
       }
       }}; t2.start();

   Thread t3 = new Thread(t2, "Thread number three") {
       @Override
       public void run() {for (int i = 0; i < 5; i++) {
          
           try {
               t2.join();
           } catch ( InterruptedException e ) {
               e.printStackTrace();
           }
           System.out.println(Thread.currentThread().getName());
       }}
   };
       t3.start();
   }
  
}
