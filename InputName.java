import java.util.*;
class InputName
{
 public static void main(String args[])
 {
	 Scanner s=new Scanner(System.in);
	 int a;
	 long b;
	 float c;
	 String d;
	 System.out.println("Enter name");
	 d=s.nextLine();
	 System.out.println("Enter rollno");
	 a=s.nextInt();
	 System.out.println("Enter percentage");
	 c=s.nextFloat();
	 System.out.println("Enter mobile_no");
	 b=s.nextLong();
	 System.out.println("NAME= "+d);
	 System.out.println("ROLLNO= "+a);
	 System.out.println("PERCENTAGE= "+c);
	 System.out.println("MOBILE NO= "+b);
 }
}