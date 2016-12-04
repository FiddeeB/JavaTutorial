
public class application {

	public static void main(String[] args) {
		String[] words = new String [3]; //skapar en string med 3 array värden
		
		words[0] = "Hello"; //Värde 1
		words[1] = "Tja"; // värde 2
		words[2] = "Tjena"; //värde 3
		
		System.out.println(words[2]); //printar värde 2
		
		String[] fruits = {"hej", "på", "dej."}; //Sätter en ny string array med tre värden
		
		for(String fruit: fruits) { //sätter fruit på varje array i stringen fruits
			System.out.println(fruit);
		}
		//int value = 123; //sätter en integer till 123
		
		String text = null; //sätter en string till null
		System.out.println(text); //printar string text
		
		String[] texts = new String[2]; //Sätter en ny string med variable texts som innehåller två array
		
				System.out.println(texts[0]); //printar array 0. eftersom array inte har något värde så printar den null
			
				texts[0] = "three"; //sätter array 0 till "three"
				System.out.println(texts[0]); //Printar array 0 med värde 3
	}

}
