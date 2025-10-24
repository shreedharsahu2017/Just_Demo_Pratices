package com.jsp.oopsBasicprogrms;

public class Animal {
  public void Animalsound() {
	  System.out.println("Animal makes sound");
  }
}
class Pig extends Animal{
	public void Animalsound() {
		System.out.println("pig says: bow bow");
	}
}
class Dog extends Animal{
	public void Animalsound() {
		System.out.println("dog says : bhow bhow");
	}
}
class AnimalInfo{
	public static void main(String[] args) {
		Animal l=new Pig();
		l.Animalsound();
		Animal l1=new Animal();
		l1.Animalsound();
		Animal l2=new Dog();
		l2.Animalsound();
		Pig l3=new Pig();
		l.Animalsound();
		
		
		
	}
}
