import java.util.*;
interface Inter 
{
    public void area();
    public void perimeter();
}
class Circle implements Inter 
{
    double radius;
    Circle(double r)
    {
        radius = r;
    }
    @Override
    public void area()
    {
        System.out.println("Area of circle: " + String.format("%.2f", (3.14*radius*radius)));
    }
    @Override
    public void perimeter()
    {
        System.out.println("Perimeter of circle: " + String.format( "%.2f",(2*3.14*radius)));
    }
}


class Rectangle implements Inter 
{
    double length,breadth;
    Rectangle(double l,double b)
    {
        length = l;
        breadth = b;
    }
    @Override
    public void area()
    {
        System.out.println("Area of rectangle: " + String.format("%.2f" ,(length*breadth)));
    }
    @Override
    public void perimeter()
    {
        System.out.println("Perimeter of rectangle: " + String.format( "%.2f",(2*(length+breadth))));
    }
}



@SuppressWarnings("unused")
class circle_rect {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int ch;
        do
        {
            System.out.print("------------------\n1.Circle\n2.Rectangle \n3.Exit\n------------------\nEnter your choice: ");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1 -> {
                    System.out.print("Enter radius of circle: ");
                    double r=sc.nextDouble();
                    Circle c =new Circle(r);
                    c.area();
                    c.perimeter();
                }
                case 2 -> {
                    System.out.print("Enter length and breadth of rectangle: ");
                    double l=sc.nextDouble();
                    double b=sc.nextDouble();
                    Rectangle r1 =new Rectangle(l,b);
                    r1.area();
                    r1.perimeter();
                }
                case 3 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice!");
            }
        }while(ch!=3);
    }
}
