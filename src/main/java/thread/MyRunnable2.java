package thread;

public class MyRunnable2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("查水表！");
        }
    }
}
