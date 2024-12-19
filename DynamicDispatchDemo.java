abstract class Shape{
    abstract void draw();
}

class Circle extends Shape{
    void draw(){
        System.out.println("Drawing circle");
    }
}

class Square extends Shape{
    void draw(){
        System.out.println("Drawing Square");
    }
}
public class DynamicDispatchDemo {
    public static void main(String[] args) {
        Shape s;
        s = new Circle();
        s.draw();
        s = new Square();
        s.draw();
    }
}
