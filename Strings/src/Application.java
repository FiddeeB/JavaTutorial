
public class Application {
	public static void main(String[] args) {
		String text = "Hello!"; //Skapar en del
		String blank = "  "; //samma
		String name = "Fredrik"; //samma
		String greeting = text + blank + name; //utf�r ovanst�ende p�st�ende till samma rad
		
		int myInt = 8; //s�tter my int till 8
		double myDouble = 7.29; //s�tter my double till 7.29
		System.out.println(greeting); //printar stringen greeting
		System.out.println("My integer is;" + myInt); //printar v�rdet av myint
		System.out.println("My double is;" + myDouble); //printar v�rdet av mydouble
	}

}
