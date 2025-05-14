import java.util.*;
class SampleArray{
    public static void main(String[] args) {
        //Scanner s1=new Scanner(System.in);
        ArrayList <String> l1=new ArrayList<String>();
        l1.add("Hello world!");        
        l1.add("Hi!");
        l1.add("Aleena");
        l1.add("abcd");
        System.out.println(l1);
        System.out.println(l1.size());
        System.out.println(l1.get(3));
        System.out.println(l1.indexOf("abcd"));
        System.out.println(l1.contains("def"));
        System.out.println(l1.contains("abcd"));
        System.out.println(l1.set(0,"def"));
        System.out.println(l1);
        System.out.println(l1.remove(0));
        System.out.println(l1);
        l1.clear();
        System.out.println(l1);
    }
}
