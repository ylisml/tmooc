package OOP.day05;

public class Test {
    public static void main(String[] args) {

        Persion[] ps = new Persion[5];
        //向上造型
        ps[0] = new Student("李四", 24, "LF", "111");
        ps[1] = new Student("张三", 24, "JMS", "222");
        ps[2] = new Teacher("王武", 35, "SD", 5000);
        ps[3] = new Teacher("赵六", 34, "HB", 10000);
        ps[4] = new Doctor("孙七", 45, "SH", "主任医师");
        for (int i = 0; i < ps.length; i++) {
            System.out.println(ps[i].name + ":");
            ps[i].sayHi();
        }

    }

}
