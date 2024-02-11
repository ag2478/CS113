

import java.util.Random;
/** going with the classics here, efficiency is for nerds */

public class randomPlate {
    public static void main(String[] args){
    
    char fir = (char) ('A' + new Random().nextInt(26));
    char sec = (char) ('A' + new Random().nextInt(26));
    char thi = (char) ('A' + new Random().nextInt(26));
    char fou = (char) ('A' + new Random().nextInt(26));
        
    /** can you tell how much i hate loops yet? */
    /** nope still not proud, but employed! */
    /** no one said i HAD to do it in a loop... */
    /** and in the real world we demand results over efficiency! */

    int twoInt = new Random().nextInt(90) + 10;

    System.out.println();

    System.out.println("Your new license plate is: " + fir + sec + thi + fou + twoInt);

    System.out.println();

    System.out.println("------------- End of Line -------------");
    /** noticing a pattern? yeah i love the frivalous in-joke of the analog 90's cyberpunk */
    }
}
