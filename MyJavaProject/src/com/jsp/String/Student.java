package com.jsp.String;

public class Student {
    String name;
    int rollno;
    Student(String name,int rollno){
    	this.name=name;
    	this.rollno=rollno;
    	
    }
    public static void main(String[] args) {
		Student s=new Student("shree",102);
		Student s1=new Student("king",103);
		System.out.println(s==s1);
		System.out.println(s.equals(s1));
	}
}
