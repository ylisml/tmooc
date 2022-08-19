package OOP.day02;
//构造方法的演示
public class ConsDemo {
    public static void main(String[] args) {
        Student lisi = new Student("李四",18,"万锦·创客星空");
        lisi.sayHi();

        Student zs = new Student("张三",24,"兴华园");
        zs.sayHi();
        Student wms = new Student();
    }
}
