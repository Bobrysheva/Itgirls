package ru.bobrysheva.calcapp.service;

public class ResultWriterService {

        public static void printResult(int a, int b, int result, String operationName, String operationSign) {
            System.out.println(operationName + ":" + a + operationSign + b + " =" + result);
        }


    }
