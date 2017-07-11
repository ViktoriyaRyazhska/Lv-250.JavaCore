public class Hello extends Thread {
	String message;
		int pause;

	public Hello(String message,  int pause) {
		this.message = message;
		this.pause = pause;
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				sleep(pause);
			} catch (InterruptedException e) {
			}
			System.out.println("Hello world");
			System.out.println("Peace in the peace");
			
		}
	}

	
	public static void main(String[] args) throws Exception {
		Thread m1 = new Hello("Hello world", 2000);
		Thread m2 = new Hello("Peace in the peace", 3000);
		m1.start();
		m2.start();
		m1.join();
		m2.join();
		System.out.println("My name is Orysia");
	}
}