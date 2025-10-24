package com.jsp.Basicprograms;

public class SwappingtwoVariable {
   public static void main(String[] args) {
	   //approach-1
	/*int a=10; int b=30;
	System.out.println("swapping two variable:"+a+" "+b);
	int temp=a;
	a=b;
	b=temp;
	System.out.println("after swapping two variable:"+a+" "+b);*/
	   
	   int a=10,b=20;
	   
	   System.out.println("swapping of two variable"+a+" "+b);
	      a=a+b;
	       b=a-b;
	       a=a-b;
	   System.out.println("after swapping of third variable"+a+" "+b);
	
	
	
}
}
