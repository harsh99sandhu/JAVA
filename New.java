class Room
{
	private int l,b;
	Room(int x,int y)
	{
		l=x; b=y;
	}
	int area()
	{
		return(l*b);
	}	
}
class class_Room extends Room
{
	int h;
	class_Room(int x,int y,int z)
	{
		super(x,y);
		h=z;
	}
	int volume()
	{
		return(area()*h);
	}
}
class New 
{
	public static void main(String[] args) 
	{
        class_Room cr=new class_Room(10,20,15);
        int a1=cr.area();
        int v1=cr.volume();
        System.out.println("Area of Room : "+a1);
        System.out.println("Volume of Room : "+v1);
		System.out.println("Name=Harsh Sandhu");
		System.out.println("Roll no= 65");
	} 
}
