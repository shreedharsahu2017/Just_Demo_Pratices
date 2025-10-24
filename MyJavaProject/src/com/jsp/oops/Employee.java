package com.jsp.oops;

public class Employee {
    float salary=40005;
}
  class programmer extends Employee{
	  int bonus=10000;
	  public static void main(String[] args) {
		programmer p=new programmer();
		//p.bonus;
		System.out.println("Emploeyee bonus is "+p.bonus);
		System.out.println("programmer salary is"+p.salary);
	}
  }
 
