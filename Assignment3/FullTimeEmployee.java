package ass3;

public abstract class FullTimeEmployee extends Employee {
	private Double basePay;

	public FullTimeEmployee() {

	}

	public FullTimeEmployee(String firstName, String lastName, Address address, Double basePay) {
		super(firstName, lastName, address);
		this.basePay = basePay;
	}

	public FullTimeEmployee(String firstName, String lastName, Address address, int id, Double basePay) {
		super(firstName, lastName, address, id);
		this.basePay = basePay;
	}

	public Double getBasePay() {
		return basePay;
	}

	public void setBasePay(Double pay) {
		basePay = pay;
	}

}
