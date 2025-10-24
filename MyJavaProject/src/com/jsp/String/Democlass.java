package com.jsp.String;

public class Democlass {
   public static void main(String[] args) {
	 String s="javapoint";
	 String  s1="javapoint";
	 String s3=new String("javapoint");
	 System.out.println(s3);
	 System.out.println(s==s1);//in case of primitive == meant for contain comparasion it return true & 
	 //if case of object reference  meant for address comparrison it returns false
	 System.out.println(s.equals(s3)); // it meants for content comparision it return true
	 System.out.println(s==s3);//if case of object reference  meant for address comparrison it returns false
	 System.out.println(s1.equals(s3));
}//it meants for content comparision it return true
}
