package Graphics;
public class Rectangle implements Figure {
    int length;
    int breadth;
    public Rectangle(int l,int b){
        l=length;
        b=breadth;
    }
    public void area(){
        System.out.println("The area of the rectangle:"+(length*breadth));
    }
}