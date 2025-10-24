package com.jsp.collectionframeworks;

import java.util.*;


public class Mycomparator implements Comparator<Integer> {
	 public int compare(Integer I1,Integer I2) {
		 
		 // java 8
		 return (I1<I2)?-1:(I1>I2)?1:0;
		/* if(I1<I2) {
			 return -1;
			 
		 }else if(I1>I2) {
			 return +1;
		 }else {
			 return 0;
		 }
	    } 
	     */
	 }
	 }
	 class Test{
		 public static void main(String[] args) {
			ArrayList<Integer> al=new ArrayList<>();
			al.add(10);
			al.add(5);
			al.add(1);
			al.add(3);
			System.out.println(al);
			
			Collections.sort(al,new Mycomparator());
			System.out.println(al);
		}
}
