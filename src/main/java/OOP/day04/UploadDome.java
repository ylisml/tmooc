package OOP.day04;
//向上造型演示
public class UploadDome {
    public static void main(String[] args) {
        /**
         * 向上造型：代码复用
         *    超类型的引用指向派生类对象
         *    能点出来什么，看引用类型---------规定
         *何时向上造型：如果多种角色干的事情是一样的，就可以将他们统一造型到超类型到数组中
         *方法的重写(override/overriding):重新写，覆盖
         *      能点出来什么看引用类型，重写方法被调用时看对象点类型
         *      重写需要遵循两同两小一大原则
         *          两同：方法名相同、参数列表相同
         *              void和基本类型相等
         *              引用类型大于
         *          两小：派生类方法点返回值类型小于或等于超类方法的、派生类方法抛出的异常小于或等于超类方法的
         *          一大：派生类方法的访问权限大于或等于超类的方法
         *重写与重载的区别：
         *      重写：发生在父子类中，方法名相同，参数列表相同
         *      重载：发生在同一个类中，方法名相同，参数列表不同
         */
        Aoo o1 = new Boo();
        o1.a = 2;
        o1.show();
        Boo o2 = new Boo();
        o2.a = 3;
        o2.b = 5;
    }
}