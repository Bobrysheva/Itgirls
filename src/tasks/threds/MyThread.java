package threds;

public class MyThread {
    private int number = 0;

    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();
        MyThread myThread = new MyThread();
        myThread.writeResult();
    }

    public void writeResult() {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 10; i++) {
                    if (i % 2 != 1)
                        System.out.println("Поток 1: " + i);
                }
            }
        });

        Thread thread2 = new java.lang.Thread(new Runnable() {
            @Override
            public void run() {
                for (int j = 1; j <= 10; j++) {
                    if (j % 2 != 0)
                        System.out.println("Поток 2: " + j);
                }
            }
        });
        thread1.start();
        thread2.start();
    }
}