package com.myArgs.java_02;

public class AnimalOperator {

    public void useAnimal(Animal a) { //Animal a = new Cat();
        a.eat();
    }

    public Animal getAnimal() {
        Animal a = new Cat();
        return a;
    }

//    public Cat getAnimal() {
//        Cat a = new Cat();
//        return a;
//    }

}
