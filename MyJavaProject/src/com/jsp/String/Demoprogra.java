package com.jsp.String;

public class Demoprogra {
  public static void main(String[] args) {
	String firstname="shree";
	String lastname="sahu";
	String fullname=firstname+lastname;
	System.out.println(fullname);
	for(int i=0;i<fullname.length();i++) {
		System.err.println(fullname.charAt(i));
		System.out.println(firstname.compareTo(lastname));
	 }
   }
}
