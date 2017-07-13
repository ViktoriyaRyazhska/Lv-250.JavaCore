
public class Task2 {
	public final static Object first = new Object();
	public final static Object second = new Object();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread() {
			   public void run() {
			     synchronized (first) {
			    	 try {
							Thread.sleep(100);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
			         synchronized (second) {
			            System.out.println("Success!");
			   }  }  }  };
			   Thread t2 = new Thread() {
				   public void run() {
				      synchronized (second) {
				    	  try {
								Thread.sleep(100);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
				         synchronized (first) {
				            System.out.println("Success!");
				         }
				      }
				   }
				};
				t1.start();
				t2.start();
	}

}
