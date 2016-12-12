/**
 * Created by fredr on 2016-12-11.
 */
public class App {
    public static void main(String[] args){
        Machine mach1 = new Machine();

        mach1.start();
        mach1.stop();

        Car car1 = new Car();

        car1.wipeWindShield();
        car1.start();

    }
}
