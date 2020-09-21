package ass4;

public class Employee {
	private String firstname;
	private String lastname;
	private int employeeId;
	private int hourlyPay;

	
	
	
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

	public double computePay(int hr) {
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
	public TooManyHoursWorkedException(String s) {
		s = "Number of hours cannot be more than 40";
		System.out.println(s);
	}
}


	