package com.jsp.Overloading;

public class Test {
	public void methodOne(String s)
	{
	System.out.println("String version");
	}
	public void methodOne(Object o) //Both methods are said to
	 //be
	//overloaded methods.
	{
	System.out.println("Object version");
	}
	public static void main(String[] args)
	{
	Test t=new Test();
	t.methodOne("arun");//String version
	t.methodOne(new Object());//Object version
	t.methodOne(null);//String version
	}
}
