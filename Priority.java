class A extends Thread{
	public void run() {
		for(int i = 1; i <= 3; i++) 
		{
			System.out.println("Thread A: i = "+ i);
		}

	}
}

class B extends Thread{
public void run() 
	{
		for(int j = 1; j <= 3; j++) {
		System.out.println("From Thread B: j = "+ j);
	}

	}
}

class C extends Thread{
	public void run() {
	for(int k = 1; k <= 3; k++) {
		System.out.println("From Thread C: k = "+ k);
	}
	}
}


class Priority{
	public static void main (String args[]) {
		System.out.println("Harshpreet Singh Sandhu");
		System.out.println("65");
		A t1 = new A();
		B t2 = new B();
		C t3 = new C();

		t3.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(t2.getPriority() + 1);
		t1.setPriority(Thread.MIN_PRIORITY);

		t1.start(); t2.start(); t3.start();
		
	}
}
