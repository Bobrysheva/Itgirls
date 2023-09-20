package ru.bobrysheva.arrays1.service;

public class Findsum {
    public static int Sum(int[] arr) {
        int allSumm = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            allSumm += arr[i];
        }
        return allSumm;
    }
    public static int oddSum(int [] arr) {
        int oddSum = 0;
        for (int i= 0; i <arr.length - 1; i +=2 ) {
            oddSum += (arr [i]);
        }
        return oddSum;
    }
    public static int evenSum(int [] arr) {
        int evenSum = 0;
        for (int i= 1; i <arr.length - 1; i +=2 ) {
            evenSum += arr [i];
        }
        return evenSum;
    }
}
