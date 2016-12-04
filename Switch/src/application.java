import java.util.Scanner; //importerar scanner

public class application {

	private static Scanner input; 

	public static void main(String[] args) {

		input = new Scanner(System.in);

		System.out.println("Please enter a command: "); //printar text
		String text = input.nextLine(); //Säger att texten ska skrivas på linjen undre

		switch (text) { //startar ett switch statement
		case "start": //ett case(kommandon) för vad switchen kan gå igenom
			System.out.println("Machine started"); //Skriver man start får man detta som svar
			break; //stoppar case
		case "stop": //samma som ovan
			System.out.println("Machine stopped!"); //samma som ovan
			break;
		default: //ifall det inte finns något igenkänt kommando för det som blev skickat till scannern så kommer command not recognized skickas
			System.out.println("Command not recognized!"); //läs ovan
		}
		

	}

}
