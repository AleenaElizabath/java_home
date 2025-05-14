import java.util.*;
class Prod{
    int price,code;
    String name;
    void getdetails(){    
        System.out.println("Enter the product code:");
        Scanner s=new Scanner(System.in);
        code=s.nextInt();
        System.out.println("Enter the product name:");
        name=s.next();
        System.out.println("Enter the product price:");
        price=s.nextInt();
    }
}
class Product extends Prod{
    public static void main(String[] args) {
        Product p1=new Product();
        Product p2=new Product();
        Product p3=new Product();
        System.out.println("Enter details for Product1:");
        p1.getdetails();
        System.out.println("Enter details for Product2:");
        p2.getdetails();
        System.out.println("Enter details for Product3:");
        p3.getdetails();
        if(p1.price<p2.price && p1.price<p3.price){
            System.out.println("Price of Product 1 is least!");
            System.out.println(p1.code);
            System.out.println(p1.name);
        }
        else if(p2.price<p3.price){
            System.out.println("Price of Product 2 is least!");
            System.out.println(p2.code);
            System.out.println(p2.name);
        }
        else{
            System.out.println("Price of Product 3 is least!");
            System.out.println(p3.code);
            System.out.println(p3.name);
        }
    }
}