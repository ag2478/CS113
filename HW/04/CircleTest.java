
import java.util.*;

public class CircleTest {

    public static void main(String[] arg){

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int fp = random.nextInt(26) - 1;
        int sp = random.nextInt(26) - 1;
        Point point1 = new Point(fp,sp);
        Point point2 = new Point(0,0);

        System.out.println("Circle 1 has a center at: " + point1);
        System.out.println("Circle 2 has a center at: " + point2);
        System.out.println("Their distance is: ");


    }

}
