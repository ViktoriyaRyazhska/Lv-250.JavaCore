
public class NumberPosistion {
	public static void main(String[] args) {
		int arr[] = { 10, -15, 25, -3, 8 };

		int min = arr[0];
		int count = 0;
		int number = 0;
		int secondPositivePlace = 0;
		int minimumNegativePlace = 0;
		for (; number < arr.length; number++) {
			if (arr[number] > 0) {
				count++;
				secondPositivePlace = number;
			}
			if (count == 2) {
				break;
			}
			if (arr[number] < min) {
				min = arr[number];
				minimumNegativePlace = number;
			}
		}
		System.out.println("The position of second positive number is " + (secondPositivePlace + 1));
		System.out.print("Minimum = " + min);
		System.out.println(" is in " + (minimumNegativePlace + 1) + " place");

	}

}
