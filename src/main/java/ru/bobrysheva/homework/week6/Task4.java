package ru.bobrysheva.homework.week6;

public class Task4 {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 512) {
            System.out.println(i);
            i *= 2;
        }
        int j = 1;
        do {
            System.out.println(j);
            j *= 2;
        }
        while (j <= 512);
    }
}
