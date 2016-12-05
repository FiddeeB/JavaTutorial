import java.util.Scanner;


public class App {

	private static Scanner reader;

	public static void main(String[] args) {
		reader = new Scanner(System.in);
		int bottles = 12;
		System.out.println("How many minutes do you shower?");
		int minutes = reader.nextInt();
		System.out.println(" ");
		int water = minutes * bottles;
		
		System.out.println("Minutes: " + minutes);
		System.out.println("Bottles: " + water);
		

	}

}
