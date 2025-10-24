package com.jsp.Basicprograms;

import java.util.Scanner;

public class TwovaribaleSwap {
public static void main(String[] args) {
	System.out.println("enter the number");
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	int temp;
	System.out.println("before swapping"+a+" "+b);
	temp=a;
	a=b;
	b=temp;
	System.out.println("after swapping"+a+" "+b);
	
}
}
