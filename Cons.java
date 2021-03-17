class Cons
{
	int id;
	String name;
	int age;
	Cons(int i,String n)
	{
		id=i;
		name=n;
	}
    Cons(int i,String n,int a)
	{
		id=i;
		name=n;
		age=a;
	}
	void display()
	{
		System.out.println(id+" "+name+" "+age);
	}
	public static void main(String args[])
	{
		Cons c1=new Cons(21,"Karan");
		Cons c2=new Cons(22,"Karan1",18);
		c1.display();
		c2.display();
	}
}