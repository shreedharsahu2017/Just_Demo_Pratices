package com.jsp.collectionframeworks;

import java.util.*;

public class LL3 {
  public static void main(String[] args) {
	LinkedList<String> l=new LinkedList<>();
	l.add("rahul");
	l.add("Rakesh");
	l.add("tu");
	System.out.println(l);
	Iterator<String> itr=l.descendingIterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
}
}
