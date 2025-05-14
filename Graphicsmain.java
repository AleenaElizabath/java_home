import Graphics.*;
import java.util.*;
class Graphicsmain {
    public static void main(String[] args) {
        int r,l,b,h1,b1,s;
        Scanner s1=new Scanner( System.in);
        System.out.println("Enter the radius of the circle:");
        r=s1.nextInt();
        Circle c=new Circle(r);
        c.area();
        System.out.println("Enter the Length and breadth of the rectangle:");
        l=s1.nextInt();
        b=s1.nextInt();
        Rectangle r1=new Rectangle(l,b);
        r1.area();
        System.out.println("Enter the height and breadth of the Triangle:");
        h1=s1.nextInt();
        b1=s1.nextInt();
        Triangle t=new Triangle(b1,h1);
        t.area();
        System.out.println("Enter the side of the Square:");
        s=s1.nextInt();
        Square s2=new Square(s);
        s2.area();
        s1.close();
    }
}