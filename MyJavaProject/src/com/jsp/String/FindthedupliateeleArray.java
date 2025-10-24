package com.jsp.String;
//
public class FindthedupliateeleArray {
  public static void main(String[] args) {
	//String arr[]= {"java","python","sql","java","odia"};
	  String arr[]= {"java","python","sql"};
	  
	 //appoarch
	boolean flag=false;
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]==arr[j]) {
				System.out.println("dupliate element given in:"+arr[i]);
				flag=true;
			}
		}
	}
	if(flag==false) {
		System.out.println("duplicate element not found:");
	}
}
}
