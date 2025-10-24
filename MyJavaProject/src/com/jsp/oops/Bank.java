package com.jsp.oops;

public class Bank {
 public int getRateofInterest() {
 return 8;
  }
}
 
 //creating child class
class Sbi extends Bank{
	public int getRateOfInterest() {
		return 10;
	}
}
class Icici extends Bank{
	public int getRateOfInterest() {
		return 8;
	}
}
class Axis extends Bank{
	int getRateOfInterest() {
		return 5;
	}
}
  class DemoTest{
	public static void main(String[] args) {
		Sbi s=new Sbi();
		Icici i=new Icici();
		Axis a=new Axis();
		System.out.println("Sbi rate of interest"+s.getRateOfInterest());
		System.out.println("Icici rate of interest"+s.getRateOfInterest());
		System.out.println("axix rate of interest"+s.getRateOfInterest());
	}
}