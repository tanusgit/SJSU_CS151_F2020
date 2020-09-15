package ass3;

public class PartTimeHourly extends Employee {
	private Double baseHourlyPay;

	public PartTimeHourly() {
		System.out.println(100.0);
	}

	public PartTimeHourly(String firstName, String lastName, Address address, Double pay) {
		super(firstName, lastName, address);
		baseHourlyPay = pay;
		
	}

	public Double getHourlyPay() {
		return baseHourlyPay;
	}

	public void setHourlyPay(Double pay) {
		baseHourlyPay = pay;
	}

	@Override
	public String toString() {
		return "PartTimeHourly employee " + getFirstName() + " " + getLastName()
		+ " " + getAddress() + baseHourlyPay ;
	}

	public void introduce(boolean displaySSN) {
		String res = toString();
		System.out.println(res + getSSN());
	}
	//assuming the base pay is hourly rate provided here
	//this method retuns a Double so we cannot return -1 as specified in the
	//assignment and that is why i am returning -1.0
	public Double computePay(int numHrs) {
		if (numHrs > 40) {
			return -1.0;
		}
		else 
			return numHrs * baseHourlyPay;
	}
}
