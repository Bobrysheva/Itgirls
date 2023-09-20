package ru.bobrysheva.arrays1.service;

public class FindNull {
    public static int Null (int [] arr) {
        int n = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] == 0)
                n++;
            }
        return n;
    }
}
