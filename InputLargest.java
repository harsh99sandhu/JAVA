import java.util.*;
class InputLargest
{
  public static void main(String args[])
 {
  Scanner s=new Scanner(System.in);
	 double a,b,c;
	 System.out.println("Enter NUmber 1");
	 a=s.nextDouble();
	 System.out.println("Enter NUmber 2");
	 b=s.nextDouble();
	 System.out.println("Enter Number 3");
	 c=s.nextDouble();
  if(a>b)
  {
	  if(a>c)
		  System.out.println("Number 1 is largest");
	  else
		  System.out.println("Number 2 is largest");
  }
  else if(b>c)
	  System.out.println("Number 2 is largest");
  else
	  System.out.println("Number 3 is largest");
  
 }
}	 