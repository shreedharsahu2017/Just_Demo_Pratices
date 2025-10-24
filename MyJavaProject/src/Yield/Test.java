package Yield;

public class Test extends Thread {
   public void run() {
	   
	   for(int i=1;i<=5;i++) {
		   Thread.yield();
		   System.out.println("child Thread");
		  // System.out.println(Thread.currentThread().getName()+" "+i);
	   }
   }
   public static void main(String[] args) {
	 Test t=new Test();
	 t.start();
	 //Thread.yield();
	 for(int i=1;i<=5;i++) {
		 System.out.println("main Thread");
		 //System.out.println(Thread.currentThread().getName()+" "+i);
	   }
  }
}
