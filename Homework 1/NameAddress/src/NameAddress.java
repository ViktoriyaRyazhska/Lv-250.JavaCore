import java.util.Scanner;
public class NameAddress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		String address;
		System.out.println("What is your name?");
		Scanner sc = new Scanner(System.in);
		name = sc.nextLine();
		System.out.println("Where are you live?");
		address = sc.nextLine();
		System.out.println("Your name is " + name + ", and your live in " + address + ".");
		sc.close();
	}

}
