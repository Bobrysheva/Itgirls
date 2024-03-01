package ru.bobrysheva.homework.week5.forest;

public class Forester {
    void makeFeed(AbstractAnimal abstractAnimal) {
        System.out.println("Working as a forester, I feed forest inhabitants");
        abstractAnimal.eat();
    }

    void makeSkinCare(AbstractAnimal abstractAnimal) {
        System.out.println("I work as a forester, I help animals take care of their skins");
        abstractAnimal.skin();
    }

    void deliverAnimals(AbstractAnimal abstractAnimal) {
        System.out.println("I work as a forester, I sometimes deliver animals");
        abstractAnimal.born();
    }
}
