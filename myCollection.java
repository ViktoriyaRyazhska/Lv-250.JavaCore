package Task1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class myCollection {
	public static void main(String[] args) {
		int[] x = new int[10];
		for (int i = 0; i < x.length; i++) {
			Random rand = new Random();
			x[i] = rand.nextInt(10);
		}

		ArrayList<Integer> myCollection = new ArrayList<Integer>();

		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + " ");
									
			if (x[i] > 0)
				myCollection.add(x[i]);

		}
		System.out.println();
		System.out.println(myCollection);
		
		 myCollection.add(2, 1);
		 myCollection.add(8, -3);
		 myCollection.add(5, -4);
		 
		 
		 
		 Arrays.sort(x);
		 for (int i = 0; i < x.length; i++) {
			
			 System.out.print(x[i] + " ");
			 }
		
		System.out.println(myCollection);
		System.out.print("position -- ");
		 System.out.print(myCollection.get(2));
		 System.out.print(", value of element -- ");
		 System.out.println(x[2]);
		 System.out.print("position -- ");
		 System.out.print(myCollection.get(8));
		 System.out.print(", value of element -- ");
		 System.out.println(x[8]);
		 System.out.print("position -- ");
		 System.out.print(myCollection.get(5));
		 System.out.print(", value of element -- ");
		 System.out.println(x[5]);
		System.out.println();

		ArrayList<Integer> newCollection = new ArrayList<Integer>();
		for (int i = 0; i < x.length; i++) {
			if (x[i] > 5)
				newCollection.add(x[i]);
		}
		System.out.println(newCollection);
	}


}
