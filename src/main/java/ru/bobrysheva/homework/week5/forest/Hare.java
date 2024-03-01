package ru.bobrysheva.homework.week5.forest;

public class Hare extends AbstractAnimal {
    @Override
    void eat() {
        System.out.println("I'm a hare. I eat plants, berries and mushrooms");
    }

    @Override
    void skin() {
        System.out.println("I'm a hare. My coat is shiny, silky, " +
                "noticeably crimped");
    }

}
