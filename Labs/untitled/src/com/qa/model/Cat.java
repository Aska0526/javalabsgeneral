package com.qa.model;

public class Cat extends Animal{
    public Cat(String name, int age){
        super(name, age);
    }

    @Override
    public String SayHello(){
        return "Hello " + getName();
    }

    @Override
    public String Move(){
        return "Slowly";
    }

    @Override
    public String toString(){
        return "Cat: " + super.toString();
    }
}
