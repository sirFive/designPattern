package com.xie.designpattern.Decorator;

public class TestMain {
    public static void main(String[] args) {
        Person p = new Person();
        Trouser trouser = new Trouser();
        TShirts tShirts = new TShirts();
        trouser.setComponent(p);
        tShirts.setComponent(trouser);
        //tShirts.show();
        trouser.show();

        //裤子的component为衣服，因此裤子的show()调用component.show()即为服务的show()，衣服的component为person,
        //因此衣服的show()方法中调用component.show()即为人.show()。因此一句话调用了3个类的show()方法

        //服饰类和人同级别，都直接实现接口
        //服饰类起到控制的作用，检查component是否为空
        //裤子和衣服为服饰类的子类，起到装饰人的作用
    }
}
