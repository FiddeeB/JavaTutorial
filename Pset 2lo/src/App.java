/**
 * Created by fredr on 2016-12-06.
 */
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int height;
        System.out.println("Enter height!");
        Scanner scanner = new Scanner(System.in);

        height = scanner.nextInt();
        //Build pyramid
        for(int i = height; i >= 1; i--) {
            //Add spaces
            for(int space = 1; space < i; space++)
                System.out.print(" ");
            //Add hashtags
            for(int hash = height; hash >= i-1; hash--)
                System.out.print("#");
            System.out.println(" ");
        }
    }
}






































































































































































































































































