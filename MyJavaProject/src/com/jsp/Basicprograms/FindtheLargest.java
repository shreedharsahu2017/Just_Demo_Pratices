package com.jsp.Basicprograms;

import java.util.Scanner;

public class FindtheLargest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("Enter the  a number");
		
		int b=sc.nextInt();
		System.out.println("Enter the b number");
		int c=sc.nextInt();
		System.out.println("Enter the c number");
		if(a>b && a>c) {
			System.out.println("a is largest"+a);
		}else if(b>a && b>c) {
			System.out.println("b is largest"+b);
		}else {
			System.out.println("c is largest"+c);
		}
	}
}
