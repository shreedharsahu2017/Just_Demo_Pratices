package com.jsp.oops;

    class EncapTest {
   public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIdNum() {
		return idNum;
	}
	public void setIdNum(String idNum) {
		this.idNum = idNum;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
		private String name;
		   private String idNum;
		   private int age;

public class RunEncap {
	/* File name : RunEncap.java */
	   public static void main(String args[]) {
	      EncapTest encap = new EncapTest();
	      encap.setName("James");
	      encap.setAge(20);
	      encap.setIdNum("12343ms");

	      System.out.print("Name : " + encap.getName() + " Age : " + encap.getAge());
	   }
	
    }
}

