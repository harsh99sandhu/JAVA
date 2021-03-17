class A
{
	void exA()
	{
		System.out.println("THIS IS exA");
	}
}
class B extends A
{
	void exB()
	{
		System.out.println("THIS IS exB");
	}
}
class C extends B
{
	void exC()
	{
		System.out.println("THIS IS exC");
	}
}

class D extends A
{
	void exD()
	{
		System.out.println("THIS IS exD");
	}
}
class Inheritance
{
	public static void main(String args[])
	{
		B obj=new B();
		D obj1=new D();
		obj.exA();
		obj1.exA();
		//obj.exC();
	}
}