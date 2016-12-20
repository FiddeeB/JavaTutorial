/**
 * Created by fredr on 2016-12-19.
 */
import java.awt.Point;
import java.awt.Rectangle;

public class App {
    public static void main(String[] args){
        Point blank;
        blank = new Point();
        int x = blank.x;
        System.out.println(blank.x + ", " + blank.y);
        int distance = blank.x * blank.x + blank.y * blank.y;
        printPoint(blank);
        distance(blank, blank);
        Rectangle box = new Rectangle(0,0,100,200);
        System.out.println(box);
        findCenter(box);
        System.out.println(box);
        moveRect(box, 12, 100);
        System.out.println(box);

    }

    public static void moveRect(Rectangle box, int dx, int dy){
        box.x = box.x + dx;
        box.y = box.y + dy;
    }

    public static Point findCenter(Rectangle box){
        int x = box.x + box.width/2;
        int y = box.y + box.height/2;
        return new Point(x, y);
    }

    public static void printPoint(Point p){
        System.out.println("(" + p.x + ", " + p.y + ")");
    }

    public static double distance(Point p1, Point p2){
        double dx = (double)(p2.x - p1.x);
        double dy = (double)(p2.y - p1.y);
        return Math.sqrt(dx*dx + dy*dy);
    }
}
