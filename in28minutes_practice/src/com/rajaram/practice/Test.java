package com.rajaram.practice;

import com.rajaram.practice.classes.CricketScorer;

public class Test {

    public static void main(String args[]){
        CricketScorer obj = new CricketScorer();
        // Initial score
        System.out.println(obj.getScore());
        //Four
        obj.four();
        obj.six();
        //After a four and a six
        System.out.println(obj.getScore());
        CricketScorer obj1 = new CricketScorer();
        // Initial score
        System.out.println(obj1.getScore());
        //Four
        obj1.four();
        obj1.four();
        //After a four and a six
        System.out.println(obj1.getScore());
        System.out.println(obj instanceof Object);

    }


}
