interface printable
{
	printable()
	{
		System.out.println("Constructor");
	}
}
class A implements printable
{
	public static void main(String args[])
	{
		printable obj=new printable();
	}
}
		