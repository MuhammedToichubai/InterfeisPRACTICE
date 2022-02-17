package com.company;

public abstract class Animal {
    private String name;
    private byte age;
    private double weight;
    private String color;

    public abstract void eat();

    public void voice(){
        System.out.println("Voicing");
    }

    public void sleep(){
        System.out.println("Sleeping");
    }
}
