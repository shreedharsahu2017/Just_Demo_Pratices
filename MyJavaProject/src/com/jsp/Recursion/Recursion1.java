package com.jsp.Recursion;

public class Recursion1 {
	  
	public static void printNum(int n) {
		  if(n==0) {    //base condition
			  return;
		  }
		System.out.println(n); //print
		printNum(n-1); //recursion
	}

   public static void main(String[] args) {
	int n=100;
	printNum(n);
}
}
