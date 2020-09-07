package ass3;

public abstract class Employee {
	private int id;
	private String educationLevel;
	private boolean directDeposit;

	public Employee() {

	}

	Employee(String firstName, String lastName, Address address, int id) {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEducation() {
		return educationLevel;
	}

	public void setEducation(String educationLevel) {
		this.educationLevel = educationLevel;
	}

	public boolean getDirectDeposit() {
		return directDeposit;
	}

	public void setDirectDeposit(boolean directDeposit) {
		this.directDeposit = directDeposit;
	}

}
