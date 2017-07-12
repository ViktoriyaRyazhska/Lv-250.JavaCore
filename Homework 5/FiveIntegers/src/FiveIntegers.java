import java.util.Scanner;

public class FiveIntegers {
	
	public static void main(String[] args) {
			// TODO Enter 5 integer numbers. Find 
			//position of second positive number;
			//minimum and its position in the array.

			int [] fiveIntegers = new int[5];
			int j = 0;
			int k = 0;
			int min = 0; 
			int p = 0;
			System.out.println("Enter 5 integer numbers: ");
			
			Scanner sc = new Scanner(System.in);
			
			for(int i = 0; i < fiveIntegers.length; i++)
				fiveIntegers[i] = sc.nextInt();
			
			System.out.println("Five integer numbers: ");
			
			for(int i = 0; i < fiveIntegers.length; i++)
				System.out.print(fiveIntegers[i] + ", ");
				System.out.println();
			
			for(int i = 0; i < fiveIntegers.length; i++)
				if (fiveIntegers[i] >= 0){
					j++;
					if (j == 2) {
					
					k = fiveIntegers[i]; 
					
					break;
					}
				}
				
			System.out.println("Second positive number is " + k + "in position " + "[" + j  + "]");
			// !!!не коректно визначає position!!!	
			
			
			min = fiveIntegers[0];
			int m = 0;
			while (m < fiveIntegers.length) {
				if (fiveIntegers[m] < min) {
					min = fiveIntegers[j];
					p = m;
				}
				m++;
			}
			System.out.print("Minimum is " + min + " in position" + "[" + (p + 1) + "]");
			
			
			sc.close();
		

	}

}
