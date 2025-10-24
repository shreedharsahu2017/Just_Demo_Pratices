  package com.Sorting;

public class MergedSort {
	public static void conquer(int a[],int si,int mid,int ei) {
		int merged[]=new int[ei-si+1];
		
		int idx1=si;
		int idx2=mid+1;
		int x=0;
		while(idx1<= mid && idx2<=ei) {
			if(a[idx1] <= a[idx2]) {
				merged[x++]=a[idx1++];
				
			}else {
				merged[x++]=a[idx2++];
			}
		}
		while(idx1<=mid) {
			merged[x++]=a[idx1++];
		}
		while(idx2<=ei) {
			merged[x++]=a[idx2++];
		}
		for(int i=0,j=si;i<merged.length;i++,j++) {
			a[j]=merged[i];
		}
	}
	public static void divide(int a[],int si,int ei) {
		if(si>=ei) {
			return;
		}
		int mid=si+(ei-si)/2;
		 divide(a,si,mid);
		 divide(a,mid+1,ei);
		 conquer(a,si,mid,ei);
	
	}
	
    public static void main(String[] args) {
		int a[] = {10,9,2,4,36,4,96};
		int n=a.length;
		divide(a,0,n-1);
		//int i;
		for( int i=0;i<n;i++){
			System.out.println(a[i]+" ");
		}
	}
}
