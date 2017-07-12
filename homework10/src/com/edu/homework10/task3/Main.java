package com.edu.homework10.task3;

public class Main {

	public static void main(String[] args) {

		ThreadOne thread1 = new ThreadOne(thread2);
		thread1.start();
		thread3.start();

	}

	static Thread thread2 = new Thread() {
		@Override
		public void run() {
			for (int i = 0; i < 3; i++) {
				System.out.println("Thread number two");
			}
		}
	};

	static Thread thread3 = new Thread() {
		@Override
		public void run() {
			for (int i = 0; i < 5; i++) {
				System.out.println("Thread number three");
			}
		}
	};

}
