package cs151;

public class Person {
	String firstname, lastname;
	int age;
	int socialSecurityNumber;
	String address;
	String gender;
	double weight;

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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber(int socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public Person(String firstname, String lastname, int age, int socialSecurityNumber, String address, String gender,
			double weight) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
		this.socialSecurityNumber = socialSecurityNumber;
		this.address = address;
		this.gender = gender;
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Person [firstname=" + firstname + ", lastname=" + lastname + ", age=" + age + ", socialSecurityNumber="
				+ socialSecurityNumber + ", address=" + address + ", gender=" + gender + ", weight=" + weight + "]";
	}

	public void introduce() {
		String res;
		res = firstname + " " + lastname + " " + age + " " + socialSecurityNumber + " " + address + "" + gender + " "
				+ weight;
		System.out.println(res);
	}

}
