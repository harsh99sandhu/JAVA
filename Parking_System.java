import java.util.*;

class Car 
{
	int type()
	{
		return 10;
	}
	int rate()
	{
		return 1;
	}
}

class Suv extends Car
{
	int rate()
	{
		return 70;
	}
}

class Sedan extends Car
{
	int rate()
	{
		return 60;
	}
}

class Mini extends Car
{
	int rate()
	{
		return 50;
	}
}

class Bike 
{
	int type()
	{
		return 5;
	}
	int rate()
	{
		return 1;
	}
}

class Motorcycle extends Bike
{
	int rate()
	{
		return 40;
	}
}

class Scooty extends Bike
{
	int rate()
	{
		return 35;
	}
}

class Parking_System
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter vehicle type:  ");
		String t=s.nextLine();
		if(t.equals("Car"))
		{
			System.out.println(t);
		}
		else
			System.out.println("No");
	}
}