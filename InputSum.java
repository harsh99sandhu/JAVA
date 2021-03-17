import java.util.*;
class InputSum

{
 public static void main(String args[])
 {
	 Scanner s=new Scanner(System.in);
	 double a,b,c,d,e,f;
	 System.out.println("Enter first number");
	 a=s.nextDouble();
	 System.out.println("Enter Second number");
	 b=s.nextDouble();
	 c=a+b;
	 d=a-b;
	 e=a*b;
	 f=a/b;
	 System.out.println("SUM="+ c);
	 System.out.println("Subtraction="+ d);
	 System.out.println("Multiple="+ e);
	 System.out.println("Division="+ f);
 }
}