

public class Animal {
	/*
	 * type of the animal, name of the animal, age, male or female, which
	 * environment it lives in (home for dogs and cats, forest for racoons, ocean
	 * for whales), and how fast it moves (e.g. x miles/hr).
	 * 
	 * move(), sound(), eat(), sleep(), toString()
	 */

	private String race;
	private String name;
	private int age;
	private String gender;
	private String homeType;
	private int speed;

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getHomeType() {
		return homeType;
	}

	public void setHomeType(String homeType) {
		this.homeType = homeType;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public static void move() {
		System.out.println("I am moving");
	}

	public static void eat() {
		System.out.println("I am eating");
	}

	public static void sleep() {
		System.out.println("I am sleeping");
	}

	public static void sound() {
		System.out.println("I am making noise");
	}

	@Override
	public String toString() {
		return "race = " + race + ", name = " + name + ", age = " + age + ", gender = " + gender + ", homeType = "
				+ homeType + ", speed = " + speed;
	}

}
