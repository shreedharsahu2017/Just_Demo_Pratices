package com.jsp.upDowncasting;

public class Animal {
	public void sound() {
	System.out.println("animal makes sound");
}
public void drink() {
	System.out.println("Animak needs to water");
}
}
class Dog extends Animal{
	public void sound() {
		System.out.println("bow bow");
	}
	public void family() {
		System.out.println("dddddddddd");
	}
}
class cat extends Animal{
	public void sound() {
		System.out.println("meow meow");
	}
public void family() {
	System.out.println("cccccccccc");
}
}
class AnimalDetails{
	public static void main(String[] args) {
		Animal a=new Animal();
		a.drink();
		a.sound();
		System.out.println("--------------");
		Animal a1=new Dog();
		a1.sound();
		System.out.println("--------------");
		Dog d=new Dog();
		d.family();
		d.sound();
		System.out.println("-----------------");
		cat t =new cat();
		t.sound();
		t.family();
		System.out.println("~~~~~~~~~~~~~~~~~");
		
		
	}
	
}

