class Sleep1 implements Runnable 
{  
	public void run() 
	{   
		for(int i=0;i<10;i++) 
		{ 
			System.out.println("Thread1 is running"+i); 
		}  
	} 
} 
class Sleep2 extends Thread 
{  
	public void run() 
	{   
		for(int i=10;i<20;i++)        
		{   
			System.out.println("Thread2 is running"+i); 
		}  
	} 
}    
class Sleep3 extends Thread 
{  
	public void run() 
	{   
		for(int i=20;i<30;i++)     
		{   
			System.out.println("Thread3 is running"+i); 
		}  
	} 
} 
class Sleep
{  
	public static void main(String arg[])
	{      
		Sleep r1=new Mythread1();   
		Thread t1=new Thread(r1,"thread1");         
		t1.start();   
		Sleep2 r2=new Sleep2();   
		r2.start();   
		Sleep3 r3=new Sleep3();   
		r3.start();                  
	} 
} 