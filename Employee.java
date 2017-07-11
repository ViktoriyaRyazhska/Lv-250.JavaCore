

import java.io.IOException;
import java.util.Scanner;

public class Employee {

	
	private static String name;
	private static int departmentNumber;
	private int salary;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDepartmentNumber() {
		return departmentNumber;
	}

	public void setDepartmentNumber(int departmentNumber) {
		this.departmentNumber = departmentNumber;
	}

	public Employee(String name, int departmentNumber, int salary) {
		super();
		this.name = name;
		this.departmentNumber = departmentNumber;
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	
		public static void main(String[] args) throws IOException {
			Scanner sc = new Scanner(System.in);
			Employee[] em = new Employee[5];
			
			em[0] = new Employee("Vasya", 1, 100);
			em[1] = new Employee("Galia", 2, 200);
			em[2] = new Employee("Myrosia", 1, 800);
			em[3] = new Employee("Maksym", 2, 700);
			em[4] = new Employee("Orest", 1, 400);
			
					
		
			for (int n = 0; n < em.length; n++){	
				System.out.println("Hi, enter the number of the department (1, 2), please!");
				int department = Integer.parseInt( sc.nextLine());
			if (em[n].getDepartmentNumber() == department) {
				System.out.println(em[n].getName());
				return;
				
				
						
			}
				
	
		}
		}
}













