/**
 * Created by fredr on 2016-12-18.
 */

public class App {
    public static void main(String[] args){

        double dist = distance(1.0, 2.0, 4.0, 6.0);
        System.out.println(dist);
        boolean single = isSingleDigit(1);
        System.out.println(single);
        boolean singe = isSingleDigitpåettbättresätt(123);
        System.out.println(singe);
        int fact = factorial(14);
        System.out.println(fact);
        int fibo = fibonacci(5);
        System.out.println(fibo);

        //Övningsfrågor
        boolean isDivi = isDivisible(10, 2);
        System.out.println("Divisible? " + isDivi);

        //Prgrammet multadd.java ingår också här
        boolean isTri = isTriangle(10, 12, 14);
        System.out.println("Triangle? " + isTri);

        boolean flag1 = isHoopy(202);
        boolean flag2 = isFrabjuous(202);
        System.out.println(flag1);
        System.out.println(flag2);
        if(flag1 && flag2){
            System.out.println("ping!");
        }
        if(flag1 || flag2){
            System.out.println("ping!");
        }
        String s = new String();
        s = "deluded";

        char fi = first(s);
        System.out.println(fi);

        String re = rest(s);
        System.out.println(re);

        int le = length(s);
        System.out.println(le);

        printString("cock");
        printBackward("Josef");

        reverseString("Longstaven");


    }
    //övningsfrågor
    //6.8
    public static char first(String s){
        return s.charAt(0);
    }
    public static String rest(String s){
        return s.substring(1, s.length());
    }
    public static int length(String s){
        return s.length();
    }
    public static void printString(String q){

        for (int i = 0; i < q.length(); i++){
            System.out.println(q.charAt(i));
        }
        return;
    }
    public static void printBackward(String z){
        StringBuilder input = new StringBuilder();
        input.append(z);
        input = input.reverse();
        for (int i = 0; i < input.length(); i++){
            System.out.println(input.charAt(i));
        }
        return;
    }
    public static void reverseString(String x){
        StringBuilder input = new StringBuilder();
        input.append(x);
        input = input.reverse();
        System.out.println(input);
        return;
    }
    //END

    private static boolean isHoopy(int x){
        boolean hoopyFlag;
        if(x%2 == 0){
            hoopyFlag = true;
        } else {
            hoopyFlag = false;
        }
        return hoopyFlag;
    }

    public static boolean isFrabjuous(int x){
        boolean frabjuousFlag;
        if(x > 0){
            frabjuousFlag = true;
        } else {
            frabjuousFlag = false;
        }
        return frabjuousFlag;
    }

    public static boolean isDivisible(int n, int m) {
        int x = n /m;
        if (x > 0){
            return true;
        } else{
            return false;
        }
    }

    public static boolean isTriangle(int x, int y, int z){
        if(x +y > z){
            return true;
        } else {
            if(x + z > y){
                return true;
            } else {
                if(y + z > x){
                    return true;
                } else {
                    return false;
                }
            }
        }
    }







    //kopierat från boken,<<
    //fibonacci
    public static int fibonacci(int n) {
        if(n == 0 || n == 1) {
            return 1;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }

    //Räkna ut factorial
    public static int factorial(int n){
        if(n == 0) {
            return 1;
        } else {
            int recurse = factorial(n-1);
            int result = n * recurse;
            return result;
        }
    }

    //Räkna ut distans mellan två punkter
    public static double distance(double x1, double y1, double x2, double y2){
        double dx = x2 - x1;
        double dy = y2 - y1;
        double dsquared = dx*dx + dy*dy;
        double result = Math.sqrt(dsquared);
        return result;
    }

    //Fråga om talet är ensiffrigt
    public static boolean isSingleDigit(int x){
        if(x >= 0 && x < 10){
            return true;
        } else {
            return false;
        }
    }

    //Fråga om talet är ensiffrigt på ett bättre sätt
    public static boolean isSingleDigitpåettbättresätt(int x){
        return (x >= 0 && x < 10);
    }

    //return x kommer inte att vara med i programmet om return -x är utskriven. return x är ansedd som död kod i det fallet. Här finns ett else statement som gör det okej att använda return två gånger Hade det stått elseif så hade det inte varit korrekt.
    public static double absoluteValue(double x){
        if(x < 0){
            return -x;
        } else {
            return x;
        }
    }

    public static double area(double radius) {
        double area = Math.PI * radius * radius;
        return area;
    }
}
