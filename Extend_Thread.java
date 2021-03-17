class Extend_Thread extends Thread
{  
	public void run()
	{  
		System.out.println("New Thread in process");  
	}  
	
	public static void main(String args[]){  
	Extend_Thread t=new Extend_Thread();  
	t.start();  
	System.out.println("Harshpreet Singh Sandhu");
	System.out.println("65");
 }  
}  