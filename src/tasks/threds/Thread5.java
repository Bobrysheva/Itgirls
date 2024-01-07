package threds;

public class Thread5 {
    public static void main(String[] args) throws InterruptedException {
        Thread5 thread5 = new Thread5();
        thread5.makeResult();

    }

    public void makeResult() throws InterruptedException {
        Object lock = new Object();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {

                for (int i = 0; i < 10; i++)
                    System.out.println("Мое имя Поток 1, я называю свое имя " + (i + 1) + " раз");

            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int j = 0; j < 10; j++)
                    System.out.println("Мое имя Поток 2, я называю свое имя " + (j + 1) + " раз");
            }
        });
        thread1.start();
        thread1.join(0, 1);
        thread2.start();

    }


}

