package com.jsp.String;

public class CountOfdigit {
 public static void main(String[] args) {
	String str="welcometojava";
	int count=0;
	for(int i=0;i<=str.length();i++) {
		if((str.charAt(i)>='o') && (str.charAt(i)<='a')) {
			count++;
		}
		System.out.println(count);
	}
	
} 
}
