import java.util.Scanner;

public class TestMethod {
    public static void main(String[] args){

        double w;
        double l;
        double h;
        //int di1;
        //int di2;
       
        Scanner scanner1 = new Scanner(System.in);
        //Scanner scanner2 = new Scanner(System.in);
        //a monument to my wasteful hubris!

        System.out.println("\nLets start with the volume method of an object.\n\nPlease enter the width: ");
        w = scanner1.nextDouble();
        System.out.println("Now input the length: ");
        l = scanner1.nextDouble();
        System.out.println("Now input the heigth: ");
        h = scanner1.nextDouble();

        double v = MyMethods.volume(l,w,h);
        System.out.println("The volume of you object is: " + v);

        System.out.println();

        //ok HERE WE GOOOOO
        System.out.println("\nNow lets try this avgFaceValues shenanigans.\n");
        //System.out.println("Input a face value: ");
        //di1 = scanner2.nextInt();
        //System.out.println("Input the next value: ");
        //di2 = scanner2.nextInt();
        //was trying to be cute with an input but i couldnt understand it at all...
        Die d1 = new Die();
        Die d2 = new Die();
        double avg = MyMethods.avgFaceValues(d1,d2);
        System.out.println("Your face values are " + d1 + " and " + d2);
        System.out.println("\nYour avgFaceValue of the input values is: " + avg);


// yeah i did it again...who doesnt love a dramatic pause/ending?
//whatever it WORKS, PUSH TO PROD!!!!

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("------------- End of Line -------------");
    }
}
