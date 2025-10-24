package com.joinThread;

public class Test extends Thread{
   public void run() {
	  for(int i=0;i<5;i++) {
		  System.out.println("child Thread");
		  try
		  {
			  Thread.sleep(10000);
		  }
		  catch(InterruptedException e) {
			  
		  }
	  }
	  
   }
   class ThreadjoinDemo{
	   public static void main(String[] args)throws InterruptedException {
		   Test t=new Test();
		   t.start();
		   t.join();
		   for(int i=0;i<5;i++)
		   {
			   System.out.println("main Thread");
		   }
	}
   }
}
