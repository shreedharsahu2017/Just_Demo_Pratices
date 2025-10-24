package com.jsp.Synchronization;

public class Display {
	public void wish(String name) {
		for(int i=0;i<=5;i++) {
			System.out.println("good morning");
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				System.out.println("name");
			}
			
		}
	}
}
	class MyThread extends Thread{
		Display d;
		String name;
		MyThread(Display d,String name){
			this.d=d;
			this.name=name;
}
		public void run() {
			d.wish(name);
		}
	}
	class Synchronization{
		public static void main(String[] args) {
			Display d=new Display();
			MyThread t1=new MyThread(d,"msdhoni");
			MyThread t2=new MyThread(d,"kohli");
			t1.start();
			t2.start();
		
	}

}
