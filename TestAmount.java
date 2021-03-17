import java.util.*;
class Bank
{
 long acc;
 String name;
 double amount;
 public void setData(long r,String s,double m)
 {
	 acc=r;
	 name=s;
	 amount=m;
 }
 public void getData()
 {
	 System.out.println("ACCOUNT= "+acc);
	 System.out.println("Name= "+name);
	 System.out.println("Balance= "+amount);
 }
 public void deposit()
 {
	 Scanner s1=new Scanner(System.in);
	 System.out.println("Enter Amount to be deposited");
	 double dep=s1.nextDouble();
	 amount=amount+dep;
	 System.out.println("Balance "+ amount);
 }
 public void withdrawn()
 {
	 Scanner s2=new Scanner(System.in);
	 System.out.println("Enter Amount to be withdrawn");
	 double with=s2.nextDouble();
	 double balwith=amount-with;
	 if(with<amount)
		 System.out.println("Balance "+ balwith);
	 else
		 System.out.println("error");
 }
	 
}
class TestAmount
{
	public static void main(String args[])
	{
		long a;
	    double c,e;
		String d;
		Scanner q=new Scanner(System.in);
		Bank Q1=new Bank();
		System.out.println("Enter name");
	    d=q.nextLine();
		System.out.println("Enter account no");
	    a=q.nextLong();
		System.out.println("Enter amount");
	    c=q.nextDouble();
		Q1.setData(a,d,c);
		Q1.getData();
		Q1.deposit();
		Q1.withdrawn();
		System.out.println("Name= Harsh Sandhu");
        System.out.println("Roll no=65");
		
	}
}