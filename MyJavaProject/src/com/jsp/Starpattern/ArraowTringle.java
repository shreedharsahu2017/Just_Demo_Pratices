package com.jsp.Starpattern;

public class ArraowTringle {
 public static void main(String[] args) {
	for(int i=1;i<=5;i++) {
		for(int j=5;j>=1;j--) {
			System.out.print(" ");
		}
		for(int k=1;k<2*i;k++) {
			if(i>1 && k<(2*i)-1) {
				System.out.print(" ");
			   }else {
				System.out.print("*");
			}
		}
		System.out.println();
	}
}
}
