
class Person {

	// instance variables (Data or "state")
	int age;
	String name;

	// Classes can contain

	// 1. Data
	// 2. Subroutines (Methods)
	void speak() {
		System.out.println("My name is: " + name + " and i am " + age + " years old!");
	}
}

class HundRas {
	String name;
	String ras;
	int age;
	
	void speak() {
		System.out.println("My name is: " + name + " and i am a " + ras + " and i am " + age + " years old!");
	}

}

public class app {

	public static void main(String[] args) {

		Person person1 = new Person();
		person1.name = "Fredrik Beckman";
		person1.age = 19;
		person1.speak();

		Person person2 = new Person();
		person2.name = "Anders Johanson";
		person2.age = 24;
		person2.speak();
		
		System.out.println(" ");

		HundRas hundras1 = new HundRas();
		hundras1.name = "M�rten";
		hundras1.ras = "Shetland Sheepdog";
		hundras1.age = 8;
		hundras1.speak();

		HundRas hundras2 = new HundRas();
		hundras2.name = "Gringo";
		hundras2.ras = "FlatCoated retriever";
		hundras2.age = 14;
		hundras2.speak();

	}

}