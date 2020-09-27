package a5;

public class Course  implements Comparable<Course>{
	private String courseName;
	private String courseDescription;
	private String department;
	private String startTime;
	private String weekday;

	public Course(String courseName, String courseDescription, String department, String startTime, String weekday) {
		super();
		this.courseName = courseName;
		this.courseDescription = courseDescription;
		this.department = department;
		this.startTime = startTime;
		this.weekday = weekday;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseDescription() {
		return courseDescription;
	}

	public void setCourseDescription(String courseDescription) {
		this.courseDescription = courseDescription;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getWeekday() {
		return weekday;
	}

	public void setWeekday(String weekday) {
		this.weekday = weekday;
	}


	@Override
	public String toString() {
		return courseName + ", " + courseDescription + ", " + department + ", " + startTime + ", " + weekday;
	}

	@Override
	public int compareTo(Course c) {
		return (this.startTime.compareTo(c.startTime));
	}

}
