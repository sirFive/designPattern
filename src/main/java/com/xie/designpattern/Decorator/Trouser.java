package com.xie.designpattern.Decorator;

/**
 * 具体服饰类：穿裤子
 */
public class Trouser  extends Finery{
    private String addName;
    public void show(){
        System.out.println("穿裤子...");
        super.show();
        System.out.println("穿好了裤子");
    }

    /**
     * 本类特有的方法
     */
    public void kuzi(){
        System.out.println("好看的裤子");
    }
}
