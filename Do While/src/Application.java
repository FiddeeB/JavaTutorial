import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); //l�gger in en scanner
		
		
		/*
		System.out.println("Enter a number: ");
		
		int value = scanner.nextInt();
		
		while(value !=5) {
			System.out.println("Enter a number: ");
			value = scanner.nextInt();
		}
		*/
		int value = 0; //s�tter int value till 0
		do {
			System.out.println("Enter a number: "); //printar enter a number
			value = scanner.nextInt(); //s�ger att value ska vara lika med scanner
		}
		while(value !=5); //value f�r inte bli 5
		
		System.out.println("Got 5!"); //Om scannern f�r in 5 s� ges svaret Got 5!
	}

}
