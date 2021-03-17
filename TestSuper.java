class Teacher
{
	int marks=10;
}
class TestSuper extends Teacher
{
	int marks=50;
	void Display()
	{
		System.out.println(super.marks);
	}

public static void main(String args[])
{
	TestSuper s=new TestSuper();
	s.Display();
}
}