package thread;

/**
 * 守护线程
 * 守护线程是通过普通线程调用方法setDaemon(true)设置而转变来的
 * 守护线程与普通线程都区别是结束线程时的一个区别：
 * 当Java进程中所有普通线程都结束时，进程就回结束，此时会强制杀死所有还在运行当守护线程
 */
public class DaemonThreadDemo {
    public static void main(String[] args) {
        Thread rose = new Thread("rose"){
            public void run(){
                for (int i = 0; i < 5;i++){
                    System.out.println(getName()+":let me go!");
                    try {
                        Thread.sleep(1000);
                    }catch (InterruptedException e){
                    }
                }
                System.out.println(getName()+":啊啊啊啊啊啊啊啊啊啊.....");
                System.out.println("噗通");
            }
        };

        Thread jack = new Thread("jack"){
            public void run(){
                while (true){
                    System.out.println(getName()+":you jump i jump!");
                    try {
                        Thread.sleep(1000);
                    }catch (InterruptedException e){

                    }
                }
            }
        };

        rose.start();
        //注意，设置守护线程这件事必须在线程启动前进行！否则会抛出异常
        jack.setDaemon(true);
        jack.start();

    }
}
