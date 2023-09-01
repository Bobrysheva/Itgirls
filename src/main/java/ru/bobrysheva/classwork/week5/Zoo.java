package ru.bobrysheva.classwork.week5;

public class Zoo {
    public static void main(String[] args) {

        Cow cow = new Cow();
        Tiger tiger = new Tiger();
        Fish fish = new Fish();
        Zookeeper zookeeper = new Zookeeper();

        zookeeper.makeVoice(cow);
        zookeeper.makeWalk(cow);
        zookeeper.makeEat(cow);

        zookeeper.makeVoice(tiger);
        zookeeper.makeWalk(tiger);
        zookeeper.makeEat(tiger);

        zookeeper.makeVoice(fish);
        zookeeper.makeWalk(fish);
        zookeeper.makeEat(fish);
    }
}
