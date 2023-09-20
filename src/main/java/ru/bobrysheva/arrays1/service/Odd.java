package ru.bobrysheva.arrays1.service;

public class Odd {
    public static int Odd1(int[] arr) {
        int evenNumber = 0;
        int oddNumber = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            if ((arr[i] % 2) != 1)
                oddNumber++;
        }
        return oddNumber;
    }
}
