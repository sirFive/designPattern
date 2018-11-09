package com.xie.designpattern.Decorator;

/**
 * 具体服饰类：穿T恤
 */
public class TShirts extends Finery{

    public void show(){
        System.out.println("穿衣服...");
        super.show();
        System.out.println("穿好了衣服");
    }
}
