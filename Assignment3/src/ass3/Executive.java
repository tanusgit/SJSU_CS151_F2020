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

	public Double getBonus() {
		return yearlyBonus;
	}

	public void setBunus(Double bonus) {
		yearlyBonus = bonus;
	}

	public String toString() {
		return yearlyBonus + " " + yearlyCompensation;
	}

	public void introduce(boolean displaySSN) {

	}

	public Double computePay() {
		return 0.0;
	}

}
