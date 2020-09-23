

public class Student implements Cloneable {
//fields: first name, last name, age, gpa,
//	major, department. Age should be an integer value.
//	GPA should be a floating point value. 
	private String firstname;
	private String lastname;
	private int age;
	private double gpa;
	private String major;
	private String department;
	private Course course;

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

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Student(String firstname, String lastname, int age, double gpa, String major, String department,
			Course course) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
		this.gpa = gpa;
		this.major = major;
		this.department = department;
		this.course = course;
	}

	public void printInfo() {
		System.out.println(firstname + " " + lastname + ", " + age + " year old, " + gpa
				+ " gpa, " + major + " major, " + department + " department, " + course);
	}
	
	protected Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }

}
