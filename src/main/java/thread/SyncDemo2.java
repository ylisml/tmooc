package thread;

import com.sun.source.tree.SynchronizedTree;

public class SyncDemo2 {
    public static void main(String[] args) {
        Shoop shoop = new Shoop();
        Thread t1 = new Thread("范传奇") {
            @Override
            public void run() {
                shoop.buy();
            }
        };

        Thread t2 = new Thread("王克晶") {
            @Override
            public void run() {
                shoop.buy();
            }
        };

        t1.start();
        t2.start();
    }
}


class Shoop {
    public void buy() {
        try {
            Thread t = Thread.currentThread();
            System.out.println(t.getName() + "正在挑选衣服....");
            Thread.sleep(5000);
            synchronized (this) {
                System.out.println(t.getName() + "正在试衣服....");
                Thread.sleep(5000);
            }


            System.out.println(t.getName() + "结账离开");
        } catch (InterruptedException e) {

        }
    }
}