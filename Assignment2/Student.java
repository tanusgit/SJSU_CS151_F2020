

public class Student {
//fields: first name, last name, age, gpa,
//	major, department. Age should be an integer value.
//	GPA should be a floating point value. 
	private String firstname;
	private String lastname;
	private int age;
	private double gpa;
	private String major;
	private String department;
	Course course = new Course("CS151 Tue/Thur 6-7:15", "Eng101 Mon/Wed 10-11:15", "Hist100 Tue/Thur 1:30-2:45");

	public Student(String firstname, String lastname, int age, double gpa, String major, String department) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
		this.gpa = gpa;
		this.major = major;
		this.department = department;
	}

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

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	
	@Override
	public String toString() {
		return firstname + " " + lastname + ", " + age + ", " + gpa
				+ ", " + major + ", " + department;
	}


	class Course {

		/*
		 * printSchedule() method should print out the student’s course schedule to
		 * command line (using System.out.println() method). The student schedule is
		 * just a string and its details are up to you. For example, it can print
		 * something like this: CS151 Tue/Thur 6-7:15 Eng101 Mon/Wed 10-11:15 Hist100
		 * Tue/Thur 1:30-2:45
		 * 
		 */
		String course1;
		String course2;
		String course3;
		
		public Course(String course1, String course2, String course3) {
			super();
			this.course1 = course1;
			this.course2 = course2;
			this.course3 = course3;
		}

		public void printSchedule() {
			String res = course1 + "\n" + course2 + "\n" + course3 + "\n";

			System.out.println(res);
		}

	}

}
