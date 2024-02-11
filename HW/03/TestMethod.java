import java.util.Scanner;

public class TestMethod {
    public static void main(String[] args){

        double w;
        double l;
        double h;
        Die d1;
        Die d2;
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






        System.out.println();

        System.out.println("------------- End of Line -------------");
    }
}
