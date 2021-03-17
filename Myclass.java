interface A
{
	void method1(int a);
	void method2(int b,int c);
}
class B implements A
{
	public void method1(int a)
	{
		System.out.println("Value of a is "+a);
	}
	public void method2(int b,int c)
	{
		System.out.println("Value of b and c is "+b+" "+c);
	}
}
class Myclass
{
	public static void main(String args[])
	{
		B obj=new B();
		obj.method1(1000);
		obj.method2(2000,3000);
	}
}
	