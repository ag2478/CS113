import java.util.*;

public class TestDog {
    
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Number of dogs in the kennel: ");
        int numDogs = (scanner.nextInt() - 1);
        //got stuck here and found this ^^^^^ helps because arrays...
        scanner.nextLine();

        int oldAge = 0;
        int sumAge = 0;
        String oldBred = "";
        Dog oldDog = new Dog(0,"");

        //no idents (like a name) or something to differ the dogs, so i put em in a list
        ArrayList<Dog> kennel = new ArrayList<Dog>();

        for(int i = 0; i<= numDogs; i++){

            System.out.print("Enter Dog Breed: ");
            String breed = scanner.nextLine();

            System.out.print("\nEnter Dog age: ");
            int age = scanner.nextInt();

            //had to figure this out because i kept getting stuck...
            scanner.nextLine();

            //gonna save this for later to average
            sumAge += age;

            //making the dog object
            Dog dog = new Dog(age, breed);

            //adding it to the list
            kennel.add(dog);

            //to find the oldest, according to instructions
            if (dog.compareTo(oldDog) > 0){

                oldDog = dog;

            }

        }

        
        //forgot you wanted this value as a double and just made it one last second
        System.out.println("Average age: " + (Double.valueOf(sumAge / numDogs)));
        System.out.println("Oldest Dog -> " + oldDog);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("------------- End of Line -------------");


    }
}
