
public class application {

	public static void main(String[] args) {
		String[] words = new String [3]; //skapar en string med 3 array v�rden
		
		words[0] = "Hello"; //V�rde 1
		words[1] = "Tja"; // v�rde 2
		words[2] = "Tjena"; //v�rde 3
		
		System.out.println(words[2]); //printar v�rde 2
		
		String[] fruits = {"hej", "p�", "dej."}; //S�tter en ny string array med tre v�rden
		
		for(String fruit: fruits) { //s�tter fruit p� varje array i stringen fruits
			System.out.println(fruit);
		}
		//int value = 123; //s�tter en integer till 123
		
		String text = null; //s�tter en string till null
		System.out.println(text); //printar string text
		
		String[] texts = new String[2]; //S�tter en ny string med variable texts som inneh�ller tv� array
		
				System.out.println(texts[0]); //printar array 0. eftersom array inte har n�got v�rde s� printar den null
			
				texts[0] = "three"; //s�tter array 0 till "three"
				System.out.println(texts[0]); //Printar array 0 med v�rde 3
	}

}
