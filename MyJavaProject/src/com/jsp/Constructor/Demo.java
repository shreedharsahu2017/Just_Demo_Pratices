package com.jsp.Constructor;

public class Demo {

	public Demo() {
		System.out.println("no args");
	}
	public Demo(int i) {
		System.out.println("int-args");
	}
	{
		System.out.println("instance block");
	}
	
	public Demo(float f) {
		System.out.println("float-args");
	}
	public Demo(double d) {
		System.out.println("double-args");
	}
	public Demo(boolean b) {
		System.out.println("boolean args");
	}
	public static void main(String[] args) {
		Demo d=new Demo();
		Demo d1=new Demo(10);
		Demo d2=new Demo(false);
		Demo dn=new Demo(10.5);
	}

}
