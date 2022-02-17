package com.company;

public class Rabbit extends Animal implements Runable{
    @Override
    public void eat() {
        System.out.println("Rabbit eating carrot.");
    }

    @Override
    public void voice() {
       // super.voice();
        System.out.println("Rabbit voicing.");
    }

    @Override
    public void sleep() {
        //super.sleep();
        System.out.println("Rabbit sleeping. ");
    }

    @Override
    public void run() {
        System.out.println("Rabbit running.");
    }

    @Override
    public void walk() {
        System.out.println("Rabbit walking.");
    }

    public void cough(){
        System.out.println("Rabbit coughing");
    }
}
