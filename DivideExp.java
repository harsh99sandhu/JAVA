import java.util.*;
class DivideExp
{
	public static void main(String args[])
	{
		System.out.println("Name- Harshpreet Singh Sandhu");
		System.out.println("Roll no- 65");
		int a,b;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter two integers");
		a=s.nextInt();	
		b=s.nextInt();
		try
		{ 
			System.out.println(a/b);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Can't perform operation"+e);
		}
	}
 }