package com.jsp.Recursion;
//print number of factorial 
public class recursion_Factorial {
    public static int Calcfact(int n) {
    	if(n==0||n==1) {
    		return 1;
    	}
       int factNum=Calcfact(n-1);
       int fact=n*factNum;
       System.out.println(factNum);
       return fact;
    }
    public static void main(String[] args) {
		int n=5;
		int ans=Calcfact(n);
		System.out.println(ans);
	}
}
