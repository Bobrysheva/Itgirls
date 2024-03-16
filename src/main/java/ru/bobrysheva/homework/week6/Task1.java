package ru.bobrysheva.homework.week6;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите текущую температуру воздуха целым числом");
        int currentTemperature = sc.nextInt();
        if (currentTemperature < 0) {
            System.out.println("Сейчас очень холодно.");
        } else if (currentTemperature > 16) {
            System.out.println("Отличный летний денек!");
        } else System.out.println("Сейчас прохладно.");

    }
}
