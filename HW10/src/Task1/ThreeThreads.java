package Task1;

public class ThreeThreads extends Thread {
	 public static void main(String[] args) {  
	final Thread t1 = new Thread("Hi!") {
        @Override
        public void run() {for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName());
        }}
    };
    t1.start();
    final Thread t2 = new Thread("My name is Orysia") {
        @Override
        public void run() {for (int i = 0; i < 5; i++) {
                       try {
                t1.join();
            } catch ( InterruptedException e ) {
                              e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName());
        }
        }}; t2.start();

    Thread t3 = new Thread(t2, "I'm happy to study on Java.Core") {
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

	