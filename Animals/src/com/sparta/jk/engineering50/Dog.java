package com.sparta.jk.engineering50;

public class Dog extends Animal {
    private int loyalty;

    public Dog(String name, String breed, int age, int loyalty) {
        super(name, breed, age);
        this.loyalty = loyalty;
    }

    public void print(){
        super.print();
        System.out.println("I have a loyalty of " + this.loyalty);
    }
}
