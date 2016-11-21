
public class Application {

	public static void main(String[] args) {
		int myNumber = 199; // Små nummer 30 eller 32bit
		short myShort = 8008; // Lite större nummer 60bit
		long myLong = 203588; // Stora nummer 64bit
		
		double myDouble = 5036; //Nummer med mer exakta värdesiffror
		float myFloat = 7.78f; //Skriva nummer med exakta värdesiffror. Måste lägga till ett "f" efter sista siffran
		
		char myChar = 'X'; // bokstav
		boolean myBoolean = true; //true eller falsk
		
		byte myByte = 120; //Mindre nummer upp till 127. 8bit
		
		System.out.println(myNumber);
		System.out.println(myShort);
		System.out.println(myLong);
		System.out.println(myDouble);
		System.out.println(myFloat);
		System.out.println(myChar);
		System.out.println(myBoolean);
		System.out.println(myByte);
	}

}
