/*final*/ class Bike
{
	/*final int speed=100;*/
	final void display()
	{
		System.out.println("error");
	}
}
class TestFinal extends Bike
{
	/*final*/ int speed=100;
	
	void display()
	{
		speed=400;
		System.out.println(speed);
	}
	
	public static void main(String args[])
	{
		TestFinal obj=new TestFinal();
		obj.display();
	}
}