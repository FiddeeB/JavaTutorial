
public class application {

	public static void main(String[] args) {
		
		int x, y, z;
		
		 
		x = 0;
		y = 1;
		do{
			System.out.println(x);
			z = x + y;
			x = y;
			y = z;
		} while(x < 255);
		

	}

}
