package com.jsp.multithreading;

 class Threadtest extends Thread {
	public void run() {
		System.out.println("run method exececuted by Thread:"
		+Thread.currentThread().getName());
	}
}
public class myThread2{
	public static void main(String[] args) {
		Threadtest t=new Threadtest();
		t.start();
		System.out.println("main Thread executed by Thread"+Thread.currentThread().getName());
	}
}