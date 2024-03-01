package ru.bobrysheva.homework.week4;

public class Fish implements Swimable {

    @Override
    public void swim() {
        eat();
        System.out.println("Плыву за дальний риф!");
    }

    void eat() {
        System.out.println("Съем несколько рачков и поплыву за рифы!");
    }
}
