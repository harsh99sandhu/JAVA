import java.util.*;
class Student
{
 int roll;
 String name;
 double marks;
 public void setData(int r,String s,Double m)
 {
	 roll=r;
	 name=s;
	 marks=m;
 }
 public void getData()
 {
	 System.out.println("ROLLNO= "+roll);
	 System.out.println("Name= "+name);
	 System.out.println("Marks= "+marks);
 }
}
class StuInfo
{
	public static void main(String args[])
	{
		int a;
	    double c;
		String d;
		Scanner s=new Scanner(System.in);
		Student S1=new Student();
		System.out.println("Enter name");
	    d=s.nextLine();
		System.out.println("Enter rollno");
	    a=s.nextInt();
		System.out.println("Enter marks");
	    c=s.nextDouble();
		S1.setData(a,d,c);
		S1.getData();
		System.out.println("Name= Harsh Sandhu");
        System.out.println("Roll no=65");
		
	}
}