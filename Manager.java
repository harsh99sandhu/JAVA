import java.util.Scanner ;

class Employee
{
static long inc ;
static String name ;
static int emp_id ;
static long salary ;

Employee(String n , int id , long sal)
{
 System.out.println("Name of Employee : "+n );
System.out.println("Salary of Employee : " +sal );
}

void inc_sal()
{
salary = salary + inc ;
System.out.println("The incremented salary is : " +salary);
}
}

class Manager extends Employee
{
Manager()
{
super(name,emp_id,salary);
}

public static void main(String args[])
{

Scanner sc = new Scanner(System.in);

System.out.println("Enter name of the Employee: ");
name = sc.nextLine();
System.out.println("Enter Employee id :");
emp_id = sc.nextInt();
System.out.println("Enter Salary of the Employee");
salary = sc.nextLong();
System.out.println("Enter the increment in salary you want ");
inc = sc.nextLong();
System.out.println("Name=Harsh Sandhu");
System.out.println("Roll no= 65");
Manager m = new Manager();
m.inc_sal();
}
}