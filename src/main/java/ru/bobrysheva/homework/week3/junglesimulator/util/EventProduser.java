package ru.bobrysheva.homework.week3.junglesimulator.util;

import com.sun.source.util.SourcePositions;
import ru.bobrysheva.homework.week3.junglesimulator.entity.Leo;

public class EventProduser {
    public void activateEvent(){

    }
    private void sleepEvent(Leo leo) {
        int energy = leo.getEnergy();
        energy = energy + 20;
        if (energy > 100) {
            energy = 100;
        }
        leo.setEnergy(energy);
        System.out.println("Лев поспал! + 20 энергии. Текущая энергия: " + leo.getEnergy());
    }
    private void move(Leo leo) {
        int energy = leo.getEnergy();
        energy = energy - 5;
        if (energy < 0) {
            energy = 0;
        }
        leo.setEnergy(energy);
        System.out.println("Лев побегал без результата :( - 5 энергии. Текущая энергия: " + leo.getEnergy());
    }

    private void leoEat(Leo leo){





    }
}
