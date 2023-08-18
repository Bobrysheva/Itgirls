package ru.bobrysheva.swim;

public class _Main {
    public static void main(String[] args) {
        Boat boat = new Boat();
        Fish fish = new Fish();
        SwimExecutor swimExecutor = new SwimExecutor();

    swimExecutor.makeSwim(fish);
    swimExecutor.makeSwim(boat);



    }
}
