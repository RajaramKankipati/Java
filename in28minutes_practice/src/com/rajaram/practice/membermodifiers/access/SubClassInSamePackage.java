package com.rajaram.practice.membermodifiers.access;

public class SubClassInSamePackage extends ExampleClass {

     void subClassMethod(){
         publicVariable = 5;
         publicMethod();
         protectedVariable = 5;
         protectedMethod();
         defaultVariable = 5;
         defaultMethod();
    }


}
