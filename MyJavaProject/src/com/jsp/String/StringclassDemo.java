package com.jsp.String;

public class StringclassDemo {
  public static void main(String[] args) {
	//Concat()  //The overload "+"and"+=" operator also meant for concate purpose only
	/*  String s1=new String("software");
	  String s="ankit";
	  s=s1.concat("testing");
	  s+=s.concat("shree");
	  System.out.println(s+"");*/
	  
	  //equalsIgnoreCase(String s);
	  // for content comparision where case is not important
	/*  String s="java";
	  System.out.println(s.equalsIgnoreCase("jAvA"));
	  System.out.println(s.equals("jAVA"));*/
	  
	  
	  //subString  where is begin index to end of the String
	 /* String s="ashok";
	  System.out.println(s.substring(3));
	  System.out.println(s.substring(1, 4));begin index to end of the String-1;*/
	  
	  
	/*///length 
	  String s="akash";
	  System.out.println(s.length());//5
	  
	  
	 /* String s="akash";
	  System.out.println(s.replace('a','b'))  // replace(char old,char new)
	  */
	   //ToLowerCase();
	 /* String s="RAHUL";
	  System.out.println(s.toLowerCase());//rahul*/
	  //
	 /* String s="rahul";
	  System.out.println(s.toUpperCase());//rahul*/
	/*  String s="   shreedhar sahu   ";
	  System.out.println(s.trim());// remove the blank space present present at begining and end of the String
	  //but not blank spaces present at middle of string
	   * */
	 /*  String s="shreedhar";
	   System.out.println(s.indexOf('c'));
	   System.out.println(s.indexOf('e'));*/
	 /* 
	  String s="shreedhaar";
	  System.out.println(s.lastIndexOf('a'));
	  System.out.println(s.lastIndexOf('e'));*/
	  //compareTo
	  String s="Ava";// it is based on unicode
	  String s1="ava";
	  System.out.println(s1.compareTo(s));  //if s1 greaterthan s1 s>s1
   }
}
