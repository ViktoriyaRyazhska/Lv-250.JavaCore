package com.edu.classwork10.task2;

public class PeaceInThePeace {

	public static void main(String[] args) throws InterruptedException {
		for (int i = 0; i < 5; i++) {
			System.out.println("Hello, world");
			Thread.sleep(2000);
		}
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Peace in the peace");
			Thread.sleep(3000);
		}
		
		System.out.println("My name is...");
	}

}
