package com.jsp.Starpattern;

public class pyarmid2 {
  public static void main(String[] args) {
	for(int i=1;i<=5;i++) {
		for(int j=1;j<=4;j++) {
			System.out.print(" ");
		}
		for(int k=1;k<=2*i-1;k++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
}
