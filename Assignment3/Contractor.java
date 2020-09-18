package ass3;

public class Contractor extends Employee {
	private Double basePay;
	private Double baseHourlyPay;


	public Contractor() {
		System.out.println(basePay + " " + baseHourlyPay);
	}

	public Contractor(String firstName, String lastName, Address address, Double pay, int id, String SSN) {
		super(firstName, lastName, address, id, SSN);
		basePay = pay;
		
	}

	public Double getBasePay() {
		return basePay;
	}

	public void setBasePay(Double pay) {
		basePay = pay;
	}

	@Override
	public String toString() {
		return "Contractor employee = " + getFirstName() + " " + getLastName() + " " + getAddress() + " $"+basePay;
	}

	public void introduce(boolean displaySSN) {
		String res = toString();
		if (displaySSN == true) {
			System.out.println(res + " and ssn is " + getSSN());
		} else {
			System.out.println(res);
		}

	}

	public Double computePay(int numHrs) {
		return getBasePay() * numHrs;
	}
}
