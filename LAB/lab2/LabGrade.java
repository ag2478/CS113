// LabGrade.java
// This program computes a student's lab grade from
// the grades on the three components of lab: the pre-lab
// assignment, the lab itself, and the post-lab assignment.
// ***************************************************************
import java.util.Scanner;

// 1)
// a) preLabPts + postLabPts / preLabMax + postLabMax * 100;
// It is doing postLabPts / preLabMax which is 12 / 20 = 0.6, and then adding postLabMax * 100 which is 15 * 100 = 1500. After that, it adds 17 to the result. This would result in 1517.6, and since outClassAvg is an int, it would be truncated to 1517.
// b) labPts / labMax * 100;
// // It is doing labMax * 100 before dividing by labPts. This would result in 0.0092, and since labPts is an int, it would be truncated to 0.
// c) OUT_WEIGHT * outClassAvg + IN_WEIGHT * inClassAvg;
// Since inClassAvg is 0 and outClassAvg * OUT_WEIGHT is 606.08, the result would be 606.08 + 0 = 606.08.

public class LabGrade
{
    public static void main (String[] args)
    {
        // Declare constants
        double inWeight;
        double outWeight;

        // Declare variables
        int preLabPts; //number of points earned on the pre-lab assignment
        int preLabMax; //maximum number of points possible for pre-lab
        int labPts; //number of poitns earned on the lab
        int labMax; //maximum number of points possible for lab
        int postLabPts; //number of points earned on the post-lab assignment
        int postLabMax; //maximum number of points possible for the post-lab
        int outClassAvg; //average on the out of class (pre and post) work
        int inClassAvg; //average on the in-class work
        double labGrade; //final lab grade
        Scanner scan = new Scanner(System.in);

        // Get the input
        System.out.println("\nWelcome to the Lab Grade Calculator\n");
        System.out.print("Enter the number of points you earned on the pre-lab: ");
        preLabPts = scan.nextInt();
        System.out.print("What was the maximum number of points you could have earned? ");
        preLabMax = scan.nextInt();
        System.out.print("Enter the number of points you earned on the lab: ");
        labPts = scan.nextInt();
        System.out.print("What was the maximum number of points for the lab? ");
        labMax = scan.nextInt();
        System.out.print("Enter the number of points you earned on the post-lab: ");
        postLabPts = scan.nextInt();
        System.out.print("What was the maximum number of points for the post-lab? ");
        postLabMax = scan.nextInt();
        System.out.print("What is the weight of in-class work (e.g., 0.6)? ");
        inWeight = scan.nextDouble();
        // Calculate the average for the out of class work
        outClassAvg = (preLabPts + postLabPts) * 100 / (preLabMax + postLabMax);

        // Calculate the average for the in-class work
        inClassAvg = (labPts * 100) / labMax;

        // Calculate the weighted average taking 40% of the out-of-class average
        // plus 60% of the in-class
        outWeight = 1 - inWeight;
        labGrade = outWeight * outClassAvg + inWeight * inClassAvg;

        // Print the results
        System.out.println("Your average on out-of-class work is " + outClassAvg + "%");
        System.out.println("Your average on in-class work is " + inClassAvg + "%");
        System.out.println("Your lab grade is " + labGrade + "%");
        System.out.println();
    }
}
