
public class SumIntegerNumbers {

	public static void main(String[] args) {
		int arr[] = { 15, 25, 36, 41, 68, -8, -47, 85, 47, 12 };

		int sum = 0;

		for (int number = 0; number < (arr.length - 5); number++) {
			if ((arr[0] > 0) && (arr[1] > 0) && (arr[2] > 0) && (arr[3] > 0) && (arr[4] > 0)) {
				sum += arr[number];
				
			} else {

				sum = arr[5] + arr[6] + arr[7] + arr[8] + arr[9];
			}

		}
		System.out.println("The sum of numbers is:" + sum);
	}

}
