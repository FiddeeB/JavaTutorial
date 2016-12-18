/**
 * Created by fredr on 2016-12-18.
 */
public class App {
    public static void main(String[] args){
        double mult = multadd(1.0, 2.0, 50.0);
        System.out.println(mult);
    }
    public static double multadd(double a, double b, double c){
        double x = a * b +c;
        return x;
    }
}
