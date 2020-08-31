package cs151;

public class Dog extends Animal implements Domesticated, Swimmer{
	
	public static void bark() {
		System.out.println("I am a dog, and I am barking.");
	}
	
	public void swim() {
		System.out.println("I am a dog, and I am swimming.");
	}
	
	public void walk() {
		System.out.println("I am a dog, and I am walking.");
	}
	
	public static void greetHuman() {
		System.out.println("I am a dog, and I am saying hello to everyone.");
	}

}
