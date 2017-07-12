import java.util.Scanner;


public class TenInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] tenInteger = new int[10];
		
		System.out.println("Enter 10 integer numbers: ");
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < tenInteger.length; i++)
			tenInteger[i] = sc.nextInt();
	   
		sc.close();
		
			System.out.println("10 integer numbers: ");
		for(int i = 0; i < tenInteger.length; i++)
			System.out.print(tenInteger[i] + ", ");
			System.out.println();
		
			System.out.println("Sum of 5 elements: ");
		int sum = 0;
		for(int i = 0; i < 5; i++)
			if (tenInteger[i] > 0){
				sum +=  tenInteger[i]; 
			}else if(tenInteger[i] != 0){
				 for(int j = 5; j < tenInteger.length-2; j++)
					sum *=  tenInteger[j];
				/* !!! Проблема з отриманням добутку 5 отанніх чисел!!! */	
					  
			}
		System.out.println(sum);	
    
	
	}

}
