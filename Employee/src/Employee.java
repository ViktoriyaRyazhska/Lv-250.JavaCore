
public class Employee {

	private String name;
	private int rate;
	private int hours;
	public static int totalSum = 0;

	Employee () {
	}

	Employee (String name, int rate) {
		this.name = name;
		this.rate = rate;
	}

	Employee (String name, int rate, int hours) {
		this.name = name;
		this.rate = rate;
		this.hours = hours;
		totalSum += salary(); 
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRate() {
		return this.rate;
	}

	public void setRate(int rate) {
		totalSum -= salary();
		this.rate = rate;
		totalSum += salary();
	}

	public int getHours() {
		return this.hours;
	}

	public void setHours(int hours) {
		totalSum -= salary();
		this.hours = hours;
		totalSum += salary();
	}

	public int salary() {
		return rate * hours;
	}

	@Override
	public String toString() {
		return "Name: " + name + ". Rate: " + rate + ". Hours: " + hours ;
	}

	public int changeRate() {
		int changeRate = rate * 2;
		return changeRate;
	}

	public int bonuses() {
//		int salary = rate * hours;
		int bon = 10;
		int bonuses = bon * salary() / 100;
		return bonuses;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee  person1 = new Employee ();
		person1.setName("Andrew");
		person1.setRate(100);
		person1.setHours(9);

		Employee person2 = new Employee ("Ivan",67,4);
		
		Employee  person3 = new Employee ("Igor", 123);
		person3.setHours(45);

		System.out.println(person1);
		System.out.println("salary = " + person1.salary());
		
		System.out.println(person2);
		System.out.println(person3);
		
		System.out.println("totalSum: " + totalSum);
		


	}

	 
}