package CS113.Test;

import java.util.Random;

public class dice {
    public static void main(String[] args){

    int dice1 = new Random().nextInt(6) + 1;

    int dice2 = new Random().nextInt(6) + 1;

    System.out.println();

    System.out.println("Your dice throws are: " + dice1 + " and: " + dice2);

    System.out.println();

    System.out.println("------------- End of Line -------------");

    }
    
}
