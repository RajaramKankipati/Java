package com.rajaram.practice.oops.inheritence.overloading;

public class OverloadingRules {
}

class Foo {
	public void doIt(int number) {
		System.out.println("test");
	}
}

class Boo extends Foo{
	public void doIt(String str) {
		System.out.println("test boo");
	}
}
