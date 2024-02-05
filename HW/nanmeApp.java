package CS113.HW;

import java.util.Scanner;

public class nanmeApp {

     public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
       System.out.println();
       System.out.println("Enter your first name: ");
       String firstName = scanner.nextLine();
       System.out.println();
       System.out.println("Enter your last name: ");
       String lastName = scanner.nextLine();

       /** probably a less blocky way to do this, not gonna look into it though... */

       String fullName = firstName + lastName;

       int length = fullName.length();
       
       
       System.out.println();

       System.out.println("Your initials are: " + (firstName.charAt(0)) + (lastName.charAt(0)));

       /** could have been more elegant, but don't care casue it works */

       System.out.println();

       System.out.println("Your total length is: " + length);

      
       System.out.println();

       System.out.println("------------- End of Line -------------");


     }
    
}
