package thread;

public class ThreadInfoDemo {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        String name = t.getName();
        System.out.println("name:"+name);

        long id = t.getId();
        System.out.println("id:" + id);

        int priority = t.getPriority();
        System.out.println("优先级："+priority);


    }
}
