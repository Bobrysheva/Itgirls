package ru.bobrysheva.homework.week5.zoo;

public class Wolf extends AbstractAnimal{
    @Override
    void eat(){
        super.eat();
        System.out.println("Я волк, хищник и обожаю мясо");
    }
    @Override
    void type(){
        System.out.println("Я волк и я дикое лесное животное");
    }
    @Override
    void character(){
        System.out.println("Я агрессивный, безопасен только когда в клетке");
    }
    @Override
    void skin(){
        System.out.println("Моя шерстка жесткая и немного колючая");
    }
}
