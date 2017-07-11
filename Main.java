public class Main {

	public static void main(String[] args) {
		Person person1 = new Person("Oksana", 1990);
		person1.setName("Oksana");
		person1.setBirthYear(1990);
		System.out.println("Person name is " + person1.getName());
		System.out.println("The age is "  + Person.getAge());
		
		Person person2 = new Person("Myrosia", 1985);
		person2.setName("Myrosia");
		person2.setBirthYear(1985);
		System.out.println("Person name is " + person2.getName());
		System.out.println("The age is " + Person.getAge());
		
		Person person3 = new Person("Maksym", 1980);
		person3.setName("Maksym");
		person3.setBirthYear(1980);
		System.out.println("Person name is " + person3.getName());
		System.out.println("The age is "  + Person.getAge());
		
		Person person4 = new Person("Davyd", 2002);
		person4.setName("Davyd");
		person4.setBirthYear(2002);
		System.out.println("Person name is " + person4.getName());
		System.out.println("The age is "  + Person.getAge());
		
		Person person5 = new Person("Yaryna", 1996);
		person5.setName("Yaryna");
		person5.setBirthYear(1996);
		System.out.println("Person name is " + person5.getName());
		System.out.println("The age is "  + Person.getAge());
	
	}
}
