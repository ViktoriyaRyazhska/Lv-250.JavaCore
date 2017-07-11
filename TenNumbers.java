
public class TenNumbers {

	public static void main(String[] args) {
		int arr[] = { 10, 15, 25, -3, 8, 14, 28, -49, 54, 76 };

		int max = arr[0];
		int sum = 0;
		int numbermax = 0;
		int countNegative = 0;
		int countPositive = 0;

		for (int number = 0; number < arr.length; number++) {

			if (arr[number] > max) {
				max = arr[number];
				numbermax = number;
			}
			if (arr[number] > 0) {
				sum += arr[number];
				countPositive++;
			}
			if (arr[number] < 0) {
				countNegative++;

			}

		}
		{
		}
		System.out.println("Maximum = " + max + " is in " + (numbermax + 1) + " place");
		System.out.println("The sum of posistive numbers is: " + sum);
		System.out.println("The amount of negative numbers is " + countNegative);

		if (countNegative > countPositive)  {
			System.out.println("There are more negative numbers.");
		} else {
			System.out.println("There are more positive numbers.");
		}
		System.out.println("The quantity of positive numbers is: " + countPositive);
		
	}
}