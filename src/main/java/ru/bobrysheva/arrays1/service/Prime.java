package ru.bobrysheva.arrays1.service;
public class Prime {
    public static int isPrime(int[] arr) {
        int isPrime1 = 0;
        int i, j, d = 0;
        for (i = 0; i < arr.length - 1; i++) {
            for (j = 2; arr[i] >= j; j++) {
                if (arr[i] > 1 && arr[i] % j != 0)  {
                    d++;
                }
                if (d == arr[i]-1) {
                    isPrime1++;
                }
            }
        }
        return isPrime1;
    }
}