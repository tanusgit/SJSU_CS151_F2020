

public class StudentTest {
	public static void main(String[] args) {
		// John Smith, 20 year old, 3.6 gpa, Computer Science major, School of Computer
		// Science department.
		// CS151, Object Oriented Design and Programming, CS, 6:00pm, Tue.
		Course course = new Course("CS151", "Object Oriented Design and Programming",
				"CS", "6:00pm", "Tue");
		Course course2 = new Course("GEOL1", "Essentials of Geology",
				"GEOL", "7:00pm", "Mon");
		
		Student s = new Student("John", "Smith", 20, 3.6, "Computer Science", 
				"School of Computer Science", course);
		
		 
        Student s2 = null;
 
        try
        {
 
            s2 = (Student) s.clone();
        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
 
        s2.setCourse(course2);
        s2.setAge(25);
        s2.setGpa(5.3);
        s2.setMajor("Geology");
        s2.setDepartment("Geology");
        
        
		s.printInfo();
		System.out.println(" ");
		System.out.println("-------------------------------");
		System.out.println(" ");
		s2.printInfo();
	}
}
