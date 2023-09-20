package ru.bobrysheva.arrays1._main;
import ru.bobrysheva.arrays1.service.*;

public class _Main {

        public static void main(String[] args) {
            int[] arr = new int[]{0, 3, -2, 3, 7, 6, 2, 0, 6, 11, 64, 22, 75, 0, 15};

            int odd = Odd.Odd1(arr);
            System.out.println("В массиве содержится "+ odd + " нечетных чисел");
            int even = Even.Even1(arr);
            System.out.println("В массиве содержится "+ even + " четных чисел");
            int prime = Prime.isPrime (arr);
            System.out.println("В массиве содержится "+ prime + " простых чисел");
            int sum = Findsum.Sum(arr);
            System.out.println("Сумма всех чисел в массиве "+ sum);
            int oddSum = Findsum.oddSum(arr);
            int evenSum = Findsum.evenSum(arr);
            int oddeven = oddSum - evenSum;
            System.out.println("Разность между суммой чисел имеющих четный индекс и суммой чисел имеющих нечетный индекс в массиве " +  oddeven);
            int findNull = FindNull.Null(arr);
            System.out.println("Количество нулей в массиве составляет "+ findNull);
        }
}
