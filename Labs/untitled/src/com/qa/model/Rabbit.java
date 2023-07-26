package com.qa.model;


public class Rabbit extends Animal{
    public Rabbit(String name, int age){
        super(name, age);
    }

    @Override
    public String SayHello(){
        return "Hey " + getName();
    }

    @Override
    public String Move(){
        return "Rapidly";
    }

    @Override
    public String toString(){
        return "Rabbit: " + super.toString();
    }
}
