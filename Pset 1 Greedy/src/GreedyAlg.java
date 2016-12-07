/**
 * Created by fredr on 2016-12-07.
 */
import java.util.Scanner;

public class GreedyAlg {
    public static void main(String[] args) throws Exception {

            //Instruction to the user.
            System.out.println("Enter cost:");
            //Deploys a new scanner with variable reader.
            Scanner reader = new Scanner(System.in);
            //Sets the scanners input to the variable amount
            int amount = reader.nextInt();
            //Creates an int array with 3 coin values
            int coin[] = {20,5,1};
            //Creates a num variable for later use
            int num;

            //Creates a for loop which sets i to zero and makes the loop repeat itself if i is less than coin and that i should add 1 for each repeat
            for(int i = 0 ; i < coin.length; i++) {
                //Set the variable num to be equal to amount/coin[i]
                num=amount/coin[i];
                //Prints the value of num + $ sign  and what coins used
                System.out.println(num + " $" + coin[i]);
                //
                amount -= num * coin[i];
        }




    }
}
