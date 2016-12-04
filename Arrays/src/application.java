
public class application {

	public static void main(String[] args) {

		int value = 7; // Säger att value ska vara 7
		int[] values; // Sätter en array för values
		values = new int[3]; // skapar values array som kan innehålla tre olika
								// svar
		System.out.println(values[0]); // printar values 0 som är 0
		System.out.println(value); // printar value som är satt till 7

		values[0] = 10; // Sätter values 0 till 10
		values[1] = 18; // Sätter values 1 till 18
		values[2] = 32; // Sätter values 2 till 32

		System.out.println(values[0]); // Printar values 0
		System.out.println(values[1]); // Printar values 1
		System.out.println(values[2]); // Printar values 2

		for (int i = 0; i < values.length; i++) { // Gör en loop som gör att
													// hela array för values
													// blir utskriven
			System.out.println(values[i]);
		}
		int[] numbers = { 5, 6, 7 };
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}

}
