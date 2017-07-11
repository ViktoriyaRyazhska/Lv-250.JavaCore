import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Error {
	public enum HTTPError {
		BadRequest, Unauthorized, HTTP_STATUS_PAYMENT_REQ
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Hi, enter the number of error (400, 401, 402), please!");
		String number = br.readLine();
		HTTPError nameOfError = HTTP(number);
		System.out.println(nameOfError);
	}

	public static HTTPError HTTP(String number) {
		HTTPError nameOfError;
		nameOfError = HTTPError.BadRequest;
		nameOfError = HTTPError.Unauthorized;
		nameOfError = HTTPError.HTTP_STATUS_PAYMENT_REQ;

		switch (number) {
		case "400":
			nameOfError = HTTPError.BadRequest;
			break;
		case "401":
			nameOfError = HTTPError.Unauthorized;
			break;
		case "402":
			nameOfError = HTTPError.HTTP_STATUS_PAYMENT_REQ;
			break;

		default:
			System.out.println("No this error");
			System.exit(0);

		}
		return nameOfError;

	}
}
