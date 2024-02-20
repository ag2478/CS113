package CS113.Test;
import java.util.*;
public class Test
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number: ");
        int entry = scanner.nextInt();


        do{

            entry++;
            System.out.println(entry);

        }
        while (entry < 100);


/*          switch(entry){

            case <10 :
            System.out.println("Odd");
            break;

            case >10 :
            System.out.println("Even");
            break;

            default :
            System.out.println("Error");   
            
*/
        
        }



      // System.out.println("another test run");

    }
