
import java.util.Scanner;

class Person{
    String name,gender,address;
    int age;
    Person() {
        Scanner n=new Scanner(System.in);
        System.out.println("Enter the name:");
        name=n.next();
        System.out.println("Enter the gender:");
        gender=n.next();
        System.out.println("Enter the address:");
        address=n.next();
        System.out.println("Enter the age:");
        age=n.nextInt();
    }  
}
class Employee extends Person{
    int emp_id;
    String comp_name,qual;
    double salary;
    Employee() {
        Scanner n=new Scanner(System.in);
        System.out.println("Enter the Employee id:");
        emp_id=n.nextInt();
        System.out.println("Enter the Company name:");
        comp_name=n.next();
        System.out.println("Enter the Qualifications:");
        qual=n.next();
        System.out.println("Enter the Salary:");
        salary=n.nextDouble();
    }    
}
class Teacher extends Employee{
    String sub,dept;
    int teacher_id;
    Teacher() {
        Scanner n=new Scanner(System.in);
        System.out.println("Enter the Teacher id:");
        teacher_id=n.nextInt();
        System.out.println("Enter the Subjects taught:");
        sub=n.next();
        System.out.println("Enter the Department:");
        dept=n.next();
    }  
    void display(){
        System.out.println("Name:"+name);
        System.out.println("Gender:"+gender);
        System.out.println("Age:"+age);
        System.out.println("Qualification:"+qual);
        System.out.println("Comapany name:"+comp_name);
        System.out.println("Employee Id:"+emp_id);
        System.out.println("Teacher Id:"+teacher_id);
        System.out.println("Salary:"+salary);
        System.out.println("Address:"+address);
        System.out.println("Department:"+dept);
        System.out.println("Subjects taught:"+sub);
    }
}
class Multilevel{
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
