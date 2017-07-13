
public class Task1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		MyThread1 t1 = new MyThread1( );
		MyThread2 t2 = new MyThread2( );
		Thread.yield();
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		
		  for (int i = 0; i < 5; i++) {
			  System.out.println("!");
	        }
	        
	     
	}

}
