package com.jsp.String;

import java.util.Scanner;
public class Pallindrome_String {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=sc.next();
		String str1=str;
	    int len=str.length()-1;
		
		String rev="";
		for(int i=len;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		if(str1.equals(rev)) {
			System.out.println("pallindrome String");
		
		}else {
			System.out.println("not pallindrome String");
		}
	}

	
	}


