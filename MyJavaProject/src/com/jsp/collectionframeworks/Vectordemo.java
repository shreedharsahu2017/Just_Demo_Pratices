package com.jsp.collectionframeworks;

import java.util.Vector;

public class Vectordemo {

	public static void main(String[] args) {
		Vector<Integer> v=new Vector<>();
		v.add(10);
         v.add(20);
         v.add(30);
         v.add(40);
         v.add(50);
         System.out.println(v);
         v.insertElementAt(500, 2);
         v.removeElement(3);
         System.out.println("vector element"+v);
         v.remove(4);
         System.out.println(v);
	}

}
