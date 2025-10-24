package com.jsp.String;

import java.util.Scanner;

public class ReversedString {
public static void main(String[] args) {
	System.out.println("Enter the String");
	Scanner sc=new Scanner(System.in);
	String str=sc.next();
	String Str1=str;
	String rev="";
	int len=str.length()-1;
	for(int i=len;i>=0;i--) {
		rev=rev+str.charAt(i);
	}
	System.out.println(rev);
	

}
}
