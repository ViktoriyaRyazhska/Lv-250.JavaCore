package com.edu.homework6.task2;

public abstract class Employee implements Pay {

	private String name;
	private String employeeId;
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public Employee(String name, String employeeId) {
		this.name = name;
		this.employeeId = employeeId;
	}

}
