package Graphics;
public class Triangle implements Figure {
    int breadth;    
    int height;
    public Triangle(int b,int h){
        breadth=b;
        height=h;
    }
    public void area(){
        System.out.println("The area of the triangle:"+((breadth*height)/2));
    }
}