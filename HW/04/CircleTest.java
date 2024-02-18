
import java.util.*;

public class CircleTest {

    public static void main(String[] arg){

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int fp = random.nextInt(26) - 1;
        int sp = random.nextInt(26) - 1;
        Point p1 = new Point(fp, sp);
        Point p2 = new Point(0,0);



        System.out.println(fp + " " + sp );
        System.out.println(p1 + " " + p2 );


    }

}
