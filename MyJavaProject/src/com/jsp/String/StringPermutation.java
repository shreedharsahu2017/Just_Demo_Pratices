package com.jsp.String;

public class StringPermutation {
  public static String Swap(String s,int i,int j) {
	  char[]a=s.toCharArray();
	  char temp=a[i];
	    a[i]=a[j];
	    a[j]=temp;
	    return new String(a);
     }
  static void permutation(String s,int str,int end) {
	  if(str>=end) {
		  System.out.println(s);
		  return;
	  }
    for(int i=str;i<=end;i++) {
    	String s1=Swap(s,str,i);
    	permutation(s1,str+1,end);
    }
  }
  public static void main(String[] args) {
	permutation("abc",0,2);
}
}
