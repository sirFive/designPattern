package com.xie.designpattern.Decorator;

public class Person implements Component {
    @Override
    public void show() {
        System.out.println("人物展示");
    }
}
