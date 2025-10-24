package com.jsp.Basicprograms;

import java.util.Scanner;

public class PallindromeNumber {
  public static void main(String[] args) {
	System.out.println("Enter the number");
	Scanner s=new Scanner(System.in);
	
	int n=s.nextInt();
	int reverse=0;int temp;
	temp=n;
	while(n>0) {
		int rem=n%10;
		reverse=(reverse*10)+rem;
		n=n/10;
	}
	if(temp==reverse) {
		System.out.println(" is is reverse number"+reverse);
	}else {
		System.out.println("not reverse number"+reverse);
	}
}
}
