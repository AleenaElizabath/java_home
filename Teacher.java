import java.util.Scanner;

class Employee {
    int Empid,sal;
    String name,address;
    Employee(){
        Scanner s=new Scanner(System.in);
        System.out.println("\nEnter the id of the Teacher:");
        Empid=s.nextInt();
        System.out.println("Enter the name of the Teacher:");
        name=s.next();
        System.out.println("Enter the salary of the Teacher:");
        sal=s.nextInt();
        System.out.println("Enter the address of the Teacher:");
        address=s.next();
    }
}
class Teacher extends Employee{
    String dept,sub;
    Teacher(){
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter the department:");
        dept=s1.next();
        System.out.println("Enter the subjects taught:");
        sub=s1.next();
    }
    void display(){
        System.out.println("Name:"+name);
        System.out.println("Id:"+Empid);
        System.out.println("Salary:"+sal);
        System.out.println("Address:"+address);
        System.out.println("Department:"+dept);
        System.out.println("Subjects taught:"+sub);
    }
    public static void main(String[] args) {
        int n;
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter the number of teachers:");
        n=s1.nextInt();
        Teacher t1[]=new Teacher[n];
        for (int i = 0; i <n; i++) {
            System.out.println("\nEnter the details of Teacher "+(i+1));
            t1[i]=new Teacher();
        } 
        for (int i = 0; i <n; i++) {
            System.out.println("\nTeacher "+(i+1)+":");
            t1[i].display();
        }
    }
}