class TypeProm
{
	public void m1(double a)
	{
		System.out.println("Double arg");
	}
    public void m1(long f)
{
	System.out.println("Long arg");
}
    public static void main(String args[])
{
	TypeProm obj=new TypeProm();
	obj.m1(20.5f);
	obj.m1(2076666);
	obj.m1('a');
	System.out.println("Name= Harsh Sandhu");
    System.out.println("Roll no=65");
}
}