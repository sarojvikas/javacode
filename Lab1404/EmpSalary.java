package Lab1404;
import java.util.Scanner;

public class EmpSalary {
  static double first_emp_sal - 11000;
  static double sec_emp_sal - 5000;
  
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);


    System.out.print("Total number of employee = " );
    int no_of_emp=sc.nextInt();
   
    if(no_of_emp==3)

      {
    System.out.print("Average salary =" );
    double avg_sal=sc.nextInt();
    
    System.out.print("Salary of the first employee = " + first_emp_sal );
    System.out.print("Salary of the second employee = " + sec_emp_sal );
    Ststem.out.print("Third employee salary is " + ((avg_sal*no_of_emp) - (first_emp_sal + sec_emp_sal)));
      }
    
    else {
      System.out.println("Total number of employee should be 3 only");
      }
    }
  }

//Output
/* 
Total number of employee = 3
Average salary = 10000
Salary of the first employee = 11000.0
Salary of the second employee = 5000.0
Third employee salary is 14000.0
*/




    
