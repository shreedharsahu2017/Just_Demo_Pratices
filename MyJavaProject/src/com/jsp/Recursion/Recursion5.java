package com.jsp.Recursion;

public class Recursion5 {
  public static void Printfib(int a,int b,int n) {
	  if(n==0) {
		  return;
	  }
	 int c=a+b;
	 System.out.println(c);
	 Printfib(b,c,n-1);
  }
  public static void main(String[] args) {
	int n=5,a=0,b=1;
	System.out.println(a);
	System.out.println(b);
	Printfib(a,b,n-2);
}
}
