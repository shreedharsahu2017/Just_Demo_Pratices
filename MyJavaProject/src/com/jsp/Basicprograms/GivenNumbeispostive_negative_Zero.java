package com.jsp.Basicprograms;

import java.util.Scanner;

public class GivenNumbeispostive_negative_Zero {
 public static void main(String[] args) {
	 System.out.println("Enter the number");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	if(n>0) {
		System.out.println("positive");
	}else if(n<0) {
		System.out.println("Negative");
	}else {
		System.out.println("Zero");
	}
}
}
