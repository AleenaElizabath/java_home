import java.util.Scanner;
class Emp1 {
    int e_no,e_sal;
    String e_name;
    Scanner s1=new Scanner(System.in);
    void getdetails()
    {
        System.out.println("Enter the employee number:");
        e_no=s1.nextInt();
        System.out.println("Enter the name of employee:");
        e_name=s1.next();
        System.out.println("Enter the salary:");
        e_sal=s1.nextInt();
    }
    public static void main(String[] args) {
        int n,srch,flag=0;
        System.out.println("Enter the number of employees:");
        Scanner s1=new Scanner(System.in);
        n=s1.nextInt();
        Emp1 e1[]=new Emp1[n];
        for (int i = 0; i <n; i++) {
            e1[i]=new Emp1();
            e1[i].getdetails();
        } 
        System.out.println("Enter the employee number to search:");
        srch=s1.nextInt();
        for (int i = 0; i < n; i++) {
            if (e1[i].e_no==srch) {
                flag=1;
                System.out.println("Name:"+e1[i].e_name);
                System.out.println("Salary:"+e1[i].e_sal);
            }
        }
        if(flag==0){
            System.out.println("Not found");
        }
        s1.close();
    }
}