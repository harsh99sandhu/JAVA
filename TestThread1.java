class Demo {
   public void printCount() {
      try {
         for(int i = 5; i > 0; i--) {
            System.out.println("Counter   ---   "  + i );
         }
      } catch (Exception e) {
         System.out.println("Thread  interrupted.");
      }
   }
}

class ThreadTest extends Thread {
   private Thread t;
   private String threadName;
   Demo  PD;

   ThreadTest( String name,  Demo pd) {
      threadName = name;
      PD = pd;
   }
   
   public void run() {
      synchronized(PD) {
         PD.printCount();
      }
      System.out.println("Thread " +  threadName + " exiting.");
   }

   public void start () {
      System.out.println("Starting " +  threadName );
      if (t == null) {
         t = new Thread (this, threadName);
         t.start ();
      }
   }
}

public class TestThread1 {

   public static void main(String args[]) {
      
	  System.out.println("Harshpreet Singh Sandhu");
	  System.out.println("65\n");
	  Demo PD = new Demo();

      ThreadTest T1 = new ThreadTest( "Thread - 1 ", PD );
      ThreadTest T2 = new ThreadTest( "Thread - 2 ", PD );

      T1.start();
      T2.start();

      // wait for threads to end
      try {
         T1.join();
         T2.join();
      } catch ( Exception e) {
         System.out.println("Interrupted");
      }
   }
}