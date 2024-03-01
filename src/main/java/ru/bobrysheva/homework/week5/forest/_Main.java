package ru.bobrysheva.homework.week5.forest;

public class _Main {
    public static void main(String[] args) {
        Beaver beaver = new Beaver();
        Fox fox = new Fox();
        Hare hare = new Hare();
        Forester forester = new Forester();

        forester.makeFeed(beaver);
        forester.makeSkinCare(fox);
        forester.deliverAnimals(hare);
    }
}
