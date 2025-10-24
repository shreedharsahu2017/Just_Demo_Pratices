package com.jsp.Starpattern;

import java.util.Scanner;

public class Pyaramid2 {

	public static void main(String[] args) {
			Scanner zc=new Scanner(System.in);
			System.out.println("Enter the number:");
			int n=zc.nextInt();
			for (int i = 1; i <=n; i++) {
				for(int j=n;j>=i;j--) {
					System.out.print(" ");
				}
				for(int k=1;k<=i;k++) {
					System.out.print("*");
				}
				for(int l=2;l<=i;l++) {
					System.out.print("*");
				}
				System.out.println();
	}


}
	
}