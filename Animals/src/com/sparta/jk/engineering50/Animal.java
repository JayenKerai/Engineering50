package com.sparta.jk.engineering50;

/*
- Animal is an abstract class so cannot itself, be created
- Its like a blueprint for other child classes of this the same type
 */
public abstract class Animal {
    private String name;
    private String breed;
    private int age;
    private double health; //health out of 10
    private double strength; //strength out of 10
    private int foodInBowl; //food available in bowl

    public Animal(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.health = 10;
        if (age < 5){
            this.strength = age;
        } else {
            this.strength = 4;
        }
    }

    public void workout(){
        this.strength++;
        System.out.println(this.name + " has lifted weights, and now has strength " + this.strength);
    }

    public static void fight(Animal animal1, Animal animal2){
        animal1.health = animal1.health - animal2.strength;
        animal2.health = animal2.health - animal1.strength;
        System.out.println(animal1.name + " has dealt " + animal1.strength + " damage, and " + animal2.name + " dealt " + animal2.strength);
        animal1.strength = animal1.strength + 0.5;
        animal2.strength = animal2.strength + 0.5;
        if (animal1.health <= 0){
            animal1.health = 0;
            System.out.println(animal1.name + " was brutally murdered by " + animal2.name);
        }
        if (animal2.health <= 0){
            animal2.health = 0;
            System.out.println(animal2.name + " was brutally murdered by " + animal1.name);
        }
        System.out.println(animal1.name + " has " + animal1.health + " left, and " + animal2.name + " has " + animal2.health + " health left");
    }

    public void eat(){
        if (foodInBowl > 0){
            foodInBowl--;
            health++;
            System.out.println(this.name + " has eaten and increased health to " + this.health);
        } else {
            System.out.println("No food in bowl");
        }
    }

    public void addFood(){
        if (foodInBowl <= 10){
            foodInBowl+=3;
        }
        if (foodInBowl > 10){
            foodInBowl = 10;
            System.out.println("Too much food in bowl. Now set to 10");
        }
    }

    public void printStatus(){
        System.out.println("The " + this.breed + ", " + this.name + " has " + this.health + " health left");
    }

    public void print(){
        System.out.println("Hello, my name is " + name + "\n"
                + "I am a " + breed + "\n"
                + "My age is " + age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
