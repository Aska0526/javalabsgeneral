package com.qa.model;

public abstract class Animal implements Comparable<Animal>{
    private String name;
    private int age;

    //constructor
    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    //setters and getters
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    //abstract methods
    public abstract String SayHello();
    public abstract String Move();

    public String toString(){
        return "Name" + name + "Age" + age;
    }

    @Override
    public int compareTo(Animal o) {
        return age - o.getAge();
    }

}
