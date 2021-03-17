interface course
{
	void division(int a);
	void modulus(int b);
	void name(String n);
}
class student implements course
{
	String name;
	int div,mod;
	public void division(int a)
	{
		div=a;
	}
	public void name(String n)
	{
		name=n;
	}
	public void modulus(int b)
	{
		mod=b;
	}
	void display()
	{
		System.out.println("Name "+name);
		System.out.println("Division "+div);
		System.out.println("Modulus "+mod);
	}
}
class Result
{
	public static void main(String args[])
	{
		student stud=new student();
		stud.name("Harsh");
		stud.division(5);
		stud.modulus(10);
		stud.display();
	}
}