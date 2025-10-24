package com.jsp.collectionframeworks;

import java.util.*;

public class LLExample {
   public static void main(String[] args) {
	LinkedList<String> s=new LinkedList<>();
	s.add("akash");
	s.add("ravi");
	s.add("rahul");
	s.add("sooo");
	System.out.println("all element are:"+s);
	s.add(3, "sample");
	System.out.println(s);
	LinkedList<String> i=new LinkedList<>();
	i.add("r");
	i.add("s");
	i.add("k");
	//System.out.println(i);
	s.addAll(i);
	System.out.println(s);
	
	LinkedList<String> l=new LinkedList<>();
	l.add("t");
	l.add("S");
	l.add("U");
	System.out.println(l);
	s.addAll(l);
	System.out.println(s);
	s.addAll(1, l);
	System.out.println(s);
	
	s.addFirst("shree");
	s.addLast("sahu");
	System.out.println(s);
	}
}
