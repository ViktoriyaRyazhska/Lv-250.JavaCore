package com.edu.classwork9.task1;

import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int lenght = 0;
		int width = 0;
		
		try {
			System.out.println("Enter lenght:");
			lenght = Integer.parseInt(sc.nextLine());
			System.out.println("\nEnter width:");
			width = Integer.parseInt(sc.nextLine());
		}
		catch (NumberFormatException e) {
			System.out.println("\nYou entered nonnumeric value!");
		}
		
		try {
			System.out.println("\nSquare: " + squareRectangle(lenght, width));
		}
		catch (ArithmeticException e) {
			System.out.println("\nYou entered negative value!");
		}
		sc.close();
	}
	
	static int squareRectangle(int lenght, int width) {
		if (lenght < 0 || width < 0) {
			throw new ArithmeticException();
		}
		return lenght * width;
	}

}
