package exception;

public class TrowDemo {
    public static void main(String[] args) {
        Person p = new Person();
        try{
            p.setAge(1000);//满足语法但不满足业务逻辑
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("此人年龄" + p.getAge() + "岁");
    }
}
