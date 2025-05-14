package Graphics;
public class Square implements Figure{
    int a;
    public Square(int s){
        a=s;
    }
    public void area(){
        System.out.println("The area of the square:"+(a*a));
    }
}