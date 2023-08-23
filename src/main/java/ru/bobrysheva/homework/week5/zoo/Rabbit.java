package ru.bobrysheva.homework.week5.zoo;

public class Rabbit extends AbstractAnimal {

    @Override
    void eat() {
        super.eat();
    }

    @Override
    void type() {
        System.out.println("Я кролик, домашнее животное");
    }

    @Override
    void character() {
        System.out.println("Я кролик добрый и ручной, погладь и покорми меня");
    }

    @Override
    void skin() {
        super.skin();
    }
}