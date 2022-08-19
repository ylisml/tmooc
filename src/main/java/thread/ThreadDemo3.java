package thread;

public class ThreadDemo3 {
    public static void main(String[] args) {
        Thread t1 = new MyThread3();
        t1.start();


        MyRunnable3 r3 = new MyRunnable3();
        Thread t2 = new Thread(r3);
        t2.start();


        Runnable r2 = () -> {
            for (int i = 0; i < 1000; i++) {
                System.out.println("查水表");
            }
        };


        Thread t3 = new Thread(r2);
        t3.start();
    }

}
