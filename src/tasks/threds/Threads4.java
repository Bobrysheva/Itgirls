package threds;
import java.util.Scanner;

public class Threads4 {
    public static void main(String[] args) {
        int speed1 = (int) (Math.random() * 5 + 1);
        int speed2 = (int) (Math.random() * 5 + 1);
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите расстояние в метрах");
        int distance = sc.nextInt();

        System.out.println("Гонка началась!  \nСкорость первого гонщика составляет: " + speed1 +
                "\nСкорость второго гонщика составляет: " + speed2 + "\nДлина трассы составляет: " + distance + " метров");
        Threads4 threads4 = new Threads4();
        threads4.race(speed1, speed2, distance);
    }

    public static void race(int speed1, int speed2, int distance) {

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                int currentTime1 = 0;
                boolean goOn = true;
                while (goOn) {
                    int currentDistance = currentTime1++ / speed1;
                    System.out.println("За" + currentTime1 + " cекунд 1 гонщик проехал " + currentDistance);
                    if (currentDistance >= distance) {
                        System.out.println("1 гонщик добрался до финиша за " + currentTime1 + " секунд.");
                        goOn = false;
                    }
                    currentTime1++;
                }
            }

        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                int currentTime2 = 0;
                boolean goOn = true;
                while (goOn) {
                    int currentDistance = currentTime2++ / speed2;
                    System.out.println("За" + currentTime2 + " cекунд 2 гонщик проехал " + currentDistance);

                    if (currentDistance >= distance) {
                        System.out.println("2 гонщик добрался до финиша за " + currentTime2 + " секунд.");
                        goOn = false;
                    }
                    currentTime2++;

                }
            }
        });
        thread1.start();
        thread2.start();

    }
}

