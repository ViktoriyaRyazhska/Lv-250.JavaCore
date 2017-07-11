import java.util.Scanner;

public class div {
	public static void main(String[] args) {
	
		double a = 10.2;
		double b = -5.648;
		String format = "%.2f";
	try {
	            double c = a/b;
				System.out.printf(format, c);
	} catch (ArithmeticException e) {
		System.err.println(e);
		}
	System.out.println();
	System.out.println("counted!");
	
			}
}

