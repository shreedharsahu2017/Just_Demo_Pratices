package com.jsp.String;

public class Myclss implements Cloneable {
     String name;
     int rollno;
     Myclss(String name,int rollno){
    	 this.name=name;
    	 this.rollno=rollno;
     }
     void display() {
    	System.out.println("name"+" "+name);
    	System.out.println("rollno"+" "+rollno);
     }
     public static void main(String[] args) throws CloneNotSupportedException {
		Myclss obj1=new Myclss("shree",101);
		obj1.display();
		Myclss obj2=(Myclss)obj1.clone();
		obj2.display();
	}
}
