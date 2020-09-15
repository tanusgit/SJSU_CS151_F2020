package ass3;

public class FullTimeSalaried extends FullTimeEmployee {

	public FullTimeSalaried() {
		System.out.println("full time salaried");
	}

	public FullTimeSalaried(String firstName, String lastName, Address add, Double salary) {
		super(firstName, lastName, add, salary);

	}

	@Override
	public String toString() {
		return "FullTimeSalaried employee = " + getFirstName() + " " + getLastName() + " " + getAddress()
				+ getBasePay();
	}

	public void introduce(boolean displaySSN) {
		String res = toString();
		System.out.println(res + getSSN());
	}

	public Double computePay(int numWeeks) {
		Double pay = getBasePay();
		Double res = (pay / 48) * numWeeks;
		return res;
	}
}
