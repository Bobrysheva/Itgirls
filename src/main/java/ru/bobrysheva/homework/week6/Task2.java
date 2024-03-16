package ru.bobrysheva.homework.week6;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое число");
        int n = sc.nextInt();
        String result = n % 2 == 0 ? "Вы ввели четное число" : "Вы ввели нечетное число";
        System.out.println(result);
    }
}
