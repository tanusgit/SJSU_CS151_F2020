package ass3;

public class Contractor extends Employee {
	private Double basePay;
	private Double baseHourlyPay;

	public Contractor() {
		System.out.println(basePay + " " + baseHourlyPay);
	}

	public Contractor(String firstName, String lastName, Address address, Double pay, int id) {
		super(firstName, lastName, address, id);
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
		return "Contractor employee = " + getFirstName() + " " + getLastName() + " " + getAddress() + basePay;
	}

	public void introduce(boolean displaySSN) {
		String res = toString();
		System.out.println(res + getSSN());
	}

	public Double computePay(int numHrs) {
		return getBasePay() * numHrs;
	}
}
