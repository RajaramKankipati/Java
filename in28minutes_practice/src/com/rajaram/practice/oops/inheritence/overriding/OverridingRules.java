package com.rajaram.practice.oops.inheritence.overriding;

public class OverridingRules {
public static void main(String args[]) {
		
		SuperClass obj = new SubClass();
		obj.publicMethod();
		obj.protectedMethod();
	} 
}

class SuperClass {
	public void publicMethod() {
		System.out.println("This is Superclass public method");
	}

	void protectedMethod() {
		System.out.println("This is Superclass public method");
	}
}

class SubClass extends SuperClass{
	
	public void publicMethod() {
		System.out.println("This is SubClass public method");
		
	}
	void protectedMethod() {
		System.out.println("This is SubClass protected method");
}}

