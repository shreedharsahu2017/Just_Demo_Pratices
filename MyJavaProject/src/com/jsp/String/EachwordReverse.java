package com.jsp.String;

public class EachwordReverse {
  public static void main(String[] args) {
	  String s="Welcome  to  java";
	  
	  String []word=s.split(" "); //splitting into each word
	  String rev="";
	  for(String w:word) {
		  String revword="";
	  
	  for(int i=w.length()-1;i>=0;i--) {
		  revword=revword+w.charAt(i);
	  }
	  rev=rev+revword+" ";
        }
	  System.out.println(rev);
	  }
}