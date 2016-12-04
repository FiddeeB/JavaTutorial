class Robot {
	public void speak(String text) {
		System.out.println(text);
	}
	public void jump(int high) {
		System.out.println("How high can he jump: " + high + " Meter!");
	}
	public void moving(String direction, double distance) {
		System.out.println("Moving " + distance + " in " + direction);
	}
}

public class App {

	public static void main(String[] args) {
		Robot sam = new Robot();
		sam.speak("Hi i am sam");
		sam.jump(14);
		sam.moving("South", 12.30);
		
		
		String greeting = "Hello there!";
		sam.speak(greeting);
		
		int value = 15;
		sam.jump(value);


	}

}
