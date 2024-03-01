package ru.bobrysheva.homework.week5.forest;

public class Fox extends AbstractAnimal {
    @Override
    void eat() {
        System.out.println("I'm a fox. I eat birds, fish, carrion, insects and berries");
    }

    @Override
    void skin() {
        System.out.println("I'm a fox. My coat is thick but short, usually light gray in color with red markings on the sides and paws, a white belly and throat");
    }
}
