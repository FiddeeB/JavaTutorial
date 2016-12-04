class Frog {
	private int age;
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int newAge) {
		age = newAge;
	}
	
	public String getName() {
	return name; 
	}
	public int getAge() {
		return age;
	}
	public void setInfo(String name, int age) {
		setAge(age);
		setName(name);
	}
}
public class App {

	public static void main(String[] args) {
		Frog frog1 = new Frog();
		//frog1.name = "berry";
		//frog1.age = 12;
		frog1.setName("Berra");
		frog1.setAge(10);
		
 
	}

}
