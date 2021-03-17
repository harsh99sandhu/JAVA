import java.util.Scanner;
interface test
{
	void sqre();
}
class arithmetic implements test
{
	public void sqre()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
		int b=a*a;
		System.out.println("Square of the number is "+b);
	}
}
class Test1
{
	public static void main(String args[])
	{
		arithmetic obj=new arithmetic();
		obj.sqre();
	}
}