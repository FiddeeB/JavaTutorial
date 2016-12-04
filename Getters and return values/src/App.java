class Person {
	String name; //Instance som personen ska ha
	int age; //Instance som personen ska ha
	
	void speak(){ //Säger vad som ska hända om void speak blir called från main class
		System.out.println("My name is: " + name);
	}
	int calculateYearsToRetirement() { //Säger vad som ska hända om int calc blir called från main
		int yearsLeft = 65 - age;
		return yearsLeft;
	}
	int getAge() { //Samma
		return age;
	}
	String getName() { //samma
		return name;
	}
}


public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person1 = new Person(); //skapar en ny person
		
		person1.name = "Hokan"; //Bestämmer namnet
		person1.age = 22; //Bestämmer ålder
		
		person1.speak(); //Callar void speak
		int years =	person1.calculateYearsToRetirement(); //sätter en ny int till person1.calc
		System.out.println("Years till retirement: " + years); //Printar years som nu är satt till person1.calc
		
		int age = person1.getAge(); //Sätter int till person1.age
		String name = person1.getName(); //sätter string ill person1.name
		
		System.out.println(age); //Callar int getAge
		System.out.println(name); //Callar int getName

	}

}
