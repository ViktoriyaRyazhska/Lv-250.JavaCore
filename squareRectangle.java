package SquareRectangle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class squareRectangle {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader (
				new InputStreamReader(System.in));
	
		int a = 0;
		int b = 0;
		System.out.println("Hi! Enter the number a of rectangle!");
		a = Integer.parseInt(br.readLine());
		System.out.println("Hi! Enter the number b of rectangle!");
		b = Integer.parseInt(br.readLine());
		try {
			if (a> 0) {
				if (b>0){
					System.out.println("The area of rectangle is  " + (0.5*a*b));
				}
					}
			
			if (a<=0){
				throw new NegativeNumberException  ("The value of rectangle side cannot be negative");
			}
			if (b<=0) {
				throw new NegativeNumberException  ("The value of rectangle side cannot be negative");
				}
		
			
		} catch (NegativeNumberException e) {
		
			System.out.println("This is impossible to calculate area of rectangle with negative value of side" + e);
			
		}finally {
			System.out.println("I calculate rectangle area");
		
		}
		
		

	}
}


