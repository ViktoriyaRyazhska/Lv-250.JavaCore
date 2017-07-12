import java.util.Scanner;


public class UntilFirstNegative {
	
	public static void main(String[] args) {
			// TODO Organize entering integers until the first negative number. 
			// Count the product of all entered even numbers.
			int product = 1;
			int i = 0;
			
			Scanner sc = new Scanner(System.in);
		    
			do{
				
				System.out.println("Enter the numbers: ");
				
		      i =  sc.nextInt();
				
		      if (i < 0) {
					System.out.println("Negative number");
					break;
				}
				else { 
					if (i % 2 == 0 && i != 0){
					product *= i;
					System.out.println("Count the product of all entered even numbers is: " + product);
					}
				    else{
					System.out.print("");
				  }
				 }
				}while (i < 10);
				
			sc.close();
			
		}
	}