package com.jsp.oops;

public class person {
    static person p=new person();
    private person() {
    	System.out.println("constructor invoked by only one object");
    }
    
    static person getInstance() {
    	return p;
    }
}


class singletonclass{
	public static void main(String[] args) {
		person p1=new person.getInstance();
		person p2=new person.getInstance();
		
	}
}
