package CS113.Test;
import java.util.*;
public class Test
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number: ");
        int entry = scanner.nextInt();



        switch(entry){

            case 1 :
            System.out.println(1);
            break;

            case 2 :
            System.out.println(2);
            break;

            case 3 :
            System.out.println(3);
            break;

            default :
            System.out.println("Error");
            break;
    }

       System.out.println("another test run");

    }
}