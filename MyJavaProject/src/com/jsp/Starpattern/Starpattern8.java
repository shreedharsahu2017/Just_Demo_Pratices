package com.jsp.Starpattern;

import java.util.Scanner;

public class Starpattern8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			for( int j=1;j<=i;j++) {
				if(i>=2 && j<=i-1) {
					System.out.print(" ");
				}
				else {
					System.out.println("*");
				}
			}
			System.out.println();
		
		}
	}

}
