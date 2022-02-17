package com.company;

public class Main {

    public static void main(String[] args) {
        Animal turtle = new Turtle();
        turtle.voice();
        turtle.eat();
        turtle.sleep();
        Swimable turtle1 = new Turtle();
        turtle1.swim();
        turtle1.see();
        Turtle turtle2 = new Turtle();
        turtle2.crying();
        System.out.println("___________________");
        Animal rabbit = new Rabbit();
        rabbit.sleep();
        rabbit.eat();
        rabbit.voice();
        Runable rabbit1 = new Rabbit();
        rabbit1.run();
        rabbit1.walk();
        Rabbit rabbit2 = new Rabbit();
        rabbit2.cough();
        System.out.println("___________________");
        Animal rooster = new Rooster();
        rooster.voice();
        rooster.eat();
        rooster.sleep();
        Flyable rooster1 = new Rooster();
        rooster1.fly();
        rooster1.landing();
        Rooster rooster2 = new Rooster();
        rooster2.jump();
        System.out.println("___________________\nWe love animals.");

       ;



    }
}
