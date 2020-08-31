package cs151;

public class Cat extends Animal implements Scratcher, Swimmer{
	public void scratch(){
		System.out.println("I am a cat, and I am scratching myself");
	}
	public void swim() {
		System.out.println("I am a cat, and I am swimming.");
	}
	
	public static void walk() {
		System.out.println("I am a cat, and I am walking.");
	}
	
	public static void greetHuman() {
		System.out.println("I am a cat, and I am saying hello to everyone.");
	}
}
