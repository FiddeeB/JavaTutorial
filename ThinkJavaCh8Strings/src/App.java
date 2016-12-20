/**
 * Created by fredr on 2016-12-18.
 */
class Palindrom{
    public static void first(String s){
        char q = s.charAt(0);
        System.out.println(q);

    }

    public static void last(String s){
        char q = s.charAt(s.length()-1);
        System.out.println(q);

    }

    public static void middle(String s){
        char q = s.charAt(0);
        char y = s.charAt(s.length()-1);

        System.out.println(s.substring(q, y));

    }
}
class Mystery{

    public static String mystery(String s){
        int i = s.length() -1;
        String total = "";

        while(i >= 0){
            char ch = s.charAt(i);
            System.out.println(i + "    " + ch);

            total = total + ch;
            i--;
        }
        return total;
    }
}

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
        reverseString("Hellooooooooo");
        fruitLoop("Hello", 'e');

        String s = "((3 + 7)* 2)";
        int len = s.length();
        int i = 0;
        int count = 0;

        while(i < len){
            char c = s.charAt(i);

            if(c == '(') {
                count++;
            } else if(c == ')') {
                count--;
            }
            i++;
        }
        System.out.println(count);

        looker("Hellofunny");
        stringPlusCharAdder("Hellomyfriends", 'q');

        System.out.println(Mystery.mystery("Allen"));
        palin("ninin");

    }
    public static boolean palin(String s){
        StringBuilder sb = new StringBuilder(s);
        return s.equals(sb.reverse().toString());
    }

    public static void stringPlusCharAdder(String s, char f){
        System.out.println(s + f);
    }

    public static void looker(String s){
        int len = s.length();
        int i = 0;
        int count = 0;
        char y = s.charAt(0);
        char x = s.charAt(s.length()-1);
        System.out.println(y + " " + x);
        while(i < len){
            char c = s.charAt(i);

            if(c == x){
                count++;
            } else if(c == y){
                count--;
            }
            i++;
        }
        System.out.println(count);


    }


    public static void fruitLoop(String s, char f){
        String fruit = s;
        //int length = s.length();
        int index = fruit.indexOf(f);
        System.out.println(index);
        return;
    }

    public static void reverseString(String x){
        StringBuilder input = new StringBuilder();
        input.append(x);
        input = input.reverse();
        System.out.println(input);
        return;
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
