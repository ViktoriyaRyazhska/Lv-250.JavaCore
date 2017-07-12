package HW;

public class Task1 {

	public static void main(String[] args) throws InterruptedException {
		Thread t1 = new MyThread(1, "Hello, world");
		Thread t2 = new MyThread(2, "Peace in the peace");
		Thread t3 = new MyThread(3, "Some text");
		
		t1.start();
		t2.start();

		t1.join();
		t2.join();

		t3.start();
	}

}
class MyThread extends Thread {
	private int number;
	private String str;

	public MyThread(int number, String str) {
		this.number = number;
		this.str = str;
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Thread " + number + " " + str);
		}
	}
}