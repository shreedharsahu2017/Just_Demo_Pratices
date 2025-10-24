package com.jsp.oops;

public class Test {
	public void methodOne(String s)
	{
	}
	public void methodOne(Object o) //Both methods are said to be overloaded
	
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
