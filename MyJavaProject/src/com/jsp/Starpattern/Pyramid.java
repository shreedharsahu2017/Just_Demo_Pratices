package com.jsp.Starpattern;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		Scanner zc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=zc.nextInt();
		for (int i = 1; i <=n; i++) {
			for(int j=n;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=2*i-1;k++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
	}

}
