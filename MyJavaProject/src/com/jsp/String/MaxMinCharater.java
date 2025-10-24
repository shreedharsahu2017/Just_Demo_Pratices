package com.jsp.String;
///maximim occuring charater in a given String
public class MaxMinCharater {
   public static void main(String[] args) {
	String s="abbbcc  cdddddd";
	
	int [] a=new int[127];
	
	for(int i=0;i<=s.length()-1;i++) {
		a[s.charAt(i)]=a[s.charAt(i)]+1;
	}
	int max=-1;
	char c=' ';
	
	for(int i=0;i<=s.length()-1;i++) {
		if(max<a[s.charAt(i)]) {
			max=a[s.charAt(i)];
			c=s.charAt(i);
		}
	}
	System.out.println("maximum reapted charater string present"+" "+c);
}
}
