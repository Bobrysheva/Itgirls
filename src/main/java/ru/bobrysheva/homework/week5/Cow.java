package ru.bobrysheva.homework.week5;

public class Cow extends AbstractAnimal{
    @Override
    void voice(){
        System.out.println("Я корова и я мычууууу!");
    }

    @Override
    void eat(){
        System.out.println("Я коровка и обожаю кушать траву на лугу");
    }

}
