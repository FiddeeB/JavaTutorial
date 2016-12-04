class Machine {
	private String name;
	private int code;

	public Machine() {
		this("Good", 33);
		System.out.println("Constructor running...");
		name = "Arne";
	}

	public Machine(String name) {
		System.out.println("Second constructor");
		this.name = name;
	}

	public Machine(String name, int code) {
		System.out.println("Third ruunnit");
		this.name = name;
		this.code = code;
	}
}

public class App {

	public static void main(String[] args) {
		Machine machine1 = new Machine();
		Machine machine2 = new Machine("Berra");
		Machine machine3 = new Machine("Bertil", 123);
	}

}