/**
 * Created by fredr on 2016-12-11.
 */

//Extends betyder att klassen Car är ett underbarn till Klassen machine
public class Car extends Machine {

    @Override
    public void start(){
        System.out.println("Car started!");
    }

    public void wipeWindShield(){
        System.out.println("Wiping windshield.");
    }
}
