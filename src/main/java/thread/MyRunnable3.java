package thread;

public class MyRunnable3 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("hello!");
        }
    }
}
