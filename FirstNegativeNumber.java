import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FirstNegativeNumber {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int n = 0;
		int sum = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number, please!");
		n = Integer.parseInt(br.readLine());
		sum += n;
		for (; n > 0; n++) {
			if (n > 0) {
				System.out.println("Enter a number, please!");
				n = Integer.parseInt(br.readLine());
			}
			if (n < 0) {
				break;
			}
			sum += n;
		}
		System.out.println("The sum of entered positive numbers is: " + sum);
	}
}
