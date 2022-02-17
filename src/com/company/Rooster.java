package com.company;

public class Rooster extends Animal implements Flyable{
    @Override
    public void eat() {
        System.out.println("Rooster eating corn.");
    }

    @Override
    public void voice() {
       // super.voice();
        System.out.println("Rooster voicing(kukarakuk kuuk).");
    }

    @Override
    public void sleep() {
     //   super.sleep();
        System.out.println("Rooster sleeping.");
    }

    @Override
    public void fly() {
        System.out.println("Rooster flying.");
    }

    @Override
    public void landing() {
        System.out.println("Rooster landing.");

    }
    public void jump(){
        System.out.println("Rooster jumping");
    }
}
