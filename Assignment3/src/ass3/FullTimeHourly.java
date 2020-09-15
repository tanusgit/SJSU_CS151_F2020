package ass3;

public class FullTimeHourly extends FullTimeEmployee {
	private Double overtimePay;

	public FullTimeHourly() {

	}

	public FullTimeHourly(String firstName, String lastName, Address address, int id, Double basePay, Double overtime) {
		super(firstName, lastName, address, id, basePay);
		this.overtimePay = overtime;
	}

	public Double getOvertimePay() {
		return overtimePay;
	}

	public void setOvertime(Double pay) {
		overtimePay = pay;
	}

	@Override
	public String toString() {
		return "FullTimeHourly employee " + getFirstName() + " " + getLastName() + " " + getAddress() + overtimePay;
	}

	public void introduce(boolean displaySSN) {
		String res = toString();
		System.out.println(res + getSSN());
	}

	public Double computePay(int numHrs) {
		Double pay = getBasePay();
		Double res = (pay / (48 * 40)) * numHrs;
		return res + overtimePay;
	}
}
