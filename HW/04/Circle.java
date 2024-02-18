

public class Circle {
    
    private Point center;
    private double radius;

    public Circle(Point center, double radius){
        this.center = center;
        this.radius = radius;

    }

    

    public Double circumference(){

        return 2 * Math.PI * radius;

    }

    public boolean equals(Circle other){

        return this.radius == other.radius;

    }

    public String toString(){

        return "This circle's center is X:" + center.x + " Y: " + center.y + "\nWith a Radius of: " + radius;

    }

}
