
public class application {

	public static void main(String[] args) {

		int value = 7; // S�ger att value ska vara 7
		int[] values; // S�tter en array f�r values
		values = new int[3]; // skapar values array som kan inneh�lla tre olika
								// svar
		System.out.println(values[0]); // printar values 0 som �r 0
		System.out.println(value); // printar value som �r satt till 7

		values[0] = 10; // S�tter values 0 till 10
		values[1] = 18; // S�tter values 1 till 18
		values[2] = 32; // S�tter values 2 till 32

		System.out.println(values[0]); // Printar values 0
		System.out.println(values[1]); // Printar values 1
		System.out.println(values[2]); // Printar values 2

		for (int i = 0; i < values.length; i++) { // G�r en loop som g�r att
													// hela array f�r values
													// blir utskriven
			System.out.println(values[i]);
		}
		int[] numbers = { 5, 6, 7 };
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}

}
