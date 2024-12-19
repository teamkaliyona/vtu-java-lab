import java.awt.*;

public class PointType {
    private double x;
    private double y;

    //constructor overloading
    public PointType(){
        this.x = 0;
        this.y = 0;
    }

    public PointType(double x, double y){
        this.x = x;
        this.y = y;
    }

    //Method overloading
    public double distance(PointType point){
        System.out.println("Calculating distance between objects");
        return Math.sqrt(Math.pow(x- point.x,2) + Math.pow(y- point.y,2));
    }

    public double distance(double x, double y){
        System.out.println("Calculating distance between two points");
        return Math.sqrt(Math.pow(this.x-x,2)+Math.pow(this.y-y,2));
    }

    public void show(){
        System.out.printf("(%.1g,%.1g)\n",x,y);
    }
}
