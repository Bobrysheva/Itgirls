package ru.bobrysheva.homework.week7;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Task2 {

    public static void main(String[] args) {
        String a = "()[]{(}";
        String[] symbols = a.split("");

        Stack<String> b = new Stack<>();
        for (String symb : symbols) {
            if ("(".equals(symb)) {
                b.push(symb);
            } else if ("[".equals(symb)) {
                b.push(symb);
            } else if ("{".equals(symb)) {
                b.push(symb);
            } else if (")".equals(symb) && "(".equals(b.peek())) {
                b.pop();
            } else if ("]".equals(symb) && "[".equals(b.peek())) {
                b.pop();
            } else if ("}".equals(symb) && "{".equals(b.peek())) {
                b.pop();
            }
        }
        System.out.println(b);
        if (b.empty() == true)
            System.out.println("Cкобочная последовательность верна");

        else System.out.println("Скобочная последовательность не верна");

    }

}
