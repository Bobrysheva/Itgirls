package ru.bobrysheva.homework.week5.zoo;

public class _Main {
    public static void main(String[] args) {
        Goat goat = new Goat();
        Rabbit rabbit = new Rabbit();
        Wolf wolf = new Wolf();
        ZooRun zooRun = new ZooRun();

        zooRun.runType(goat);
        zooRun.runEat(goat);
        zooRun.runCharacter(goat);
        zooRun.runSkin(goat);

        zooRun.runType(rabbit);
        zooRun.runEat(rabbit);
        zooRun.runCharacter(rabbit);
        zooRun.runSkin(rabbit);

        zooRun.runType(wolf);
        zooRun.runEat(wolf);
        zooRun.runCharacter(wolf);
        zooRun.runSkin(wolf);
    }
}
