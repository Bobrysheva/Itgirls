package ru.bobrysheva.swim;

public class Boat implements Swimable {

    @Override
    public void swim(){
        thing();
        System.out.println("Я лодка и я плаваю");}

    private void thing() {
        System.out.println("Я лодка и я вещь");}
}

