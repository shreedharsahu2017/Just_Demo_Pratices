package com.jsp.collectionframeworks;

import java.util.ArrayList;

public class ArraylistDemo {

	public static void main(String[] args) {
		ArrayList<Integer>  list=new ArrayList<Integer>();
		list.add(10);
		list.add(2);
		list.add(4);
		list.add(5);
		list.add(5);
		System.out.println(list);
		//get elenment
		int element=list.get(2);
		System.out.println(element);
		//add element in between
		list.add(1,5);
		System.out.println(list);
		//list set
		list.set(0, 3);
		System.out.println(list);
		//delete element
		list.remove(3);
		System.out.println(list);
		//size
		int size=list.size();
		System.out.println(size);
		//loops
		for(int i=0;i<list.size();i++) {
			System.out.print(i);
		}
		System.out.println();
	}

}
