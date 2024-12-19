import java.awt.*;

public class PointDemo {
    public static void main(String[] args) {
        PointType point1 = new PointType(1,1);
        PointType point2 = new PointType(7,9);
        System.out.println("Point 1 coordinates:");
        point1.show();
        System.out.println("Point 2 coordinates: ");
        point2.show();
        double result = point1.distance(point2);
        System.out.println("Distance between point1 and point2 objects is "+ result);
        PointType point3 = new PointType();
        System.out.println("Point 3 coordinates: ");
        point3.show();
        result = point3.distance(3,4);
        System.out.println("Distance between point3 and (3,4) is " + result);
    }
}
