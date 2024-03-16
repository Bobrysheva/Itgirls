package ru.bobrysheva.homework.week6;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое число");
        int number = sc.nextInt();
        int fuctorialNumber = 1;
        for (; number > 1; number--) {
            fuctorialNumber *= number;
        }
        System.out.println(fuctorialNumber);
    }
}
