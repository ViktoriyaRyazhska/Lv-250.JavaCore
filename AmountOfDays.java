import java.util.Scanner;

public class AmountOfDays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int d = 0;
		int month[] = new int[12];
		month[0] =31;
		month[1] =28;
		month[2] =31;
		month[3] =30;
		month[4] =31;
		month[5] =30;
		month[6] =31;
		month[7] =31;
		month[8] =30;
		month[9] =31;
		month[10] =30;
		month[11] =31;
		 for ( ; d < month.length; d++) {
		System.out.println("Input month number");
		d = Integer.parseInt(sc.nextLine());
		System.out.println(month[d]); 
		break;
		 }
	}
}
				
	
		
		

			



