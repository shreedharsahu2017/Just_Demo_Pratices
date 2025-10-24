package com.jsp.Recursion;
//print sum of natural number 1+2+3+......+n;
public class Recursion3 {
     public static void Printsum(int i,int n,int sum) {
    	 if(i==n) {
    		 sum+=i; //sum=sum+i;
    		 System.out.println(sum);
    		 return;
    	 }
    	 sum+=i;
    	 System.out.println(i); //1 2 3 4 5 15
    	 Printsum(i+1,n,sum);
    	 
     }
     public static void main(String[] args) {
		Printsum(1,5,0);
	}
     
}
