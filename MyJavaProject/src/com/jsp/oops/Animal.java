package com.jsp.oops;
 class Animal1 {
       public void eat() {
    	   System.out.println("Animal Eating");
	}  
}
class Dog extends Animal1{
	public void bark(){
		System.out.println("barking...");
		} 
}
public class Animal{
	public static void main(String[] args) {
		Dog a=new Dog();
		a.bark();
		a.eat();
		/*Dog d=new Dog();
		d.eat();
		*/
	}
}
