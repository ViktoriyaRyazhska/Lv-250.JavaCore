import java.util.Scanner;

public class DaysInMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arrDaysInMonth[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		
		System.out.println("Enter number of month: ");
		
		Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
        
	    System.out.println(arrDaysInMonth[n - 1]);
			
		sc.close();
	}

}
