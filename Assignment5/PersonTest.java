

import java.util.ArrayList;
import java.util.Collections;

public class PersonTest {
	public static void main(String[] args) {
		ArrayList<Person> people = new ArrayList<>();
		Person p = new Person("Joe", "Smith", 40);
		Person p1 = new Person("Amy", "Gold", 32);
		Person p2 = new Person("Tony", "Stork", 21);
		Person p3 = new Person("Sean", "Irish", 24);
		Person p4 = new Person("Tina", " Brock", 28);
		Person p5 = new Person("Lenny", "Hep", 18);
		people.add(p);
		people.add(p1);
		people.add(p2);
		people.add(p3);
		people.add(p4);
		people.add(p5);

		// sort Persons array using Comparator by lengh of lastname
		Collections.sort(people, Person.LastnameComparator);
		System.out.println(" ");
		System.out.println("Persons list sorted by the lengh of lastname in ascending order:\n");
		System.out.println(people);
		System.out.println("------------------------------------------- ");
		System.out.println(" ");

		// sort Persons array using Comparator by Age
		Collections.sort(people, Person.AgeComparator);
		System.out.println(" ");
		System.out.println("Persons list sorted by Age in ascending order:\n");
		System.out.println(people);
		System.out.println("------------------------------------------- ");
		System.out.println(" ");

		// sort Persons array using Comparator by first Name
		Collections.sort(people, Person.FirstNameComparator);
		System.out.println(" ");
		System.out.println("Persons list sorted by first Name in ascending order:\n");
		System.out.println(people);
		System.out.println("------------------------------------------- ");
		System.out.println(" ");

		// sort Persons array using Comparator by lengh of lastname
		Collections.sort(people, Person.LastnameComparatorDescending);
		System.out.println(" ");
		System.out.println("Persons list sorted by the lengh of lastname in descending order:\n");
		System.out.println(people);
		System.out.println("------------------------------------------- ");
		System.out.println(" ");

		// sort Persons array using Comparator by Age
		Collections.sort(people, Person.AgeComparatorDescending);
		System.out.println(" ");
		System.out.println("Persons list sorted by Age in descending order:\n");
		System.out.println(people);
		System.out.println("------------------------------------------- ");
		System.out.println(" ");

		// sort Persons array using Comparator by first Name
		Collections.sort(people, Person.FirstNameComparatorDescending);
		System.out.println(" ");
		System.out.println("Persons list sorted by first Name in descending order:\n");
		System.out.println(people);
		System.out.println("------------------------------------------- ");
		System.out.println(" ");

	}
}
