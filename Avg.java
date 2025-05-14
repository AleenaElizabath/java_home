
import java.util.Scanner;
//Find the average of N positive integers, raising a user defined exception for each negative input.
class userexception extends RuntimeException{
    userexception(String s){
        super(s);
    }
}
class Avg{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int l=sc.nextInt();
        int arr[]=new int[l];
        float avg=0;
        System.out.println("Enter the elements:");
        for (int i = 0; i < l; i++) {
            arr[i]=sc.nextInt();
            try {
                if (arr[i]<0) {
                    throw new userexception("No negative numbers are allowed");
                }
                else{
                    avg+=arr[i];
                }
            } catch (userexception e) {
                System.out.println("\n"+e.getMessage());
                System.exit(0);
            }
        }
        System.out.println("Average:"+(avg/l));
    }
}
