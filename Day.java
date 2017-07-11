import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day {

	
	
	public enum day {
		Sunday, нед≥л€, Monday, понед≥лок, Tuesday, в≥второк, Wednesday, середа, Thursday, четвер, Friday, п€тниц€, Saturday, субота
	}
	
	
	
		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(
					new InputStreamReader(System.in));
					
		System.out.println("Hi, enter the number, please!");
		String number = br.readLine();
		String result=continetCountry(number);
		System.out.println(result);
	}
		
	public static String continetCountry(String number){
			day d = null;
			String result = "";
		switch (number) {
		case "1":
			result = d.Sunday.toString() + ", " + d.нед≥л€.toString();
			break;
		case "2":
			result = d.Monday.toString() + ", " + d.понед≥лок.toString();
			break;
		case "3":
			result = d.Tuesday.toString() + ", " + d.в≥второк.toString();
			break;
		case "4":
			result = d.Wednesday.toString() + ", " + d.середа.toString();
			break;
		case "5":
			result = d.Thursday.toString() + ", " + d.четвер.toString();
			break;
		case "6":
			result = d.Friday.toString() + ", " + d.п€тниц€.toString();
			break;
		case "7":
			result = d.Saturday.toString() + ", " + d.субота.toString();
			break;
		default:
			System.out.println("No this day");
			System.exit(0);

		}
			return result;
			
		
	}
}