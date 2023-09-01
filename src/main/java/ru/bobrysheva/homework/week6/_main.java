package ru.bobrysheva.homework.week6;

public class _main {
    public static void main(String[] args) {
        System.out.println("Введите температуру целым числом ");
        Scanner inputInt = new Scanner(System.in);
        int i = inputInt.nextInt();
        if (i<0) {
            System.out.println("Сейчас очень холодно");
        }
        else if (i>0 && i<=16) {
            System.out.println("Сейчас прохладно ");
        }
        else {
            System.out.println("Отличный летний денек!");
        }
    }

}
