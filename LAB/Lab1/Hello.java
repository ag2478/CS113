// ********************************************
// Hello.java
//
// Print a Hello, World message.
// ********************************************

// 2) "Helo" causes an error because the class name must match the file name. The error is "class Helo is public, should be declared in a file named Helo.java".
// 3) Removing an "l" from "Hello" inside the print statement does not cause any errors because the print statement is a string and does not affect the class name.
// 4) Removing the closing quotation mark from the print statement causes an error because the print statement is not closed properly. The error is "unclosed string literal".
// 5) Removing the starting quotation mark from the print statement causes an error because the print statement is not started properly. The errors are "unclosed string literal" and "')' expected".
// 6) Removing the semicolon from the end of the print statement returns the error "';' expected".

public class Hello
{
    // -----------------------------------
    // main method -- prints the greeting
    // -----------------------------------
    public static void main (String[] args)
    {
        System.out.println ("Hello, World!");
    }
}