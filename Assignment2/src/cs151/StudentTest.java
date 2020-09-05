package cs151;

public class StudentTest {
	public static void main(String[] args) {
		Student student1 = new Student("John", "Smith", 20, 3.6, "Computer Science",
				"School of Computer Science department");
		System.out.println(student1);
		System.out.println();
		student1.course.printSchedule();
	}
}
