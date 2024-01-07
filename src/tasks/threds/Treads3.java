package threds;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Treads3 {
    public static void main(String[] args) {
        Scanner findN = new Scanner(System.in);
        System.out.println("Введите натуральное число для расчета");
        int n = findN.nextInt();
        Treads3 treads3 = new Treads3();
        treads3.counter(n);
    }

    public void counter(int n) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i < n + 1; i++) {
            numbers.add(i - 1, i);
        }
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                int result = 0;
                for (Integer number : numbers) {
                    result += (int) Math.pow(number, 2);
                }
                System.out.println(result);
            }
        });
        thread.start();
    }
}
