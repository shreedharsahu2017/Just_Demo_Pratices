package com.jsp.Basicprograms;

import java.util.Scanner;

public class CountofOddandEven {
  public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number:");
	int n=sc.nextInt();
	int even_count=0;
	int odd_count=0;
	while(n>0) {
		int rem=n%10;
		if(rem%2==0) {
			even_count++;
		}else {
			odd_count++;
		}
		n=n/10;
		
	}
	System.out.println("Even and odd"+even_count);
	System.out.println("Eveb and odd "+odd_count);
}
}
