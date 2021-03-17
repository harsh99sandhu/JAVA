class Main
{
	private void Display()
	{
		System.out.println("This is super class");
	}
}
class TestPrivate extends Main
{
	
public static void main(String args[])
{
	  Main b=new Main();
	  b.Display();
}
}