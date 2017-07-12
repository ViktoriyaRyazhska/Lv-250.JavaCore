package Threads;

public class Main {

	public static int sum = 0;

	public static void main(String[] args) 		throws Exception {
	      Thread t1 = new MyThread(1, 2000, "Hello, world");
	      Thread t2 = new MyThread(2, 3000, "Peace in the peace");
	      t1.start();
	      t2.start();
	       t1.join();
	       t2.join();
	      System.out.println("My name is ");
	   }
	}

class MyThread extends Thread {
	   private int number;
	   private int pause;
	   private String str;

	   public MyThread(int number, int pause, String str) {
	      this.number = number;
	      this.pause = pause;
	      this.str = str;
	   }
	   @Override
	   public void run() {
	      for (int i = 0; i < 5; i++) {
	         try { sleep(pause); 
	         } catch (InterruptedException e) {}
	         System.out.println("Thread " + str);
	      }
	}  }


