package com.jsp.Constructor;

public class Student {
      int id;
      String name;
       int rollno;
       String email;

	public Student(int id,String name,int rollno,String email) {
		this.id=id;
		this.name=name;
		this.rollno=rollno;
		this.email=email;

	}
	public static void main(String[] args) {
		Student t1=new Student(10,"shree",101,"shree@gmail.com");
		Student t2=new Student(11,"rakesh",102,"rakesh@gmail.com");
		
	}

	}
