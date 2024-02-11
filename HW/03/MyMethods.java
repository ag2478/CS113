
public class MyMethods {

    public double volume(double width, double length, double height){
        
        return width * length * height;

    }

    public double avgFaceValues(Die d1, Die d2){
        
        int fv1 = d1.roll();
        int fv2 = d2.roll();
        return (( fv1 + fv2 ) / 2); 

    }

}
