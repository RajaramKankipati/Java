package com.rajaram.practice.classes;

public class CricketScorer {

    private int score;

    public void four(){
        this.score = this.score + 4;
    }

    public void six(){
        this.score = this.score + 6;
    }

    public int getScore(){
        return this.score;
    }

    @Override
    public String toString(){
        return "This is a CricketScorer Object";
    }

    public boolean equals(CricketScorer object){

        return this.getScore() == object.getScore();

    }

    public static void main(String args[]){
        CricketScorer obj = new CricketScorer();
        CricketScorer obj1 = new CricketScorer();
        System.out.println(obj.equals(obj1));
    }

}



