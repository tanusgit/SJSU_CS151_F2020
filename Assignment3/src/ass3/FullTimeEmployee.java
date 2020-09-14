package ass3;

public abstract class FullTimeEmployee extends Employee{
	private Double basePay;
	
	public FullTimeEmployee() {
		System.out.println(basePay);
	}

	public FullTimeEmployee(String firstName, String lastName, Address address,
	int id, Double basePay) {
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
