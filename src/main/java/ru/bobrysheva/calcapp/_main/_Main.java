package ru.bobrysheva.calcapp._main;

import ru.bobrysheva.calcapp.service.ResultWriterService;
import ru.bobrysheva.calcapp.util.Calculator;

import java.util.Scanner;

public class _Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = Calculator.sum(a, b);
        ResultWriterService.printResult(a, b, result, "сложение", "+");
        int result2 = Calculator.div(a, b);
        ResultWriterService.printResult(a, b, result2, "деление", "/");
        int result3 = Calculator.sub(a, b);
        ResultWriterService.printResult(a, b, result3, "вычитание", "-");
    }
}
