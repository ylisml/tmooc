package OOP.day05;

public class Doctor extends Persion {

    String level;

    /**
     * 构造方法
     */
    Doctor(String name,int age,String address,String level){
        super(name, age, address);
        this.level = level;
    }

}
