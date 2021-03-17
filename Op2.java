class Op2
{
public static void main(String args[])
{
	
	String a= new String("Harsh");
	String a1="Harsh";
	String k="  Sandhu ";
	System.out.println("hash value "+ a.hashCode());
	System.out.println(k.trim());
	String a2=a.intern();
	System.out.println(a==a1);
	System.out.println(a1==a2);
	System.out.println("length "+ a.length());
	System.out.println(a.replace('a','A'));
	System.out.println(a.substring(1,5));
	
	System.out.println("Harshpreet Singh Sandhu");
	System.out.println("65");
}
}