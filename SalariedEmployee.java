package task2;

import javax.management.StringValueExp;

public abstract class SalariedEmployee extends Employee {

	public int hourlyRate;
	public int NumberOfWorkHours;
	String name;
	public int getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(int hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	public int getNumberOfWorkHours() {
		return NumberOfWorkHours;
	}

	public void setNumberOfWorkHours(int numberOfWorkHours) {
		NumberOfWorkHours = numberOfWorkHours;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	String socialSecurityNumber;

	public SalariedEmployee(String socialSecurityNumber, String name, int hourlyRate, int NumberOfWorkHours) {
		super();
		this.name = name;
		this.socialSecurityNumber = socialSecurityNumber;
		this.hourlyRate = hourlyRate;
		this.NumberOfWorkHours = NumberOfWorkHours;
	}

	public int AverMonSa() {
		return hourlyRate * NumberOfWorkHours;
	}
}
