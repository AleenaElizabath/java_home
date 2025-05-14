import java.util.Scanner;
class Intsearch1{
    int len,arr[],search;
    public Intsearch1() {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the length of the array:");
        len=s.nextInt();
        arr=new int[len];
        System.out.println("Enter the elements:");
        for (int i = 0; i < len; i++) {
            arr[i]=s.nextInt();
        }
        System.out.println("Enter the element to search:");
        search=s.nextInt();
        for (int i = 0; i < len; i++) {
            if (arr[i]==search) {
                System.out.println("Element found at position "+i);
                break;
            }
        }
    }
}
class Intsearch extends Intsearch1{
    public static void main(String[] args) {
        Intsearch i1=new Intsearch();
    }
}
