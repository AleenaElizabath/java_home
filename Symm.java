
import java.util.Scanner;
class Sym1{
    int row,col,m1[][];
    Scanner s1=new Scanner(System.in);
    public Sym1() {
        System.out.println("Enter the number of rows:");
        row=s1.nextInt();
        System.out.println("Enter the number of columns:");
        col=s1.nextInt();
        m1=new int[row][col];
        System.out.println("Enter the elements:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                m1[i][j]=s1.nextInt();
            }
        }
        int flag=0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(m1[i][j]!=m1[j][i]){
                    flag=1;
                    break;
                }
            }
        }
        if (flag==0) {
            System.out.println("Matrix is Symmetric");            
        }
        else{
            System.out.println("Not symmetric!");
        }
    }
}
class Symm extends Sym1{
    public static void main(String[] args) {
        Symm s1=new Symm();
    }
}