

public class Circle {
    
    private Point center;
    private double radius;

    //i honestly still dont get private or the how/why

    public Circle(Point center, double radius){
        this.center = center;
        this.radius = radius;

    }

    //MAN is it roomy in here...

    public Double circumference(){

        return 2 * Math.PI * radius;

    }

    public boolean equals(Circle other){

        return this.radius == other.radius;

    }

    // if the compiler says it passes, then i got no problem wit it

    public String toString(){

        return "This circle's center is " + center + "\nWith a Radius of: " + radius;

    }

}
