class NLine {
	public static void nLines(int n) {
		if (n > 0) {
			System.out.println(" ");
			nLines(n - 1);
		}

	}
}

public class App {

	public static void main(String[] args) {
		System.out.println("First");

		NLine.nLines(3);
		System.out.println("Second");

	}

}
