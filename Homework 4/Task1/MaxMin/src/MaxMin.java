import java.util.Scanner;

	public class MaxMin {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first float number: ");
			float number1 = sc.nextFloat();
		System.out.println("Enter the second float number: ");	
			float number2 = sc.nextFloat();
		System.out.println("Enter the third float number: ");	
			float number3 = sc.nextFloat();
			
		if(number1 > number2 && number1 > number3 ){
			System.out.println("The " + number1 + " is maximum number");
		}
		else if(number2 > number1 && number2 > number3){
			System.out.println("The " + number2 + " is maximum number");
		}
		else{
			System.out.println("The " + number3 + " is maximum number");
		}

		if(number1 < number2 && number1 < number3 ){
			System.out.println("The " + number1 + " is minimum number");
		}
		else if(number2 < number1 && number2 < number3){
			System.out.println("The " + number2 + " is minimum number");
		}
		else{
			System.out.println("The " + number3 + " is minimum number");
		}
		
		
	    sc.close();
		
	}

}
