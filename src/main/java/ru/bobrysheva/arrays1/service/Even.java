package ru.bobrysheva.arrays1.service;

public class  Even {
    public static int Even1(int[] arr) {
        int evenNumber = 0;
        int oddNumber = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            if ((arr[i] % 2) == 1)
                evenNumber++;
        }
        return evenNumber;
    }
}