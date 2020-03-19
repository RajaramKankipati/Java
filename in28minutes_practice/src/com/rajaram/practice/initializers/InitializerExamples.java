package com.rajaram.practice.initializers;

public class InitializerExamples {
    static int count;
    int i;

    {
        System.out.println("Instance Initializer");
        i = 6;
        count = count + 1;
        System.out.println("Count when Instance Initializer is run is " + count);

    }

    //Static Initializer
    static
    {
        System.out.println("Static Initializer");
        System.out.println("Count when static initializer is run is "+ count);
    }

    public static void main(String[] args) {
        InitializerExamples example = new InitializerExamples();
        InitializerExamples example1 = new InitializerExamples();
        InitializerExamples example2 = new InitializerExamples();
    }



}
