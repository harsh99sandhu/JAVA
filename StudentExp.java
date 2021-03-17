import java.util.*;
class StudentExp
{
	public static void main(String args[])
	{
		System.out.println("Name- Harshpreet Singh Sandhu");
		System.out.println("Roll no- 65");
		int r[]=new int[10],i;			
		String name[]=new String[10];
		try
		{
			System.out.println("Enter the Name and Roll no. of Students");
			for(i=0;i<=10;i++)
			{
				Scanner s=new Scanner(System.in);
				name[i]=s.next();
				r[i]=s.nextInt();
			}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Invalid	"+e);
		}
		System.out.println("Data of 10 students :");
		for(i=0;i<=10;i++)
		{
			System.out.println("Name: "+name[i]+"		"+"Roll no: "+r[i]);
		}
		
	}
}