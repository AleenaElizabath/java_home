
import java.util.Scanner;
class Salary{
    void calc_sal(float  base_sal){
        float hra,da,grs;
        if (base_sal<=10000) {
            hra=base_sal*0.2f;
            da=base_sal*0.8f;
            grs=base_sal+da+hra;
            System.out.println("Gross Salary="+grs);
        }
        else if (base_sal<=20000) {
            hra=base_sal*0.25f;
            da=base_sal*0.9f;
            grs=base_sal+da+hra;
            System.out.println("Gross Salary="+grs);
        }
        else {
            hra=base_sal*0.3f;
            da=base_sal*0.95f;
            grs=base_sal+da+hra;
            System.out.println("Gross Salary="+grs);
        }
    }
}
class Emp extends Salary{
    public static void main(String[] args) {
        int emp_no;
        float emp_sal;
        String emp_name;
        Emp e1=new Emp();
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter the employee_no:");
        emp_no=s1.nextInt();
        System.out.println("Enter the employee name:");
        emp_name=s1.next();
        System.out.println("Enter the basic salary:");
        emp_sal=s1.nextFloat();
        System.out.println("Emp_no:"+emp_no);
        System.out.println("Emp_name:"+emp_name);
        System.out.println("Basic Salary:"+emp_sal);
        e1.calc_sal(emp_sal);
    }
}