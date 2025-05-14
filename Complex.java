import java.util.*;
class Comp{
    float real1,real2,img1,img2;
    Scanner s1=new Scanner(System.in);
    void calc(){
        float rsum,isum;
        System.out.println("Enter the real part of 1st number:");
        real1=s1.nextFloat();
        System.out.println("Enter the imaginary part of 1st number:");
        real2=s1.nextFloat();
        System.out.println("Enter the real part of 2nd number:");
        img1=s1.nextFloat();
        System.out.println("Enter the imaginary part of 2nd number:");
        img2=s1.nextFloat();
        rsum=real1+real2;
        isum=img1+img2;
        System.out.println("The sum of the given complex numbers are:"+rsum+"+ i"+isum);
    }
}
class Complex extends Comp{
    public static void main(String[] args) {
        Complex c1=new Complex();
        c1.calc();
    }
}