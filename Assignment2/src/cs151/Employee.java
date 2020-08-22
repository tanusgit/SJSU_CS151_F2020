package cs151;

public class Employee extends Person{
	int employeeId;
	String employeeStatus;
	int payAmount;
	
	public Employee(String firstname, String lastname, int age, int socialSecurityNumber, String address, String gender,
			double weight, int employeeId, String employeeStatus, int payAmount) {
		super(firstname, lastname, age, socialSecurityNumber, address, gender, weight);
		this.employeeId = employeeId;
		this.employeeStatus = employeeStatus;
		this.payAmount = payAmount;
	}
	
	public void introduce() {
		String res;
		res = firstname + " " + lastname + " " + age + " " + socialSecurityNumber + " " + address + "" + gender + " "
				+ weight + " " + employeeId + " " + employeeStatus + " " + payAmount;
		System.out.println(res);
	}
	
	
}
