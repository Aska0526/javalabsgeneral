package com.qa.model;


public class Dog extends Animal{
    public Dog(String name, int age){
        super(name, age);
    }

    @Override
    public String SayHello(){
        return "Puff Puff " + getName();
    }

    @Override
    public String Move(){
        return "Quickly";
    }

    @Override
    public String toString(){
        return "Dog: " + super.toString();
    }
}
