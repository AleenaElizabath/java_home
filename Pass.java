import java.util.*;
class userexception extends RuntimeException{
    userexception(String s){
        super(s);
    }
}
class pswrdexception extends RuntimeException{
    pswrdexception(String s){
        super(s);
    }
}
class user{
    String name,pswrd;
    user(String n, String p){
        name=n;
        pswrd=p;
    }
    void login(String n, String p){
        try {
            if(name.equals(n)&&pswrd.equals(p)){
                System.out.println("Login Successful!");
            }
            else{
                throw new pswrdexception("Login failed!");
            }
        } catch (pswrdexception e) {
            System.out.println("\n"+e.getMessage());
            System.exit(0);
        }
    }
}
class Pass{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the name:");
        String n=s.next();
        try {
            for (int i = 0; i < n.length(); i++) {
                if (n.matches("[A-Za-z]+")) {
                    continue;
                }
                else{
                    throw new userexception("Invalid name!");
                }
            }
        } catch (userexception e) {
            System.out.println("\n"+e.getMessage());
            System.exit(0);
        }
        System.out.println("Enter the password:");
        String p=s.next();
        try {
            for (int i = 0; i < p.length(); i++) {
                if (p.length()<8 ){
                    throw new pswrdexception("Your password must contain 8 letters!!");

                }
                if(p.matches("[0-9!@#$%^a-z]+")) {
                    continue;
                }
                else{
                    throw new pswrdexception("Invalid password!");
                }
            }
        } catch (pswrdexception e) {
            System.out.println("\n"+e.getMessage());
            System.exit(0);
        }
        user u=new user(n,p);
        System.out.println("Login");
        System.out.println("Enter the name:");
        String n1=s.next();
        System.out.println("Enter the password:");
        String p1=s.next();
        u.login(n1,p1);
    }
}