interface A
{
void meth1();
void meth2();
}

public class MyClass1 implements A
{
public void meth1(){System.out.println("Method1");}
public void meth2(){System.out.println("Method2");}
	public static void main(String args[])
	{
	MyClass1 obj = new MyClass1();
	obj.meth1();
	obj.meth2();
	System.out.println("Name=Harsh Sandhu");
	System.out.println("Roll no= 65");
	}
}
