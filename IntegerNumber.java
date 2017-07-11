
public class IntegerNumber {
	public static void main(String args[]) {
		int a = 5, b = 7, c = 10;

		if ((a > b) && (a > c))
			System.out.println("The max number is " + a);
		else if ((b > a) && (b > c))
			System.out.println("The max number is " + b);
		else if ((c > a) && (c > b))
			System.out.println("The max number is " + c);
		
		if ((a < b) && (a < c))
			System.out.println("The min number is " + a);
		else if ((b < a) && (b < c))
			System.out.println("The min number is " + b);
		else if ((c < a) && (c < b))
			System.out.println("The min number is " + c);

	}
}
