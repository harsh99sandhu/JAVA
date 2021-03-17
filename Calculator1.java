interface cal
{
int division(int num);
int modules(int num);
}
public class Calculator1 implements cal
{
public int division(int num){
return num/2;
}
public int modules(int num){
return num%2;
}
public static void main(String args[])
{
Calculator1 c1= new Calculator1 ();
System.out.println(c1.division(2));
System.out.println(c1.modules(2));
System.out.println("Name=Harsh Sandhu");
System.out.println("Roll no= 65");
}
}
