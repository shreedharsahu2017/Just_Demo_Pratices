package com.jsp.Starpattern;

import java.util.Scanner;

public class Numberpattern3 {
  public static void main(String[] args) {
	  System.out.println("Enter the number");
	Scanner sc=new Scanner(System.in);
	int r=sc.nextInt();
	
	for(int i=1;i<=r;i++) {
		//space
		for(int j=1;j<=r-i;j++) {
			System.out.print(" ");
		}
		for(int k=1;k<=i;k++) {
			System.out.print(k);
		}
		for(int l=i-1;l>=1;l--) {
			System.out.print(l);
		}
		System.out.println();
	}
}
}
