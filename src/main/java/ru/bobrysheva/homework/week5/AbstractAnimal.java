package ru.bobrysheva.homework.week5;

public abstract class AbstractAnimal {
    abstract void voice();

    void walk() {
        System.out.println("Я животное и я могу гулять");
    }

    abstract void eat();
}
