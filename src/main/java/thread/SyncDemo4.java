package thread;

public class SyncDemo4 {
    public static void main(String[] args) {
        Boo boo = new Boo();
        Thread t1 = new Thread(){
            @Override
            public void run() {
                boo.methodA();
            }
        };

        Thread t2 = new Thread(){
            @Override
            public void run() {
                boo.methodB();
            }
        };

        t1.start();
        t2.start();

    }
}

class Boo{
    public synchronized void methodA(){
        Thread t = Thread.currentThread();
        System.out.println(t.getName()+":正在执行A方法...");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(t.getName()+":执行A方法完毕！");
    }

    public synchronized void methodB(){
        Thread t = Thread.currentThread();
        System.out.println(t.getName()+":正在执行B方法...");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(t.getName()+":执行B方法完毕！");
    }

}