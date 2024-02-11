import java.util.Scanner;

public class TestMethod {
    public static void main(String[] args){

        double w;
        double l;
        double h;
        int d1;
        int d2;
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        //bringing back the ole' classics of waste!

        System.out.println("\nLets start with the volume method of an object.\n\nPlease enter the width: ");
        w = scanner1.nextDouble();
        System.out.println("Now input the length: ");
        l = scanner1.nextDouble();
        System.out.println("Now input the heigth: ");
        h = scanner1.nextDouble();

        double v = MyMethods.volume(l,w,h);
        System.out.println("The volume of you object is: " + v);

        System.out.println("\nNow lets try this avgFaceValues shenanigans.\n\nPlease provide the amount of faces for die 1: \n ");
        d1 = scanner2.nextInt();
        System.out.println("Now input the second die face value: ");
        d2 = scanner2.nextInt();

        double a = MyMethods.avgFaceValue(d1,d2);
        System.out.println("Your avgFaceValue of the input values is: " + a);










        System.out.println();

        System.out.println("------------- End of Line -------------");
    }
}
