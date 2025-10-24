package com.jsp.oops;

public class Student {
 private String name;
  private int rollno;
    int age;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getRollno() {
	return rollno;
}
public void setRollno(int rollno) {
	this.rollno = rollno;
}
public int getAge() {
	return age;
}
public void setAge(int age) {  
	
}

	public static void main(String[] args) {
		Student s=new Student();
		s.setRollno(101);
		s.setName("shree");
		s.age=25; 
		System.out.println(s.getRollno());
		System.out.println(s.getName());
		System.out.println(s.getAge());
		System.out.println(s.age);
		
		
		
	}
}