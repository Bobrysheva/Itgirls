package ru.bobrysheva.homework.week4;

public class Ship implements Swimable {

    @Override
    public void swim() {
        fuel();
        pickPass();
        System.out.println("Право руля!");
    }

    void fuel() {
        System.out.println("Заправимся топливом для дальнего плаванья!");
    }

    void pickPass() {
        System.out.println("Необходимо закончить посадку пассажиров");
    }
}
