package com.edu.homework10.task1;

public class ThreeThreads {

	public static void main(String[] args) {
		ThreeThreads t = new ThreeThreads();
		t.thread1.start();
		t.thread2.start();
		try {
			t.thread1.join();
			t.thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		t.thread3.start();
	}
	
	Thread thread1 = new Thread() {
		@Override
		public void run() {
			for (int i = 0; i < 5; i++) {
				System.out.println("Hello from thread 1!");
			}
		}
	};
	
	Thread thread2 = new Thread() {
		@Override
		public void run() {
			for (int i = 0; i < 5; i++) {
				System.out.println("Hello from thread 2!");
			}
		}
	};
	
	Thread thread3 = new Thread() {
		@Override
		public void run() {
			for (int i = 0; i < 5; i++) {
				System.out.println("Hello from thread 3!");
			}
		}
	};

}
