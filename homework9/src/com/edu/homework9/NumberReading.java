package com.edu.homework9;

import java.util.Scanner;

public class NumberReading {

	public static void main(String[] args) {

		System.out.println(readNumber(1, 100));
		
	}
	
	static int readNumber(int start, int end) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number, that belongs to the range [" + start + "; " + 
				end + "]:");
		int number = Integer.parseInt(sc.nextLine());
		sc.close();
		if (number < start || number > end) {
			throw new ArithmeticException("Number is out of range!");
		}
		return number;
	}

}
