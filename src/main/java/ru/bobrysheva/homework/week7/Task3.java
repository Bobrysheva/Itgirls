package ru.bobrysheva.homework.week7;
import java.util.HashMap;

public class Task3 {
    public static void main(String[] args) {
        String text = "Hello world";
        String[] symbols = text.split("");
        HashMap<String, Integer> sym = new HashMap<>();
        for (String symbol : symbols) {
            if (sym.containsKey(symbol)) {
                for (HashMap.Entry<String, Integer> element : sym.entrySet()) {
                    element.setValue(element.getValue() + 1);
                    System.out.println(element.getKey() + " " + element.getValue());
                }
            } else
                sym.put(symbol, 1);
        }

        for (HashMap.Entry<String, Integer> element : sym.entrySet()) {
            System.out.println(element.getKey() + " " + element.getValue());
        }
    }
}

