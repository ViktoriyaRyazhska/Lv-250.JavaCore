import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class readNumber {
	public static void main(String[] args) throws NumberFormatException, IOException, MyException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int start = 1;
		int end = 100;
		
		
		try {System.out.println("Hi, enter the number, please!");
		int number = Integer.parseInt(br.readLine());
			if (number <= end) {
				if (number >= start) {
					System.out
							.println("You enter the right number, which is in the range [" + start + ", " + end + "]");
				
					return;
							}
			}
			if (number > end) {
				throw new MyException("The number is bigger than the end number");
			}
			if (number < start) {
				throw new MyException("The number is smaller then the Start");

			}
			if (Integer.parseInt(br.readLine()) != number) {
				throw new MyException("You entered a text or symbol, not a number");

			}

		} catch (MyException | NumberFormatException e) {
			System.err.println("This numder doesn't belong to range [" + start + ", " + end + "]  or you entered text, or symbols " + e);

		}
	finally {
		System.out.println("Done");
	}
		
	
		
				
			}
		
			
		
	}

