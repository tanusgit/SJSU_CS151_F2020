package ass3;

public class Employee extends Person {
	private int id;
	private String educationLevel;
	private boolean directDeposit;
	public Employee() {
		
	}
	public Employee(String firstName, String lastName, Address address) {
		super(firstName, lastName, address);
	}
	
	public Employee(String firstName, String lastName, Address address, int id) {
		super(firstName, lastName, address);
		this.id = id;
	}

	public Employee(String firstName, String lastName, Address address, int id, String ssn) {
		super(firstName, lastName, address, ssn);
		this.id = id;
	}

	public int getID() {
		return id;
	}

	public String getEducation() {
		return educationLevel;
	}

	public boolean getDirectDeposit() {
		return directDeposit;
	}

	public void setID(int id) {
		this.id = id;
	}

	public void setEducation(String n) {
		educationLevel = n;
	}

	public void setDirectDeposit(boolean m) {
		directDeposit = m;
	}
}
