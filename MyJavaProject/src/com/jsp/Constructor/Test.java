package com.jsp.Constructor;

public class Test {
	static int count=0;
	{
	count++; //instance block
	}
	Test()
	{
		System.out.println("No args conc");
	}
	Test(int i)
	{
		System.out.println("parameterized conc");
	}
	public static void main(String[] args)
	{
	Test t1=new Test();
	Test t2=new Test(10);
	Test t3=new Test();
	System.out.println(count);//3
	}
	}
