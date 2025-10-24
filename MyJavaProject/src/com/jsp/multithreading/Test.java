package com.jsp.multithreading;
//performing single tasks from single Thread
 public class Test extends Thread {
	
	public void run() {
		System.out.println("RUN METHOD");
	}

	public static void main(String[] args) {
		Test t=new Test();
		t.start();
	}
}
	
	// creating main class different ways
 /*class Testdemo{
	public static void main(String[] args) {
		Test t=new Test();
		t.start();
	}
  }*/

