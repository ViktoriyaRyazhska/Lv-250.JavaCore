package task2;

public class ContractEmployee extends Employee {
	String name;
	int federalTaxIdmember;
	int fixedMounthlyPayment;

	public ContractEmployee(String name, int federalTaxIdmember, int fixedMounthlyPayment) {
		super();
		this.name = name;
		this.federalTaxIdmember = federalTaxIdmember;
		this.fixedMounthlyPayment = fixedMounthlyPayment;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getFederalTaxIdmember() {
		return federalTaxIdmember;
	}

	public void setFederalTaxIdmember(int federalTaxIdmember) {
		this.federalTaxIdmember = federalTaxIdmember;
	}

	public int getFixedMounthlyPayment() {
		return fixedMounthlyPayment;
	}

	public void setFixedMounthlyPayment(int fixedMounthlyPayment) {
		this.fixedMounthlyPayment = fixedMounthlyPayment;
	}

	@Override
	public int AverMonSa() {
		int AverMonSa;
		return AverMonSa = fixedMounthlyPayment;
	}

}
