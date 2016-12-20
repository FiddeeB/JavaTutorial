/**
 * Created by fredr on 2016-12-19.
 */
class Time{
    int hour, minute;
    double second;

    public Time(){
        this.hour = 0;
        this.minute = 0;
        this.second = 0.0;
        }
    public Time(int hour, int minute, double second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
}

public class App {
    public static void main(String[] args){
        Time t1 = new Time();
        t1.hour = 11;
        t1.minute = 8;
        t1.second = 3.14;
        System.out.println(t1);

        Time t2 = new Time(8, 53,3.22);
        System.out.println(t2);
        printTime(t2);
        printTime(t1);
        isAfter(t1, t2);
        Time addedTime = addTime(t1, t2);
        System.out.println(addedTime);

        Time inc = new Time();
        increment(t1, 300);
        printTime(addedTime);
        

    }
    public static void printTime(Time t){
        System.out.println(t.hour + ":" + t.minute + ":" + t.second);
    }
    public static boolean isAfter(Time t1, Time t2){
        if(t1.hour > t2.hour) return true;
        if(t1.hour < t2.hour) return false;

        if(t1.minute > t2.minute) return true;
        if(t1.minute < t2.minute) return false;

        if(t1.second > t2.second) return true;
        if(t1.second < t2.second) return false;
        return false;
    }
    public static void increment(Time time, double secs){
        time.second += secs;

        while(time.second >= 60.0) {
            time.second -= 60.0;
            time.minute += 1;
        }
        while(time.minute >= 60) {
            time.minute -= 60;
            time.hour += 1;
        }
    }
    public static Time addTime(Time t1, Time t2){
        Time sum = new Time();
        sum.hour = t1.hour + t2.hour;
        sum.minute = t1.minute + t2.minute;
        sum.second = t1.second + t2.second;

        if(sum.second >= 60.0) {
            sum.second -= 60.0;
            sum.minute += 1;
        }
        if(sum.minute >= 60) {
            sum.minute -= 60;
            sum.hour += 1;
        }
        return sum;
    }
}
