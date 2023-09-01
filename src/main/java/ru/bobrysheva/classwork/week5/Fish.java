package ru.bobrysheva.classwork.week5;

public class Fish extends AbstractAnimal {

    @Override
    void voice() {
        System.out.println("Я рыбка и я только молчу и пускаю пузыри");
    }

    @Override
    void walk() {
        System.out.println("Я рыбка и вместо того чтобы гулять я плаваю!");
    }

    @Override
    void eat() {
        System.out.println("Я рыбка, кушаю рачков и водоросли");
    }
}
