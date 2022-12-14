package thread;

/**
 * 多线程并发安全问题
 * 当多个线程并发操作同一临界资源，由于线程却换不确定，导致操作临界资源的完整过程出现混乱，导致的不良后果
 */
public class SyncDemo {
    public static void main(String[] args) {
        Table table = new Table();
        Thread t1 = new Thread(){
            @Override
            public void run() {
                while (true){
                    int bean = table.getBeans();
                    Thread.yield();
                    System.out.println(getName()+":"+bean);
                }
            }
        };

        Thread t2 = new Thread(){
            @Override
            public void run() {
                while (true){
                    int bean = table.getBeans();
                    Thread.yield();
                    System.out.println(getName()+":"+bean);
                }
            }
        };

        t1.start();
        t2.start();
    }
}


class Table{
    private int beans = 20;

    public synchronized int getBeans() {
        if(beans == 0){
            throw new RuntimeException("没有豆子了");
        }
        Thread.yield();
        return beans--;
    }
}