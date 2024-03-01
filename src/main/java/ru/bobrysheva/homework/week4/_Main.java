package ru.bobrysheva.homework.week4;

public class _Main {
    public static void main(String[] args) {
        Ship ship = new Ship();
        Fish fish = new Fish();
        SwimExecutor se = new SwimExecutor();
        se.makeSwim(ship);
        se.makeSwim(fish);
    }
}
