import java.util.*;
class Matrix1{
    int row,col;
    int mat1[][];
    int mat2[][];
    Scanner s1=new Scanner(System.in);
    void create(){
        System.out.println("Enter the number of rows of Matrix:");
        row=s1.nextInt();
        System.out.println("Enter the number of columns of Matrix:");
        col=s1.nextInt();
        mat1=new int[row][col];
        mat2=new int[row][col];
        System.out.println("Enter the elements of Matrix1:");
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++) {
                mat1[i][j]=s1.nextInt();
            }
        }
        System.out.println("Enter the elements of Matrix2:");
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++) {
                mat2[i][j]=s1.nextInt();
            }
        }
    }
    void display(){
        System.out.println("Matrix1:");
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++) {
                System.out.print(mat1[i][j]+"\t");
            }
            System.out.println("\n");
        }
        System.out.println("Matrix2:");
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++) {
                System.out.print(mat2[i][j]+"\t");
            }
            System.out.println("\n");
        }
    }  
    void add(){
        int m3[][]=new int[row][col];
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++) {
                m3[i][j]=mat1[i][j]+mat2[i][j];
            }
        }
        System.out.println("Resultant Matrix:");
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++) {
                System.out.print(m3[i][j]+"\t");
            }
            System.out.println("\n");
        }
    }
    void prod(){
        int m3[][]=new int[row][col];
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++) {
                m3[i][j]=mat1[i][j]*mat2[i][j];
            }
        }
        System.out.println("Resultant Matrix:");
        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++) {
                System.out.print(m3[i][j]+"\t");
            }
            System.out.println("\n");
        }
    }
    void transpose(){
        System.out.println("Transpose of Matrix1:");
        for (int i = 0; i < col; i++){
            for (int j = 0; j < row; j++) {
                System.out.print(mat1[j][i]+"\t");
            }
            System.out.println("\n");
        }
        System.out.println("Transpose of Matrix2:");
        for (int i = 0; i < col; i++){
            for (int j = 0; j < row; j++) {
                System.out.print(mat2[j][i]+"\t");
            }
            System.out.println("\n");
        }
    }
    
}
public class Matrix extends Matrix1{
    public static void main(String[] args) {
        Scanner s2=new Scanner(System.in);
        Matrix m1=new Matrix();
        System.out.println("Creating the matrix:");
        m1.create();
        while (true) {
            System.out.println("Enter the matrix operation(\n1.Create\n2.Addition\n3.Multiplication\n4.Transpose\n5.Display\n6.Exit\n(1/2/3/4/5/6)?):");
            int ch=s2.nextInt();
            switch (ch) {
                case 1 -> {
                    m1.create();
                }
                case 2 -> {
                    m1.add();
                }
                case 3 -> {
                    m1.prod();
                }
                case 4 -> {
                    m1.transpose();
                }
                case 5 -> {
                    m1.display();
                }
                case 6 -> {
                    System.out.println("Exit!!");
                    return;
                }
                default -> {
                    System.out.println("Invalid option");
                    break;
                }
            }
        }
    }
}