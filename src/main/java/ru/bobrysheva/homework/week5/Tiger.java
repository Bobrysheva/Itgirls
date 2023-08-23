package ru.bobrysheva.homework.week5;

public class Tiger extends AbstractAnimal{
    @Override
    void voice(){
        System.out.println("Я тигр и я громко рычуууу: РРРРРРРР!");
    }
    @Override
    void walk (){
        super.walk();
        System.out.println("Я тигр и обожаю бегать, прыгать и играть!!!");
    }
    @Override
    void eat() {
        System.out.println("Я тигр и я хищник... разорву на мясо!");
    }
}
