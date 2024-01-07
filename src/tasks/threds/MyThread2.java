package threds;

import java.util.concurrent.Semaphore;

public class MyThread2 {
    public static void main(String[] args) throws InterruptedException {

        MyThread2 myThread2 = new MyThread2();
        myThread2.writeResult();
    }

    public void writeResult() throws InterruptedException {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 10; i++) {
                    System.out.println("Поток 1" + ": число " + i);
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int j = 1; j <= 10; j++) {
                    System.out.println("Поток 2" + ": число " + j);
                }
            }
        });

        thread1.start();
        thread1.join();
        thread2.start();

    }
}



