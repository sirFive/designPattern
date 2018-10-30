package com.xie.designpattern.Strategy;

/**
 * 策略模式
 * 与简单工厂模式的区别是：策略模式把生成何种类的选择放在客户端，而简单工厂模式则是放在factory方法
 */
public class TestMain {
    public static void main(String[] args) {
        String type="+";
        Context context = null;
        switch (type){
            case "+":
                context=new Context(new OperationAdd());
                break;
            case "-":
                context=new Context(new OperationSub());
                break;
        }
        double result = context.contextInterface(10,20);
    }
}
