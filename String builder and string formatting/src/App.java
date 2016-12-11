/**
 * Created by fredr on 2016-12-10.
 */
public class App {
    public static void main(String[]args){

        //Inefficient
        String info = "";

        info += "Hello world";
        info += " ";
        info += "How are you?";

        System.out.println(info);

        //More efficient
        StringBuilder sb = new StringBuilder("");
        sb.append("My name i charles");
        sb.append(" My other name is dickens");
        sb.append(" My full name is Charles Dickens");

        System.out.println(sb.toString());

        StringBuilder s = new StringBuilder();
        s.append("Hello")
                .append("How are you?")
                .append("I am fine");

        System.out.println(s.toString());

        /**
         * Formatting
         */

        System.out.println("Here is some text!\tThat was a tab.\n that was a new line.");

        System.out.printf("This is sparta! %d: \nThat would be %d", 5, 200);
        //%d = integer
        //%f = Floating point
        //%s = String
        }

    }

