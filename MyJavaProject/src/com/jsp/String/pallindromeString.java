package com.jsp.String;

public class pallindromeString {
  public static void main(String[] args) {
	String s="kanak";
	String rev="";
	for(int i=s.length()-1;i>=0;--i) {
		rev=rev+s.charAt(i);
	}
	if(s.equals(rev)) {
		System.out.println("Pallendrome String");
	}else {
		System.out.println("not pallendrome string");
	}
}
}
