package ass3;

public abstract class Person {

	private String FirstName, LastName;
	private int Age;
	private String SSN;
	private Address Address;

	public Person(String firstName, String lastName, Address address, String sSN ) {
		super();
		FirstName = firstName;
		LastName = lastName;
		SSN = sSN;
		Address = address;
	}

	public Person() {

	}
	

	public Person(String firstName, String lastName, Address address) {
		FirstName = firstName;
		LastName = lastName;
		Address = address;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public String getSSN() {
		return SSN;
	}

	public void setSSN(String sSN) {
		SSN = sSN;
	}

	public Address getAddress() {
		return Address;
	}

	public void setAddress(Address address) {
		Address = address;
	}

	@Override
	public String toString() {
		return "Person [FirstName=" + FirstName + ", LastName=" + LastName + ", Age=" + Age + ", SSN=" + SSN
				+ ", Address=" + Address + "]";
	}

	
}
