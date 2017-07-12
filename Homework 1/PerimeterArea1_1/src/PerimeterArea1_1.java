
import java.io.BufferedReader; 
import java.io.IOException;
import java.io.InputStreamReader;


public class PerimeterArea1_1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Flower bed is shaped like a circle. 
		//Calculate the perimeter and area by entering the radius. Output obtained results.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		double P;
        double S;
        double r;
		
        System.out.println("Entering the radius: "); 
        
        r = Integer.parseInt(br.readLine());
	      
         S = Math.PI * (r * r);
	      
	     P = Math.PI * 2 * r;
	    
	      System.out.println("Perimeter = " + P);
	      System.out.println("Area = " + S);
	}

}