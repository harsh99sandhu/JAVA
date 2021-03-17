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
class Teacher
{
 String name1;
 public void setData1(String a)
 {
	 name1=a;
 }
 public void getData1()
 {
	 System.out.println("Name= "+name1);
 }
}

class TestStudent
{
	public static void main(String args[])
	{
		Student S1=new Student();
		S1.setData(50,"harsh",900.2);
		S1.getData();
		System.out.println();
		Student S2=new Student();
		S2.setData(60,"ashish",900.1);
		S2.getData();
		System.out.println();
		Teacher S3=new Teacher();
		S3.setData1("harsh sandhu");
		S3.getData1();
		Teacher S4=new Teacher();
		S4.setData1("apoorve");
		S4.getData1();
	}
}