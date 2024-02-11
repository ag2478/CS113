
public class MyMethods {

    public static double volume(double width, double length, double height){
        
        return width * length * height;

    }


    public static double avgFaceValues(Die d1, Die d2){
        
        return (( d1.roll() + d2.roll() ) / 2); 

    }


}
