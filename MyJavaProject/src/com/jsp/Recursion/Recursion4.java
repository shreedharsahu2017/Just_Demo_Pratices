package com.jsp.Recursion;
//find print the first and last occurance of an element
public class Recursion4 {
   public static int first=-1;
   public static int last=-1;
     
  public static void findOccurance(String s,int index, char element) {
	  if(index==s.length()) {
		  System.out.println(first);
		  System.out.println(last);
		  return;
	  }
	  
	  char currentchart=s.charAt(index);
	  if(currentchart==element) {
		  if(first==-1) {
			  first=index;
		  }else {
		      last=index;
		  }
	  }
	  findOccurance(s,index+1,element);
  }
  public static void main(String[] args) {
	String s="banbdshaaaaamkd";
	findOccurance(s,0,'a');
}
}
