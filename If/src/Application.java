
public class Application {

	public static void main(String[] args) {
		
		int myInt = 15; //S�tter myInt till 15
		
		if(myInt < 10) { //s�tter ett if statement p� om myint �r st�rre �n 10
			System.out.println("Yes, its true!");
		}
		else if(myInt > 20){ //S�tter ett om annat if statement p� om myint �r mindre �n 15
			System.out.println("no, its false");
		}
		else{ //s�tter ett else statement om inget av ovanst�ende �r sanna.
			System.out.println("None of the above");
		}
		
		int loop = 0; //s�tter int med variablen loop till = 0
		
		while(true){ //s�tter en while loop med boolean true
			System.out.println("Looping: " + loop); //printar text + v�rdet p� loop
			
			if(loop == 15) { //s�ger att om loop �r 15 s� avbryts loopen
				break; //break avbryter
			}
			loop++; //s�ger att loopen ska �ka med 1 f�r varje loop
			System.out.println("Running"); //S�ger att den ska printa running en g�ng f�r varje loop
		}
	}

}
