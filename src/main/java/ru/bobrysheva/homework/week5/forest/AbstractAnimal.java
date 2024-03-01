package ru.bobrysheva.homework.week5.forest;

import org.w3c.dom.ls.LSOutput;

public abstract class AbstractAnimal {
    abstract void eat();
    abstract void skin();
    void born() {
        System.out.println("Hello world! I was born!");
    }
}
