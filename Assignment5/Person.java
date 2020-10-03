

import java.util.Comparator;

public class Person {
	private String firstName;
	private String lastName;
	private int age;

	public Person(String firstName, String lastName, int age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + "]";
	}

	/**
	 * Comparator to sort Persons list based on length of their last name
	 */
	public static Comparator<Person> LastnameComparator = new Comparator<Person>() {

		@Override
		public int compare(Person e1, Person e2) {
			return (int) (e1.getLastName().length() - e2.getLastName().length());
		}
	};
	public static Comparator<Person> LastnameComparatorDescending = new Comparator<Person>() {

		@Override
		public int compare(Person e1, Person e2) {
			return (int) (e2.getLastName().length() - e1.getLastName().length());
		}
	};
	/**
	 * Comparator to sort Persons list based on age
	 */
	public static Comparator<Person> AgeComparator = new Comparator<Person>() {

		@Override
		public int compare(Person e1, Person e2) {
			return e1.getAge() - e2.getAge();
		}
	};

	public static Comparator<Person> AgeComparatorDescending = new Comparator<Person>() {

		@Override
		public int compare(Person e1, Person e2) {
			return e2.getAge() - e1.getAge();
		}
	};

	/**
	 * Comparator to sort Persons list based on their first name
	 */
	public static Comparator<Person> FirstNameComparator = new Comparator<Person>() {

		@Override
		public int compare(Person e1, Person e2) {
			return e1.getFirstName().compareTo(e2.getFirstName());
		}
	};

	public static Comparator<Person> FirstNameComparatorDescending = new Comparator<Person>() {

		@Override
		public int compare(Person e1, Person e2) {
			return e2.getFirstName().compareTo(e1.getFirstName());
		}
	};

}
