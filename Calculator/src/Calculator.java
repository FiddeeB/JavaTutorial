import java.util.*;

public class Calculator {
	public static void main(String[] args) {
		int num1=0; //Deklarerar inputs
		int num2=0; //samma som ovan
		char operator; //samma som ovan
		double answer = 0.0;
		
		Scanner scanObject = new Scanner(System.in);
		System.out.println("Please enter first number");
		num1 = scanObject.nextInt();
		System.out.println("Please enter second number");
		num2 = scanObject.nextInt();
		System.out.println("What operation?");
		operator = scanObject.next().charAt(0);
		
		switch (operator) { //Recieves operator statement and decides what to do with it with case
		case '+': answer = num1 + num2;
		break;
		case '-': answer = num1 - num2;
		break;
		case '*': answer = num1 * num2;
		break;
		case '/': answer = num1 / num2;
		}
		System.out.println(num1+" "+operator+" "+num2+" = "+answer);
	}
}
