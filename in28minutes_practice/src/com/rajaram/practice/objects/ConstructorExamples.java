package com.rajaram.practice.objects;

class Animal{
    String name;
    //parametric constructor
    public Animal(String name){
        this.name = name;
        System.out.println("Animal constructor with name " + name);
    }
    //default constructor
    public Animal(){}
}

class Dog extends Animal{

    public Dog(String name){
        super(name);
    }

    public Dog(){
        System.out.println("Dog constructor without name");
    }

}



public class ConstructorExamples {

    public static void main(String args[]){
            Dog puppy = new Dog("puppy");
    }



}
