class Person {
	String name; //Instance som personen ska ha
	int age; //Instance som personen ska ha
	
	void speak(){ //S�ger vad som ska h�nda om void speak blir called fr�n main class
		System.out.println("My name is: " + name);
	}
	int calculateYearsToRetirement() { //S�ger vad som ska h�nda om int calc blir called fr�n main
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
		
		person1.name = "Hokan"; //Best�mmer namnet
		person1.age = 22; //Best�mmer �lder
		
		person1.speak(); //Callar void speak
		int years =	person1.calculateYearsToRetirement(); //s�tter en ny int till person1.calc
		System.out.println("Years till retirement: " + years); //Printar years som nu �r satt till person1.calc
		
		int age = person1.getAge(); //S�tter int till person1.age
		String name = person1.getName(); //s�tter string ill person1.name
		
		System.out.println(age); //Callar int getAge
		System.out.println(name); //Callar int getName

	}

}
