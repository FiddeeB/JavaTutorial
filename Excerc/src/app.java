class Zoo {
	public void zoo1(int num, String text, String fail) {
		System.out.println("My pets name is: " + text + " and i grew up in: " + fail + "this is the number eleven " + num);
	}
}


public class app {

	public static void main(String[] args) {
		Zoo zoo3 = new Zoo();
		zoo3.zoo1(11, "M�rten", "Tr�lshult");

	}

}
