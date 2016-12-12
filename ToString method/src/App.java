/**
 * Created by fredr on 2016-12-11.
 */

class Ollo {
    private int id;
    private String name;

    public Ollo(int id, String name){
        this.id = id;
        this.name = name;
    }
    public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(id).append(": ").append(name);
            return sb.toString();
        }

}

public class App {
    public static void main(String[] args){
        Ollo obj = new Ollo(113, "Long bridge");
        Ollo obj2 = new Ollo(2100, "Short Bridge");

        System.out.println(obj);
        System.out.println(obj2);
    }
}
