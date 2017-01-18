/**
 * Created by fredrik on 2017-01-02.
 */
public class App {
    public static void main(String []args){
        int[] count;
        double[] values;

        count = new int[4];
        values = new double[4];

        count[0] = 7;
        count[1] = count[0]*2;
        count[2] = count[1]++;

        int i = 0;
        while(i < 4){
            System.out.println(count[i]);
            i++;
        }

        double[] a= new double[3];
        double[] b= a;

        double[] c = new double[3];

        int q = 0;
        while(q < 4){
            b[q] = a[q];
            i++;
        }

    }
}
