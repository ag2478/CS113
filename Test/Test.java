
import java.util.*;
public class Test
{
    public static void main(String[] args)
    {
        //Scanner scanner = new Scanner(System.in);
        //System.out.println("enter a number: ");
        //int entry = scanner.nextInt();
        Die d1 = new Die();

        for (int count = 1; count <= 100; count++){

            if (d1.roll() == 3)
                count++;
            System.out.print("*");

        }
/*
        do{

            entry++;
            System.out.println(entry);

        }
        while (entry < 100);

*/
/*          switch(entry){

            case 1 :
            System.out.println("Odd");
            break;

            case 2 :
            System.out.println("Even");
            break;

            default :
            System.out.println("Error");   
            
*/

System.out.println();
System.out.println();
System.out.println("------------- End of Line -------------");
}
}
