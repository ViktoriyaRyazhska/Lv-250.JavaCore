import java.util.Scanner;
public class Calls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int c1 = 0; int c2 = 0; int c3 = 0; 
         int t1 = 0; int t2 = 0; int t3 = 0; 
         int sum1 = 0; int sum2 = 0; int sum3 = 0; int total = 0;
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the cost of the call to the first country: ");
          c1 = sc.nextInt();
          System.out.println("Enter the duration of the call: ");
          t1 = sc.nextInt();
          sum1 = c1 * t1;
          System.out.println("First cost is: " + sum1);
          System.out.println("Enter the cost of the call to the second country: ");
          c2 = sc.nextInt();
          System.out.println("Enter the duration of the call: ");
          t2 = sc.nextInt();
          sum2 = c2 * t2;
          System.out.println("Second cost is: " + sum2);
          System.out.println("Enter the cost of the call to the third country: ");
          c3 = sc.nextInt();
          System.out.println("Enter the duration of the call: ");
          t3 = sc.nextInt();
          sum3 = c3 * t3;
          System.out.println("Third cost is: " + sum3);
          total = sum1 + sum2 + sum3;
          System.out.println("Total is :" + total);
          sc.close();
          
         
	}

}
