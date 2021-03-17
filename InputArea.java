import java.util.*;
class InputArea
{
  public static void main(String args[])
 {
  Scanner s=new Scanner(System.in);
	 double a,b,c;
	 System.out.println("Enter radius");
	 a=s.nextDouble();
	 b=3.14*a*a;
	 c=2*3.14*a;
	 System.out.println("AREA= "+b);
	 System.out.println("Circumference= "+c);
}
}