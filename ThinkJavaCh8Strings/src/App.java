/**
 * Created by fredr on 2016-12-18.
 */
public class App {
    public static void main(String[] args){
        String fruit = "Banana";
        char letter = fruit.charAt(4);
        System.out.println(letter);
        int length = fruit.length();
        System.out.println(length);
        char last = fruit.charAt(length-1);
        System.out.println(last);
        int indox = fruit.indexOf('n');
        System.out.println(indox+1);

        int index = 0;
        while(index < fruit.length()){
            char letters = fruit.charAt(index);
            System.out.println(letters);
            index = index + 1;
        }
        countChar("BananaFantoma");

        String name = "Alan Turing";
        String upperName = name.toUpperCase();
        System.out.println(upperName);

        String name1 = "Alan Turing";
        String name2 = "Ada Lovelace";

        if(name.equals(name2)) {
            System.out.println("The names a the same!");
        }

        int flag = name1.compareTo(name2);
        if(flag == 0) {
            System.out.println("The namesare the same");
        } else if (flag < 0){
            System.out.println("Name1 comes befor name2");
        } else if (flag > 0){
            System.out.println("Name2 comes bofere naem1");
        }
        

    }

    public static void countChar(String s){
        int length = s.length();
        int count = 0;

        int index = 0;
        while(index < length){
            if(s.charAt(index) == 'a') {
                count++;
            }
            index++;
        }
        System.out.println(count);
    }


}
