import java.util.Scanner;
class Shape{
    void area(int l,int b){
        int area=l*b;
        System.out.println("The area of the rectangle is:"+area);
    }
    void area(double r){
        double pi=3.14;
        double area=pi*r*r;
        System.out.println("The area of the circle is:"+area);
    }
    void area(int l,int b,int h){
        int area=l*b*h;
        System.out.println("The area of the cuboid is:"+area);
    }
    void area(int a){
        int area=a*a;
        System.out.println("The area of the square is:"+area);
    }
}
class Overloadprg extends Shape{
    public static void main(String[] args) {
        Overloadprg o1=new Overloadprg();
        Scanner s1=new Scanner(System.in);
        double r;
        int l1,b1,l,b,h,a;
        System.out.println("Enter the radius of the circle:");
        r=s1.nextDouble();
        o1.area(r);
        System.out.println("Enter the side of the square:");
        a=s1.nextInt();
        o1.area(a);
        System.out.println("Enter the breadth of the rectangle:");
        b=s1.nextInt();
        System.out.println("Enter the length of the rectangle:");
        l=s1.nextInt();
        o1.area(l,b);
        System.out.println("Enter the breadth of the cuboid:");
        b1=s1.nextInt();
        System.out.println("Enter the length of the cuboid:");
        l1=s1.nextInt();
        System.out.println("Enter the height of the cuboid:");
        h=s1.nextInt();
        o1.area(l1, b1, h);
    }
}