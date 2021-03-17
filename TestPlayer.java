class Player
{
	void Cricket()
	{
		System.out.println("Cricket Player");
	}
	void Football()
	{
		System.out.println("Football Player");
	}
	void Hockey()
	{
		System.out.println("Hockey Player");
	}
}
class CricketPlayer extends Player
{
}
class FootballPlayer extends Player
{
}
class HockeyPlayer extends Player
{
}
class TestPlayer
{
	public static void main(String args[])
	{
		CricketPlayer a=new CricketPlayer();
		a.Cricket();
		FootballPlayer b=new FootballPlayer();
		b.Football();
		HockeyPlayer c=new HockeyPlayer();
		c.Hockey();
		System.out.println("Name=Harsh Sandhu");
		System.out.println("Roll no= 65");
	}
}
		
	