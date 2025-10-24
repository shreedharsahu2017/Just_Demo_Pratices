package com.jsp.multithreading;

public class MyThread extends Thread {
	public void run() {
		System.out.println("task1");
	}
	public void start() {
		System.out.println("hello start");
	}
}
	class myThread1 extends Thread{
		public void run() {
			System.out.println("task2");
		}
		
}
class Demo{
	public static void main(String[] args) {
		//MyThread t=new MyThread();
		//t.start();
		myThread1 t1=new myThread1();
		t1.start();
	}
}