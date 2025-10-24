package com.jsp.Basicprograms;

import java.util.Arrays;

public class EqualityofArray {
  public static void main(String[] args) {
	int a []= {10,85,96,78,85};
	int b[]= {10,85,96,78,85};
	boolean status=Arrays.equals(a, b);
	if(status==true) {
		System.out.println("arrays are equals");
	}else {
		System.out.println("arrays not equals");
	}
}
}
