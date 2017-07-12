import java.util.Scanner;

public class FloatNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the first float number: ");
		float number1 = sc.nextFloat();
		
	if(-5 <= number1 && number1 <= 5 ){
		System.out.println("The number is in range.");
	}
	else{
		System.out.println("Number outside the range.");
	}
	
	System.out.println("Enter the second float number: ");
	float number2 = sc.nextFloat();
	
	if(-5 <= number2 && number2 <= 5 ){
		System.out.println("The number is in range.");
	}
	else{
		System.out.println("Number outside the range.");
	}
	 
	System.out.println("Enter the third float number: ");
	    float number3 = sc.nextFloat();
	
	if(-5 <= number3 && number3 <= 5 ){
		System.out.println("The number is in range.");
	}
	else{
		System.out.println("Number outside the range.");
	}
	sc.close();
	}

}
