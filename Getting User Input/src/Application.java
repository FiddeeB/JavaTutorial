import java.util.Scanner; //inporterar scannern

public class Application {

	private static Scanner input;

	public static void main(String[] args) {
		
		input = new Scanner(System.in); //skapar scanner
		
		//output promp
		System.out.println("Enter an floatingpoint value: ");
		
		//Wait for user to enter something
		double value = input.nextDouble();
		
		//Tell them what the endered
		System.out.println("You entered: " + value);
	}

}
