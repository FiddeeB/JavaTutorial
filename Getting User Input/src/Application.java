import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		
		input = new Scanner(System.in);
		
		//output promp
		System.out.println("Enter an floatingpoint value: ");
		
		//Wait for user to enter something
		double value = input.nextDouble();
		
		//Tell them what the endered
		System.out.println("You entered: " + value);
	}

}
