import java.util.*;
class Stringman{
    void upper(String str){
        String str1=str.toUpperCase();
        System.out.println("The uppercase of "+str+" is "+str1);
    }
    void lower(String str){
        String str1=str.toLowerCase();
        System.out.println("The lowercase of "+str+"is "+str1);
    }
    void length1(String str){
        int strlen=str.length();
        System.out.println("The length of "+str+" is "+strlen);

    }
    void Substring1(String str){
        String str2=str.substring(0, str.length()/2);
        System.out.println("The substring of the given String is:"+str2);
    } 
    void Index1(String s1){
        System.out.println("Enter the letter to search:");
        Scanner s=new Scanner(System.in);
        String s3=s.next();
        System.out.println("Letter found at postion "+s1.indexOf(s3));
    }
}
    
class Stringfun extends Stringman{
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter the String:");
        String str=s1.next();
        Stringfun s2=new Stringfun();   
        s2.upper(str);
        s2.lower(str);
        s2.length1(str);
        s2.Substring1(str);
        s2.Index1(str);
    }
}