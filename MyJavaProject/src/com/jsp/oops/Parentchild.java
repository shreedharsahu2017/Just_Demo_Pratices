package com.jsp.oops;

public class Parentchild {
	
			
		  public void show() {
			  System.out.println("show");
		  }
		}
		 class child extends Parentchild{
			 public void display() {
				 System.out.println("display");
			 }
		 }
		 class DowncastigExample{
			 public static void main(String[] args) {
				Parentchild p=new child();//upcasting
				p.show();//show
				child c=(child)p;//downcasting
				c.display();//display
				c.show();//show
			}
		 }



