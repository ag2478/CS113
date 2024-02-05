import java.util.Scanner;

public class BaseConvert {
    public static void main(String[] args) {
        int base;
        int maxNumber; // n^4-1, where n is the base
        int base10Num;
        String baseBNum = new String("");
        Scanner scan = new Scanner(System.in);

        // read in the base 10 number and the base
        System.out.println();
        System.out.println ("Base Conversion Program");
        System.out.println() ;
        System.out.print ("Please enter a base (2-9): ");
        if (!scan.hasNextInt()) {
            System.out.println("Invalid input. Please enter a valid integer.");
            return;
        }
        base = scan.nextInt();
        if (base < 2 || base > 9) {
            System.out.println("Invalid input. Please enter a number within the range of 2-9");
            return;
        }

        // Compute the maximum base 10 number that will fit in 4 digits
        // in the new base and tell the user what range the number they
        // want to convert must be in
        maxNumber = base * base * base * base - 1; // I tested the performance of Math.pow, and it was slower than multiplying the base by itself 4 times
        // System.out.println(maxNumber);

        System.out.print ("Please enter a base 10 number to convert (0-" + maxNumber + "): ");
        base10Num = scan.nextInt();
        if (base10Num < 0 || base10Num > maxNumber) {
            System.out.println("Invalid input. Please enter a number within the range of 0-" + maxNumber);
            return;
        }
        // System.out.println(base10Num);

        int placeNum;
        for (int i = 0; i < 4; i++) {
            placeNum = base10Num % base;
            base10Num /= base;
            baseBNum = placeNum + baseBNum;
            // System.out.println(base10Num);
        }

        System.out.println("Your number is " + baseBNum + " in base " + base);
    }
}
