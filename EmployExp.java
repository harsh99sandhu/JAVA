import java.io.*;
import java.util.*;
class EmployExp
{
	public static void main(String args[])
{
	System.out.println("Name- Harshpreet Singh Sandhu");
	System.out.println("Roll no- 65\n");

	String name;
	int age;
	System.out.println("ENTER EMPLOYEE DETAILS");
	System.out.println("Enter Name and Age:");
	Scanner a=new Scanner(System.in);

try
{
	if(!(a.nextLine().matches("[a-zA-Z]+")))
	{throw new IOException();}

	age=a.nextInt();
	if(age>50)
	{
		System.out.println("Age greater than 50 Exception");
		throw new Exception();
	}

	EmployExp x=new EmployExp();
	System.out.println("Object Created");
}

	catch(Exception e)
	{
		System.out.println("Invalid: "+e);
	}
}
}