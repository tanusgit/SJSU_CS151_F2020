package ass3;

public class Executive extends Employee {
	private Double yearlyBonus;
	private Double yearlyCompensation;

	public Executive(Double yearlyBonus, Double yearlyCompensation) {
		super();
		this.yearlyBonus = yearlyBonus;
		this.yearlyCompensation = yearlyCompensation;
	}

	public Executive(String firstName, String lastName, Address address, int id, Double pay, Double bonus) {
		super(firstName, lastName, address, id);
		yearlyBonus = pay;
		yearlyCompensation = bonus;
	}

	public Double getyearlyCompensation() {
		return yearlyCompensation;
	}

	public Double getBonus() {
		return yearlyBonus;
	}

	public void setBunus(Double bonus) {
		yearlyBonus = bonus;
	}

	public String toString() {
		return "Executive" + " = " + getFirstName() + " " + getLastName() + " " + getID() + " " + getAddress() + " "
				+ " $"+ getBonus() + " "+ " $" + getyearlyCompensation();
	}

	public void introduce(boolean displaySSN) {
		String res = toString();
		if (displaySSN == true) {
			System.out.println(res + " and ssn is " + getSSN());
		} else {
			System.out.println(res);
		}

	}

	public Double computePay() {
		return yearlyBonus + yearlyCompensation;
	}

}