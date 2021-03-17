public class TestMultipleCatchBlock
{
	public static void main(String args[])
	{
		try
		{
			int a[]=new int[5];
			a[5]=50/0;
			a[5]=5;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Catch ArithmeticException");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Catch ArrayIndexOutOfBoundsException");
		}
		catch(Exception e)
		{
			System.out.println("Catch all Exception");
		}
		System.out.println("Rest of the code");
		
	}
}