package Graphics;
public class Circle implements Figure{
    double rad;
    public Circle(double r){
        rad=r;
    }
    public void area(){
        System.out.println("The area of circle="+Math.PI*rad*rad);
    }
}