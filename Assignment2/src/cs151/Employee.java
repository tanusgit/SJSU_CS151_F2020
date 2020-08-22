package cs151;

public class Employee extends Person{
	int employeeId;
	String employeeStatus;
	double basePay;
	double salary;
	int unit;
	
	//Joe Smith, a contractor, pay is $60/hr, should get paid or working 30 hours,
	public double calculatePay(int unit) {
		this.unit = unit;
		if(employeeStatus.equals("fulltime")) {
			salary = basePay * 1/52 * unit;
		}
		else if(employeeStatus.equals("parttime")) {
			salary = basePay * unit;
			
		}
		else if(employeeStatus.equals("contractor")) {
			salary = basePay * unit;
		}
		//String strSalary = String.format("%.2f", salary);  
		//System.out.println("salary of the employee is $" + strSalary);
		return salary;
		
	}
	
	
	
	public Employee(String firstname, String lastname, int age, int socialSecurityNumber, String address, String gender,
			double weight, int employeeId, String employeeStatus, double basePay) {
		super(firstname, lastname, age, socialSecurityNumber, address, gender, weight);
		this.employeeId = employeeId;
		this.employeeStatus = employeeStatus;
		this.basePay = basePay;
	}



	public void introduce() {
		String res;
		String basePays = "";
		
		if(basePay < 999) {
			basePays = basePay + "/hr";
		}
		else if(basePay > 20000) {
			basePays = basePay + "/yr";
		}
		res = firstname + " " + lastname  + ", a " + employeeStatus + " employee, "
		+ "pay is $"  + basePays + ", working " + unit + " hours ,"+ " age is " + age + ", social security number is " + 
		socialSecurityNumber + ", address is " + address + ", gender is " + gender +
		", weight is " + weight + ", employee id is " + employeeId ;
		System.out.println(res);
	}
	
	
}
