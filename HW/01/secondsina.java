

import java.util.*;

public class secondsina {

    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
       System.out.println();
       System.out.println("Enter an amount of seconds: ");
       /** of course cant be an int, cant be easy, gotta be a long, and i have to work with remainders, thanks a lot */
       long inSeconds = scanner.nextLong();
       
       long hours = (inSeconds / (60 * 60)) ;
       long rem = inSeconds % (60 * 60);
        /** this was way harder for me than it should have been and im not proud of it */

       long minutes = (rem / 60);
       /** kept using inSecond instead of rem, kept gettign the wrong minutes... */
       rem %= 60;

       System.out.println();

       System.out.println("The amount of time entered is " + hours + " hours, " + minutes + " minutes and " + rem + " seconds.");

       System.out.println();

       System.out.println("------------- End of Line -------------");


    }
}