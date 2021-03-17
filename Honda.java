abstract class Bike
{
	abstract void run();
	void speed()
	{
	}
}
class Honda extends Bike
{
	void run()
	{
		System.out.println("Overridden");
	}
	public static void main(String args[])
	{
		Honda obj=new Honda();
		obj.run();
	}
}