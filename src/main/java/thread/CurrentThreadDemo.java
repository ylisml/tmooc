package thread;

public class CurrentThreadDemo {


    public static void main(String[] args) {
        //Thread t = Thread.currentThread();
        //System.out.println("主线程：" + t);
        dosome();
    }

    public static void dosome(){
        Thread t = Thread.currentThread();
        System.out.println("运行dosome的线程是：" + t);
    }
}
