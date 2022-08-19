package OOP.day05;

public class Persion {
    String name;
    int age;
    String address;

    /**
     * 构造方法
     */
    Persion(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    void sayHi() {
        System.out.println("name=" + name + "\t" + "age=" + age + "\t" + "address=" + address);
    }

}
