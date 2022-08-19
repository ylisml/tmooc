package OOP.day01;

import OOP.day01.Aoo;

public class OverloadDome {
    public static void main(String[] args){
        Aoo o = new Aoo();
        o.show();
        o.show(12);
        o.show("zhangsan",34);
        o.show("lisi");
        o.show(23,"wangwu");
    }
}
