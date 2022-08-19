package OOP.day05;

public class Student extends Persion {

    String stuId;

    /**
     * 构造方法
     */
    Student(String name, int age, String address, String stuId) {
        super(name, age, address);
        this.stuId = stuId;
    }

    @Override
    void sayHi() {
        System.out.println("name = " + name + "\t" + "age = " + age + "\t" + "address = " + address + "\t" + "stuId = " + stuId);
    }
}
