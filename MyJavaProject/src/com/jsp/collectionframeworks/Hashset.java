package com.jsp.collectionframeworks;

import java.util.HashSet;
public class Hashset {
  public static void main(String[] args) {
	HashSet<Integer> hs=new HashSet<>();
	hs.add(10);
	hs.add(5);
	hs.add(9);
	hs.add(4);
	hs.add(null);
	hs.add(5);
	System.out.println("HashSet"+hs);
	System.out.println(hs.add(5));
	System.out.println(hs);
  }
}
