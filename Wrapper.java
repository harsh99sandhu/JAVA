class Wrapper
{
	public static void main(String args[])
	{
		int a=25;
		String s="25";
		
		Integer int_obj=new Integer(a); //Integer object
		System.out.println("Integer object = "+int_obj);
		
		int a_new=int_obj; //Int value
		System.out.println("Int value = "+a_new);
		
		int s_int=Integer.parseInt(s); //String to Int value
		System.out.println("String to Int value= "+s_int);
		
		Integer string_obj=new Integer(s); //String to Integer object
		System.out.println("String to Integer object = "+string_obj);
		
		String int_str_obj = Integer.toString(a_new); //Int value to String
		System.out.println("Int value to String = "+int_str_obj);
		
		String integer_str_obj = Integer.toString(int_obj); //Integer object to String 
		System.out.println("Integer object to String = "+integer_str_obj);
		
		System.out.println("Harshpreet Singh Sandhu");
		System.out.println("65");
	}
}