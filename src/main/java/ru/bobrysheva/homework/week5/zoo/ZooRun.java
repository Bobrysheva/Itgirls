package ru.bobrysheva.homework.week5.zoo;

public class ZooRun {
    void runEat (AbstractAnimal abstractAnimal){
        abstractAnimal.eat();
    }
    void runType (AbstractAnimal abstractAnimal){
        abstractAnimal.type();
    }
    void runCharacter (AbstractAnimal abstractAnimal){
        abstractAnimal.character();
    }
    void runSkin (AbstractAnimal abstractAnimal) {
        abstractAnimal.skin();
    }
}
