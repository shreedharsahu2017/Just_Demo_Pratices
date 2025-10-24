package com.jsp.collectionframeworks;

import java.util.LinkedList;

public class Linkedlistdemo {

	public static void main(String[] args) {
		LinkedList<Comparable> s=new LinkedList<Comparable>();
		s.add("durga");
		s.add(30);
		s.add(null);
		s.add("s");
		s.set(0,"software");
		s.add(0,"shree");
		System.out.println(s);
		s.removeFirst();
		s.addFirst("shreedhar");
		System.out.println(s);
		s.getFirst();
		System.out.println(s);
	}

}
