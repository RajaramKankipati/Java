package com.rajaram.practice.exceptionhandling;


class CheckedException extends Exception{

	public void display() throws Exception{
		throw new Exception("I am exception");

	}
	
}

public class ExceptionHandlingExample1 {

	public static void main(String[] args) {
		
		CheckedException example = new CheckedException();
		try {
		example.display();
		}
		catch(Exception e) {
			System.out.println("Exception raised");
		}
	}

}
