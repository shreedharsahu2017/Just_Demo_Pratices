package com.jsp.collectionframeworks;
import java.util.Iterator;
import java.util.Stack; 
public class stack2 {  
	public static void main(String[] args)   
	{  
	Stack<String> stk= new Stack<>();  
	//pushing elements into Stack  
	stk.push("Mac Book");  
	stk.push("HP");  
	stk.push("DELL");  
	stk.push("Asus");  
	System.out.println("Stack: " + stk);  
	// Search an element  
	Iterator<String> itr=stk.iterator();
	while(itr.hasNext()) {
		//System.out.println(itr.hasNext());\
		boolean ans=itr.hasNext();
		System.out.println(ans);
	/*int location = stk.search("HP");  
	System.out.println("Location of Dell: " + location);  
	System.out.println(stk.search("lenovo"));*/
	
	}
	}  

}
