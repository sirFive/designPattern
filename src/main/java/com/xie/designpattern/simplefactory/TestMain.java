package com.xie.designpattern.simplefactory;

/**
 * 简单工厂模式
 */
public class TestMain {
    public static void main(String[] args) {
        Operation operation = OperationFactory.getOperation("+");
        //Operation operation = OperationFactory.getOperation("-");
        //Operation operation = OperationFactory.getOperation("*");
        //Operation operation = OperationFactory.getOperation("/");
        operation.setNumberA(10.0);
        operation.setNumberB(20.0);
        System.out.println(operation.getResult());
    }
}
