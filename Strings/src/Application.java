
public class Application {
	public static void main(String[] args) {
		String text = "Hello!"; //Skapar en del
		String blank = "  "; //samma
		String name = "Fredrik"; //samma
		String greeting = text + blank + name; //utför ovanstående påstående till samma rad
		
		int myInt = 8; //sätter my int till 8
		double myDouble = 7.29; //sätter my double till 7.29
		System.out.println(greeting); //printar stringen greeting
		System.out.println("My integer is;" + myInt); //printar värdet av myint
		System.out.println("My double is;" + myDouble); //printar värdet av mydouble
	}

}
