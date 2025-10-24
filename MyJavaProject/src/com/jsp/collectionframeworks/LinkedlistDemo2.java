package com.jsp.collectionframeworks;

import java.util.*; 
public class LinkedlistDemo2 {
 
	 public static void main(String args[]){  
	  
	  LinkedList<String> al=new LinkedList<String>();  
	  al.add("Ravi");  
	  al.add("Vijay");  
	  al.add("Ravi");  
	  al.add("Ajay");  
	  
	  Iterator<String> itr=al.iterator();  
	  while(itr.hasNext()){  
	   System.out.println(itr.next());  
	  }  
	 }  
	}  


