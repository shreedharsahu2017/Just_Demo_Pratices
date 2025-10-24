package com.jsp.oops;

public class A {
	
		public void m1(double d) {
			System.out.println("double types");
}
		public void m2(int i) {
			System.out.println("int types");
			}
		public void m13(double d) {
			System.out.println("double args");
		}
		public static void main(String ar[]) {
		 A t=new A();
		 t.m1(10.5);
		 t.m1(10);
		 t.m13(10.5);
   }
}
