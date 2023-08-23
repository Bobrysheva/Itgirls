package ru.bobrysheva.homework.week5.zoo;

public class Goat extends AbstractAnimal{
    @Override
    void eat(){
        super.eat();
        System.out.println("Я коза и я обожаю жевать траву в поле");
    }
    @Override
    void type(){
        System.out.println("Я коза и я домашнее животное");
    }
    @Override
    void character(){
        System.out.println("Я коза-дереза и могу бодаться");
    }
    @Override
    void skin(){
        super.skin();
    }
}
