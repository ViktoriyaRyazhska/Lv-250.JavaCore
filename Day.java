import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day {

	
	
	public enum day {
		Sunday, �����, Monday, ��������, Tuesday, �������, Wednesday, ������, Thursday, ������, Friday, �������, Saturday, ������
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
			result = d.Sunday.toString() + ", " + d.�����.toString();
			break;
		case "2":
			result = d.Monday.toString() + ", " + d.��������.toString();
			break;
		case "3":
			result = d.Tuesday.toString() + ", " + d.�������.toString();
			break;
		case "4":
			result = d.Wednesday.toString() + ", " + d.������.toString();
			break;
		case "5":
			result = d.Thursday.toString() + ", " + d.������.toString();
			break;
		case "6":
			result = d.Friday.toString() + ", " + d.�������.toString();
			break;
		case "7":
			result = d.Saturday.toString() + ", " + d.������.toString();
			break;
		default:
			System.out.println("No this day");
			System.exit(0);

		}
			return result;
			
		
	}
}