package com.company;

public class Turtle extends Animal implements Swimable{
    @Override
    public void eat() {
        System.out.println("Turtle eating.");
    }

    @Override
    public void voice() {
        //super.voice();
        System.out.println("Turtle voicing.");
    }

    @Override
    public void sleep() {
       // super.sleep();
        System.out.println("Turtle sleeping.");
    }

    @Override
    public void swim() {
        System.out.println("Turtle swimming.");
    }

    @Override
    public void see() {
        System.out.println("Turtle seeing.");

    }
    public void crying(){
        System.out.println("Turtle crying");

    }
}
