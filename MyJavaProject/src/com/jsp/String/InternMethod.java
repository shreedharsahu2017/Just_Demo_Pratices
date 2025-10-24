package com.jsp.String;

public class InternMethod {
    public static void main(String[] args) {
		String s=new String("shreedharsahu");
		String s2=s.intern();
		System.out.println(s==s2);
		System.out.println(s);
		String s3="shreedharsahu";
		System.out.println(s2==s3);  //by using object referance in heap then to get corresponding scp object
		//we should go for intern()
	}
}
