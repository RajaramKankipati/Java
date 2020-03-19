package com.rajaram.practice.oops.polymorphism;


public class PolymorphismExample {

	public static void main(String[] args) {
			Dog puppy = new Dog();
			puppy.shout();
			Animal lion = new Animal();
			lion.shout();
			System.out.println(lion instanceof Dog);

	}
}