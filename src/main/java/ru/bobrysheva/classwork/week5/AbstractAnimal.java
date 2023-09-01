package ru.bobrysheva.classwork.week5;

public abstract class AbstractAnimal {
    abstract void voice();

    void walk() {
        System.out.println("Я животное и я могу гулять");
    }

    abstract void eat();
}
