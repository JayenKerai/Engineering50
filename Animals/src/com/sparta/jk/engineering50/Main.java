package com.sparta.jk.engineering50;

public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat("Meowmere", "Tabby", 2);
        Dog dog = new Dog("Snooperdoop", "Cava-poo", 5, 8);

        // cat vs dog fight ---------------------------------------------------------------------------------------
        cat.printStatus();
        dog.printStatus();
        Animal.fight(cat, dog);
        cat.printStatus();
        dog.printStatus();
        dog.addFood();
        dog.eat();
        cat.printStatus();
        dog.printStatus();
        Animal.fight(cat, dog);
        Animal.fight(cat, dog);
        Animal.fight(cat, dog);
        dog.workout();
        dog.workout();
        Animal.fight(cat, dog);
        Animal.fight(cat, dog);
        Animal.fight(cat, dog);
        Animal.fight(cat, dog);
        Animal.fight(cat, dog);
        cat.printStatus();
        dog.printStatus();

        // end of fight ---------------------------------------------------------------------------------------
    }
}
