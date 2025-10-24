package com.Sorting;



public class BubbleSort {
     public static void printArray(int a[]) {
    	 for(int i=0;i<a.length;i++) {
    		 System.out.println(a[i]+" ");
    	 }
    	 System.out.println();
     } 
    	 
       public static void main(String[] args) {
    	   int[] a= {10,5,6,78,54};
    	   //time complexity o(
    	   for(int i=0;i<a.length-1;i++) {
    		   for(int j=0;j<a.length-i-1;j++) {
    			   if(a[j]>a[j+1]) {
    				   //swap
    				   int temp=a[j];
    				   a[j]=a[j+1];
    				   a[j+1]=temp;
    			   }
    		   }
    	   }
    	   printArray(a);
       
     }
}
