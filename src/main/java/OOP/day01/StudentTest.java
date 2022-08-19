package OOP.day01;
//学生类的测试类
public class StudentTest {
    public static void main(String[] args){
      /*数据类型           引用类型变量   指向      对象
        Student             zs          =      new Student();
       */
        //创建一个学生对象
        Student zs = new Student();
        //给成员变量赋值
        zs.name = "zhangsan";
        zs.age = 18;
        zs.address = "河北廊坊";
        //调用方法
        zs.sayHi();
        zs.study();

        Student lisi = new Student();
        lisi.name = "lisi";
        lisi.age = 20;
        lisi.address = "黑龙江";
        lisi.sayHi();
        lisi.study();
    }
}
