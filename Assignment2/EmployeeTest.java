

public class EmployeeTest {
public static void main(String[] args) {
	Employee emp1 = new Employee("Joe", "Smith", 45, 7894561, "San Jose", "Male", 123.2, 1, "fulltime", 120000.0);
	double salary  = emp1.calculatePay(2);
	String strSalary = String.format("%.2f", salary);  
	System.out.println("the employee should get paid $" + strSalary);
	//Joe Smith, a contractor, pay is $60/hr, 
	//should get paid or working 30 hours, other details are up to you
	emp1.introduce();
	
}
}
