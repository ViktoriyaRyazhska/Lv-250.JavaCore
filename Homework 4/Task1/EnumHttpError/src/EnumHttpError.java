import java.util.Scanner;

public class EnumHttpError {
public enum HttpError{
	Bad_Request,  Unauthorized, Payment_Required;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number of HTTP Error: ");
		Scanner sc = new Scanner(System.in);
		int err = sc.nextInt();
		sc.close();
		
		switch(err){
		case 400: 
			System.out.println(HttpError.Bad_Request);
		break;
		case 401: 
			System.out.println(HttpError.Unauthorized);
		break;
		case 402: 
			System.out.println(HttpError.Payment_Required);
		break;
		default:
			System.out.println("Not a valid command");
		}
	}

}
