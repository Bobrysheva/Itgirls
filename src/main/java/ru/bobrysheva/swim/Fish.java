package ru.bobrysheva.swim;

public class Fish implements Swimable {

    @Override
    public void swim(){
        alive();
        System.out.println("Я рыба и я плаваю в пруду");}

    private void alive() {
        System.out.println("Я рыба и я живая");}
    }


