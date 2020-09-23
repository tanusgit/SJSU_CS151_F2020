

public class Employee {
	private String firstname;
	private String lastname;
	private int employeeId;
	private int hourlyPay;

	public Employee(String firstname, String lastname, int employeeId, int hourlyPay) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.employeeId = employeeId;
		this.hourlyPay = hourlyPay;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public int getHourlyPay() {
		return hourlyPay;
	}

	public void setHourlyPay(int hourlyPay) {
		this.hourlyPay = hourlyPay;
	}

	@Override
	public String toString() {
		return firstname + " " + lastname + ", " + employeeId + ", " + hourlyPay;
	}

	public double computePay(int hr) throws TooManyHoursWorkedException {
		if (hr < 0) {
			throw new NumberFormatException();
		}
		if (hr > 40) {
			throw new TooManyHoursWorkedException();
		}
		double pay;
		pay = hr * hourlyPay;
		return pay;
	}
}

class TooManyHoursWorkedException extends Exception {
	public TooManyHoursWorkedException() {
		String s = "Number of hours cannot be more than 40";
		System.out.println(s);
	}
}
