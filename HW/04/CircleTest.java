
import java.util.*;

public class CircleTest {

    public static void main(String[] arg){

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int fp = random.nextInt(26) - 1;
        int sp = random.nextInt(26) - 1;
        Point p1 = new Point(fp, sp);
        Point p2 = new Point(0,0);
        //clearly an english major was not involved in the question writing process.

        System.out.println("Please enter the radius of Circle 1: ");
        double r1 = scanner.nextDouble();
        double r2 = 5;

        //organization is pointless here im jsut goin goff the prompt because my adhd holds me back from keeping track.
        //you'd think this would be easier for us neuro-spicy people

        Circle c1 = new Circle(p1,r1);
        Circle c2 = new Circle(p2,r2);

        double d1 = p1.distance(p2);

        System.out.println("Circle 1: " + c1);
        System.out.println("Circle 2: " + c2);
        System.out.println();
        //OH BOY HERE WE GOOOOO!!!!

        if (c1.equals(c2)){

            System.out.println("The distance between the two circles is: " + d1);

        } else {

            System.out.println("They ain't \"equal\"...\nSomething was supposed to happen here...");
        }

        System.out.println();
        System.out.println();
        System.out.println("------------- End of Line -------------");

        //System.out.println(fp + " " + sp );
        //System.out.println(p1);
        //System.out.println(c2);
        //remnants of my inability to understand if i was actually pulling this off before...

    }

}
