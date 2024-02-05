import java.util.Scanner;

// ************************************************************
// Circle.java
//
// Print the area of a circle with two different radii
// ************************************************************
public class Circle
{
    public static void main(String[] args)
    {
        final double PI = 3.14159;

        int userRadius;
        Scanner userInput = new Scanner(System.in);
        System.out.print("Please enter a value for the radius: ");
        if (userInput.hasNextInt()) {
            userRadius = userInput.nextInt();
            if (userRadius < 0) {
                System.out.println("Invalid input. Please enter a positive integer.");
                return;
            }
        } else {
            System.out.println("Invalid input. Please enter a valid integer.");
            return;
        }

        // First circle
        double firstArea = PI * userRadius * userRadius;
        double firstCircumference = 2 * (PI * userRadius);
        System.out.println("The area of a circle with radius " + userRadius + " is " + firstArea);
        System.out.println("The circumference of a circle with radius " + userRadius + " is " + firstCircumference);

        // Second circle
        int doubleUserRadius = userRadius * 2;
        double secondArea = PI * doubleUserRadius * doubleUserRadius;
        double secondCircumference = 2 * (PI * doubleUserRadius);
        System.out.println("The area of a circle with radius " + doubleUserRadius + " is " + secondArea);
        System.out.println("The circumference of a circle with radius " + doubleUserRadius + " is " + secondCircumference);

        // Area change calculation
        double areaChange = secondArea / firstArea; // Is 4 times the area of the first circle due to being exponential
        double circumferenceChange = secondCircumference / firstCircumference; // Is 2 times the circumference of the first circle due to being linear
        System.out.println("The area of the second circle is " + areaChange + " times the area of the first circle");
        System.out.println("The circumference of the second circle is " + circumferenceChange + " times the circumference of the first circle");
    }
}