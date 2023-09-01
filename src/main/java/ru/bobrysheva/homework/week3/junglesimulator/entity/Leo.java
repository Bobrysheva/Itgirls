package ru.bobrysheva.homework.week3.junglesimulator.entity;

public class Leo {
    private int health = 100;
    private int energy = 100;
    private double fangs = 5.0;


    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return this.health;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public int getEnergy() {
        return this.energy;
    }

    public double getFangs() {
        return this.fangs;
    }
}
