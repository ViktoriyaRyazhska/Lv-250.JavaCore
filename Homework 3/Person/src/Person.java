
import java.io.IOException;
import java.util.Scanner;



public class Person {
	
	private String name; 
	private int birthYear;
	
	Person() {
	}

	Person(String name, int birthYear) {
		this.name = name;
		this.birthYear = birthYear;
	}


	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public int getBirthYear() {
		return this.birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;

	}	
	
	public int age() {
		 int age = 2017 - this.birthYear;
		 return age;
	}
	  
	   
	
	public  void input() throws NumberFormatException, IOException{
		Scanner sc = new Scanner(System.in);
		System.out.println("Write the name: ");
		this.name = sc.nextLine();
		System.out.println("Write the birthday year: ");
		this.birthYear = sc.nextInt();
	}
	public void changeName(){
		 Scanner sc = new Scanner(System.in);
		    System.out.println("Enter the new name: ");
		    this.name = sc.nextLine();
		    System.out.println("New name is: " + this.name);

	}
	public void  output() {
		System.out.println("Name: " + name + ". Year of the birth: " + this.birthYear + ". Age: " + age());
		
	}
	

	

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
          
		Person per1 = new Person();
		per1.input();
		per1.changeName();
		per1.output();
		
		Person per2 = new Person();
		per2.input();
		per2.output();
		
		Person per3 = new Person();
		per3.input();
		per3.output();
		
		Person per4 = new Person();
		per4.input();
		per4.output();
		
		Person per5 = new Person();
		per5.input();
		per5.output();
		

		}		
}
		
