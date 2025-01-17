
class Thing {
	public final static int LUCKY_NUMBER = 13; // final static. Numret �r samma
												// �verallt och kan inte
												// p�v�rkas
	public String name; // Vanlig string
	public static String description; // Static string

	public static int count = 0; // Skapar ett static int v�rde som �r samma
									// �ver allt

	public int id; // Skapar ett id. alla object har olika id

	public Thing() { // Constructor. K�rs alltid varje g�ng kod h�mtas.
		id = count;
		count++; // �kar static int v�rde med ett f�r varje g�ng n�gon kallar p�
					// Thing. osv
	}

	public void showName() {
		System.out.println("Object id: " + id + ", " + description + ": " + name);
	}

	public static void showInfo() {
		System.out.println("Hello");
		System.out.println(description);
	}
}

public class App {

	public static void main(String[] args) {

		Thing.description = "i am nice"; // Kallar p� en static string
		Thing.showInfo(); // Kallar p� en static void
		System.out.println("Befor creating object count is " + Thing.count);

		Thing thing1 = new Thing();
		Thing thing2 = new Thing();

		System.out.println("After creating objects count is " + Thing.count);

		thing1.name = "Bobby"; // s�tter ett value till variabel
		thing2.name = "Jens"; // s�tter ett value till variabel

		thing1.showName();
		thing2.showName();

		System.out.println(thing2.name); // Skickar ut ett vanligt variabel som
											// har ett value

		System.out.println(Math.PI);

		System.out.println(Thing.LUCKY_NUMBER);

	}

}
