
class Beer {
	public static void beerCountdown(int n) {
		if (n == 0) {
		System.out.println("No bottles of beer on the wall, no bottles of beer, ya� can�t takeone down, ya� can�t pass it around, �cause there are no morebottles of beer on the wall!");
	}	else {
		if (n != 0) {
		System.out.println(n + " bottles of beer on the wall, ");
		System.out.println(n + " bottles of beer, ya� take onedown, ya� pass it around,");
		System.out.println(n-1 + " bottles of beer on the wall.");
		beerCountdown(n -1);
	}
	}
	}
	
}

public class Appp {

	public static void main(String[] args) {
		Beer.beerCountdown(99);

	}

}
