

public class AnimalTest {
	public static void main(String[] args) {
		Dog dog1 = new Dog();

		dog1.bark();
		dog1.walk();
		dog1.swim();
		dog1.greetHuman();
		dog1.move();
		dog1.sleep();
		dog1.move();
		dog1.sound();

		System.out.println("-----------------------------------");

		Cat cat1 = new Cat();
		cat1.walk();
		cat1.swim();
		cat1.scratch();
		cat1.greetHuman();
		cat1.move();
		cat1.sleep();
		cat1.move();
		cat1.sound();
		System.out.println("-----------------------------------");

		Whale whale1 = new Whale();
		whale1.swim();
		whale1.move();
		whale1.sleep();
		whale1.move();
		whale1.sound();

		System.out.println("-----------------------------------");

		Racoon racoon1 = new Racoon();
		racoon1.scratch();
		racoon1.walk();
		racoon1.move();
		racoon1.sleep();
		racoon1.move();
		racoon1.sound();

	}
}
