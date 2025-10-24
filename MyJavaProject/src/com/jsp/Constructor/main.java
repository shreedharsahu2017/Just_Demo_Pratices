package com.jsp.Constructor;

public class main {
			main(double d){
			 System.out.println("double-argument constructor");
			 
			}
			main(int i) {
				
			this(10.5);
			
			System.out.println("int-argument constructor");
			
			}
			main() {
				
			this(10);
			
			 System.out.println("no-argument constructor");
			 
			}
			public static void main(String[] args) {
				
			main t1=new main(); //no-argument constructor/int-argument
			 //constructor/double-argument constructor
			
			main t2=new main(10);
			 //int-argument constructor/double-argument constructor
			
			main t3=new main(10.5);//double-argument constructor
			
			
			 }
			

}
	


