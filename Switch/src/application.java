import java.util.Scanner; //importerar scanner

public class application {

	private static Scanner input; 

	public static void main(String[] args) {

		input = new Scanner(System.in);

		System.out.println("Please enter a command: "); //printar text
		String text = input.nextLine(); //S�ger att texten ska skrivas p� linjen undre

		switch (text) { //startar ett switch statement
		case "start": //ett case(kommandon) f�r vad switchen kan g� igenom
			System.out.println("Machine started"); //Skriver man start f�r man detta som svar
			break; //stoppar case
		case "stop": //samma som ovan
			System.out.println("Machine stopped!"); //samma som ovan
			break;
		default: //ifall det inte finns n�got igenk�nt kommando f�r det som blev skickat till scannern s� kommer command not recognized skickas
			System.out.println("Command not recognized!"); //l�s ovan
		}
		

	}

}
