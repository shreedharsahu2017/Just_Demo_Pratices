package com.Sorting;

public class InsertionSort {
	
	public static void printArray(int a[]) {
		for(int i:a) {                   //for(int i=0;i<a.length;i++){
			                              //System.out.println(a[]+"");
			System.out.println(i);
		}
	}
	
	
  public static void main(String[] args) {
	 int [] a= {10,25,78,96,85,20};
	 for(int i=1;i<a.length;i++) {
		 int temp=a[i];
		 int j=i-1;
		 while(j>=0 && temp<a[j]) {
			 a[j+1]=a[j];
			 j--;
		 }
		 //placement
		 a[j+1]=temp;
	 }
	 printArray(a);
}
}
