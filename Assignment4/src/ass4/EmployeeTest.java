package ass4;

public class EmployeeTest {
	public static void main(String[] args) {
		// John Smith, id = 101, hourly pay = $35/hr. Use computePay() method call to
		// print to command line what this employee earned for the following number of
		// hours:
		// 40 23 1 0 -5 45

		Employee e = new Employee("John", "Smith", 101, 35);
		try {
			double r = e.computePay(40);
			double r1 = e.computePay(23);
			double r2 = e.computePay(1);
			double r3 = e.computePay(0);
			System.out.println("pay for 40 hours is " + r);
			System.out.println("pay for 23 hours is " + r1);
			System.out.println("pay for 1 hours is " + r2);
			System.out.println("pay for 0 hours is " + r3);
		} catch (TooManyHoursWorkedException e1) {
			System.out.println(e1);
		} catch (NumberFormatException e1) {
			System.out.println("NumberFormatException happened");
		}

		try {
			double r4 = e.computePay(-5);
			System.out.println("pay for -5 hours is " + r4);
		} catch (TooManyHoursWorkedException e1) {
			System.out.println(e1);
		} catch (NumberFormatException e1) {
			System.out.println("Number of hours cannot be less than 0.");
			System.out.println(e1);
		}

		try {
			double r5 = e.computePay(45);
			System.out.println("pay for 45 hours is " + r5);
		} catch (TooManyHoursWorkedException e1) {
			System.out.println(e1);
		} catch (NumberFormatException e1) {
			System.out.println("Number of hours cannot be less than 0.");
			System.out.println(e1);
		}

	}
}
