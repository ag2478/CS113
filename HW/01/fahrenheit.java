package CS113.HW;

import java.util.*;
/** don't care if it is not efficient, im IT */

public class fahrenheit {

    public static void main(String[] args){
        
        Random random = new Random();

        int degreeF = random.nextInt(100) + 1;

        int degreeC = (5 *(degreeF - 32) / 9);

        System.out.println();

        System.out.println("Temp in Fahrenheit: " + degreeF + "\u00B0F, Temp in Celsius: " + degreeC + "\u00B0C");

        /* All this just so i can get the damn Degree symbol, cause of course i cant jsut type it in... */

        System.out.println();

        System.out.println("------------- End of Line -------------");
    }

}
