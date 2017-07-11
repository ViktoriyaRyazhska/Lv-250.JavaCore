import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.NoRouteToHostException;

public class Country {

	
	
	public enum country {
		Europe, Asia, Africa, Australia, America
	}

	
		public static void main(String[] args) throws IOException  {
			BufferedReader br = new BufferedReader(
					new InputStreamReader(System.in));
					
		System.out.println("Hi, enter the name of the country, please!");
		String name = br.readLine();
		country continent=continetCountry(name);
		System.out.println(continent);
		
	}

				
	public static country continetCountry(String name){
		country continent;
		continent = country.Africa;
		continent = country.America;
		continent = country.Asia;
		continent = country.Australia;
		continent = country.Europe;
		
		
		switch (name) {
		case "Ukraine" : case "Russia"  : case "UK" : case "Poland" : 
			continent = country.Europe;
			break;
		case "China" : 
			continent = country.Asia;
			break;
		case "USA" : case "Canada"  : case "Mexico" : case "Brazil" : case "Paraguay" : case "Colombia" : case "Peru" :
			continent = country.America;
			break;
		case "Marocco" : case "Egypt"  :  
			continent = country.Africa;
			break;
		case "Australia" :  
			continent = country.Australia;
			break;
		default:
			System.out.println("No this country");
			System.exit(0);

		}
			return continent;
			
		
	}
}

