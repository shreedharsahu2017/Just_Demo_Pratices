package com.jsp.multithreading;
//performing single task to from mutilpletheading
public class Testt extends Thread {
       public void run() {
    	   System.out.println(" run method ");
       }
	public static void main(String[] args) {
		Testt t=new Testt();
		t.start();
		Testt t1=new Testt();
		t1.start();
		Testt t2=new Testt();
		t2.start();
		Testt t3=new Testt();
		t3.start();
		//t2.start();illegalThreadstateException
	}

}
