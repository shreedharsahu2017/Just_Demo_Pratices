package com.jsp.oops;

public class Emp { 
 int id;
 String name;
 Address address;
 public Emp(int id ,String name,Address address) {
	 this.id=id;
	 this.name=name;
	 this.address=address;
 }
	 void display() {

		 System.out.println(id+" "+name);
 System.out.println(address.state+" "+address.city+" "+address.country);
 }
	 public static void main(String[] args) {
		Address a1=new Address("odisha", "khallikote", "India");
		Address a2=new Address("Odisha","Berhampur","India");
		 Emp e1=new Emp(101,"shree",a1);
		 Emp e2=new Emp(102,"arun",a2);
		 e1.display();
		 e2.display();
		 
	}
}