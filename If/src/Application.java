
public class Application {

	public static void main(String[] args) {
		
		int myInt = 15;
		
		if(myInt < 10) {
			System.out.println("Yes, its true!");
		}
		else if(myInt > 20){
			System.out.println("no, its false");
		}
		else{
			System.out.println("None of the above");
		}
		
		int loop = 0;
		
		while(true){
			System.out.println("Looping: " + loop);
			
			if(loop == 15) {
				break;
			}
			loop++;
			System.out.println("Running");
		}
	}

}
