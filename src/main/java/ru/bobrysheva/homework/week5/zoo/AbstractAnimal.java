package ru.bobrysheva.homework.week5.zoo;

public abstract class AbstractAnimal {
    void eat() {
        System.out.println("я животное и я нуждаюсь в кормлении");
    }

    abstract void type();

    abstract void character();

    void skin() {
        System.out.println("я животное и у меня мягкая шерстка");
    }
}
