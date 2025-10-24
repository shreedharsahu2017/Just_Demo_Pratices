package com.jsp.Basicprograms;

import java.util.Scanner;

public class ArmstrongNumber {
  public static void main(String[] args) {
	  System.out.println("Enter the number");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int arm=0; int temp;
	temp=n;
	while(n>0) {
		int rem=n%10;
		arm=(rem*rem*rem)+arm;
		n=n/10;
	}
	if(temp==arm) {
		System.out.println("armstrong  number"+temp);
	}else {
		System.out.println("not armstrong number"+temp);
	}
}
}
