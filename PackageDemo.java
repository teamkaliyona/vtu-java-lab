import com.P1.A;
import com.P1.B;
import com.P1.C;
import com.P2.D;
import com.P2.E;

public class PackageDemo {
    public static void main(String[] args) {
        A a = new A();
        a.setX(10);
        a.setY(20);
        System.out.println("X value is "+ a.getX());
        System.out.println("Y value is "+ a.getY());

        B b = new B();
        b.setX(30);
        b.setY(40);
        b.setZ(50);
        System.out.println("X value is "+ b.getX());
        System.out.println("Y value is "+ b.getY());
        System.out.println("Z value is "+ b.getZ());

        C c = new C();
        c.setW(60);
        System.out.println("W value is "+ c.getW());

        D d = new D();
        d.setX(70);
        d.setY(80);
        d.setV(90);
        System.out.println("X value is "+ d.getX());
        System.out.println("Y value is "+ d.getY());
        System.out.println("Z value is "+ d.getV());

        E e = new E();
        e.setU(100);
        System.out.println("U value is "+ e.getU());
    }
}
