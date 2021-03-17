class Run implements Runnable
{  
	public void run()
	{  
		System.out.println("New Thread in process");  
	}  
  
	public static void main(String args[]){  
	Run r=new Run();  
	Thread t =new Thread(r);  
	t.start(); 
	System.out.println("Harshpreet Singh Sandhu");
	System.out.println("65");
 }  
}  