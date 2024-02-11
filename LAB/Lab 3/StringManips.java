// ***************************************************************
// StringManips.j ava
//
// Test several methods for manipulating String objects
// ***************************************************************
import java.util.Scanner;
public class StringManips
{
public static void main (String[] args)
{
String phrase = new String ("This is a String test.");
int phraseLength; // number of characters in the phrase String
int middleIndex; // index of the middle character in the String
String firstHalf; // first half of the phrase String
String secondHalf; // second half of the phrase String
String switchedPhrase;

String middle3;

Scanner scanner = new Scanner(System.in);
System.out.println();
System.out.println("Enter city: ");
String city = scanner.nextLine();
System.out.println();
System.out.println("Enter state: ");
String state = scanner.nextLine();
System.out.println();


//a new phrase with original halves switched
// compute the length and middle index of the phrase
phraseLength = phrase.length();
middleIndex = phraseLength / 2;
// get the substring for each half of the phrase

//1
middle3 = phrase.substring(middleIndex - 1, middleIndex + 2);


firstHalf = phrase.substring(0,middleIndex);
secondHalf = phrase.substring(middleIndex, phraseLength);
// concatenate the firstHalf at the end of the secondHalf
switchedPhrase = secondHalf.concat(firstHalf);
// print information about the phrase

//2
switchedPhrase = switchedPhrase.replaceAll(".", "*");

System.out.println();
System.out.println ("Original phrase: " + phrase);
System.out.println ("Length of the phrase: " + phraseLength +
" characters");
System.out.println ("Index of the middle: " + middleIndex);
System.out.println ("Character at the middle index: " +
phrase.charAt(middleIndex));
System.out.println ("Switched phrase: " + switchedPhrase);
System.out.println ("Middle three characters are: " + middle3);
System.out.println();
//3
System.out.println(state.toUpperCase() + city.toLowerCase() + state.toUpperCase());
System.out.println();

}
}