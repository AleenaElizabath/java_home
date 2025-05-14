import java.util.Scanner;
interface Shape{
    public void area();
    public void perimeter();
}
class Rectangle implements Shape{
    int length,breadth;
    Rectangle(int l,int b) {
        length=l;
        breadth=b;
    }
    @Override
    public void area(){
        System.out.println("The area of the rectangle is:"+(length*breadth));
    }
    @Override
    public void perimeter(){
        System.out.println("Perimeter of the rectangle is:"+(2*(length+breadth)));
    }
}
class Circle implements Shape{
    double radius;
    Circle(double r) {
        radius=r;
    }    
    @Override
    public void area(){
        System.out.println("The area of the circle is:"+Math.PI*radius*radius);
    }
    @Override
    public void perimeter(){
        System.out.println("Circumference of the circle is:"+2*Math.PI*radius);
    }
}
@SuppressWarnings("unused")
class Shape2{
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        int l,b,ch;
        double r;
        while (true) {
            System.out.println("Enter the operation(\n1.Circle\n2.Rectangle\n3.Exit\n(1/2/3)?):");
            ch=s1.nextInt();
            switch (ch) {
                case 1 -> {
                    System.out.println("Enter the radius:");
                    r=s1.nextDouble();
                    Circle c=new Circle(r);
                    c.area();
                    c.perimeter();

                }
                case 2 -> {
                    System.out.println("Enter the length:");
                    l=s1.nextInt();
                    System.out.println("Enter the breadth:");
                    b=s1.nextInt();
                    Rectangle r1=new Rectangle(l,b);
                    r1.area();
                    r1.perimeter();
                }
                case 3 ->{
                    System.out.println("Exit!!");
                    return;
                }
                default -> {
                    System.out.println("Invalid option");
                    break;
                }
            }
        }
    }
}