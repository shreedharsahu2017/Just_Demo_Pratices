package com.jsp.Recursion;

public class ReverseString {
   public static void printRev(String s,int index) {
	   if(index==0) {
		   System.out.println(s.charAt(index));
		   return;
	   }
	   System.out.println(s.charAt(index));
	   printRev(s,index-1);
   }
   public static void main(String[] args) {
	String s="shree";
	printRev(s,s.length()-1);
}
}