package ru.bobrysheva.homework.week5.forest;

public class Beaver extends AbstractAnimal{
    @Override
    void eat() {
        System.out.println("I'm a beaver. I am eating wood");}

    @Override
    void skin() {
        System.out.println("I'm a beaver. My skin consists of coarse, " +
                "long, glossy guard hairs");}
}
