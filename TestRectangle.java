import java.util.Scanner;
class Rectangle
{
	int l,b,area;
	public void insertData()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Lenght");
		l=s.nextInt();
		System.out.println("Enter Width");
		b=s.nextInt();
	}
	public void printArea()
	{
		area=l*b;
		System.out.println("Area=" + area);
	}
}
class TestRectangle
{
	public static void main(String args[])
	{
		Rectangle R1=new Rectangle();
		R1.insertData();
		R1.printArea();
	}
}
		