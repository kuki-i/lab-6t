package org.example;
//тут не працює, див. мейн1
public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog("Jerry");
        System.out.println(myDog.makeSound());

        Cat myCat = new Cat("Tom");
        System.out.println(myCat.makeSound());
    }
}

abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract String makeSound();
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
    public String makeSound(){
        return("The dog says: bark bark");
    }
}


class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }
    public String makeSound(){
        return("The cat says: meow");
    }
}
