
import java.util.Scanner;
public class TestBook {

    public static void main(String[] args){

        String title1;
        String title2;
        int pages1;
        int pages2;
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);


        System.out.println("\nPlease input the name of the first book: ");
        title1 = scanner.nextLine();
        System.out.println("\nPlease input the page number of the first book: ");
        pages1 = scanner.nextInt();

        Book book1 = new Book(title1, pages1);

        System.out.println("\nPlease input the name of the first book: ");
        title2 = scanner2.nextLine();
        System.out.println("\nPlease input the page number of the first book: ");
        pages2 = scanner2.nextInt();

        Book book2 = new Book(title2, pages2);


        System.out.println("\nYour output is as follow:\n");

        System.out.println(book1);

        System.out.println();

        System.out.println(book2);

        System.out.println("\nThank you for using Testbook.java\n");

        System.out.println("------------- End of Line -------------");
    }
}
