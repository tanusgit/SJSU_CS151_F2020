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
		if(employeeStatus.equals("fulltime") || basePay > 20000) {
			salary = basePay * 1/52 * unit;
		}
		else if(employeeStatus.equals("parttime") || basePay < 999) {
			salary = basePay * unit;
			
		}
		else if(employeeStatus.equals("contractor") || basePay < 999) {
			salary = basePay * unit;
		}
		//String strSalary = String.format("%.2f", salary);  
		//System.out.println("salary of the employee is $" + strSalary);
		return salary;
		
	}
	
	
	
	public int getEmployeeId() {
		return employeeId;
	}



	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}



	public String getEmployeeStatus() {
		return employeeStatus;
	}



	public void setEmployeeStatus(String employeeStatus) {
		this.employeeStatus = employeeStatus;
	}



	public double getBasePay() {
		return basePay;
	}



	public void setBasePay(double basePay) {
		this.basePay = basePay;
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
		String unitstr = "";
		
		if(basePay < 999) {
			basePays = basePay + "/hr";
			unitstr = unit + " hours ";
			
		}
		else if(basePay > 20000) {
			basePays = basePay + "/yr";
			unitstr = unit + " weeks ";
		}
		
		res = firstname + " " + lastname  + ", a " + employeeStatus + " employee, "
		+ "pay is $"  + basePays + ", working " + unitstr+ " ,"+ " age is " + age + ", social security number is " + 
		socialSecurityNumber + ", address is " + address + ", gender is " + gender +
		", weight is " + weight + ", employee id is " + employeeId ;
		System.out.println(res);
	}
	
	
}
