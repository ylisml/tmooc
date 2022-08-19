package OOP.day05;

public class Teacher extends Persion {

    double salary;

    /**
     * 构造方法
     */
    Teacher(String name, int age, String address, double salary) {
        super(name, age, address);
        this.salary = salary;
    }

    @Override
    void sayHi() {
        System.out.println("name = " + name + "\t" + "age = " + age + "\t" + "address = " + address + "\t" + "salaey = " + salary);
    }

}
/**
 * package java.util
 * public class Scanner{
 * Scanner(Stream s){
 * <p>
 * }
 * }
 */