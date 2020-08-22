package cs151;

public class StudentTest {
	public static void main(String[] args) {
		Student student1 = new Student("John", "Smith", 20, 3.6, "Computer Science",
				"School of Computer Science department");
		student1.course.printSchedule();
	}
}
