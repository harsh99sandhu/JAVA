interface AnimalEat
{
	void eat();
}
interface AnimalTravel
{
	void travel();
}
class Animal implements AnimalEat,AnimalTravel
{
	public void eat()
	{
		System.out.println("Animal is eating");
	}
	public void travel()
	{
		System.out.println("Animal is travelling");
	}
}
class Dog extends Animal
{
	public void bulldog()
	{
		System.out.println("Multilevel inheritance");
	}
}

public class Demo
{
	public static void main(String args[])
	{
		Animal a=new Animal();
		a.eat();
		a.travel();
		Dog b=new Dog();
		b.bulldog();
	}
}