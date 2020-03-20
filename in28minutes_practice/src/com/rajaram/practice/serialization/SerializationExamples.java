package com.rajaram.practice.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import com.sun.corba.se.impl.orbutil.ObjectWriter;

class Rectangle implements Serializable{
	
	int length;
	int breadth; 
	int area;
	
	
	public Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
		area = length* breadth;
	}
	

}




public class SerializationExamples {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		
		FileOutputStream filewriter = new FileOutputStream("Rectangle.ser");
		ObjectOutputStream objectoutput = new ObjectOutputStream(filewriter); 
		
		FileInputStream filereader = new FileInputStream("Rectangle.ser");
		ObjectInputStream objectinput = new ObjectInputStream(filereader); 
		
		objectoutput.writeObject(new Rectangle(5, 6));
		Rectangle rectangle = (Rectangle) objectinput.readObject();
		
		System.out.println(rectangle.length);
		System.out.println(rectangle.breadth);
		System.out.println(rectangle.area);
		
		objectoutput.close();
		objectinput.close();

	}

}
