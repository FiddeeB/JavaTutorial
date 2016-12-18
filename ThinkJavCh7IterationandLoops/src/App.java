/**
 * Created by fredr on 2016-12-18.
 */
public class App {
    public static void main(String[] args){
        int liz = 5;
        System.out.print(liz);
        liz = 7;
        System.out.println(liz);

        countdown(3);
        sequence(15);

        double x = 1.0;
        while(x < 10.0){
            System.out.println(x + "  " + Math.log(x));//Lägg till / Math.log(2.0) om man vill ha upphöjt till 2
            x = x + 1.0;
        }

        int i = 1;
        while (i <= 10) {
            System.out.print(2*i + "   ");
            i = i +1;
        }
        System.out.println("");

        printMultTable(10);

        long fib = fibonacci(6);
        System.out.println(fib);


    }
    public static long fibonacci(int n){
        if(n < 2)
            return n;
        long ans = 0;
        long n1 = 0;
        long n2 = 1;
        for(n--; n > 0; n--){
            ans = n1 + n2;
            n1 = n2;
            n2 = ans;
        }
        return ans;
    }

    public static void printMultTable(int high){
        int b = 1;
        while(b <= high){
            printMultiples(b);
            b = b + 1;
        }
    }
    public static void printMultiples(int n){
        int i = 1;
        while (i <= 10){
            System.out.print(n*i + "   ");
            i = i+1;
        }
        System.out.println("");
    }

    public static void countdown(int n){
        while(n > 0){
            System.out.println(n);
            n = n-1;
        }
        System.out.println("Blastoff!!!");
    }
    public static void sequence(int n){
        while(n != 1){
            System.out.println(n);
            if(n%2 == 0) {
                n = n/2;
            } else {
                n = n*3 + 1;
            }
        }
    }
}
