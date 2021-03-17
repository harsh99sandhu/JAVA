class NumExp
{
public static void main(String args[])
{
	System.out.println("Name- Harshpreet Singh Sandhu");
	System.out.println("Roll no- 65");

	try
	{
		double a= Double.parseDouble(args[0]);
		double b= Double.parseDouble(args[1]);
		System.out.println("Modulo is: "+(a%b));
	}
	catch(Exception e)
	{
		System.out.println("Invalid: Non numerical operand found	"+e); 
	}
}
}
